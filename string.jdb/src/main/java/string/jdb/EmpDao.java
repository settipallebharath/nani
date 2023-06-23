package string.jdb;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmpDao
{
	private JdbcTemplate  jdbcTemplate;
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate)
	{
		this.jdbcTemplate=jdbcTemplate;
	}
public int save(Employee emp)
{
	String sql="insert into kumar1 values("+emp.getId()+",'"+emp.getName()+"','"+emp.getCmp()+"')";
	return jdbcTemplate.update(sql);
}
public int update(Employee emp)
{
	String sql="update kumar1 set name ='"+emp.getName()+"'where id='"+emp.getId()+"'";
	return jdbcTemplate.update(sql);
}
public int delete(Employee emp)
{
	String sql="delete from kumar1 where id='"+emp.getId()+"'";
	return jdbcTemplate.update(sql);
}
public int listEmployee(Employee emp)
{
	String sql="select* from kumar1";
	return jdbcTemplate.update(sql);
}

}
