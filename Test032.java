/*===========================================================
  ���� ���� �帧�� ��Ʈ��(���, ���ǹ��� �ݺ���) ����
  - if ~ else �� �ǽ�
=============================================================*/
// ����ڷκ��� ������ �� ������ �����ڸ� �Է¹޾�
// �ش� �������� ���� ó�� ����� ����ϴ� ���α׷��� �����Ѵ�.
// ��, if ���ǹ��� Ȱ���Ͽ� ó���� �� �ֵ��� �ϸ�,.
// ���� ����� ���ǻ� �������� ó���� �� �ֵ��� �Ѵ�.

// ���� ��)
// ù ��° ���� �Է�  : 20
// �� ��° ���� �Է�  : 14
// ������ �Է�[+ - * /] : +

// >> 20 + 14 = 34

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Test032
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


		//��� ��
		/*
		int a, b;			//-- ù ��°, �� ��° ����
		char op;			//-- ������

		System.out.print("ù��° ���� �Է� : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("�ι�° ���� �Է� : ");
		b = Integer.parseInt(br.readLine());

		// Integer.parseInt() ��
		// "1234" �� Integer.parseInt() �� 1234
		// "abcd" �� Integer.parseInt() �� ������


		System.out.print("������ �Է�[+ - * /] : ");
		//op = Integer.parseInt(br.readLine());
		//op = System.in.read();
		op = (char)System.in.read();

		if(op=='+') // 43==43
		{
			System.out.printf("\n>> %d + %d = %d\n", a, b, (a+b));
		}
		else if(op=='-') // 45==45
		{
			System.out.printf("\n>> %d - %d = %d\n", a, b, (a-b));
		}
		else if(op=='*') // 42==42
		{
			System.out.printf("\n>> %d * %d = %d\n", a, b, (a*b));
		}
		else if(op=='/') // 47==47
		{
			System.out.printf("\n>> %d / %d = %d\n", a, b, (a/b));
		}
		else
			System.out.printf("\n>> �Է� ������ ������ �����մϴ�.\n");

		*/
		
		
		// ��� ��  
		/*

		int a, b, op;		//-- ù ��°, �� ��° ����, �׸��� ������

		System.out.print("ù��° ���� �Է� : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("�ι�° ���� �Է� : ");
		b = Integer.parseInt(br.readLine());


		System.out.print("������ �Է�[+ - * /] : ");
		op = System.in.read();

		if(op==43)
			System.out.printf("\n>> %d + %d = %d\n", a, b, (a+b));
		else if(op==45)
			System.out.printf("\n>> %d - %d = %d\n", a, b, (a-b));
		else if(op==42)
			System.out.printf("\n>> %d * %d = %d\n", a, b, (a*b));
		else if(op==47) 
			System.out.printf("\n>> %d / %d = %d\n", a, b, (a/b));
		else
			System.out.printf("\n>> �Է� ������ ������ �����մϴ�.\n");
		
		*/
		

		// ��� ��
		
		int a, b, result=0;		//-- ù ��°, �� ��° ����, �׸��� ������
		char op;

		System.out.print("ù��° ���� �Է� : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("�ι�° ���� �Է� : ");
		b = Integer.parseInt(br.readLine());


		System.out.print("������ �Է�[+ - * /] : ");
		op = (char)System.in.read();

		if(op=='+') 
			result = a + b;
		else if(op=='-') 
			result = a - b;
		else if(op=='*') 
			result = a * b;
		else if(op=='/') 
			result = a / b;

		System.out.printf("\n>> %d %c %d = %d\n", a, op, b, result); 


	}
}


/* �� ���

ù��° ���� �Է� : 27
�ι�° ���� �Է� : 6
������ �Է�[+ - * /] : -

>> 27 - 6 = 21
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

*/



		
		
/*
		int a, b;
		char c;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
*/
		



//���� �Ѱ�
/*
		int a, b;
		char c;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		

		System.out.print("ù��° ���� �Է� : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("�ι�° ���� �Է� : ");
		b = Integer.parseInt(br.readLine());

		System.out.print("������ �Է�[+ - * /] : ");
		c = (char)System.in.read();

		if (c == '+')
		{
			System.out.printf("%d %c %d = %d\n", a, c, b, (a+b));
		}
		
		else if (c == '-')
		{
			System.out.printf("%d %c %d = %d\n", a, c, b, (a-b));
		}

		else if (c == '*')
		{
			System.out.printf("%d %c %d = %d\n", a, c, b, (a*b));
		}

		else if (c == '/')
		{
			System.out.printf("%d %c %d = %d\n", a, c, b, (a/b));
		}

		
	}
}
*/