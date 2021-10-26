/*========================================
  ���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
  - Wrapper Ŭ����
==========================================*/
//import java.math.BigDecimal;

public class Test130
{
	public static void main(String[] args)
	{
		byte b = 3;
		int i = 256;

		Byte b2 = new Byte(b);
		Integer i2 = new Integer(i);

		System.out.println(b2);
		System.out.println(i2);
		//--==>> 3
		//		 256

		print(b2);
		print(i2);

		// Byte Ŭ������ byteValue() �޼ҵ� ȣ��
		byte b3 = b2.byteValue();

		//	Integer Ŭ������ intValue() �޼ҵ� ȣ��
		int i3 = i2.intValue();

		System.out.println(b3);
		System.out.println(i3);
		//--==>> 3
		//		 256
		
		//check~!!!
		int i4 = b2.byteValue();
		//byte b4 = i2.intValue();	 //--==>> ���� �߻�
		byte b4 = i2.byteValue();	 //--==>> �ݵ�� Ȯ��
		//check~!!!
		System.out.println(i4);
		System.out.println(b4);
	}
	/*
	static void print(Byte b)
	{
		...;
	}

	static void print(Integer i)
	{
		...;
	}

	static void print(int i)
	{
		...;
	}

	static void print(Object o)
	{
		...;
	}
	*/

	// java.lang.Number Ŭ����(�߻� Ŭ����)��
	// ��� Wrapper Ŭ�������� �θ� Ŭ����
	// (���� Ŭ����, ���� Ŭ����)�̴�.
	// b2, i2 �ڷ����� Number n �� �Ѿ���鼭
	// Auto-Boxing �� �Ͼ�� �ȴ�.
	
	public static void print(Number n)
	{
		System.out.println(n);
		System.out.println(n.intValue());
	}
}