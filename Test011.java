/*===============================================
	■■■ 자바의 기본 프로그래밍 ■■■
	- 변수와 자료형
	- 자바의 기본 입출력 : BufferedReader 클래스
=================================================*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test011
{
	public static void main(String[] args) throws IOException
	{												//↑문제발생시 메뉴얼
												//문제일으키는승객을밖으로던져버려라
											//이뜻!!그래서 위에 import.java.io.~
											//로 설정해둠 java여기 io 안에 메뉴얼이 있다.라는 뜻
		//BufferedReader 인스턴스 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


		//int n;
		//double d;
		//BufferedReader br;

		//주요 변수 선언
		int r;							//--반지름
		final double PI = 3.141592;		//--원주율
		double a, b;					//--넓이, 둘레

		//연산 및 처리
		//① 사용자에게 안내 메세지 출력
		System.out.print("원의 반지름 입력 : ");
							//↓숫자를 입력한거가 밑에 r.br~여기에 대입됨
		//② 사용자가 입력한 값을 받아와 반지름 변수 r 에 담기
		//r = br.readLine();
		//r = "20"; ← ㅅ= "20"이라 문자이지만 r은 int로 선언되었기때문에 밑에계속설명
		
		//Integer.parseInt() → 매개변수로 넘겨받은 문자열 데이터를 정수형으로 변환
		r = Integer.parseInt(br.readLine()); 
		// r = Integer.parseInt("20") → 정수형으로 변경할거야
		// r = 20; → 정수형으로 바뀜
		//--사용자가 입력한 값을 BufferedReader(br)의 『readLine()』
		//	메소드를 활용하여 문자열 형태로 읽어들인 후
		//	그 값을 『Integer.parseInt()』를 통해 숫자형(정수형)으로 변환한 후
		//정수 형태의 반지름 변수 r에 담아내기

		// ③ 넓이 및 둘레 연산
		a = r * r * PI;
		b = r * 2 * PI;

		// 결과 출력
		//System.out.println(">> 넓이 : "+a);
		//System.out.println(">> 넓이 : "+b);

		//System.out.printf(">> 넓이 : ○\n", ○에 넣을 값);
		//System.out.printf(">> 둘레 : ○\n", ○에 넣을 값);
		//System.out.printf(">> 넓이 : %f\n", a);
		//System.out.printf(">> 둘레 : %f\n", b);

		//System.out.printf(">> 넓이 : %.2f\n", a);
		//System.out.printf(">> 둘레 : %.2f\n", b);	
		//-- 『%f』는 서식 출력용 메소드에서 실수형을 담아내는 옵션 문자
		//	 『%.2f』는 소수점 이하 둘재자리까지 표현하겠다는 의미


	}
}