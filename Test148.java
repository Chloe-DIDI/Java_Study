/*========================================
  ���� ����(Exception) ó�� ����
==========================================*/

// ���� �ٽ� ������


public class Test148
{	
	public static void main(String[] args)
	{
		//Test148 �ν��Ͻ� ����
		Test148 ob = new Test148();

		try
		{
			int a = ob.getValue(-2);				// �� ���� �߻�
			System.out.println("a : " + a);
		}
		catch (Exception e)							// �� ���� ��Ƴ���
		{
			System.out.println("�� printStackTrace...............");
			e.printStackTrace();
		}


	}
	public int getData(int data) throws Exception
	{
		if(data<0)
			throw new Exception("data �� 0���� �۽��ϴ�.");
		// �� ���� �߻�

		return data + 10;
	}


	public int getValue(int Value) throws Exception
	{							//  =============== �̰ŵ� �����ؾߴ� ************
		int a = 0;

		try
		{
			a = getData(-2);		// �� ���� �߻����� ����� ��������
		}
		catch (Exception e)			// �� �߻��� ���ܸ� ��Ѵ�
		{
			// �� ��Ƴ� ���ܿ� ���� ó��
			System.out.println("�� printStackTrace...............");
			e.printStackTrace();

			// ��Ƴ� ���ܸ� �ٽ� ������ 
			// *****���࿡ �̰Ÿ� �����Ѵٸ�
			throw e;
			//-- �ּ� ó�� ��(��, ��Ƴ� ���ܸ� �ٽ� ������ ���� ���)
			//	 main() �޼ҵ��� ���� ó�� ������ ������� �ʰ� �ȴ�.
		}
		return a;
	}
}

//���� ���
/*
�� printStackTrace...............
java.lang.Exception: data �� 0���� �۽��ϴ�.
        at Test148.getData(Test148.java:31)
        at Test148.getValue(Test148.java:44)
        at Test148.main(Test148.java:17)
�� printStackTrace...............
java.lang.Exception: data �� 0���� �۽��ϴ�.
        at Test148.getData(Test148.java:31)
        at Test148.getValue(Test148.java:44)
        at Test148.main(Test148.java:17)
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

*/
