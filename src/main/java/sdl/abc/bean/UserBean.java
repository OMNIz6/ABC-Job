package sdl.abc.bean;

public class UserBean {
	private int id;
	private String fname;
	private String lname;
	private String email;
	private int age;
	private String location;
	private String phno;
	private String postion;
	private String pImg;
	private String cImg;
	private String CV;
	private String description;
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getPhno() {
		return phno;
	}

	public void setPhno(String phno) {
		this.phno = phno;
	}

	public String getPostion() {
		return postion;
	}

	public void setPostion(String postion) {
		this.postion = postion;
	}

	public String getpImg() {
		return pImg;
	}

	public void setpImg(String pImg) {
		this.pImg = pImg;
	}

	public String getcImg() {
		return cImg;
	}

	public void setcImg(String cImg) {
		this.cImg = cImg;
	}

	public String getCV() {
		return CV;
	}

	public void setCV(String cV) {
		CV = cV;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "User [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
}
