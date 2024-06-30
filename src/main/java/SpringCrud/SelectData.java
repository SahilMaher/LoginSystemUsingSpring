package SpringCrud;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class SelectData 
{
	public UserData selectData(String unm,String pass)
	{
		ForJdbc j=new ForJdbc();
		JdbcTemplate jdbc=j.getObj();
		String q="Select * from user where unm=? and pass=? ";
		RowMapper<UserData> rmp=new RowMapperImpl();
		UserData udata=jdbc.queryForObject(q,rmp,unm,pass);
		
		
		return udata;
		
	}
	public List<UserData> selectAllData()
	{
		ForJdbc j=new ForJdbc();
		JdbcTemplate jdbc=j.getObj();
		String q="Select * from user  ";
		RowMapper<UserData> rmp=new RowMapperImpl();
		List<UserData> udata=jdbc.query(q,rmp);
		
		
		return udata;
		
	}

}
