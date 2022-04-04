package java_09;

public class LamdaThreadTest {

	public static void main(String[] args) {
		// Runnable runnable = new Runnable()
	    Runnable runnable = new Runnable() {
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName());
			}
		};
	   new Thread(runnable).start();

	   
	   Runnable  runnable2 =()-> System.out.println(Thread.currentThread().getName());
	   Thread th2 = new Thread(runnable2);
	   th2.start();
	   
	   Runnable  runnable3 =()-> {
		   System.out.println(Thread.currentThread().getName());
	   };
	   new Thread(runnable3).start();
	   
	   
	   
	   
	}

}
