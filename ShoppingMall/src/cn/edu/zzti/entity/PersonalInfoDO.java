package cn.edu.zzti.entity;

public class PersonalInfoDO {
	
	//page1 基础信息
	
	private Integer age;
	private String gender;
	private String address;
	private String tel;
	private String email;
	
	//page2 学历信息
	
	private String graduaterSchool;
	private String highestEducation;
	private String major;
	private String realName;
	
	public PersonalInfoDO(Integer age, String gender, String address, String tel, String email, String graduaterSchool,
			String highestEducation, String major) {
		super();
		this.age = age;
		this.gender = gender;
		this.address = address;
		this.tel = tel;
		this.email = email;
		this.graduaterSchool = graduaterSchool;
		this.highestEducation = highestEducation;
		this.major = major;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGraduaterSchool() {
		return graduaterSchool;
	}

	public void setGraduaterSchool(String graduaterSchool) {
		this.graduaterSchool = graduaterSchool;
	}

	public String getHighestEducation() {
		return highestEducation;
	}

	public void setHighestEducation(String highestEducation) {
		this.highestEducation = highestEducation;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

}
