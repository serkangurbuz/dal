package com.Argeloji.Service;


public interface DMRegistry {
	
	<T> T get(Class<T> interfaceType, Class<?> object);

}
