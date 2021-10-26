/*====================================
	■■■ 자바의 개요 및 특징 ■■■
	-변수와 자료형
	-키워드 및 식별자
	-printf()
======================================*/

public class Test005
{
	public static void main(String[] args)
	{
		//변수 선언 및 초기화(메모리에 값 할당)
		// int a=10, int b=5; 
		//이렇게 선언 안함
		//밑에처럼 선ㄴ언함
		int a=10, b=5;

		//변수 선언
		int c,d;

		//연산 및 처리
		c = a + b;		//-- a + b의 결과값을 변수 c 에 대입하라.
		d = a - b;		//-- a + b의 결과값을 변수 c 에 대입하라.

		//결과 출력 → 『10 + 5 = 15』 의 형태...
		//System.out.println( a + b = c );
		System.out.println( a + " + " + b + " = " + c );
		//--==>> 10 + 5 = 15
		//				  숫자  문자열 숫자 문자열 숫자
		//-- 자바에서는 서로 다른 자료형의 데이터들끼리도
		//	『+』 연산이 가능하며
		//	다른 어떤 자료형과 문자열 데이터의 『+』 연산결과는 문자열.
		//	즉, 문자열 결합 연산자로써 『+』
	
		//print() / println() / printf() / format()
		//--JDK 1.5 부터 지원되는 메소드
		System.out.printf("%d + %d = %d\n", 10, 20, 30);	// 『\n』 개행
		System.out.printf("%d + %d = %d%n", 10, 20, 30);	// 『%n』 개행
		//첫번째 동그라미에는 10
		//두번째 동그라미에는 20
		//세번째 동그라미에는 30
		//정수형태 넣을거면 %d하면됨
		//예시로 지금 동그라미 넣어둔거 밑에꺼 확인
		//System.out.printf("○ + ○ = ○", 10, 20, 30);
		

		System.out.printf("%d 와 %f%n", 10, 3.141592);	
		//System.out.printf("○ 와 ○", 10, 3.141592);	
		//첫번째 ○는 10이니까 정수형 → %d
		//두번째 ○는 실수 → %f 
		//그러고 개행해야되니까 뒤에 %n 붙이기
		//--==> 10 와 3.141592

		System.out.printf("%d 와 %.2f%n", 10, 3.141592);
		//소수점 이하 두 번째 자리까지 표현 ( 반올림 발생 )
		//--==>> 10 와 3.14

		System.out.printf("%d 와 %.4f%n", 10, 3.141592);
		//소수점 이하 네 번째 자리까지 표현( 반올림 발생 )
		//--==>> 10 와 3.1416


		/*
		10 + 5 = 15
		10 + 20 = 30
		10 + 20 = 30
		10 와 3.141592
		10 와 3.14
		10 와 3.1416
		*/


	}
}