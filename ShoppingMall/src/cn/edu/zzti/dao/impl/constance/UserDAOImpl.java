package cn.edu.zzti.dao.impl.constance;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cn.edu.zzti.dao.UserDAO;
import cn.edu.zzti.entity.PersonalInfoDO;
import cn.edu.zzti.entity.UserDO;

public class UserDAOImpl implements UserDAO{
	
	static Map<String,UserDO>userList = new HashMap<String,UserDO>();
	
	static {
		for(int i=0;i<5;i++) {
			UserDO userDO = new UserDO("admin"+i,"admin"+i);
			if(i == 0) {
				userDO.setPi(new PersonalInfoDO(20,"女","河南省中原区","67698021","test@163.com","中原工学院","硕士","计算机应用"));
			}else {
				userDO.setPi(null);
			}
			userList.put("admin"+i, userDO);
		}
	}

	@Override
	public List<UserDO> getAll() throws SQLException {
		
		return new ArrayList<UserDO>(userList.values());
		
	}

	@Override
	public UserDO findUser(String username, String password) throws SQLException {
		
		Collection<UserDO> c = userList.values();
		for(UserDO u:c) {
			if(u.getUsername().equals(username)&&u.getPassword().equals(password)) {
				return u;
			}
		}
		
		return null;
	}

	@Override
	public int insert(UserDO user) throws SQLException {
		
		userList.put(user.getUsername(), user);
		return 1;
		
	}

	@Override
	public int deleteUser(String id) throws SQLException {
		
		userList.remove(id);
		return 1;
		
	}
	

}
