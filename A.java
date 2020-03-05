
public class A {

	A(String str){
		
	}
	
	public static void main(String[] args) {
		String s="abc";
		String s1 = new String("abc");
		String s2 = new String("abc");
		System.out.println(s2.equals(s1));	
		Integer i = new Integer(10);
		Integer i1 = new Integer(10);
		System.out.println(i.equals(i1));
		
		A a = new A("abc");
		A a1 = new A("abc");
		
		System.out.println(a.equals(a1));
		System.out.println(a+"  "+a1);
	}
	}
