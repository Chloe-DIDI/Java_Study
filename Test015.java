
public class Test015
{
	public static void main(String[] args)
	{
		System.out.print("AAA");
		System.out.print("BBB");
		//System.out.print("CCC"); �� �����߻� (������ ����)
		System.out.print("CCC\n");
		//--==>>AAABBBCCC

		System.out.println();			//--����
		//System.out.print();			//--==>> ���� �߻�(������ ����)

		System.out.printf("12345678901234567890");
		System.out.printf("12345678901234567890\n"); // --��\n�� ����
		System.out.printf("12345678901234567890%n"); // --��%n�� ����

		//System.out.printf();	//--==>> �Ű����� ���� ���� ��������(�����Ͽ���)
								//��ȣ ���� �Ű�����

		System.out.printf("%d + %d = %d\n", 10, 20, 30);
		//--==>> 10 + 20 = 30

		System.out.printf("%d\n", 123);
		System.out.printf("%d10\n", 123);
		System.out.printf("%d8\n", 1234);
		System.out.printf("%d010\n", 123);
		//--==>>10�տ� 0������ ���ڸ�0���� ��

		//���� ���
		/*
		
		123
		12310
		12348
		123010

		*/

		System.out.printf("%+d\n", 365);
		System.out.printf("+%d\n", 365);	//-> �� ������� ����ϱ� 
		//--==>>							//������ ����� �Ѵ� ��밡�� �� ���
		/*
		+365
		+365
		*/

		System.out.printf("%d\n", +365);
		//-->> 365

		//System.out.printf("%-d\n", +365);
		//--==>> �����߻�(��Ÿ�� ����)

		
		System.out.printf("-%d\n", 365);
		//--==>> -365

		
		System.out.printf("%d\n", -365);
		//--==>> -365
	
		System.out.printf("%(d\n", -365);		//�������϶� ()
		//--==>>(365)
		System.out.printf("%(d\n", 365);		//�����϶� �׳�
		//--==>> 365
		
		//System.out.printf("%d\n", 'A');
		//--==>> ���� �߻� ( ��Ÿ�� ����)
		System.out.printf("%s\n", 'A');		//���ڿ�s ���ڴ�c
		//--==>> A

		//System.out.printf("%c\n", "ABCD");
		//--==>> ���� �߻�(��Ÿ�� ����)
		System.out.printf("%s\n", "ABCD");
		//--==>> ABCD

		System.out.printf("%h\n", 365);		//h�� 16������ ǥ���ϴ� ��
		//--==> 16d
		System.out.printf("%o\n", 24);		//o�� 8������ ǥ���ϴ� ��
		//--==>> 30

		System.out.printf("%b\n", true);	// true (�� ���� ����)   
		//--==>> true						//"ture" (t r u e���ڿ�)  �ΰ� �ٸ�

		System.out.printf("%f\n", 123.23);
		//--==>> 123.230000
		System.out.printf("%.2f\n", 123.23);
		//--==>> 123.23
		System.out.printf("%.2f\n", 123.231);
		//--==>> 123.23
		System.out.printf("%.2f\n", 123.236);
		//--==>> 123.24

		
		// System.out.printf("%10d\n", 123);
		System.out.printf("%8.2f\n", 123.236);
		//8.2���� 8�� ________ 8ĭ ���� Ȯ��
		//.2f �����
		//--==>>__123.24
		System.out.printf("%2.2f\n", 123.236);
		// 1123.24 ǥ���ؾߵǴ� �����ʹ��ִµ� 2�� �ʹ������� �׳� �״�γ���
		//--==>> 123.24
	}
}
//������
/*

AAABBBCCC

1234567890123456789012345678901234567890
12345678901234567890
10 + 20 = 30
123
12310
12348
123010
+365
+365
365
-365
-365
(365)
365
A
ABCD
16d
30
true
123.230000
123.23
123.23
123.24
  123.24
123.24
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

*/