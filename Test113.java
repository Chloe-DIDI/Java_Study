/* =======================================
		      Ŭ���� ���
		- �������̽�(Interface)
========================================*/

/*
 ��	�������̽�(Interface)�� ������ �̿ϼ��� ä�� ������
	�������̽� �ȿ� �����ϴ� �� � �޼ҵ嵵
	��ü(���Ǻ�)�� ���� ������ ��ǻ� ���� �κ��� �������� �ʵ��.
	Ŭ������ ���� ���ø����ν��� ����� �����ϴ� �߻� Ŭ������ �� �����̴�.

 ��	�������̽��� Ŭ������ �޸� ���� ����� �����ϸ� �������̽� ��ü�� ����Ѵ�.
	������ C++ ��� ��� �����Ǵ� ���� ����� ��� �������� ���� ��������
	������ױ� ������ �ڹٿ����� ���� ����� ������ �������̽���� �������� �����Ͽ�
	�������̽��� ���� ���� ����� �����ϴ� ����� �����Ѵ�.

 ��	�������̽��� ����� �߻� �޼ҵ常 ���� �� ������
	�������̽� �ȿ� �޼ҵ���� �������������ڸ� ������� �ʾƵ�
	��public������ �����Ǿ� Ŭ�������� ����(implements)�����ν� �ٷ� ������ �̷���� �� �ִ�.

 ��	 Ư¡
 	 - �߻� Ŭ������ �������� ���� �ְ� ���ǰ� ����.
	 - final ������ ���� �� �ִ�. (����� ����)
	 - �������̽��� ��public static final�� ����� ���� �� �ִ�.
	 - �������̽��� �����ϱ� ���ؼ��� ��extends����ſ� ��implements���� �̿��Ѵ�.
	 - �ϳ� �̻��� �������̽��� implements �� �� �ִ�.
	 - �������̽��� implements �� Ŭ������ �������̽��� �ٸ� �޼ҵ带 Overriding �ؾ� �Ѵ�.
	 - �������̽��� �ٸ� �������̽��� ��ӹ��� �� ������ �� ��, ��extends�� Ű���带 ����Ѵ�.
	   ����, Ŭ������ �޸� �������̽��� ���� ����� �����ϴ�.
*/

// �������̽�
interface Demo
{
	public static final double PI = 3.141592;

	// �������̽��� ��� ������
	// ��static final���� ������ ������� �ʾƵ�
	// �ڵ����� ��static final���� ����
	public int a = 10;  // �׳� ������� �����ϸ� �� ��.
	
	// �������̽��� �޼ҵ�� ���� ����(���� �Ұ�)
	// public abstract void print();
	// �ڵ����� ��abstract���� ����
	public void print();
	/* 
	{
		System.out.println(PI);
	}
	*/
}
//class DemoImpl
//class DemoImpl extends Demo (��)
//abstract class DemoImpl extends Demo (��)
//class DemoImpl implements Demo (��)
//
//�߻� Ŭ���� - �������̽��� �����ϴ� �߻� Ŭ����
//abstract class DemoImpl implements Demo
//
//Ŭ���� - �������̽��� �����ϴ� Ŭ����
class DemoImpl implements Demo
{
	//public void print();
	@Override
	public void print()
	{
		System.out.println("�������̽��� �޼ҵ� ������...");
	}
	public void write()
	{
		System.out.println("Ŭ������ ���ǵ� �޼ҵ�...");
	}

}


//main() �޼ҵ带 �����ϰ� �ִ� �ܺ��� �ٸ� Ŭ����
public class Test113
{
	public static void main(String[] args)
	{
		//Demo ob = new Demo();

		//DemoImpl ob = new DemoImpl();		// ���� �Ұ�~!!
		//-- print() �޼ҵ� ������ �� ����~!!!

		//DemoImpl obTemp = new DemoImp();
		//Demo ob = (Demo)obTemp;
		//Demo ob = obTemp;

		//�� �� ĳ����
		//  �������̽� ��ü�� ���� ��ü
		Demo ob = new DemoImpl();
		ob.print();
		//--==>> �������̽� �޼ҵ� ������...

		//ob.write();
		//--==>> ���� �߻�(������ ����)

		//�۴ٿ�ĳ����
		((DemoImpl)ob).write();
		//--==>> Ŭ������ ���ǵ� �޼ҵ�...

		System.out.println(Demo.PI);		//-- static �̱� ������...
		//--==>> 3.141592

		System.out.println(Demo.a);			//-- static �̱� ������...	
		//--==>> 10

		//Demo.a = 30;						//-- final �̱� ������...
		//==>> ���� �߻�

		
	}
}