/*===============================================
  ■■■ 연산자(Operator) ■■■
  - 삼항 연산자 == 조건 연산자
=================================================*/

//사용자로부터 임의의연도를 입력받아
//입력받은 연도가... 윤년인지 평년인지 판별하여
//그 결과를 출력하는 프로그램을 구현한다.
//단, 입력은 BufferedReader를 활용하고,
//처리 과정은 조건 연산자를 활용하여 수행할 수 있도록 한다.

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

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Test028
{
	public static void main(String[] args) throws IOException
	{

		//○ 주요 변수 선언
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int year;				//--사용자가 입력하는 연도를 담아둘 변수
		String strResult;		//--윤년 평년에 대한 판별 결과를 담아둘 변수


		System.out.print("임의의 연도 입력 : ");
		year = Integer.parseInt(br.readLine());

		//(연도가 4의 배수  연도가 100의 배수 아님 연도가 400의 배수) ? () : ();
		//(year가 4의 배수  year가 100의 배수 아님 year가 400의 배수) ? () : ();
		//(year%4==0  &&  year%100!==0  ||  year%400==0) ? ("윤년") : (평년);

		//2021
		//(2021%4==0  &&  year%100!==0  ||  year%400==0) ? (윤년) : (평년);
		//( false==0  &&  year%100!==0  ||  year%400==0) ? (윤년) : (평년);

		//strResult = (year%4==0 && year%100!==0 || year%400==0) ? ("윤년") : ("평년");
		strResult = (year%4==0 && year%100!=0 || year%400==0) ? ("윤년") : ("평년");
		//                                ---
		//                              이 연산자가 같지 않다는 연산~ ^^

		System.out.printf(" %d년 → %s\n", year, strResult);








//내가 푼거
/*
		int n;					//-사용자 입력값을 담을 변수
		String strResult;		//--평년인지 윤년인지 판별결과 담을 변수

		System.out.print("임의의 연도 입력 : ");
		n=Integer.parseInt(br.readLine());

		
		strResult = (n%4==0)?((n%100==0)?((n%400==0)?"윤년":"평년"):"윤년"):"평년";


		System.out.println(n + "년 →" + strResult);

*/
		





	}
}