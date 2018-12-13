package cn.edu.zzti.dao;

import java.sql.SQLException;
import java.util.List;

import cn.edu.zzti.entity.UserDO;

public interface UserDAO extends BaseDAO{
	
	/*
	 * UserDAO接口继承自BaseDAO接口.
	  * 定义了获取所有用户信息,查找用户,增加及删除用户等方法.
	 */
	
	//获得系统中所有用户
	public List<UserDO> getAll() throws SQLException;
	
	//用于登录校验
	public UserDO findUser(String username,String password) throws SQLException;
	
	//在系统中创建一个用户的信息
	public int insert(UserDO user) throws SQLException;
	
	//根据用户的id删除一个用户
	public int deleteUser(String id) throws SQLException;

}
