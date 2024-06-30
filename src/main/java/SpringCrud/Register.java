package SpringCrud;
import java.util.Scanner;

import javax.swing.JOptionPane;

import org.springframework.jdbc.core.*;
public class Register 
{
	ForJdbc jdbc;
	Scanner sc=new Scanner(System.in);
	public void registerUser()
	{
		UserData udata=new UserData();
		System.out.println("Enter Your UserName");
	
		udata.setUserName(sc.nextLine());
		System.out.println("Enter Password");
		udata.setPassword(sc.nextLine());
		jdbc=new ForJdbc();
		JdbcTemplate jdbc1=jdbc.getObj();
		 
		String query="insert into user(unm,pass) values(?,?) ";
		int res=jdbc1.update(query,udata.getUserName(),udata.getPassword());
		JOptionPane.showConfirmDialog(null, res);
		
	}

}
