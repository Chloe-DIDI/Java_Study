/*========================================
  ■■■ 자바의 주요(중요) 클래스 ■■■
  - Calender 클래스
==========================================*/
/*
※ java.util.Calendar 클래스는
   날짜와 시간을 객체 모델링화 한 클래스로 
   연, 월, 일, 요일, 시, 분, 초 까지의 
   시간과 날짜가 관련된 정보를 제공한다.
   그리고, Calendar 클래스는 추상클래스이므로 직접 객체를 생성할 수 없으며 
   실제적인 메소드 구현은 Calendar 클래스의 서브 클래스인
   『GregorianCalendar』 클래스에 정의되어 있다.

   시스템으로부터 현재 시스템 시간 정보를 얻어올 때 
   getInstance() 라는 정적(static) 메소드를 이용하여 객체를 생성할 수 있다.
   생성된 Calendar 클래스 객체는 시스템의 현재 날짜와 시간 정보를 가지며, 
   이 객체가 생성되면 갖고  있는 시간 정보들은
   get() 메소드를 이용하여 쉽게 가져올(사용할) 수 있다.

   getInstance() 메소드는 내부적으로 GregorianCalendar 객체를 생성하여 
   돌려주기 때문에 GregorianCalendar 객체를 직접 생성하여 시간 정보를 구할 수도 있다.
*/

// ○ 실습 문제
//	  사용자로부터 연, 월을 입력받아
//	  달력을 그려주는(출력하는) 프로그램을 구현한다.
//	  단, 만년달력이 아니라 Calendar 클래스를 활용하여 작성할 수 있도록 한다.

// 실행 예)
// 연도 입력 : 0
// 연도 입력 : 2021
// 월 입력   : -2
// 월 입력   : 16
// 월 입력   : 8
/*
      [ 2021년 8월 ]

 일  월  화  수  목  금  토
============================
  1   2   3   4   5   6   7
  8   9  10  11  12  13  14
 15  16  17  18  19  20  21
 22  23  24  25  26  27  28
 29  30  31
============================
계속하려면 아무 키나 누르세요...
*/
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Calendar;


public class Test139
{
	public static void main(String[] arg) 
	{
		//BufferedReader 인스턴스 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//Calendar 인스턴스 생성 
		Calendar ob = Calendar.getInstance();

		//주요 변수 선언
		int y, m;		//-- 년, 월
		int w;			//-- 요일
		int i;

		do
		{
			System.out.print("연도 입력 : ");
			y = Integer.parseInt(br.readLine());
		}
		while (y<1);    

		do
		{
			System.out.print("월 입력 : ");
			m = Integer.parseInt(br.readLine());
		}
		while (m<1 || m>12);    

		// 사용자로부터 입력받은 연(y), 월(m)을 이용하여
		// 달력의 날짜 셋팅
		cal.set(y, m-1, 1);
		//-- 월 구성 시 입력값(m)을 그대로 사용하는 것이 아니라
		//	 입력값에서 1을 뺀 값으로 월을 설정해야 한다.
		//-- 일 구성 시 입력받은 연, 월에 해당하는 1일로 설정해야 한다.
		//	 그 날의 요일 확인을 위해서...

		// 요일 가져오기
		w = cal.get(Calendar.DAY_OF_WEEK);		
		

		// 테스트
		System.out.println(w);
		//--==> 

		// 결과 출력 → 달력 그리기
		System.out.println();
		System.out.println("\t[" + y + "년" + m + "월]\n");
		System.out.println(" 일  월  화  수  목  금  토");
		System.out.println("============================");
		
		// 빈 칸 공백 발생
		for (i=1; i<w; i++)
			System.out.print("    ");
		
		//테스트	
		//System.out.printf("%4d", 1);
		

		// ※ Calendar 의 getActualMaximum() 메소드
		// System.out.println(cal.getActualMaximum(Calendar.DATE));
		for (int i=1; i<cal.getActualMaximum(Calendar.DATE); i++)
		{
			System.out.printf("%4d", i);
			w++;							//-- 반복문을 수행하며 날짜가 증가할 때 마다
											//	 요일도 함께 증가할 수 있도록 처리
			
			if (w%7==1)						//--증가한 요일이
			{
				System.out.println();	// 개행
			}
		}
		
		if (w%7!=1)
			System.out.println();

		System.out.println("=====================");
	}

}






/*
import java.util.Scanner;
import java.util.Calendar;
import java.util.GregorianCalendar;


public class Test139
{
	public static void main(String[] arg) 
	{
		Scanner sc = new Scanner(System.in);
		Calendar ob = new GregorianCalendar();

		int y, m;	

		do
		{
			System.out.print("연도 입력 : ");
			y = sc.nextInt();
		}
		while (y<0);    

		do
		{
			System.out.print("월 입력 : ");
			m = sc.nextInt();
		}
		while (m<0 || m>12);    

		// 날짜 셋팅하기
		ob.set(y, m-1, 1);
		
		int dayOfWeek = ob.get(Calendar.DAY_OF_WEEK);		
		int monthDays = ob.getActualMaximum(Calendar.DATE);	


		// 결과 출력
		System.out.printf("    [ %d년 %d월 ]\n", y, m);    
		System.out.println(" 일  월  화  수  목  금  토");
		System.out.println("============================");
	

		for (int j=1; j<=monthDays; j++) 
		{
			System.out.printf("%4d", j);

			if (((j+dayOfWeek-1)%7==0) || (j == monthDays))   
				System.out.println();
		}
	

		System.out.println("============================");
	}
}
*/