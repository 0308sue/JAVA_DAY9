package java_09;

public class Gugudan {
	private int dan;
	public Gugudan(int dan) {
		this.dan = dan;
	}
	public void test() {
		for(int i =1; i<10;i++) {
			System.out.println(dan +"*" + i +"=" + dan*i);
		}
	}

	public static void main(String[] args) {
		Gugudan g1= new Gugudan(5);
		g1.test(); //5단 출력 
		
		Gugudan g2 = new Gugudan(7);
		g2.test();  //7단 출력 
		
		Gugudan g3 = new Gugudan(9);
		g3.test();  //9단 출력

	}

}

