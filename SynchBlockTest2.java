package thread;

public class SynchBlockTest2 extends Thread {
 
	TestBlock tb;
	
	SynchBlockTest2(TestBlock tb){
		this.tb=tb;
	}
	
	@Override
	public void run() {
	 tb.m1();
	}
}
