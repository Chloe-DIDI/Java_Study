/*===============================================
  ■■■ 연산자(Operator) ■■■
  - 삼항 연산자 == 조건 연산자
=================================================*/


//사용자로부터 임의의 정수를 입력받아
//입력받은 정수가 영수인지, 음수인지, 0인지 구분하여
//이 결과를 출력하는 프로그램을 구현한다
//단, 입력 데이터는 BufferedReader 의 readLine() 을 통해 넘겨받을 수 있도록 한다.
//또한, 조건 연산자(삼항연산자)를 활용하여 기능을 구현할 수 있도록 한다.

//실행 예)
//임의의 정수 입력 : -12
//-12 → 음수
//계속하려면 아무 키나 누르세요...

//임의의 정수 입력 : 257
//257 → 양수
//계속하려면 아무 키나 누르세요...

//임의의 정수 입력 : 0
// 0 → 영
//계속하려면 아무 키나 누르세요...


import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
//import.java.io.*;    //-->>

public class Test027
{
	public static void main(String[] args) throws IOException
	{
		//○ 주요 변수 선언
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n;					//-사용자 입력값을 담을 변수
		String strResult;		//--음수인지 양수인지 영인지 판별결과를 담을변수

				//○ 연산 및 처리
				System.out.print("임의의 정수 입력 : ");
				n=Integer.parseInt(br.readLine());
				/*
				n이 0보다 크다 → true  → n 은 양수 
							   → false → n 이 작다 → true  → n 은 음수
							   						 → false → n 은 영
									------------------------------------------							   
							   → false → n 은 음수 또는 영 이라고 할 수 없다
				*/
				
				
				strResult = (n>0) ? ("양수") : ((n<0) ? ("음수") : ("영") );
				//10
				//strResult = (10>0) ? ("양수") : ((n<0) ? ("음수") : ("영") );
				//strResult = (true) ? ("양수") : ((n<0) ? ("음수") : ("영") );
				//strResult = "양수"

				//-4
				//strResult = (-4>0) ? ("양수") : ((n<0) ? ("음수") : ("영") );
				//strResult = (false) ? ("양수") : ((n<0) ? ("음수") : ("영") );
				//strResult = (false) ? ("양수") : ((-4<0) ? ("음수") : ("영") );
				//strResult = (false) ? ("양수") : ((true) ? ("음수") : ("영") );
				//strResult = (false) ? ("양수") : ("음수");
				//strResult = "음수"

				//0
				//strResult = (0>0) ? ("양수") : ((n<0) ? ("음수") : ("영") );
				//strResult = (false) ? ("양수") : ((n<0) ? ("음수") : ("영") );
				//strResult = (false) ? ("양수") : ((0<0) ? ("음수") : ("영") );
				//strResult = (false) ? ("양수") : ((false) ? ("음수") : ("영") );
				//strResult = "영"


				// ○ 결과 출력

				System.out.println(n + "→" + strResult);
	}
}


//실행결과
/*
임의의 정수 입력 : 0
0→영
*/


//내 풀이
/*
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test027
{
	public static void main(String[] args) throws IOException
	{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n;
		String strResult;

		System.out.print("임의의 정수 입력 : ");
		n = Integer.parseInt(br.readLine());


		strResult = (n>0) ? "양수" : (n==0 ? "영" : "음수");

		System.out.printf("%d → %s\n", n, strResult);
	
	}
}*/
//실행결과
/*
 

*/

		