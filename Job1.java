package thread;

public class Job1 extends Thread{
	
	@Override
	public void run() {
		
	for(int i=10;i<20;i++){
		System.out.println("job: "+i);
	}
			
	
	}

}
