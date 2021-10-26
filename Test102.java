/*======================================
  ■■■ 주민등록번호 유효성 검사 ■■■
========================================*/

/*
○ 주민등록번호 검증 공식

	① 마지막 자리를 제외한 앞자리 수를 규칙에 맞게 곱한다.

	123456-1234567 (주민번호)
	******-******* ---------------------- 각 자릿수 곱하기
	234567 892345  (각 자리에 곱해질 수)

	② 규칙에 맞게 곱셈 연산을 수행한 결과를 모두 더한다.

	ex) 7 5 0 6 1 5 - 1 8 6 2 1 3 3
		* * * * * *   * * * * * * * 
		2 3 4 5 6 7   8 9 2 3 4 5
		-----------------------------------------------------
		→  14 + 15 + 0 + 30 + 6 + 35 + 8 + 72 + 12 + 6 + 4 + 15 

		== 217

	③ 더해진 결과값을 11로 나누어 『나머지』를 취한다.
		  19
		-----
	  11|217
	     11
		-----
		 107
		  99
		-----
		   8 → 나머지

	④ 11에서 나머지(→ 8)를 뺀 결과값을 구한다.

	11-8 = 3

	※ ③ 의 처리과정에서 나머지가 0인 경우 → 11 → 1
								   1인 경우 → 10 → 0
								   
	   이를 다시 10으로 나누어 나머지를 취한다.
		
	⑤ ④의 연산 경과가 주민번호를 구성하는 마지막 숫자롸
	   일치하는지의 여부를 확인한다.

	   일치   → 유효한 주민번호
	   불일치 → 잘못된 주민번호


*/

// 실행 예)
// 주민번호 입력(xxxxxx-xxxxxxx) : 123456-12345678 → 입력 갯수 초과
// >> 입력 오류~!!!
// 계속하려면 아무 키나 누르세요...

// 주민번호 입력(xxxxxx-xxxxxxx) : 123456-123456 → 입력 갯수 미달
// >> 입력 오류~!!!
// 계속하려면 아무 키나 누르세요...

// 주민번호 입력(xxxxxx-xxxxxxx) : 750615-1252085 → 유효한 주민번호
// >> 정확한 주민번호~!!!
// 계속하려면 아무 키나 누르세요...

// 주민번호 입력(xxxxxx-xxxxxxx) : 750615-1252085 → 유효하지 않는 주민번호
// >> 잘못된 주민번호~!!!
// 계속하려면 아무 키나 누르세요...

// ※ 추가 팁~!!!

//	  배열.length				→ 배열의 길이(배열방의 갯수) 반환
//	  문자열.length()			→ 문자열의 길이 반환
//	  String str = "abcdefg";
//	  str.length();				→ 7
//	  "abcdefg".length();		→ 7
//	  문자열.substring()		→ 문자열 추출

import java.io.InputStreamReader; 
import java.io.BufferedReader; 
import java.io.IOException;

public class Test102
{
	public static void main(String[] args) throws IOException
	{

		//BufferedReader 인스턴스 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 입력받는 주민번호(문자열 형태)
		String str;		

		//주민번호의 각 자릿수에 곱하게 될 수 → 배열 형태로 구성
		//		   7 5 0 6 1 5 - 1 8 6 2 1 3 3 
		int[] chk = {2,3,4,5,6,7,0,8,9,2,3,4,5};
		//						 -
		//						check~!!!

		// 곱셈 연산 후 누적합(즉, 각 곱셈의 결과를 더해 나갈 수 있도록  처리...)
		int tot = 0;


		System.out.print("주민번호 입력(xxxxxx-xxxxxxx) : ");
		str = br.readLine();

		if (str.length()!=14)
		{
			System.out.println(">> 입력 오류~!!!");
			return;	//--메소드 종료 → main 메소드 종료 → 프로그램 종료
		}

		//테스트
		//System.out.println(">> 자릿수 적합~!!!");
		//ex) "750615-1252085"
	
		for (int i=0; i<13; i++)
		{
			
		//ex) System.out.print(i + " ");	// 0 ~ 12
		if(i==6)
		{
			continue;		// (뒷부분 무시하고... + ) 계속해라
		}

				tot += chk[i]*Integer.parseInt(str.substring(i,(i+1)));
				//		   0 → 2							 0   1 → "7"  ==> tot += 2 * 7
				//		   1 →	3							 1   2 → "5"  ==> tot += 3 * 5
				//						:
				//		  12 → 5							 12  13 → "8" ==> tot += 5 * 8
		}

		//--------------------------------- 여기까지 수행하면 ①과 ② 를 모두 끝낸 상황이며
		//									규칙에 맞게 곱셈 연산을 수행한 결과를 모두 더한 값은
		//									변수 tot 에 담겨있는 상황이 된다.
		
		int su = 11 - tot % 11;

		// 테스트
		System.out.println(su);

		// 만약에 
		// 10 이나 11 이 나온다면

		// 최종 결과 출력 이전에... 추가 연산 필요~!!!
		// su 에 대한 연산 결과가 두 자리로 나올 경우(10 또는 11)
		// 주빈번호 마지막 자리의 숫자와 비교할 수 없는 상황
		su = su % 10;	// su %=10;

		//----------------------------------- 여기까지 수행하면 ③과 ④를 모두 끝낸 상황이며
		//									 최종 연산 결과는 변수 su 에 담겨있는 상황이 된다.

		//if (su==주민등록번화마지막한자리 숫자)
		if (su==Integer.parseInt(str.substring(13)))
			System.out.println(">>정확한 주민번호~!!!");
		else 
			System.out.println(">>잘못된 주민번호~!!!");
		

	}
}
// 실행 결과
/*
주민번호 입력(xxxxxx-xxxxxxx) : 940603-1234562
1
>>잘못된 주민번호~!!!
계속하려면 아무 키나 누르십시오 . . .

주민번호 입력(xxxxxx-xxxxxxx) : 940603-1212221545
>> 입력 오류~!!!
계속하려면 아무 키나 누르십시오 . . .
*/

/*
		"7560152-1252085"

		str.substring(0, 1);
		"7"
		Integer.parseInt("7");
		tot+=chk[0] * 7;

		str.substring(1,2)
		"5"
		Integer.parseInt("5");
		tot+=chk[0] * 7;

		str.substring(2,3)
		"0"
		Integer.parseInt("0");
		tot+=chk[0] * 7;

*/


/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] n = {2,3,4,5,6,7,8,9,2,3,4,5};	// 곱하는 수
		String str;								// 입력한 주민번호
		int sum;								// 곱한거 더한 값

		System.out.print("주민번호 입력(xxxxxx-xxxxxxx) : ");
		str = br.readLine();

		if(str.length()>=15 || str.length()<=13)
		{
			System.out.println(">> 입력 오류~!!!");
			return;
			
		}

		for (int i=0; i<13; i++)
		{
			if(i==6)

				sum+= n[i]*strTemp.substring(i,(i+1));
		}

		int na = 11 - sum%11;

		na = na%10;

	}
}
*/


/*
		//테스트

		String strTemp = "윤유동";
		System.out.println(strTemp.length());
		//--==>> 3

		strTemp = "동해물과 백두산이";
		System.out.println(strTemp.length());
		//--==>> 9

		strTemp = "study-hard";
		System.out.println(strTemp.length());
		//--==>> 10

		strTemp = "ABCDEFGHIJKLMNOPQRXTUVWXYZ";
		System.out.println(strTemp.substring(3, 5));
		//--==>> DE
		// ABC DE FGHIJKLMNOPQRXTUVWXYZ 
		// 012 34 56789...

		strTemp = "ABCDEFGHIJKLMNOPQRXTUVWXYZ";
		System.out.println(strTemp.substring(13, 17));
		//--==>> NOPQ
		// ABCDEFGHIJKLMNOPQRXTUVWXYZ

		//strTemp = "ABCDEFGHIJKLMNOPQRXTUVWXYZ";
		//System.out.println(strTemp.substring(13, 85));
		//--==>> 에러 발생(컴파일 에러)
		//		StringIndexOutOfBoundsException

		strTemp = "ABCDEFGHIJKLMNOPQRXTUVWXYZ";
		System.out.println(strTemp.substring(5));
		//--==>> FGHIJKLMNOPQRXTUVWXYZ

		System.out.println(strTemp.substring(5, strTemp.length()));
		//									    -------------------
		//										strTemp 의 전체 길이
		//--==>> FGHIJKLMNOPQRXTUVWXYZ

	}
}
*/




