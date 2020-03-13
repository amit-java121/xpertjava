package thread;

public class Job3 implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<20;i++){
			System.out.println(i);
		}
		
	}
}
