package CH05;

public class C03비트연산자 {

	public static void main(String[] args) {
		int num1 = 15;
		int num2 = 20;
		int num3 = num1&num2;
		int num4 = num1|num2;
		int num5 = num1^num2;
		int num6 = ~num1;
		
		System.out.println("AND 비트 연산 결과 : " + num3);
		System.out.println("OR 비트 연산 결과 : " + num4);
		System.out.println("XOR 비트 연산 결과 : " + num5);
		System.out.println("NOT 비트 연산  결과 : " + num6);
		

	}

}
