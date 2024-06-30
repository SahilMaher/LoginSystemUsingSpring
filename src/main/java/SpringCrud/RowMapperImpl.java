package SpringCrud;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class RowMapperImpl implements RowMapper<UserData>
{

	@Override
	public UserData mapRow(ResultSet rs, int rowNum) throws SQLException
	{
		UserData udata=new UserData();
		udata.setUserName(rs.getString(2));
		
		
		udata.setPassword(rs.getString(3));
		
		return udata;
	}

}
