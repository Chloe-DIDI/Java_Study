/*=======================
  ■■■ 만년달력 ■■■
=========================*/

//실행 예)
//『연도』를 입력하세요 : 2021
//『월』을 입력하세요 : 8
//
/*
      [ 2020년 8월 ]

일  월  화  수  목  금  토
==========================
1	2	3	4	5	6	7
8	9	10	11	12	13	14
15	16	17	18	19	20	21	
22	23	24	25	26	27	28
29	30	31
==========================
계속하려면 아무 키나 누르세요...
*/
/*
○ 문제 분석 및 접근
	- 서기 1년 1월 1일 : 월요일
	- 연도가 4의 배수이면서 100의 배수가 아니거나,
	  400의 배수이면 2월은 29일(윤년),
	  나머지 2월 28일(평년)
	- 만약 2021년 8월 달력을 그린다고 가정하면
	  1.1.1 ~ 2021.7.31 까지의 날 수를 구한다.
	  그 날 수에 『+1』 연산을 수행하면...(1.1.1 ~ 2021.8.1) 날 수 확인
	  이 날 수를 통해 2021년 8월 1일의 요일 확인
*/

import java.io.InputStreamReader; 
import java.io.BufferedReader; 
import java.io.IOException;

public class Test101
{
	public static void main(String[] args) throws IOException
	{

		//BufferedReader 인스턴스 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		//배열 선언 및 초기화
		//-- 각 달이 담고 있는 마지막 날짜(매 월의 최대 날짜)
		int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		//테스트
		//System.out.println("days.length : " + days.length);
		//--==>>>days.length : 12
		
		
		//주요 변수 선언
		int nalsu,y, m, w;

		do
		{
			System.out.print("『연도』를 입력하세요 : ");
			y = Integer.parseInt(br.readLine());
		}
		while (y<1);

		do
		{
			System.out.print("『월』을 입력하세요 : ");
			m = Integer.parseInt(br.readLine());
		}
		while (m<1 || m>12);
		//----------------------------------------여기까지 수행하면 유효한 연도, 월 입력한 상태

		//입력받은 년도에 해당하는 2월의 마지막 날 계산
		if ((y%4==0 && y%100!=0) || y%400==0)	//--윤년이라면...
		{
			days[1] = 29;		
		}
		/*
		else			
		{
			days[1] = 28;
		}
		*/
		//-- else 구문은
		//	 현재 days 배열의 1번째 요소(즉, 2월)가 28로 구성되어 있는 상태이기 때문에
		//	 생략 가능한 구문이 된다.

		// 1년 1월 1일 ~ 입력받은 년도 이전년도의 12월 31일 까지의 날 수 계산
		nalsu = (y-1)*365 + (y-1)/4 - (y-1)/100 + (y-1)/400;
		
		// 입력받은 년도(해당년도) 1월 1일 ~ 입력한 월의 이전 월까지의 날 수 누적 연산
		for (int i=0; i<(m-1); i++)		//배열 index가
			nalsu += days[i];
		
		// 입력받은 월의 1일을 날 수 누적 연산
		nalsu += 1;			// ++nalsu;
		
		//------------------------------------------여기까지 수행하며]면 모든 날 수에 대한 종합 완료

		// 요일 산출
		// : 입력받은 월의 1일이 무슨 요일인지 확인하기 위한 연산
		w = nalsu % 7;		//--0:일요일, 1:월요일, 2:화요일...

		//테스트
		//System.out.println("w : " + w);

		//-------------------------------------여기까지 수행하면 해당 년 해달 월 1일이 
		//									   무슨 요일인지 확인 완료

		//출력(달력 그리기) 
		System.out.println();
		System.out.printf("\t [%d년 %d월 ]\n", y, m);
		System.out.println();
		System.out.println("  일  월  화  수  목  금  토  ");
		System.out.println("==============================");

		// 특정 요일부터 1일이 출발할 수 있도록 공백 발생(지정)
		for (int i=1; i<=w; i++)
		{
			System.out.print("    ");	// 공백 4칸 발생
		}

		// 테스트
		//System.out.printf("%4d", 1);

		//해당 월(입력한 월)의 날짜들이 출력될 수 있도록 반복문 구성
		for (int i=1; i<=days[m-1]; i++)
		{
			System.out.printf("%4d", i);		// 1 2 3 4 5 6 7 8 9 ... 31
		
			w++;								// 날짜를 하나씩 처리할 대 마다 요일도 하나씩 증가
			
			if (w%7==0)							// 일요일에 해당하는 날짜일 경우
			{
				 System.out.println();			// 개행
			}
		}
		
		// 달의 마지막 날짜가 출력 형식을 모두 채웠을 경우
		// 이미 일요일 개행이 이루어졌기 때문에
		//이 경우는 추가 개행을 하지않도록 처리~!!!		ex)2020 2월입력햇을때 맨밑줄공백나오는거없어짐
		if (w%7!=0)
		{
			System.out.println();			// 개행
		}
		
		System.out.println("==============================");
	}
}

//실행결과
/*『연도』를 입력하세요 : 2021
『월』을 입력하세요 : 8

         [2021년 8월 ]

  일  월  화  수  목  금  토
==============================
   1   2   3   4   5   6   7
   8   9  10  11  12  13  14
  15  16  17  18  19  20  21
  22  23  24  25  26  27  28
  29  30  31
==============================
계속하려면 아무 키나 누르십시오 . . .
*/
		



