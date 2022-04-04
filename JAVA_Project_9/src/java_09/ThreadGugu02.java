package java_09;

public class ThreadGugu02  implements Runnable{
	private int dan;
	public ThreadGugu02(int dan) {
		this.dan = dan;
	}
	@Override
	public void run() {
		 for(int i =1; i<10;i++) {
				System.out.println(dan +"*" + i +"=" + dan*i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
		}
	}
	public static void main(String[] args) {
		ThreadGugu02 tgu1 = new ThreadGugu02(1);
		ThreadGugu02 tgu2 = new ThreadGugu02(2);
		ThreadGugu02 tgu3 = new ThreadGugu02(3);
		Thread th1 = new Thread(tgu1);
		th1.start();
		Thread th2 = new Thread(tgu2);
		th2.start();
//		Thread th3 = new Thread(tgu3);
//		th3.start();
		new Thread(tgu3).start();
	}

}


