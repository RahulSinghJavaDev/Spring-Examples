package SingletonDP;

public class SDPTest{
	public static void main(String[] args) {
		Singleton st=Singleton.getInstance();
		System.out.println(st.hashCode());
		Singleton st1=Singleton.getInstance();
		System.out.println(st1.hashCode());
	}

}
