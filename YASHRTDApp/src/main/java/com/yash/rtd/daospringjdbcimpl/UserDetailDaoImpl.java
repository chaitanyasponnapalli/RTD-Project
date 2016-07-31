package com.yash.rtd.daospringjdbcimpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;


import com.yash.rtd.dao.UserDetailDao;
import com.yash.rtd.model.UserDetail;

/**
 * This class will implement the UserDetailDao and 
 * perform the implementation using SpringJDBC Template
 * @author sharma.pankaj
 *
 */
@Repository
public class UserDetailDaoImpl implements UserDetailDao{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public UserDetailDaoImpl() {
		System.out.println("----------"+jdbcTemplate);
	}
	
	public void insertUserDetail(UserDetail userDetail) {
		// TODO Auto-generated method stub
		
	}

	public UserDetail authenticateUser(UserDetail userDetail) {
		//Get firstname, lastname, username, password roleid from 
		// user table
		
		String sql="select firstname,lastname,username,password,fk_role_id from user where username=? and password=?";
		//return jdbcTemplate.query(sql, new ResultSetExtractor<T>() {
		//};(){

			//@Override
			/*public List<User> extractData(ResultSet rs) throws SQLException,
					DataAccessException {
				List<User> userList=new ArrayList<User>();
				while(rs.next()){
					User user=new User();
					user.setName(rs.getString("name"));
					user.setEmail(rs.getString("email"));
					user.setUsername(rs.getString("username"));
					user.setPassword(rs.getString("password"));
					userList.add(user);
					
				}
				return userList;
			}*/
		
		
		
		
		return null;
	}

	public void editUserDetail(int id) {
		// TODO Auto-generated method stub
		
	}

	public void deleteUserDetail(int id) {
		// TODO Auto-generated method stub
		
	}

	public List<UserDetail> listUserDetail() {
		// TODO Auto-generated method stub
		return null;
	}

	public UserDetail findUserDetailById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<UserDetail> findUserDetail(String freeText) {
		// TODO Auto-generated method stub
		return null;
	}

}
