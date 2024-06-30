package SpringCrud;

public class UserData 
{

	private int id;
	private String userName;
	private String Password;

	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public UserData(String userName, String password) {
		super();
	
		this.userName = userName;
		Password = password;
	}
	public UserData() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
