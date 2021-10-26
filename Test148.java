/*========================================
  ■■■ 예외(Exception) 처리 ■■■
==========================================*/

// 예외 다시 던지기


public class Test148
{	
	public static void main(String[] args)
	{
		//Test148 인스턴스 생성
		Test148 ob = new Test148();

		try
		{
			int a = ob.getValue(-2);				// ⑥ 예외 발생
			System.out.println("a : " + a);
		}
		catch (Exception e)							// ⑦ 예외 잡아내기
		{
			System.out.println("ⓑ printStackTrace...............");
			e.printStackTrace();
		}


	}
	public int getData(int data) throws Exception
	{
		if(data<0)
			throw new Exception("data 가 0보다 작습니다.");
		// ① 예외 발생

		return data + 10;
	}


	public int getValue(int Value) throws Exception
	{							//  =============== 이거도 생략해야댐 ************
		int a = 0;

		try
		{
			a = getData(-2);		// ② 예외 발생①이 여기로 버려진다
		}
		catch (Exception e)			// ③ 발생한 예외를 잡앗다
		{
			// ④ 잡아낸 예외에 대한 처리
			System.out.println("ⓐ printStackTrace...............");
			e.printStackTrace();

			// 잡아낸 예외를 다시 던지기 
			// *****만약에 이거를 생략한다면
			throw e;
			//-- 주석 처리 시(즉, 잡아낸 예외를 다시 던지지 않을 경우)
			//	 main() 메소드의 예외 처리 구문은 수행되지 않게 된다.
		}
		return a;
	}
}

//실행 결과
/*
ⓐ printStackTrace...............
java.lang.Exception: data 가 0보다 작습니다.
        at Test148.getData(Test148.java:31)
        at Test148.getValue(Test148.java:44)
        at Test148.main(Test148.java:17)
ⓑ printStackTrace...............
java.lang.Exception: data 가 0보다 작습니다.
        at Test148.getData(Test148.java:31)
        at Test148.getValue(Test148.java:44)
        at Test148.main(Test148.java:17)
계속하려면 아무 키나 누르십시오 . . .

*/
