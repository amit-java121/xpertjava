package inner;

public class TestAnonymous {

	public static void main(String[] args) {
		
		
		TestAnonymousClass ta = new TestAnonymousClass() {
			
			@Override
			void m2() {
				System.out.println("m2 called...");
				
			}
		};
		
		ta.m2();
	}
}
