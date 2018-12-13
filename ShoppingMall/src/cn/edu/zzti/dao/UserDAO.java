package cn.edu.zzti.dao;

import java.sql.SQLException;
import java.util.List;

import cn.edu.zzti.entity.UserDO;

public interface UserDAO extends BaseDAO{
	
	/*
	 * UserDAO�ӿڼ̳���BaseDAO�ӿ�.
	  * �����˻�ȡ�����û���Ϣ,�����û�,���Ӽ�ɾ���û��ȷ���.
	 */
	
	//���ϵͳ�������û�
	public List<UserDO> getAll() throws SQLException;
	
	//���ڵ�¼У��
	public UserDO findUser(String username,String password) throws SQLException;
	
	//��ϵͳ�д���һ���û�����Ϣ
	public int insert(UserDO user) throws SQLException;
	
	//�����û���idɾ��һ���û�
	public int deleteUser(String id) throws SQLException;

}
