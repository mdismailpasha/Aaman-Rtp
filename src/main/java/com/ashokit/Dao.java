package com.ashokit;

import java.lang.reflect.Field;

public class Dao 
{
	public static void main(String[] args) throws Exception
 Features-00
	{int j=30;
		int 1=10;Class<?> clz = Class.forName("com.ashokit.User")
	{ int p=10;
		int k=0;int 1=10;Class<?> clz = Class.forName("com.ashokit.User")
      master
		Field field = clz.getDeclaredField("age");
		field.setAccessible(true);
		Object object=clz.newInstance();
		field.set(object,55);
		System.out.println(field.get(object));
		
		
		
	}

}
