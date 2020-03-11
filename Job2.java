package thread;

public class Job2 extends Thread{
	
	
	static int balance = 1000;
	@Override
	public void run() {
		System.out.println(" thread name: "+Thread.currentThread().getName());
		for(int i=0;i<10;i++){
			withdraw(150);
		}
	}
	
	private static synchronized void withdraw(int amount){
		
		System.out.println("trying to withdraw "+Thread.currentThread().getName());
		try {
			Thread.sleep(0);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(balance > 200){
		balance = balance-150;
		System.out.println("remakining balance "+balance);
		}else{
			System.out.println("in suff balance");
		}
	}

}
