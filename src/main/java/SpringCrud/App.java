package SpringCrud;
/**
 * Hello world!
 *
 */
import javax.swing.JOptionPane;

import java.util.List;
import java.util.Scanner;
import org.springframework.context.ApplicationContext;
import org.springframework.jdbc.core.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	Scanner sc=new Scanner(System.in);
    	boolean i=true;
    	int num=0;
    	while(i)
    	{
    	System.out.println("Enter Your Choice(Enter Number 1 or 2....) \n 1.RegiSter \n 2.Login  \n 3.Show Users \n (Enter Any For Exit ) \n");
    	 num=sc.nextInt();
    	
    	   	if(num==1)
        	{
        		Register reg=new Register();
        		reg.registerUser();
        	}
        	else if(num==2)
        	{
        		System.out.println("Enter User Name");
        		String unm=sc.next();
        		
        		sc.nextLine();
        		System.out.println("Enter Password");
        		String pass=sc.nextLine();
        		try
        		{
        		
        		
        		
        		SelectData data=new SelectData();
        		
        		UserData d=data.selectData(unm,pass);
        		
        	     System.out.println("Login Succesfully");
        		}
        		catch(Exception e)
        		{
        			System.out.println("SomeThing Wrong Please Try Again");
        		}
        	}
        	else if(num==3)
        	{
        		SelectData slt=new SelectData();
        		List<UserData> udt=slt.selectAllData();
        		System.out.println("Users Are");
        		for(UserData u:udt)
        		{
        			
        			System.out.println(u.getUserName());
        		
        		}
        	}
        	else
        	{
        		 i=false;
        	}
        	
    	}
 
    	
//    	ApplicationContext cn=new ClassPathXmlApplicationContext("config.xml");
//    	JdbcTemplate jdbc1=cn.getBean("jdbc",JdbcTemplate.class);
    	
    	
    }

	private static void JOptionPane(Object object, String string, String string2, int i) {
		// TODO Auto-generated method stub
		
	}
}
