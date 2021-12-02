package com.ashokit;

import java.lang.reflect.Field;

public class Dao 
{
	public static void main(String[] args) throws Exception
	{
		Class<?> clz = Class.forName("com.ashokit.User");
		Field field = clz.getDeclaredField("age");
		field.setAccessible(true);
		Object object=clz.newInstance();
		field.set(object,55);
		System.out.println(field.get(object));
		
		
		
	}

}
