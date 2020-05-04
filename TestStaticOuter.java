package inner;

public class TestStaticOuter {
	
	static class StaticInner{
		void m4() {
			System.out.println("m4 is called");
		}
	}

	public static void main(String[] args) {
		
		TestStaticOuter.StaticInner si = new TestStaticOuter.StaticInner();
		si.m4();
	}
}
