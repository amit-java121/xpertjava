package thread;

public class SynchBlockTest1 extends Thread {
 
	TestBlock tb;
	
	SynchBlockTest1(TestBlock tb1){
		tb=tb1;
	}
	
	@Override
	public void run() {
	 tb.m1();
	}
}
