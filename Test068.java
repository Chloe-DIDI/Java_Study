/*===========================================================
  ���� Ŭ������ �ν��Ͻ� ����
=============================================================*/

// ����ڷκ��� ������ �� ������ �����ڸ� �Է¹޾�
// ��Ģ������ �����ϴ� ���α׷��� �����Ѵ�.
// ��, Ŭ������ �ν��Ͻ��� ������ Ȱ���Ͽ� �ۼ��� �� �ֵ��� �Ѵ�.

// ���� ��)
// ������ �� ���� �Է�(���� ����) : 10 5
// ������ ������ �Է�( + - * / ) : +
// >> 10 + 5 = 15
// ����Ϸ��� �ƹ� Ű�� ��������...


import java.util.Scanner;
import java.io.IOException;

class Calculate
{
	//�ֿ� ���� ����		
	int su1, su2;			//--����ڷκ��� �Է¹��� �� ������ ��Ƶ� ����
	char op;				//--����ڷκ��� �Է¹��� �����ڸ� ��Ƶ� ����

	//�޼ҵ� ����(��� : �Է�)
	void input() throws IOException	//throws IOException�̰Ŵ�	 System.in.read();����
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("������ �� ���� �Է�(���� ����) : ");
		su1 = sc.nextInt();
		su2 = sc.nextInt();

		System.out.print("������ ������ �Է�( + - * / ) : ");
		op = (char)System.in.read();
	}


	//�޼ҵ� ����(��� : ����)
	int cal()
	{ 
		int result = 0;

		switch(op)
		{
			case'+' : result = su1 + su2; break;
			case'-' : result = su1 - su2; break;
			case'*' : result = su1 * su2; break;
			case'%' : result = su1 % su2; break;
		}
		return result;

	}
	
	// �޼ҵ� ����(��� : ���)
	void print(int s)
	{
		System.out.printf(">>%d %c %d=%d\n", su1,op,su2,s);
	}
}


public class Test068
{
	public static void main(String[] args) throws IOException
	{
		//calcylate Ŭ���� �ν��Ͻ� ����
		Calculate cal = new Calculate();

		cal.input();
		int result=cal.cal();
		cal.print(result);
	}
}

//������
/*
������ �� ���� �Է�(���� ����) : 10 2
������ ������ �Է�( + - * / ) : *
>>10 * 2=20
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	// �ֿ� ���� ����
	int a, b;		
	char ch;


	void input() throws IOException
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �� ���� �Է�(���� ����) : ");
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.print("������ ������ �Է�(+ - * /)   : ");
		ch = (char)System.in.read();
	}
	
	double cal()
	{
		double result=0;
		switch (ch)
		{
		case '+': result = a+b; break;
		case '-': result = a-b; break;
		case '*': result = a*b; break;
		case '/': result = a/b; break;
		}

		return result;
	}

	
	void print(double k)
	{
		System.out.printf(">> %d %c %d = %.1f\n", a, ch, b, k);
	}
	
}

public class Test068
{
	public static void main(String[] args) throws IOException
	{
		
		Calculate ob = new Calculate();

		ob.input();			
		double result = ob.cal();	     
		ob.print(result);		        
	}
}*/

/*
������ �� ���� �Է�(���� ����) : 5 10
������ ������ �Է�(+ - * /)   : *
>> 5 * 10 = 50.0
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/
