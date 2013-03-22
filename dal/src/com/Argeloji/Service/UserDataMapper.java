package com.Argeloji.Service;

public interface UserDataMapper
{

	void save(User user) throws Exception;

	User load(String username) throws Exception;

}
