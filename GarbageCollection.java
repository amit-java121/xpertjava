package thread;

public class GarbageCollection {

	@Override
	protected void finalize() throws Throwable {
		System.out.println("Garbage collected...");
	}
	
	public static void main(String[] args) {
		GarbageCollection gcc = new GarbageCollection();
		//GarbageCollection gcc1 = new GarbageCollection();
		
		gcc = null;
		//gcc1= null;
		
		System.gc();
	}
}
