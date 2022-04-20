package Ex13_2;

public class Ex13_2 {

	public static void main(String[] args) {
//		시스템 시간계산 메소드(ms단위 : 1000분의1초) : currentTimeMillis()
		long startTime = System.currentTimeMillis();
		
		for(int i=0; i<300; i++) {
			System.out.printf("%s", new String("-"));
		}
		System.out.print("소요시간 1: " + (System.currentTimeMillis()-startTime));
		
		for(int i=0; i<300; i++) {
			System.out.printf("%s", new String("|"));
		}
		System.out.print("소요시간 2: " + (System.currentTimeMillis()- startTime));
	}

}
