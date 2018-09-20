package base.design.singleton.f;

public class Singleton {
	private volatile static Singleton singleton = new Singleton();

	private Singleton() {
	}

	public static Singleton getInstance() {
		return singleton;
	}
}
