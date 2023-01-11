package CH05;

import java.util.Scanner;

public class C02나머지연산자 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 3개를 입력하세요");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		sc.close();
		int sum = num1 + num2 + num3;
		String result = (sum%2==0 && sum%5==0)? "참입니다":"거짓입니다.";
		System.out.println(result);
		

	}

}
