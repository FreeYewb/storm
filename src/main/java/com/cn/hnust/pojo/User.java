package com.cn.hnust.pojo;
/**
 * 用户信息
 */
public class User {
	// 成员变量
	private Integer userid;
	private String username;
	private String password;
	private int age;
	
	// 构造函数
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(Integer userid, String username, String password, int age) {
		super();
		this.userid = userid;
		this.username = username;
		this.password = password;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "User [userid=" + userid + ", username=" + username + ", password=" + password + ", age=" + age + "]";
	}
	// 成员方法
	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	
	
	
	
}
