/*=======================================================
  ■■■ 클래스와 인스턴스 ■■■
  - 생성자(Constructor)와 초기화 블럭(Initialized Block)
=========================================================*/

public class Test073
{
	//int n=100;
	//int m=200;
	//↑이건 n은 100이고 m은 200이다라는 선언
	//↓이건 연산이라서 안된다 근데 {} 이걸넣으면 또 된다!
	int n;
	int m;
	
	//생성자(Constructor)
	Test073()
	{
		n=1000;
		m=2000;
		System.out.println("생성자 실행...");
	}

	// 초기화 블럭(Initialized Block)
	{	//← 요거랑
		n=100;
		m=200;
		System.out.println("초기화 블럭 실행...");
	}	//←요고 넣었다고 된다! 요게 초기화 블럭이란 뜻!

	
	//생성자(Constructor)
	Test073(int n, int m)
	{
		this.n=n;
		this.m=m;
		System.out.println("매개변수 있는 생성자 실행...");
	}
	

	//출력 메소드 정의
	void write()
	{
		System.out.println("n: " + n + ", m: " + m);
	}


	public static void main(String[] args)
	{
		Test073 ob1 = new Test073();
		//--==>>초기화 블럭 실행...
		//		생성자 실행...
	
		ob1.write();
		//-->> n: 1000, m: 2000	

		Test073 ob2 = new Test073(1234, 4567);
		//--==>> 초기화 블럭 실행...
		//		 매개변수 있는 생성자 실행...

		ob2.write();
		//--==>> n:1234, m:4567
	}
}
//실행결과
/*
초기화 블럭 실행...
생성자 실행...
n: 1000, m: 2000
초기화 블럭 실행...
매개변수 있는 생성자 실행...
n: 1234, m: 4567
계속하려면 아무 키나 누르십시오 . . .
*/