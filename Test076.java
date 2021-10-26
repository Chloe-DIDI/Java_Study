/*=====================
  ■■■ 배열 ■■■
  - 배열의 선언과 초기화
  - 배열의 기본적 활용
=======================*/

// 『char』자료형의 배열을 만들어
// 그 배열의 각 방에 알파벳 대문자를 채우고
// 채워진 그 배열의 전체 요소를 출려하는 프로그램을 구현한다.
// 단, 채우는 구문과 출력하는 구문을 따로 분리하여 처리한다.

// 실행 예)
// A B C D E F G ... W X Y Z
// 계속하려면 아무 키나 누르세요...

public class Test076
{
	public static void main(String[] args)
	{
		// 영문 알파벳 대문자 배열 구성
		// 방법 ①
		char[] arr1;
		arr1 = new char[26];

		arr1[0] = 'A';
		arr1[1] = 'B';
		arr1[2] = 'C';
		arr1[3] = 'D';
		arr1[4] = 'E';
		arr1[5] = 'F';
		arr1[6] = 'G';
		arr1[7] = 'H';
		arr1[8] = 'I';
		arr1[9] = 'J';
		arr1[10] = 'K';
		arr1[11] = 'L';
		arr1[12] = 'M';
		arr1[13] = 'N';
		arr1[14] = 'O';
		arr1[15] = 'P';
		arr1[16] = 'Q';
		arr1[17] = 'R';
		arr1[18] = 'S';
		arr1[19] = 'T';
		arr1[20] = 'U';
		arr1[21] = 'V';
		arr1[22] = 'W';
		arr1[23] = 'X';
		arr1[24] = 'Y';
		arr1[25] = 'Z';


		//방법 ②
		char[] arr2 = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		

		// 방법③
		char[] arr3 = new char[26];	// 알파벳 갯수 26개

		for (int i=0, ch=65; i<arr3.length; i++, ch++)
		{
			arr3[i] = (char)ch;	//(char)65;	(char)66; (char)67; ... (char)90;
		}
		
		// 배열 요소 전체 출력
		for (int i=0; i<arr3.length; i++)
		{
			System.out.print(arr3[i] + " ");
		}
		System.out.println();


	}
}
		// 실행 결과
		/*
		char[] arr = new char[26];	// 알파벳 갯수 26개

		for (int i=0; i<arr.length; i++)
		{
			arr[i] = (char)(65+i);
		}

		for (int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		*/

		
		//내가 푼것
		/*
		char[] arr = new char[26];	// 알파벳 갯수 26개

		for (int i=0; i<arr.length; i++)
		{
			arr[i] = (char)(65+i);
		}

		for (int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
*/
//실행결과
/*
A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
계속하려면 아무 키나 누르십시오 . . .
*/