package sdl.abc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import sdl.abc.bean.JobBean;
import sdl.abc.bean.LoginBean;
import sdl.abc.bean.UserBean;


public class UserDAO {
	
//	For database connection
	public Connection getDBConnection(){
		Connection connection = null;
		try {

			// load the driver class
			Class.forName("com.mysql.jdbc.Driver");

			// get hold of the DriverManager
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/abc_jobs_portal", "root", "09450026462");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();

		}

		catch (SQLException e) {
			
			e.printStackTrace();
			
		}
		
		return connection;
		
	}
	
//	for the register function
	public int register (String fname, String lname, String email, String password) {
		int result = 0;
		String sql = "Insert into `abc_jobs_portal`.`user` (First_name,Last_name,User_email,User_password) Values(?,?,?,?) ";
		try {
			PreparedStatement statement = getDBConnection().prepareStatement(sql);
			
			statement.setString(1, fname);
			statement.setString(2, lname);
			statement.setString(3, email);
			statement.setString(4, password);
			result = statement.executeUpdate();
			
			statement.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
		
	}
	
// for login function with the user account 	
	public LoginBean login(String Usermail,String pass){
		LoginBean login = null;
		
		ResultSet set = null;
		String sql = "SELECT User_id,User_email,User_password,acc_status FROM `abc_jobs_portal`.`user` where User_email = ?";
		
		try {
			PreparedStatement statement = getDBConnection().prepareStatement(sql);
			statement.setString(1, Usermail);
			set = statement.executeQuery();
			while (set.next()) {

				if (pass.equals(set.getString(3))) {
					
					login = new LoginBean();
					
					login.setId(set.getInt(1));
					login.setEmail(set.getString(2));
					login.setRole("user");
					login.setStatus(set.getString(4));
				}else {
					login = null;
				}
			}
			statement.close();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
			
		return login;
		
	}
	

	
//	for the user search function
	public List<UserBean> searchUser (String keyword) {
		ResultSet set = null;
		String sql = "Select User_ID, First_name, Last_name, User_location, Position from user where First_name like '%"+keyword+"%' or Last_name like '%"+keyword+"%' or User_location like '%"+keyword+"%'";
		
		List <UserBean> list = null;
		UserBean user;
		
		try {
			PreparedStatement statement = getDBConnection().prepareStatement(sql);
			
			set = statement.executeQuery();
			
			list = new ArrayList<UserBean>();
			if(set.next()) {
				do{
					user = new UserBean();
					user.setId(set.getInt(1));
					user.setFname(set.getString(2));
					user.setLname(set.getString(3));
					user.setLocation(set.getString(4));
					user.setPostion(set.getString(5));
						
					list.add(user);
				}while(set.next());	
			
			}else {
				list=null;
			}
			
			statement.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return list;
	}
	
	public List<JobBean> getJobs (){
		ResultSet set = null;
		String sql = "SELECT Job_ID,Job_name,Job_location,Company_name FROM job LEFT JOIN company ON job.Company_ID = company.Company_ID";
		
		List <JobBean> list = null;
		JobBean job;
		try {
			PreparedStatement statement = getDBConnection().prepareStatement(sql);
			
			set = statement.executeQuery();
			
			list = new ArrayList<JobBean>();
			if(set.next()) {
			do {
				job = new JobBean();
				job.setId(set.getInt(1));
				job.setName(set.getString(2));
				job.setLcoation(set.getString(3));
				job.setComName(set.getString(4));
				
				list.add(job);
			}while(set.next());
			
			}else {
				list=null;
			}
			
			statement.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return list;
	}
	
	public JobBean getJobDetail(int id) {
		ResultSet set = null;
		String sql = "SELECT Job_ID,Job_name,Job_category,Job_location,Job_time,Job_date,Job_salary,Job_description,Company_name FROM job LEFT JOIN company ON job.Company_ID = company.Company_ID where Job_ID = ?";
		
		JobBean job = null;
		try {
			PreparedStatement statement = getDBConnection().prepareStatement(sql);
			statement.setInt(1, id);
			set = statement.executeQuery();
			
			
				while(set.next()) {
					job = new JobBean();
					job.setId(set.getInt(1));
					job.setName(set.getString(2));
					job.setCategory(set.getString(3));
					job.setLcoation(set.getString(4));
					job.setTime(set.getString(5));
					job.setDate(set.getDate(6));
					job.setSalary(set.getString(7));
					job.setDescription(set.getString(8));
					job.setComName(set.getString(9));
				}
			
			statement.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return job;
		
	}
	
//	for the confirmation of email before changing password
	public Boolean confirmEmail (String email) {
		ResultSet set = null;
		String sql = "Select User_email from user where User_email = ?";
		boolean result = false;
		try {
			PreparedStatement statement = getDBConnection().prepareStatement(sql);
			
			statement.setString(1, email);
			
			set = statement.executeQuery();
			while(set.next()) {
				if(set.getString(1).equals(email)) {
					result = true;
				}
			}
			
			statement.close();
		} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
		}
		
		return result;

	}
	
//	for changing password in forget password function
	public int changePassword(String email, String password){
		int set = 0;
		String sql = "Update user set User_password = ? where User_email = ?";
		
		try {
			PreparedStatement statement = getDBConnection().prepareStatement(sql);
			
			statement.setString(1, password);
			statement.setString(2, email);
			
			set = statement.executeUpdate();
			statement.close();
			
		} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
		}
		
		return set;
	}
	
//	for updating the user's public profile
	public int updateProfile (int id, String fname, String lname, String email, int age, String location, String phno, String pos, String description) {
		int set = 0;
		String sql = "Update user set `First_name`= ?,`Last_name` = ?,`User_email` = ?,`Age`= ?,`User_location` = ?,`Contact_No` = ?,`Position` = ?,`Description`= ? where User_id = ?";
		try {
			PreparedStatement statement = getDBConnection().prepareStatement(sql);
			
			statement.setString(1, fname);
			statement.setString(2, lname);
			statement.setString(3, email);
			statement.setInt(4, age);
			statement.setString(5, location);
			statement.setString(6, phno);
			statement.setString(7, pos);
			statement.setString(8, description);
			statement.setInt(9, id);
			
			set = statement.executeUpdate();
			statement.close();
			
		} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
		}
		return set;
	}
	
//	for viewing profile
	public UserBean viewProfile(int id) {
		ResultSet set = null;
		UserBean user = null;
		String sql = "Select First_name, Last_name, User_email, Age, User_location, Contact_No, Position, Description from user where User_id = ?";
		try {
			PreparedStatement statement = getDBConnection().prepareStatement(sql);
			statement.setInt(1, id);
			
			set = statement.executeQuery();
			while(set.next()) {
				user = new UserBean();
				user.setFname(set.getString(1));
				user.setLname(set.getString(2));
				user.setEmail(set.getString(3));
				user.setAge(set.getInt(4));
				user.setLocation(set.getString(5));
				user.setPhno(set.getString(6));
				user.setPostion(set.getString(7));
				user.setDescription(set.getString(8));
			}
			statement.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return user;
		
	}
	
	public int applyJob(int uid,int jid){
		int result = 0;
		String sql = "INSERT INTO `abc_jobs_portal`.`apply`(`User_id`,`Job_ID`)VALUES(?,?);";
		try {
			PreparedStatement statement = getDBConnection().prepareStatement(sql);
			statement.setInt(1, uid);
			statement.setInt(2, jid);
			
			result = statement.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return result;
	}
	
}
