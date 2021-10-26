/*========================================
  ■■■ 자바의 주요(중요) 클래스 ■■■
  - Calender 클래스
==========================================*/

// ○ 실습 문제
//	  오늘을 기준으로 입력받는 날짜만큼 후의 년, 월, 일, 요일을 확인하여
//	  결과를 출력하는 프로그램을 구현한다.

// 실행 예)
// 오늘 날짜 : 2021-8-11 수요일
// 몇 일 후의 날짜를 확인하고자 하십니까? : 200

//=========[확인 결과]==========
// 200일 후 : xxxx-xx-xx x요일
//==============================
//계속하려면 아무 키나 누르세요...

// ※ 현재 날짜를 기준으로 날 수를 더하는 연산 메소드
//	  『개체.add(Calendar.DATE, 날 수);』

import java.util.Scanner;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Test140
{
	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		Calendar ob = new GregorianCalendar();
		
		
		int days;
		String[] week = {"일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일"};

		// 년, 월, 날, 요일
		int y = ob.get(Calendar.YEAR);
		int m = ob.get(Calendar.MONTH)+1;	
		int d = ob.get(Calendar.DATE);
		int w = ob.get(Calendar.DAY_OF_WEEK)-1;

	
		System.out.printf("오늘 날짜 : %d-%d-%d %s\n", y, m, d, week[w]);

	
		do
		{
			System.out.print(" 몇 일 후의 날짜를 확인하고자 하십니까? : ");
			days = sc.nextInt();
		}
		while (days<1);
		
		// 입력한 값 만큼 날짜 수 증가
		ob.add(Calendar.DATE, days);

		
		y = ob.get(Calendar.YEAR); 
		m = ob.get(Calendar.MONTH)+1;	
		d = ob.get(Calendar.DATE);
		w = ob.get(Calendar.DAY_OF_WEEK)-1;

		
		System.out.println("\n===========[확인결과]===========");
		System.out.printf("%d일 후 : %d-%d-%d %s\n", days, y, m, d, week[w]);
		System.out.println("================================");

	
	}
}
