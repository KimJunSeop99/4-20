package Ex9_16;

public class Ex9_16 {

	public static void main(String[] args) {
		int i = 10;

//		래퍼(wrapper) 클래스
		Integer intg = (Integer) i;
		
		Object obj = (Object) i;
//		래퍼(wrapper) 클래스
		Long lng = 100L;

//		오토박싱 : 래퍼객체.intValue() + 기본정수 : 연산 O
//				래퍼객체 + 기본정수 : 연산 O
		int i2 = intg + 10; // 래퍼객체 + 기본정수 = 연산O : 오토박싱
		long l = intg + lng;

		Integer intg2 = new Integer(20);
		int i3 = (int) intg2;

		Integer intg3 = intg2 + i3;

		System.out.println("i = " + i);
		System.out.println("intg = " + intg);
		System.out.println("obj = " + obj);
		System.out.println("lng = " + lng);
		System.out.println("intg + 10 = " + i2);
		System.out.println("intg + lng = " + l);
		System.out.println("intg2 = " + intg2);
		System.out.println("i3 = " + i3);
		System.out.println("intg2 + i3 = " + intg3);

	}

}
