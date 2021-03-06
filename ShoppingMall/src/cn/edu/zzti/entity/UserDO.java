package cn.edu.zzti.entity;

import java.util.Date;

public class UserDO {
	
	/*
	 * UserDO类实现对用户登录信息的封装,如用户名,密码等.
	 */
	
	private String username;
	private String password;
	private Date loginTime;
	private PersonalInfoDO pi;
	
	public UserDO() {}

	public UserDO(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public UserDO(String username, String password, Date loginTime) {
		super();
		this.username = username;
		this.password = password;
		this.loginTime = loginTime;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getLoginTime() {
		return loginTime;
	}

	public void setLoginTime(Date loginTime) {
		this.loginTime = loginTime;
	}

	public PersonalInfoDO getPi() {
		return pi;
	}

	public void setPi(PersonalInfoDO pi) {
		this.pi = pi;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((username == null) ? 0 : username.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserDO other = (UserDO) obj;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "UserDO [username=" + username + ", password=" + password + "]";
	}

}
