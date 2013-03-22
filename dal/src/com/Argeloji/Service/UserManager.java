package com.Argeloji.Service;
import java.util.List;

import com.Argeloji.Service.DMRegistry;


public class UserManager {
	

	private final DMRegistry registry;
	
	
	public UserManager(DMRegistry registry)
	{
		
	this.registry = registry;
	
	}
	
	private UserHibernateDataMapper getMapper()
	{

		return registry.get(UserHibernateDataMapper.class,User.class);
	}
	
	public void save(User user) throws Exception
	{
		
	getMapper().save(user);
	
	}
	
	
	public User load(String username) throws Exception
	{
	return getMapper().load(username);
	
	}
	
	public void delete(User user)
	{
		getMapper().delete(user);
	
	}
	
	
	
}
