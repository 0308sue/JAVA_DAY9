package java_09;

//학생
class StudentThread extends Thread{
	private String name;
	private SharedBoard board;
	public StudentThread(String name, SharedBoard board) {
		this.name = name;
		this.board = board;
	}
	@Override
	//board를 10번 접근해서 카운팅하기
	public void run() {
		for(int i=0; i<10;i++) {
			board.add();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
class SharedBoard{
	private int sum;
	synchronized public void add() { //10 증가
		int n = sum;
		n+=10;
		sum = n;
	  System.out.println(Thread.currentThread().getName() +" : " + sum);
		
	}
	public int getSum() {
		return sum;
	}
}

public class SynchronizedEx {
	public static void main(String[] args) {
		SharedBoard board = new SharedBoard(); //공유자원
		Thread th1= new StudentThread("홍길동",board);
		Thread th2= new StudentThread("이순신",board);
		th1.start();
		th2.start();

	}

}