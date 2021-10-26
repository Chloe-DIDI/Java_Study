/*===========================================================
  ■■■ 실행 흐름의 컨트롤(제어문, 조건문과 반복문) ■■■
  - if ~ else 문 실습
=============================================================*/

//사용자로부터 임의의 정수를 입력받아
//입력받은 정수가... 짝수인지, 홀수인지, 영인지
//결과를 판별하여 출력하는 프로그램을 구현한다.


// 실행 예)
// 임의의 정수 입력 : 14
// 14→짝수
// 계속하려면 아무키나...

// 임의의 정수 입력 : 3
// 3 → 홀수
// 계속하려면 아무키나...



import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Test030
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n;
		
		System.out.print("임의의 정수 입력 : ");
		n = Integer.parseInt(br.readLine());

		

		/*  //--==>>이건 0이 짝수로 결과가나오니까 안됨

		if (n%2==0)
		{
			System.out.println( n + " → 짝수");
		}
		else if ((n%2!=0))
		{
			System.out.println( n + " → 홀수");
		}
		else
		{
			System.out.println( n + " → 영");
		}     
		*/

		String strResult = "판별불가";
		

		if(n%2!=0)
		{
			strResult = "홀수";
		}
		else if(n==0)
		{
			strResult = "영";
		}
		else if(n%2==0)
		{
			strResult = "짝수";
		}

		System.out.println(n+ "→" +strResult);

	}
}

//실행결과
/*
임의의 정수 입력 : 3
3→홀수
계속하려면 아무 키나 누르십시오 . . .

*/