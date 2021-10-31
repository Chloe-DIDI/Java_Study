/*===========================================================
  ■■■ 클래스와 인스턴스 ■■■
=============================================================*/

// ※ Test066.java 파일과 세트~!!!

// 원의 넓이와 둘레 구하기
// 원의 넓이와 둘레를 구할 수 있는 클래스를 설계한다.
// (클래스명 : CircleTest) → CircleTest.java
// Test065.java 파일을 참조하되
// 위와 같이 두 개의 파일로 나누어 작업을 수행한다.
// 또한, BufferedReader 를 활용한다.

// 원의 넓이 = 반지름 * 반지름 * 3.141592
// 원의 둘레 = 반지름 * 2 * 3.141592

// 실행 예)
// 반지름 입력 : 13

// 반지름이 13인 원의 넓이
// 넓이 : xxx.xx
// 둘레 : xxx.xx
// 계속하려면 아무 키나 누르세요...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class CircleTest
{
	// 주요 속성
	int r;							//-- 반지름
	final double PI = 3.141592;		//-- 원주율 ( 변수의 상수화 )
	
	// 기능(동작, 행위)
	// 반지름 입력 기능
	void input() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("반지름 입력 : ");
		r = Integer.parseInt(br.readLine());
	}

	// 넓이 연산 기능
	double calArea()			//반환해야되는 자료형은 double,,,,매개변수 없다
	{
		double result = 0;		

		result = r * r * PI;

		return result;

	}

	// 둘레 연산 기능
	double calLength()			//반환해야되는 자료형은 double,,,,매개변수 없다
	{
		double result = 0;		

		result = r * 2 * PI;

		return result;
	}


	// 출력 기능
	void print(double a, double l)
	{
		// 반지름이 13인 원의 넓이
		// 넓이 : xxx.xx
		// 둘레 : xxx.xx

		System.out.printf("반지름이 %d인 원의\n",r);
		System.out.printf("넓이 : 2%f\n",a);
		System.out.printf("둘레 : 2%f\n",l);

	}
} 
