/*===========================================================
  ■■■ 실행 흐름의 컨트롤(제어문, 조건문과 반복문) ■■■
  - break
=============================================================*/

// 아래와 같은 처리가 이루어지는 프로그램을 구현한다.
// 단, 입력받는 정수는 1~100 범위 안에서만
// 가능하도록 작성한다.

//실행 예)

//임의의 정수 입력 : -20

// 임의의 정수 입력 : 0 

// 임의의 정수 입력 : 2021

// 임의의 정수 입력 : 10
// >> 1~10 까지의 합 : 55
// 계속하시겠습니까(Y/N)? : y

// 임의의 정수 입력 : 100
// >> 1~100 까지의 합 : 5050
// 계속하시겠습니까(Y/N)? : n
// 계속하려면 아무 키나 누르세요... → 프로그램 종료


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test060
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


		int n, s, i;		//-- n : 외부로부터 사용자의 입력값을 담아둘 변수
							//	 s : 누적합 연산 결과를 담아둘 변수
							//	 i : 1 부터 1 씩 사용자의 입력값까지 증가할 변수

		char ch;			//-- 계속 진행할지 말지에 대한 의사표현 결과를 담아둘 변수

		while(true)			//-- 무한루프
		{
			do
			{
			System.out.print("\n임의의 정수 입력 : ");
			n = Integer.parseInt(br.readLine());	//skip 안적으면 여기서 에러나는것,,
													//숫자로되어있어야되는데 숫자형태가아니라 에러남
			}
		while (n<1 || n>100);

		//테스트
		//System.out.println("유효한 정수 입력 완료~!!!");

		s=0;			//-- 누적합 변수의 초기화 위치 여기야~!!!!  check~!!!!

		//누적합 산출
		for (i=1;i<=n ;i++ )
		{
			s += i;
		}
		System.out.printf(">> 1~ %d 까지의 합 : %d\n", n, s);

		System.out.print(" 계속하시겠습니까(Y/N) : ");
		ch = (char)System.in.read();

			

		//그만할래
		//if (ch=='N' || ch=='n')		//↓ 밑에 식은 ==가 아니라 != 라서 &&
			if (ch!='Y' && ch!='y')	// 논리연산자 check~!!!!!
			{
				// 반복문(while)을 빠져나갈 수 있는 코드 작성 필요
				//-- 위와 같은 의사표현을 했다면
				//	 그동안 수행했던 반복문을 멈추고 빠져나가야 한다.
				break;		//--멈춘다 ( + 그리고 빠져나간다.)   check~!!!!!
							//-- 가장 가까운 while 에서 빠져나가는 것
			}
			
			// Y + 엔터 / y + 엔터
			// 엔터값(\r\n) 처리
			System.in.skip(2);

		
	
		}// end while
	}// end main()
} //end class Test060





/*
		// 변수 선언
		int a,b,i;
		char ch;

		while(true)
		{
			do
			{
				System.out.print("\n임의의 정수 입력 : ");
				a = Integer.parseInt(br.readLine());
			}
			while (a<1|100<a);

			b=0;
			
			for(i=1; i<=a; i++)
				b+=i;

			System.out.printf(" >> 1~%d 까지의 합 : %d\n",a,b);
			System.out.print("계속 하시겠습니까?(Y/N):");
			ch=(char)System.in.read();
			System.in.skip(2);

			if (ch!='y'||ch=='Y')
			{
				break;
			}
			else
			{
				System.out.println("  ");
			}
		} */



//결과보기
/*
임의의 정수 입력 : 20
>> 1~ 20 까지의 합 : 210
 계속하시겠습니까(Y/N) : Y

임의의 정수 입력 : 50
>> 1~ 50 까지의 합 : 1275
 계속하시겠습니까(Y/N) : y

임의의 정수 입력 : 10
>> 1~ 10 까지의 합 : 55
 계속하시겠습니까(Y/N) : n
계속하려면 아무 키나 누르십시오 . . .
*/