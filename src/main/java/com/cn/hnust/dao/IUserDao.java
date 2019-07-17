package com.cn.hnust.dao;

import com.cn.hnust.pojo.User;

public interface IUserDao {
	public abstract User findByUsername(String name);
	
	public abstract User selectByPrimaryKey(int id);
}
