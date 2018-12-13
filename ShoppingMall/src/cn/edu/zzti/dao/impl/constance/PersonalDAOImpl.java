package cn.edu.zzti.dao.impl.constance;

import java.sql.SQLException;

import cn.edu.zzti.dao.PersonalInfoDAO;
import cn.edu.zzti.entity.PersonalInfoDO;
import cn.edu.zzti.entity.UserDO;

public class PersonalDAOImpl implements PersonalInfoDAO{

	@Override
	public PersonalInfoDO getPersonalInfo(String username) throws SQLException {
		
		if(username != null&&"".equals(username)) {
			return UserDAOImpl.userList.get(username).getPi();
		}
		return null;
		
	}

	@Override
	public void setPersonalInfo(String username, PersonalInfoDO p) throws SQLException {
		
		UserDO u = UserDAOImpl.userList.get(username);
		if(u != null) {
			u.setPi(p);
		}
		
	}
	
	

}
