/*===============================================
  ■■■ 자바의 기본 프로그래밍 ■■■
  - 변수와 자료형
  - 자바의 기본 입출력 : BufferedReader 클래스
=================================================*/

// 사용자로부터 이름, 국어점수, 영어점수, 수학점수를 받아 입력받아
// 이름과 총점을 출력하는 프로그램을 구현한다.

// 실행 예)
// 이름을 입령하세요 : 최현정
// 국어 점수 입력 : 90
// 영어 점수 입력 : 80
// 수학 점수 입력 : 70


// ===[결과]===
// 이름 : 최현정
// 총점 : 240
//계속하려면 아무 키나 누르세요...


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Test013
{
	public static void main(String[] args) throws IOException
	{
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//위에꺼랑 밑에꺼 같음
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);


			String strName;				//--이름 변수  //헝거리헝표기법 
			int nKor, nEng, nMat;		//--국,영,수 점수 변수
			int nTot;					//--총점 변수

			//추가 변수 선언
			String strTemp;				//--문자열 데이터 임시 저장 변수

			// ○ 연산 및 처리
			//- 사용자에게 안내 메세지 출력 ( 이름 입력 안내)
			System.out.print("이름을 입력하세요 : ");

			//-사용자가 입력한 값(외부 데이터)을 변수에 담아내기
			strName = br.readLine();

			//-사용자에게 안내 메세지 출력(국어 점수 입력 안내)
			System.out.print("국어 점수 입력 : ");

			strTemp = br.readLine();

			nKor = Integer.parseInt(strTemp);

			System.out.print("영어 점수 입력 : ");

			strTemp = br.readLine();

			nEng = Integer.parseInt(strTemp);

			System.out.print("수학 점수 입력 : ");

			strTemp = br.readLine();

			nMat = Integer.parseInt(strTemp);

			nTot = nKor + nEng + nMat;

			
			
			
			System.out.println("\n====[결과]====");

			System.out.printf("이름 : %s\n", strName);
			System.out.printf("총점 : %d\n", nTot);






// 내 풀이
/*
		String name;	
		int a, b, c, d;		

		System.out.print(" 이름을 입력하세요 : ");
		name = br.readLine();

		System.out.print(" 국어 점수 입력 : ");
		a = Integer.parseInt(br.readLine());

		System.out.print(" 영어 점수 입력 : ");
		b = Integer.parseInt(br.readLine());

		System.out.print(" 수학 점수 입력 : ");
		c = Integer.parseInt(br.readLine());
	
		d = a + b + c;

		System.out.println();
		System.out.println("===[결과]===");
		System.out.println(" 이름 : " + name);
		System.out.println(" 총점 : " + d);
		
		
		*/
//결과
/*
 이름을 입력하세요 : 손다정
 국어 점수 입력 : 90
 영어 점수 입력 : 90
 수학 점수 입력 : 90

===[결과]===
 이름 : 손다정
 총점 : 270
계속하려면 아무 키나 누르십시오 . . .


*/

	}
}