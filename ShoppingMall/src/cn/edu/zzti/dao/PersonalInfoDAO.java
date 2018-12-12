package cn.edu.zzti.dao;

import java.sql.SQLException;

import cn.edu.zzti.entity.PersonalInfoDO;

public interface PersonalInfoDAO extends BaseDAO {
	
	//通过用户名查询当前用户的个人信息
	public PersonalInfoDAO getPersonalInfo(String username) throws SQLException;
	
	//保存一个用户的个人信息
	public void setPersonalInfo(String username,PersonalInfoDO p) throws SQLException;
	

}
