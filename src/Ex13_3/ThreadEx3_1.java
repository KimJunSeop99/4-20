package Ex13_3;

public class ThreadEx3_1 extends Thread{
	public void run() {
		for(int i=0; i<300; i++) {
			System.out.printf("%s", new String("|"));
		}
		
		System.out.println("소요시간 2: " + (System.currentTimeMillis() -Ex13_3.startTime));
	}
	
	
}
