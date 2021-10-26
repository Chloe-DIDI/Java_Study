/*===============================================
  ■■■ 자바의 기본 프로그래밍 ■■■
  - 퀴즈
	삼각형의 밑변의 길이와 높이를 사용자로부터 입력받아
	이 삼각형의 넓이를 구하는 프로그램을 구현한다.
=================================================*/

//실행 예)
//■ 삼각형의 넓이 구하기■
//-삼각형의 밑변 입력 : 3
//-삼각형의 높이 입력 : 5

// >>밑변이 3, 높이가 5인 삼격형의 넓이 : XXXXX
//계속하려면 아무키나 누르세요.....

// ※ 삼각형의 넓이 = 밑변 * 높이 / 2
//					  -----------
//					  사용자로부터 데이터를 입력받아 처리 → BufferedReader 활용

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
//import.java.lang.* ; 

public class Test012
{
	public static void main(String[] args) throws IOException
	{

		//주요 변수 선언


		//BufferedReader 인스턴스 생성 -> br을 변수로 선언
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			//빨강색으로 적히는건 위에 import로 어디에잇는지알려줘야된다
			//그럼 왜 string랑 system은 안해도되냐?
			//import java.lang.string;
			//import java.lang.system;
			//lang는 언어라는거라서 io와 달리 할 필요 없다

			int bottomLength, height;		//--밑변과 높이
			double area;					//--넓이 

			//연산 및 처리
			//① 사용자에게 안내 메세지 출력
			System.out.println("■ 삼각형의 넓이 구하기 ■");
			System.out.print("- 삼각형의 밑변 입력 : ");

			//② 사용자가 입력한 데이터를 정수 형태로 변환한 후
			//	 변수 bottomLength 에 담아내기
			bottomLength = Integer.parseInt(br.readLine());

			//③ 다시 사용자에게 안내 메세지 출력
			System.out.print("- 삼각형의 높이 입력 : ");

			// ④ 사용자가 입력한 데이터를 정수 형태로 변환한 후
			//		변수 height 에 담아내기
			height = Integer.parseInt(br.readLine());

			// ⑤ 값이 채워진(담겨진) 변수들을 활용하여
			//	삼각형의 넓이를 구하는 연산 수행
			//	삼각형의 넓이 = 밑변 * 높이 / 2
			//		 정수형		  정수형   정수형 → 정수 기반 연산
			area = bottomLength * height / 2.0;						//check!!!!
			//		 정수형		  정수형   실수형 → 실수 기반 연산

			//※ 실수 자료형이 결과값으로 산출되는 과정ㅇ에서
			//	 실수 기반의 연산이 필요한 상황이다.
			//	 정수형 『2』가 아닌 실수형 『2.0』ㅇ로 나눗셈 연산을 수행하게 되면
			//	 이 연산은 실수 기반으로 처리된다.

			//	○ 결과 출력

			System.out.println(); //-- 매개변수가 없을 경우 -> 개행
			//System.out.print(); //-- 매개변수가 없을 경우 -> 에러

			System.out.printf(">> 밑변이 %d, 높이가 %d인 삼각형의 넓이 : %.2f\n", bottomLength, height, area);


			//결과 출력
		

		//학원풀이

	


		//내 풀이
		/*
		int a, b;		//밑변, 높이
		double c;		//삼각형 넓이

		System.out.print("삼각형의 밑변 입력 : ");
		a = Integer.parseInt(br.readLine());
		
		System.out.print("삼각형의 높이 입력 : ");
		b = Integer.parseInt(br.readLine());

		c = a*b / 2;

		System.out.println("밑변이 " + a + ","+ " 높이가 " + b + "인 삼각형의 넓이 : " + c);
		*/
 
 		// 내가 제어하는 동안 마우스 안 건드리면 되요 ^^

	}
}