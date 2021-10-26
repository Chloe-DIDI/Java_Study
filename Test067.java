/*===========================================================
  ■■■ 클래스와 인스턴스 ■■■
=============================================================*/

// 사용자로부터 임의의 정수를 입력받아
// 1부터 입력받은 수 까지의 합을 연산하여
// 결과값을 출력하는 프로그램을 구현한다.

// 단, 클래스와 인스턴스의 개념을 활용하여 처리할 수 있도록 한다.
// 또한, 입력 처리 과정에서 BufferedReader 를 활용하며,
// 입력 데이터가 1 보다 작거나 1000 보다 큰 경우
// 다시 입력받을 수 있는 처리를 포함하여 프로그램을 구현할 수 있도록 한다.

// 실행 예)
// 임의의 정수 입력 (1~1000) : 1022
// 임의의 정수 입력 (1~1000) : -20 
// 임의의 정수 입력 (1~1000) : 100
// >> 1 ~ 100 까지의 합 : 5050
// 계속하려면 아무 키나 누르세요...


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Hap
{
	// 주요 변수 선언(사용자의 입력값을 담아둘 변수)
	int su;

	// 입력 메소드 정의
	void input() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		do
		{
			System.out.print("임의의 정수 입력(1~1000) : ");
			su = Integer.parseInt(br.readLine());

		}
		while (su<1 || su>1000);
	}

	// 연산 처리 메소드 정의
	int calculate()
	{
		int result = 0;

		for (int i=1; i<=su; i++)
			result += i;

		return result;
	}

	

	// 결과 출력 메소드 정의
	void print(int sum)
	{
		System.out.printf(">>1 ~ %d 까지의 합 : %d\n", su,sum);
	}
}

//import java.io.IOException;		여기에 쓰이는게아니라 무조건 젤위에

public class Test067
{
	public static void main(String[] args) throws IOException
	{
		//Hap 클래스 인스턴스 생성
		Hap ob = new Hap();

		//생성한 인스턴스를 통해 입력 메소드 호출
		ob.input();

		//생성한 인스턴스를 통해 연산 처리 메소드 호출
		int s = ob.calculate();

		//생성한 인스턴스를 통해 결과 출력 메소드 호출
		ob.print(s);
	}

}

//실행결과
/*
임의의 정수 입력(1~1000) : 2000
임의의 정수 입력(1~1000) : -20
임의의 정수 입력(1~1000) : 200
>>1 ~ 200 까지의 합 : 20100
계속하려면 아무 키나 누르십시오 . . .*/



//내가 푼것
/*
	
	// 기능(동작, 행위)
	// 정수 입력 기능
	void input() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		do
		{	
			System.out.print("임의의 정수 입력 (1~1000) : ");
			a = Integer.parseInt(br.readLine());
		}
	}
	while( n<1 ||

	int calSum()
	{
		int sum = 0;				// 변수 합
		sum +=a;
		a++;

		return sum;
	}

	// 출력 기능
	void print(int a)
	{
		 System.out.printf(">> 1 ~ %d 까지의 합 : \n", sum);
	}

}	
public class Test067
{
		public static void main(String[] args) throws IOException
	{
		// Hap 크래스 인스턴스 생성
		Hap ob = new Hap();
		
		// 생성된 인스턴스 ob 를 통해 반지름 입력 메소드 호출
		ob.input();

		//생성된 인스턴스 ob 를 통해 넓이 연산 메소드 호출
		int a = ob.calSum();

		//생성된 인스턴스 ob 를 통해 출력 메소드 호출
		ob.print(a);		// a,l 말고 b,t 이렇게 적어도 상관없다 키티예제를 생각해라~!

	}
}*/