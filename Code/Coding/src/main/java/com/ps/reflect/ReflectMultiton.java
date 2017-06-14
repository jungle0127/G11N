package com.ps.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectMultiton {

	public static void main(String[] args) {
		Class<?> singletonClass;
		try {
			singletonClass = Class.forName("com.ps.reflect.Singleton");
			Constructor<Singleton> sc = (Constructor<Singleton>) singletonClass.getDeclaredConstructor();
			sc.setAccessible(true);			
			Singleton si = sc.newInstance(null);
			System.out.println(si.getName());
			
		} catch (NoSuchMethodException | SecurityException | ClassNotFoundException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		}
	}

}
