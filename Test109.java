/* ============================
	      클래스 고급
	  상속(Inheritance)
=============================*/

// 다음과 같은 프로그램을 구현한다.
// 단, 상속의 개념을 적용하여 작성할 수 있도록 한다.

// 실행 예)
// 임의의 두 정수 입력 (공백 구분) : 20 15
// 연산자 입력 ( + - * / ) : -
// >> 20 - 15 = 5.00
// 계속하려면 아무 키나 누르세요...

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;


class Aclass
{
	protected int x,y;
	protected char op;

	Aclass()
	{
	}

	void write(double result)
	{
		System.out.printf(">> %d %c %d = %.2f\n", x, op, y, result);
	}
}

class Bclass extends Aclass
{
	boolean input() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("임의의 두 정수 입력 (공백 구분) : ");
		
		String temp = br.readLine();			// "20 15"
		String[] strArr = temp.split("\\s");		// 구분자 → 공백
		// String[] strArr = {"20","15"};

		// ※ 문자열.split("구분자") → 구분자를 기준으로 잘라서 배열로 반환
		//	  ex) "10 20 30 40".split("\\s");		
		//		   → {"10","20","30","40"} 반환
	
		if(strArr.length != 2)	
			return false;
		// false를 반환하며 input() 메소드 종료
		// 이 조건을 수행할 경우 이 코드의 아래에 수행해야 할 코드가 남아있더라도 
		// 결과값을 반환하며 메소드는 종료된다.
		// 조건문 없이 return을 쓰고, 그 밑에 코드 작성하면 이클립스에서는 에러난다.

		super.x = Integer.parseInt(strArr[0]);
		super.y = Integer.parseInt(strArr[1]);

		System.out.print("연산자 입력 ( + - * / ) : ");
		super.op = (char)System.in.read();


		/*
		if (op != '+' && op != '-' && op != '*' && op != '/')
		{
			return false;
		}

		return true;
		*/

		if (op == '+' || op == '-' || op == '*' || op == '/')
		{
			return true;
		}
		return false;

	} // end input()
							

	// 계산
	 double calc()
	{
		double result = 0 ;
		
		switch(op)
		{
			case '+' : result = x + y; break;
			case '-' : result = x - y; break;
			case '*' : result = x * y; break;
			case '/' : result = x / y; break;
		}
		return result;
	} // end calc()

} // end Bclass




public class Test109
{
	public static void main(String[] args) throws IOException
	{
		Bclass ob = new Bclass();

		if (!ob.input())
		{
			System.out.println("Error");
			return;						// 프로그램 종료
		}

		double result = ob.calc();
		
		ob.write(result); 
	}
}