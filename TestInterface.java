package inner;

public class TestInterface implements InterFace1.InterFacse2{

	@Override
	public void m5() {
		System.out.println("m5 called");
		
	}
	
	public static void main(String[] args) {
		//InterFace1.InterFacse2 ii = new TestInterface();
		TestInterface ti = new TestInterface();
		ti.m5();
	}

}
