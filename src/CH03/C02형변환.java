package CH03;

public class C02형변환 {

	public static void main(String[] args) {
		// 강제 형변환
		// 좁은 범위공간에 큰 값을 넣으려고 하는경우
		// 기본적으로 불가능하기 떄문에 강제로 자료형을 바꾸어 전달한다
		// 데이터 손실의 염려가 있다
		int intValue = 44032;
		char  charValue = (char)intValue;	//(char)를 지우면 오류
		System.out.println(charValue);
		
		long longValue = 500;
		intValue = (int) longValue;
		System.out.println(intValue);
		
		//데이터 손실!
		double doubleValue = 3.14;
		intValue = (int)doubleValue;
		System.out.println(intValue);

		//char vs short
		char ch = '가';
		short ch2 = (short)ch;	//왜 안돼?
		System.out.printf("%d %d\n", (int)ch , ch2);
	}

}
