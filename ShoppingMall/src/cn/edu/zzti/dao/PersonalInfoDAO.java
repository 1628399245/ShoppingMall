package cn.edu.zzti.dao;

import java.sql.SQLException;

import cn.edu.zzti.entity.PersonalInfoDO;

public interface PersonalInfoDAO extends BaseDAO {
	
	/*
	 * PersonalInfoDAO接口继承自BaseDAO接口.
	  * 定义了获取个人基本信息和设置个人基本信息等基本方法.
	 */
	
	//通过用户名查询当前用户的个人信息
	public PersonalInfoDO getPersonalInfo(String username) throws SQLException;
	
	//保存一个用户的个人信息
	public void setPersonalInfo(String username,PersonalInfoDO p) throws SQLException;
	

}
