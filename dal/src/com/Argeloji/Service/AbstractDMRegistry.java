package com.Argeloji.Service;
import java.util.HashMap;
import java.util.Map;



public class AbstractDMRegistry  implements DMRegistry {

	private final static Map<Class<?>, Object> map = new HashMap<Class<?>, Object>();

	public <T> void add(final Class<?> objectType, final T dataMapper)
	{
	map.put(objectType, dataMapper);
	}
	
	@Override
	public <T> T get(Class<T> interfaceType, Class<?> object)
	{
	final T dataMapper = interfaceType.cast(map.get(object));
	if(dataMapper == null)
	{
	throw new IllegalStateException( object+" not found in registry "
	+ getClass().getName());
	}
	return dataMapper;
	}
	

	

}
