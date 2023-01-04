package CH05;

public class C01연산자 {

	public static void main(String[] args) {
//		// 산술연산자( + - *  / % )
//		int a = 10, b = 20, c;
//		System.out.println("a + b=" + (a + b));
//		System.out.println("a-b"+ (a - b));
//		System.out.println("a*b" + (a * b));
//		System.out.println("b/a" + (b / a));	//나누기 - 몫
//		System.out.println("a%b" + (a % b));	//나누기 - 나머지(1.짝수홀수 구분
//		System.out.println("-a=" + -a);
		
		
//		//복합대입연산자(선택)
//		int a = 10;
//		a += 10;	// a = a + 10;
//		a -= 5;		// a = a - 5;
//		a *= 3;		// a = a a*3;
//		System.out.println("a="+a);

		
//		//비교연산자(중요!)	 > >= < <= == != ? true / false
//		int a = 10;
//		int b = 20;
//		System.out.println("A == B : "+ ( a = b));	//a=b와 혼동하지 말것
//		System.out.println("A == B : "+ ( a == b));	//a=b와 혼동하지 말것
//		System.out.println("A > B : "+ ( a > b));	
//		System.out.println("A < B : "+ ( a < b));	
//		System.out.println("A >= B : "+ ( a >= b));	
//		System.out.println("A <= B : "+ ( a <= b));	
//		System.out.println("A != B : "+ ( a != b));	
		
		//논리연산자(중요!)
		// And연산 && : 모든 조건식이 true이어야지만 true을 반환
		// Or연산 || : 조건식 중 하나라도 true이면 true을 반환
		// ! : true라면 false 반환, false라면 true을 반환
		
//		System.out.println("true AND true = " + (true && true));
//		System.out.println("false AND true = " + (false && true));
//		System.out.println("ture AND false = " + (true && false));
//		System.out.println("false AND false = " + (false && false));

//		int a = 10, b = 20, c = 5;
//		System.out.println("(10>5) && (6>4) = " + ((10>5) && (6>4)));
//		System.out.println("(a>b) && (a>c) = " + ((a>b) && (a>c)));
		
//		System.out.println("true || true = " + (true || true));
//		System.out.println("false || true = " + (false || true));
//		System.out.println("true || false = " + (true || false));
//		System.out.println("false || false = " + (false || false));
//		
//		int a = 10, b = 20, c = 5;
//		System.out.println("ture || true = " + ((a>b) || (a > c)));
		
//		boolean flag = false;
//		System.out.println("flag : " +flag);
//		System.out.println("!flag : " +!flag);
		//증감연산자
		//++a(--a) : 전치 연산자 : 먼저 값 1증가(1감소) 이후 다른 연산자 처리
		//a++(a--) : 후치 연산자 : 다른 연산자 처리 먼저 한 후 1증가(1감소)
//		int a = 10, b = 10, c, d;
//		c = --a;
//		d = a--;
//		System.out.printf("a = %d, b = %d, c = %d, d = %d", a, b, c, d);
		
//		int a = 10, b = 10, c, d;
//		c = --a + b--;
//		d = a-- + b--;
//		System.out.printf("a = %d, b = %d, c = %d, d = %d", a, b, c, d);
		
		//삼항 연산자
		// (조건식)? 참인경우 실행코드 : 거짓인경우 실행코드;
		
//		int score = 85;
//		char grade = (score > 90) ? 'A' : 'B';
//		System.out.println(score + "점은" + grade + "등급입니다.");
		
		int kor = 85;
		int eng = 60;
		char grade = (kor>80 && eng>80) ? 'A' : 'B';
		System.out.println(grade + "등급입니다.");
		
	}

}
