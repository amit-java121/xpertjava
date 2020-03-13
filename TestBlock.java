package thread;

public class TestBlock {

	void m1(){
		System.out.println("m1()");
		synchronized (this) {
			for(int i=0;i<10;i++){
				System.out.println(i);
				try {
					wait(2000);//
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
