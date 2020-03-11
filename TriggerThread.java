package thread;

public class TriggerThread {

	public static void main(String[] args) {
	
//		for(int i=0;i<10;i++){
//			System.out.println("normal loop "+i);
//		}
		
		System.out.println(" thread name: "+Thread.currentThread().getName());
		
		Job2 job = new Job2();
		job.start();
		job.setName("SBI");
		System.out.println(" thread name: "+Thread.currentThread().getName());
		
		Job2 job1 = new Job2();
		job1.setName("HDFC");
		job1.start();
		System.out.println(" thread name: "+Thread.currentThread().getName());

		
//		for(int i=20;i<30;i++){
//			System.out.println("normal loop: "+i);
//		}
	}
}
