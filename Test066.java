/*===========================================================
  ■■■ 클래스와 인스턴스 ■■■
=============================================================*/

// ※ CircleTest.java 파일과 세트~!!!

// 원의 넓이와 둘레 구하기
// 원의 넓이와 둘레를 구할 수 있는 클래스를 설계한다.
// (클래스명 : CircleTest) → CircleTest.java
// Test065.java 파일을 참조하되
// 위와 같이 두 개의 파일로 나누어 작업을 수행한다.
// 또한, BufferedReader 를 활용한다.

// 원의 넓이 = 반지름 * 반지름 * 3.141592
// 원의 둘레 = 반지름 * 2 * 3.141592

// 실행 예)
// 반지름 입력 : 13

// 반지름이 13인 원의 넓이
// 넓이 : xxx.xx
// 둘레 : xxx.xx
// 계속하려면 아무 키나 누르세요...

//import java.io.BufferedReader;		// 이거는 할필요없움,, 밑에껏두
//import java.io.InputStreamReader;
import java.io.IOException;				// 그래서 ↓이거 때문에 이건써야된다

public class Test066
{										//-- ob input() 땜에 이거씀
	public static void main(String[] args) throws IOException
	{
		// CircleTest 크래스 인스턴스 생성
		CircleTest ob = new CircleTest();
		
		// 생성된 인스턴스 ob 를 통해 반지름 입력 메소드 호출
		ob.input();

		//생성된 인스턴스 ob 를 통해 넓이 연산 메소드 호출
		double b = ob.calArea();

		//생성된 인스턴스 ob 를 통해 둘레 연산 메소드 호출
		double t = ob.calLength();

		//생성된 인스턴스 ob 를 통해 출력 메소드 호출
		ob.print(b, t);		// a,l 말고 b,t 이렇게 적어도 상관없다 키티예제를 생각해라~!
	}
}

/*
반지름 입력 : 23
반지름이 23인 원의
넓이 : 21661.902168
둘레 : 2144.513232
계속하려면 아무 키나 누르십시오 . . .
*/