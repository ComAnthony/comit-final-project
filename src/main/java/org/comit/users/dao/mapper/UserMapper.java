package org.comit.users.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.comit.users.bean.UserBean;
import org.springframework.jdbc.core.RowMapper;

public class UserMapper implements RowMapper<UserBean>{

	@Override
	public UserBean mapRow(ResultSet rs, int rowNum) throws SQLException {
	
	UserBean user = new UserBean();
	
	user.setIdUser(rs.getInt("ID_USER"));
	user.setUserName(rs.getString("USER_NAME"));
	user.seteMail(rs.getString("EMAIL"));
	user.setPassword(rs.getString("PASSWORD"));
	user.setCode(rs.getInt("CODE"));
	
	return user;
	
	}
}
