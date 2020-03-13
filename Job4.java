package thread;

public class Job4 implements Runnable{

	@Override
	public void run() {
		for(int i=10;i<200;i++){
			System.out.println(i);
		}
		
	}
}
