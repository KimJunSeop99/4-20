package Ex13_3;

public class Ex13_3 {

	public static long startTime;

	public static void main(String[] args) {
		ThreadEx3_1 th1 = new ThreadEx3_1();
		th1.start();
		startTime = System.currentTimeMillis();

		for (int i = 0; i < 300; i++) {
			System.out.printf("%s", new String("-"));
		}
		System.out.println("소요시간 1 : " + (System.currentTimeMillis() - Ex13_3.startTime));

	}

}
