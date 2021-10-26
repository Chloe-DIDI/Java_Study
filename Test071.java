/*=================================
  ■■■ 클래스와 인스턴스 ■■■
  - 생성사 (Constructor)
===================================*/

public class Test071
{

	int x;

	// ※ 생성자의 이름은 항상 예외없이 클래스의 이름과 동일해야 하며
	//	  필요한 경우 인수를 받아 들이는 것도 가능하고,
	//	  같은 이름의 메소드를 정의하는 중복정의가 가능하지만
	//	  리턴값(반환값)은 가질 수 없다.

	// ※ 생성자는 다른 일반 메소드처럼 호출될 수 없고,
	//    『new』 연산자를 이용하여 객체를 생성하기위해 호출되며,
	//    각 클래스의 인스턴스인 객체를 생성한 후에
	//	  생성된 객체의 멤버를 초기화 시키는 작업을 수행한다.

	Test071()
	{
		// ※ 생성자 내부에서 다른 생성자를 호출하는 것은 가능하다.
		//	  하지만, 생성자 내부에서 가장 먼저 실행되어야 한다.

		// 생성자 호출
		this(1000);

		//this.x=10;
		x = 10;

		System.out.println("인자가 없는 생성자 " );
		//System.out.println("Test071이 갖고있는 x : " + this.x );
		System.out.println("Test071이 갖고있는 x : " + x );
		
		// 여기 나오는 x는 int x 맨위에꺼~!
		
	}

	Test071(int x)
	{
		
		this.x = x;			//this를 써야될때 코드레벨에서 Test071.x를 써야될대
							//이걸 품고있는 class를 찾아라 
							//위에 class Test071이니까 Test071이다 
		System.out.println("인자가 하나인 생성자 " );
		System.out.println("Test071이 갖고있는 x : " + x );

	}

	public static void main(String[] args)
	{
		//Test071 클래스 기반 인스턴스 생성
		Test071 ob1 = new Test071();
		Test071 ob2 = new Test071(100);
		//--==>>
		/*
		인자가 없는 생성자
		Test071이 갖고있는 x : 10
		인자가 하나인 생성자
		Test071이 갖고있는 x : 100
		ob2.x : 100
		계속하려면 아무 키나 누르십시오 . . .
		*/

		//System.out.println("ob2.x : " + ob2.x);

		System.out.println();
		System.out.println("main에서 ob1.x : " + ob1.x);
		System.out.println("main에서 ob2.x : " + ob2.x);
	}
}
//실행 결과
/*
인자가 하나인 생성자
Test071이 갖고있는 x : 1000
인자가 없는 생성자
Test071이 갖고있는 x : 10
인자가 하나인 생성자
Test071이 갖고있는 x : 100

main에서 ob1.x : 10
main에서 ob2.x : 100
계속하려면 아무 키나 누르십시오 . . .*/

//40에 100넣엇을때
/*
인자가 없는 생성자
인자가 하나인 생성자
ob2.x : 100
계속하려면 아무 키나 누르십시오 . . .*/