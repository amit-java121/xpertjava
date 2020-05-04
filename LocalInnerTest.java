package inner;

public class LocalInnerTest {
	
	void m3() {
		
		class Local{
			void print() {
				System.out.println("print method is called");
			}
		}
		
		Local ll = new Local();
		ll.print();
	}

	public static void main(String[] args) {
		LocalInnerTest li = new LocalInnerTest();
				li.m3();
	}
}
