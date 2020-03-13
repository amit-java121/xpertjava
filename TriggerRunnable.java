package thread;

public class TriggerRunnable {

	public static void main(String[] args) {
		 Job3 job3 = new Job3();
		 Thread th = new Thread(job3);
		 
		 th.start();
		 try {
			th.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 Job4 job4 = new Job4();
		 Thread th1 = new Thread(job4);
		 
		 th1.start();
	}
}
