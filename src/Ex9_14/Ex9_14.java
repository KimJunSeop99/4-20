package Ex9_14;

public class Ex9_14 {

	public static void main(String[] args) {
		Integer i = new Integer(100);
		Integer i2 = new Integer(100);
		
		System.out.println("i==i2 ?" + (i==i2)) ;
		System.out.println("i.equals(i2) ? " + i.equals(i2));
//		compareTo : 같으면 0 , 크면 1, 작으면 -1
		System.out.println("i.compareTo(i2) = " + i.compareTo(i2));
		System.out.println("i.toString() = " + i.toString());
//		INTEGER 최대 표현할 수 있는 값(양수)
		System.out.println("MAX_VALUE = " + Integer.MAX_VALUE);
//		INTEGER 최소 표현할 수 있는 값(음수)
		System.out.println("MIN_VALUE = " + Integer.MIN_VALUE);
//		SIZE : bit 표현할 수 있는 범위 32bit
		System.out.println("SIZE = " + Integer.SIZE + "bits");
//		BYTES : byte 표현할 수 있는 범위 4byte
		System.out.println("BYTES = " + Integer.BYTES + "bytes");
//		TYPE : 자료형 int
		System.out.println("TYPE = " + Integer.TYPE);
			
	}

}
