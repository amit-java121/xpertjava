package thread;

public class TriggerSynchJob {

	public static void main(String[] args) {
		TestBlock tb = new TestBlock();
		
		SynchBlockTest1 st1 = new SynchBlockTest1(tb);
		SynchBlockTest1 st2 = new SynchBlockTest1(tb);
		
		st1.start();
		st2.start();
	}
}
