/*===========================================================
  ■■■ 클래스와 인스턴스 ■■■
=============================================================*/

// 사용자로부터 임의의 두 정수와 연산자를 입력받아
// 사칙연산을 수행하는 프로그램을 구현한다.
// 단, 클래스와 인스턴스의 개념을 활용하여 작성할 수 있도록 한다.

// 실행 예)
// 임의의 두 정수 입력(공백 구분) : 10 5
// 임의의 연산자 입력( + - * / ) : +
// >> 10 + 5 = 15
// 계속하려면 아무 키나 누르세요...


import java.util.Scanner;
import java.io.IOException;

class Calculate
{
	//주요 변수 선언		
	int su1, su2;			//--사용자로부터 입력받음 두 정수를 담아둘 변수
	char op;				//--사용자로부터 입력받은 연산자를 담아둘 변수

	//메소드 정의(기능 : 입력)
	void input() throws IOException	//throws IOException이거는	 System.in.read();땸에
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("임의의 두 정수 입력(공백 구분) : ");
		su1 = sc.nextInt();
		su2 = sc.nextInt();

		System.out.print("임의의 연산자 입력( + - * / ) : ");
		op = (char)System.in.read();
	}


	//메소드 정의(기능 : 연산)
	int cal()
	{ 
		int result = 0;

		switch(op)
		{
			case'+' : result = su1 + su2; break;
			case'-' : result = su1 - su2; break;
			case'*' : result = su1 * su2; break;
			case'%' : result = su1 % su2; break;
		}
		return result;

	}
	
	// 메소드 정의(기능 : 출력)
	void print(int s)
	{
		System.out.printf(">>%d %c %d=%d\n", su1,op,su2,s);
	}
}


public class Test068
{
	public static void main(String[] args) throws IOException
	{
		//calcylate 클래스 인스턴스 생성
		Calculate cal = new Calculate();

		cal.input();
		int result=cal.cal();
		cal.print(result);
	}
}

//실행결과
/*
임의의 두 정수 입력(공백 구부) : 10 2
임의의 연산자 입력( + - * / ) : *
>>10 * 2=20
계속하려면 아무 키나 누르십시오 . . .
*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	// 주요 변수 선언
	int a, b;		
	char ch;


	void input() throws IOException
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("임의의 두 정수 입력(공백 구분) : ");
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.print("임의의 연산자 입력(+ - * /)   : ");
		ch = (char)System.in.read();
	}
	
	double cal()
	{
		double result=0;
		switch (ch)
		{
		case '+': result = a+b; break;
		case '-': result = a-b; break;
		case '*': result = a*b; break;
		case '/': result = a/b; break;
		}

		return result;
	}

	
	void print(double k)
	{
		System.out.printf(">> %d %c %d = %.1f\n", a, ch, b, k);
	}
	
}

public class Test068
{
	public static void main(String[] args) throws IOException
	{
		
		Calculate ob = new Calculate();

		ob.input();			
		double result = ob.cal();	     
		ob.print(result);		        
	}
}*/

/*
임의의 두 정수 입력(공백 구분) : 5 10
임의의 연산자 입력(+ - * /)   : *
>> 5 * 10 = 50.0
계속하려면 아무 키나 누르십시오 . . .
*/
