/*===========================================================
  ■■■ 실행 흐름의 컨트롤(제어문, 조건문과 반복문) ■■■
  - 반복문(while문) 실습
=============================================================*/

// 사용자로부터 임의의 정수를 입력받아
// 입력받은 정수가 소수인지 아닌지를 판별하여
// 결과를 출력하는 프로그램을 구현한다.

// 실행 예)
// 임의의 정수 입력 : 10
// 10 → 소수 아님
// 계속하려면 아무 키나 누르세요...

// 실행 예)
// 임의의 정수 입력 : 11
// 10 → 소수
// 계속하려면 아무 키나 누르세요...

// ※ 소수 : 1 또는 자기 자신의 값 이외의 어떤 수로도 나누어 떨어지지 않는 수.
//			 단, 1은 소수 아님.

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Test046
{
	public static void main(String[] args) throws IOException
	{

		// ○ 주요 변수 선언 		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				
		int num;    //--사용자 입력값을 담아낼 변수
		System.out.print("임의의 정수 입력 : ");
		num = Integer.parseInt(br.readLine());

		int n = 2;	//--입력값을 대상으로 나눗셈연산을 수해할 변수
					//  (1씩 증가)		  5 → 2 3 4
		boolean flag = true;	//우왓~소수다~!!
		

		while (n<num)		//num=5 → n=2~4	//num=15 →n=2~14
		{

			//입력값(num=5)이 n(2,3,4)로 나누어 떨어지는지 확인
			if(num%n==0)	//값이 0으로 떨어지는 것은 소수 아님
			{	
				//num은 소수가 아니다.
				flag = false;		//--에이~ 소수가 아니엇네~!!!
						break;
			}
				n++;
		}

		//○ 결과 출력 (출력 전에 수행해야 할 추가 확인 → 1인지 아닌지에 대한 추가 검토)
				
		if(flag == true && num!=1) //flag==true는 소수라는뜻
			System.out.printf("%d -> 소수\n",num); 
		else 
			System.out.printf("%d -> 소수 아님\n",num);

	}
}

		// 추가 확인


		//○ 결과 출력

	


/*		// 변수
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n, a = 1;				
			
		String result = "소수 아님";
		
		// 연산 및 처리

		System.out.print("임의의 정수 입력: ");
		a = Integer.parseInt(br.readLine());

		while(a<=n)
		{
			n++;

			if(m%n==0) 
				{
				result="소수 아님";	break;
			}
			else if (m==n)
			{
				result="소수";
			}
		}
		System.out.printf("%d → %s\n", m, result);

	}
}
*/
//실행 결과

