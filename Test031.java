/*===========================================================
  ■■■ 실행 흐름의 컨트롤(제어문, 조건문과 반복문) ■■■
  - if ~ else 문 실습
=============================================================*/

//○ 과제
//사용자로부터 임의의연도를 입력받아
//입력받은 연도가... 윤년인지 평년인지 판별하여
//그 결과를 출력하는 프로그램을 구현한다.
//단, 입력은 BufferedReader를 활용하고,
//처리 과정은 if 조건문 활용하여 수행할 수 있도록 한다.

// 실행 예)
// 임의의 연도 입력 : 2021
// 2021년 → 평년
// 계속하려면 아무 키나 누르세요...

// 임의의 연도 입력 : 2020
// 2020년 → 윤년
// 계속하려면 아무 키나 누르세요...

// 임의의 연도 입력 : 2012
// 2012년 → 윤년
// 계속하려면 아무 키나 누르세요...

// ※ 2월이 28일까지 있는 해 → 평년
//			29일까지 있는 해 → 윤년

// ※ 윤년의 판별 조건
//	  연도가 4의 배수이면서 100의 배수가 아니거나	//&&
//	  400의 배수이면 윤년 ~!!!
//	  그렇지 않으면 평년~!!!

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Test031
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int year;				//--연도를 담아둘 변수
		String strResult;		//--윤년 평년에 대한 판별 결과를 담아둘 변수


		System.out.print("임의의 연도 입력 : ");
		year = Integer.parseInt(br.readLine());



		if(year%4==0 && year%100!=0)	// 연도가 4의 배수이면서 100의 배수가 아니거나
		{
			strResult = "윤년";		
		}
		else if(year%400==0)			// 400의 배수이면 윤년
		{
			strResult = "윤년";
		}
		else 
		{
			strResult = "평년";			// 그렇지 않으면 평년
		}
		
		// 결과
		System.out.println( year + "→" +strResult);

		//실행 결과
		/*
		임의의 연도 입력 : 2021
		2021→평년
		계속하려면 아무 키나 누르십시오 . . .

		임의의 연도 입력 : 2020
		2020→윤년
		계속하려면 아무 키나 누르십시오 . . .

		임의의 연도 입력 : 2012
		2012→윤년
		계속하려면 아무 키나 누르십시오 . . .
		*/

		
	}
}
