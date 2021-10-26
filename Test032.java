/*===========================================================
  ■■■ 실행 흐름의 컨트롤(제어문, 조건문과 반복문) ■■■
  - if ~ else 문 실습
=============================================================*/
// 사용자로부터 임의의 두 정수와 연산자를 입력받아
// 해당 연산자의 연산 처리 결과를 출력하는 프로그램을 구현한다.
// 단, if 조건문을 활용하여 처리할 수 있도록 하며,.
// 연산 결과는 편의상 정수형을 처리될 수 있도록 한다.

// 실행 예)
// 첫 번째 정수 입력  : 20
// 두 번째 정수 입력  : 14
// 연산자 입력[+ - * /] : +

// >> 20 + 14 = 34

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Test032
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


		//방법 ①
		/*
		int a, b;			//-- 첫 번째, 두 번째 정수
		char op;			//-- 연산자

		System.out.print("첫번째 정수 입력 : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("두번째 정수 입력 : ");
		b = Integer.parseInt(br.readLine());

		// Integer.parseInt() →
		// "1234" → Integer.parseInt() → 1234
		// "abcd" → Integer.parseInt() → 에러남


		System.out.print("연산자 입력[+ - * /] : ");
		//op = Integer.parseInt(br.readLine());
		//op = System.in.read();
		op = (char)System.in.read();

		if(op=='+') // 43==43
		{
			System.out.printf("\n>> %d + %d = %d\n", a, b, (a+b));
		}
		else if(op=='-') // 45==45
		{
			System.out.printf("\n>> %d - %d = %d\n", a, b, (a-b));
		}
		else if(op=='*') // 42==42
		{
			System.out.printf("\n>> %d * %d = %d\n", a, b, (a*b));
		}
		else if(op=='/') // 47==47
		{
			System.out.printf("\n>> %d / %d = %d\n", a, b, (a/b));
		}
		else
			System.out.printf("\n>> 입력 과정에 오류가 존재합니다.\n");

		*/
		
		
		// 방법 ②  
		/*

		int a, b, op;		//-- 첫 번째, 두 번째 정수, 그리고 연산자

		System.out.print("첫번째 정수 입력 : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("두번째 정수 입력 : ");
		b = Integer.parseInt(br.readLine());


		System.out.print("연산자 입력[+ - * /] : ");
		op = System.in.read();

		if(op==43)
			System.out.printf("\n>> %d + %d = %d\n", a, b, (a+b));
		else if(op==45)
			System.out.printf("\n>> %d - %d = %d\n", a, b, (a-b));
		else if(op==42)
			System.out.printf("\n>> %d * %d = %d\n", a, b, (a*b));
		else if(op==47) 
			System.out.printf("\n>> %d / %d = %d\n", a, b, (a/b));
		else
			System.out.printf("\n>> 입력 과정에 오류가 존재합니다.\n");
		
		*/
		

		// 방법 ③
		
		int a, b, result=0;		//-- 첫 번째, 두 번째 정수, 그리고 연산자
		char op;

		System.out.print("첫번째 정수 입력 : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("두번째 정수 입력 : ");
		b = Integer.parseInt(br.readLine());


		System.out.print("연산자 입력[+ - * /] : ");
		op = (char)System.in.read();

		if(op=='+') 
			result = a + b;
		else if(op=='-') 
			result = a - b;
		else if(op=='*') 
			result = a * b;
		else if(op=='/') 
			result = a / b;

		System.out.printf("\n>> %d %c %d = %d\n", a, op, b, result); 


	}
}


/* 번 결과

첫번째 정수 입력 : 27
두번째 정수 입력 : 6
연산자 입력[+ - * /] : -

>> 27 - 6 = 21
계속하려면 아무 키나 누르십시오 . . .

*/



		
		
/*
		int a, b;
		char c;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
*/
		



//내가 한거
/*
		int a, b;
		char c;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		

		System.out.print("첫번째 정수 입력 : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("두번째 정수 입력 : ");
		b = Integer.parseInt(br.readLine());

		System.out.print("연산자 입력[+ - * /] : ");
		c = (char)System.in.read();

		if (c == '+')
		{
			System.out.printf("%d %c %d = %d\n", a, c, b, (a+b));
		}
		
		else if (c == '-')
		{
			System.out.printf("%d %c %d = %d\n", a, c, b, (a-b));
		}

		else if (c == '*')
		{
			System.out.printf("%d %c %d = %d\n", a, c, b, (a*b));
		}

		else if (c == '/')
		{
			System.out.printf("%d %c %d = %d\n", a, c, b, (a/b));
		}

		
	}
}
*/