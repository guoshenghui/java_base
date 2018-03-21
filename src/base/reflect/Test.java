package base.reflect;

import java.lang.reflect.Field;

public class Test {
	public static void main(String[] args) {
		Test test = new Test();
		String className = test.getClass().getPackage().getName() + ".MyClass";
		try {
			Class<?> clazz = ClassLoader.getSystemClassLoader().loadClass(className);
			Field[] fields = clazz.getDeclaredFields();
			System.out.println(fields.length);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

class MyClass {
	String name;
	String age;
	static {
		System.out.println("hello");
	}
}
