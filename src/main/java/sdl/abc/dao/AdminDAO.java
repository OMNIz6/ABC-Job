package sdl.abc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import sdl.abc.bean.LoginBean;

public class AdminDAO {
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
	
//	for the log in function with the Admin account
	public LoginBean login(String Usermail,String pass){
		LoginBean login = null;
		
		ResultSet set = null;
		String sql = "SELECT Admin_ID,Admin_email,Admin_password FROM `abc_jobs_portal`.`admin_data` where Admin_email = ?";
		
		try {
			PreparedStatement statement = getDBConnection().prepareStatement(sql);
			statement.setString(1, Usermail);
			set = statement.executeQuery();
			while (set.next()) {

				if (pass.equals(set.getString(3))) {
					
					login = new LoginBean();
					
					login.setId(set.getInt(1));
					login.setEmail(set.getString(2));
					login.setRole("admin");
					login.setStatus("admin");
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
//	for the Admin to be able to delete user 
	public int deleteUser(int id) {
		int set = 0;
		String sql = "DELETE FROM `abc_jobs_portal`.`user` WHERE `User_id` = ?;";
		try {
			PreparedStatement statement = getDBConnection().prepareStatement(sql);
			statement.setInt(1, id);
			
			set = statement.executeUpdate();
			
			statement.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return set;
	}
	
//	for the Admin to ban the user
	public int BanUser(int id) {
		int set = 0;
		String sql = "Update user set acc_status ='banned' WHERE `User_id` = ?;";
		try {
			PreparedStatement statement = getDBConnection().prepareStatement(sql);
			statement.setInt(1, id);
			
			set = statement.executeUpdate();
			
			statement.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return set;
	}
}
