package SpringCrud;
import org.springframework.context.ApplicationContext;
import org.springframework.jdbc.core.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class ForJdbc 
{
	
	ApplicationContext cn=new ClassPathXmlApplicationContext("config.xml");
	
	public JdbcTemplate getObj()
	{
		JdbcTemplate jdbc1=cn.getBean("jdbc",JdbcTemplate.class);
		
		return jdbc1;
	}
	

}
