package SingletonDP;

public class Singleton {
	private Singleton() {
	}

	static Singleton s;

	public static Singleton getInstance() {
		
		if (s == null) {
			s = new Singleton();
			System.out.println("creating Obj..");
		}
		return s;
	}
}
