package org.comit.users.dao;

import java.util.List;

import org.comit.users.bean.UserBean;
import org.comit.users.dao.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
	
	List<UserBean> user;
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
public void createUser(UserBean user) {
		
		String sql = "INSERT INTO USER(USER_NAME, EMAIL, PASSWORD) VALUES " + "VALUES(?,?,?)";
		
		this.jdbcTemplate.update(sql,user.getUserName(),user.geteMail(),user.getPassword());
	}

	public UserBean findUser (int idUser) {
		
		String sql = "SELECT * FROM USER WHERE ID_USER=?";
		
		return this.jdbcTemplate.queryForObject(sql, new UserMapper(), idUser);
	}


}
