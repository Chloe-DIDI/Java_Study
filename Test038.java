/*===========================================================
  ���� ���� �帧�� ��Ʈ��(���, ���ǹ��� �ݺ���) ����
  - switch �� �ǽ�
=============================================================*/

// ����ڷκ��� ������ �� ������ �����ڸ� �Է¹޾�
// �ش� �������� ���� ó�� ����� ����ϴ� ���α׷��� �����Ѵ�.
// ��, switch ���ǹ��� Ȱ���Ͽ� ó���� �� �ֵ��� �ϸ�,.
// ���� ����� ���ǻ� �������� ó���� �� �ֵ��� �Ѵ�.

// ���� ��)
// ù ��° ���� �Է�  : 20
// �� ��° ���� �Է�  : 14
// ������ �Է�[+ - * /] : +

// >> 20 + 14 = 34


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Test038
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


		// ��
/*
		// int a, b, result=0;
		int a, b, result; //!!!!result �����ʱ�ȭ�Ƚ�Ű���̷��� �ϰ�ʹٸ�
		int op;

		System.out.print("ù ��° ���� �Է�  : ");
		a = Integer.parseInt(br.readLine());
				
		System.out.print("�ι�° ���� �Է� : ");
		b = Integer.parseInt(br.readLine());

		System.out.print("������ �Է�[+ - * /] : ");
		op = System.in.read();

		// + �� op:43, - �� op:45, * �� op:42, / �� op:47

		switch (op)
		{
			case 43: result=a+b;break;
			case 45: result=a-b;break;
			case 42: result=a*b;break;
			case 47: result=a/b;break;
			default: return;	//!!!! �̷��� �ϸ��	//check~!!!!
		
		}

		// �� return Ű���尡 ���ϴ� �� ���� �ǹ�
		// 1. ���� ��ȯ
		// 2. �޼ҵ��� ���� �� main() �޼ҵ� ���� �� ���α׷� ��

		System.out.println();
		System.out.printf(">> %d %c %d = %d\n", a, op, b, result);
		//						----
		//						���ڰ� + - * /
		// ���࿡ %d ��� �ƽ�Ű�ڵ尪���� ���ڰ� �ð�
*/

//���� ���
/*
ù ��° ���� �Է�  : 27
�ι�° ���� �Է� : 7
������ �Է�[+ - * /] : -

>> 27 - 7 = 20
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/


		// ��
/*		int a, b, result;
		char op;

		System.out.print("ù ��° ���� �Է�  : ");
		a = Integer.parseInt(br.readLine());
				
		System.out.print("�ι�° ���� �Է� : ");
		b = Integer.parseInt(br.readLine());

		System.out.print("������ �Է�[+ - * /] : ");
		op = (char)System.in.read();

		switch (op)
		{
			case '+': result=a+b;break;
			case '-': result=a-b;break;
			case '*': result=a*b;break;
			case '/': result=a/b;break;
			default: return;
		
		}

		System.out.println();
		System.out.printf(">> %d %c %d = %d\n", a, op, b, result);
*/

		// ��
		int a, b, result;
		String op;				//--check~!!!

		System.out.print("ù ��° ���� �Է�  : ");
		a = Integer.parseInt(br.readLine());
				
		System.out.print("�ι�° ���� �Է� : ");
		b = Integer.parseInt(br.readLine());

		System.out.print("������ �Է�[+ - * /] : ");
		op = br.readLine();		//--check~!!!

		switch (op)				//--check~!!!
		{
			case "+": result=a+b;break;
			case "-": result=a-b;break;
			case "*": result=a*b;break;
			case "/": result=a/b;break;
			default: return;
		
		}

		System.out.println();
		System.out.printf(">> %d %s %d = %d\n", a, op, b, result);
		//						---- 
		//						���ڿ��̴ϱ� s




		//���� Ǭ��
		/*
		int a, b;
		char op;

		System.out.print("ù��° ���� �Է� : ");
		a = Integer.parseInt(br.readLine());
				
		System.out.print("�ι�° ���� �Է� : ");
		b = Integer.parseInt(br.readLine());

		System.out.print("������ �Է�[+ - * /] : ");
		op = (char)System.in.read();

		switch (op)
		{
		case '+': System.out.printf("\n >> %d + %d = %d\n", a, b, a+b); break;
		case '-' : System.out.printf("\n>> %d %c %d = %d\n", a, op, b, a-b); break;
		case '*': System.out.printf("\n>> %d %c %d = %d\n", a, op, b, a*b); break;
		case '/': System.out.printf("\n>> %d %c %d = %d\n", a, op, b, a/b); break;
		default: System.out.println("\n>> �Է� ����");
		}
		*/


		
	}
}
