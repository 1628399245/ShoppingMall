package cn.edu.zzti.dao;

import java.sql.SQLException;

import cn.edu.zzti.entity.PersonalInfoDO;

public interface PersonalInfoDAO extends BaseDAO {
	
	/*
	 * PersonalInfoDAO�ӿڼ̳���BaseDAO�ӿ�.
	  * �����˻�ȡ���˻�����Ϣ�����ø��˻�����Ϣ�Ȼ�������.
	 */
	
	//ͨ���û�����ѯ��ǰ�û��ĸ�����Ϣ
	public PersonalInfoDO getPersonalInfo(String username) throws SQLException;
	
	//����һ���û��ĸ�����Ϣ
	public void setPersonalInfo(String username,PersonalInfoDO p) throws SQLException;
	

}
