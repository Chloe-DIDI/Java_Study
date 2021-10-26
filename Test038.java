/*===========================================================
  ■■■ 실행 흐름의 컨트롤(제어문, 조건문과 반복문) ■■■
  - switch 문 실습
=============================================================*/

// 사용자로부터 임의의 두 정수와 연산자를 입력받아
// 해당 연산자의 연산 처리 결과를 출력하는 프로그램을 구현한다.
// 단, switch 조건문을 활용하여 처리할 수 있도록 하며,.
// 연산 결과는 편의상 정수형을 처리될 수 있도록 한다.

// 실행 예)
// 첫 번째 정수 입력  : 20
// 두 번째 정수 입력  : 14
// 연산자 입력[+ - * /] : +

// >> 20 + 14 = 34


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Test038
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


		// ①
/*
		// int a, b, result=0;
		int a, b, result; //!!!!result 값을초기화안시키고이렇게 하고싶다면
		int op;

		System.out.print("첫 번째 정수 입력  : ");
		a = Integer.parseInt(br.readLine());
				
		System.out.print("두번째 정수 입력 : ");
		b = Integer.parseInt(br.readLine());

		System.out.print("연산자 입력[+ - * /] : ");
		op = System.in.read();

		// + → op:43, - → op:45, * → op:42, / → op:47

		switch (op)
		{
			case 43: result=a+b;break;
			case 45: result=a-b;break;
			case 42: result=a*b;break;
			case 47: result=a/b;break;
			default: return;	//!!!! 이렇게 하면됨	//check~!!!!
		
		}

		// ※ return 키워드가 지니는 두 가지 의미
		// 1. 값의 반환
		// 2. 메소드의 종료 → main() 메소드 종료 → 프로그램 끝

		System.out.println();
		System.out.printf(">> %d %c %d = %d\n", a, op, b, result);
		//						----
		//						문자값 + - * /
		// 만약에 %d 라면 아스키코드값으로 숫자가 올것
*/

//실행 결과
/*
첫 번째 정수 입력  : 27
두번째 정수 입력 : 7
연산자 입력[+ - * /] : -

>> 27 - 7 = 20
계속하려면 아무 키나 누르십시오 . . .
*/


		// ②
/*		int a, b, result;
		char op;

		System.out.print("첫 번째 정수 입력  : ");
		a = Integer.parseInt(br.readLine());
				
		System.out.print("두번째 정수 입력 : ");
		b = Integer.parseInt(br.readLine());

		System.out.print("연산자 입력[+ - * /] : ");
		op = (char)System.in.read();

		switch (op)
		{
			case '+': result=a+b;break;
			case '-': result=a-b;break;
			case '*': result=a*b;break;
			case '/': result=a/b;break;
			default: return;
		
		}

		System.out.println();
		System.out.printf(">> %d %c %d = %d\n", a, op, b, result);
*/

		// ③
		int a, b, result;
		String op;				//--check~!!!

		System.out.print("첫 번째 정수 입력  : ");
		a = Integer.parseInt(br.readLine());
				
		System.out.print("두번째 정수 입력 : ");
		b = Integer.parseInt(br.readLine());

		System.out.print("연산자 입력[+ - * /] : ");
		op = br.readLine();		//--check~!!!

		switch (op)				//--check~!!!
		{
			case "+": result=a+b;break;
			case "-": result=a-b;break;
			case "*": result=a*b;break;
			case "/": result=a/b;break;
			default: return;
		
		}

		System.out.println();
		System.out.printf(">> %d %s %d = %d\n", a, op, b, result);
		//						---- 
		//						문자열이니까 s




		//내가 푼것
		/*
		int a, b;
		char op;

		System.out.print("첫번째 정수 입력 : ");
		a = Integer.parseInt(br.readLine());
				
		System.out.print("두번째 정수 입력 : ");
		b = Integer.parseInt(br.readLine());

		System.out.print("연산자 입력[+ - * /] : ");
		op = (char)System.in.read();

		switch (op)
		{
		case '+': System.out.printf("\n >> %d + %d = %d\n", a, b, a+b); break;
		case '-' : System.out.printf("\n>> %d %c %d = %d\n", a, op, b, a-b); break;
		case '*': System.out.printf("\n>> %d %c %d = %d\n", a, op, b, a*b); break;
		case '/': System.out.printf("\n>> %d %c %d = %d\n", a, op, b, a/b); break;
		default: System.out.println("\n>> 입력 오류");
		}
		*/


		
	}
}
