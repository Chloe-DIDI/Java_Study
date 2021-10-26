/* ============================
	      Ŭ���� ���
	  ���(Inheritance)
=============================*/

// ������ ���� ���α׷��� �����Ѵ�.
// ��, ����� ������ �����Ͽ� �ۼ��� �� �ֵ��� �Ѵ�.

// ���� ��)
// ������ �� ���� �Է� (���� ����) : 20 15
// ������ �Է� ( + - * / ) : -
// >> 20 - 15 = 5.00
// ����Ϸ��� �ƹ� Ű�� ��������...

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
		
		System.out.print("������ �� ���� �Է� (���� ����) : ");
		
		String temp = br.readLine();			// "20 15"
		String[] strArr = temp.split("\\s");		// ������ �� ����
		// String[] strArr = {"20","15"};

		// �� ���ڿ�.split("������") �� �����ڸ� �������� �߶� �迭�� ��ȯ
		//	  ex) "10 20 30 40".split("\\s");		
		//		   �� {"10","20","30","40"} ��ȯ
	
		if(strArr.length != 2)	
			return false;
		// false�� ��ȯ�ϸ� input() �޼ҵ� ����
		// �� ������ ������ ��� �� �ڵ��� �Ʒ��� �����ؾ� �� �ڵ尡 �����ִ��� 
		// ������� ��ȯ�ϸ� �޼ҵ�� ����ȴ�.
		// ���ǹ� ���� return�� ����, �� �ؿ� �ڵ� �ۼ��ϸ� ��Ŭ���������� ��������.

		super.x = Integer.parseInt(strArr[0]);
		super.y = Integer.parseInt(strArr[1]);

		System.out.print("������ �Է� ( + - * / ) : ");
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
							

	// ���
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
			return;						// ���α׷� ����
		}

		double result = ob.calc();
		
		ob.write(result); 
	}
}