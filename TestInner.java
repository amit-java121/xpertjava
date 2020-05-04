package inner;

public class TestInner {
	
	private int a =5;
	class Inner {
		void m1() {
			System.out.println("m1 is called"+a);
		}
	}

	public static void main(String[] args) {
		
		TestInner ti = new TestInner();
		
		TestInner.Inner inn = ti.new Inner();
		inn.m1();
	}
}
