/* ============================
	      Ŭ���� ���
	  ���(Inheritance)
=============================*/

/*
 ��	�޼ҵ� �������̵�(Method Overriding)�� Ư¡

	- �޼ҵ� �̸�, ����Ÿ��, �Ķ���� ���� Ÿ���� ������ ��ġ�ؾ� �Ѵ�.
	- �ݵ�� ��� ���谡 �־�� �Ѵ�.
	- �����ǵ� ���� Ŭ������ �޼ҵ� �������������ڴ�
	  ���� Ŭ������ �޼ҵ� �������������ں��� ������ ũ�ų� ���ƾ� �Ѵ�.
	  ���� ���, ���� Ŭ���� �޼ҵ��� �������������ڰ� ��protected���� ���
	  ���� Ŭ������ �� �޼ҵ带 �������̵�(Overriding)�ϴ� ���
	  �������������ڴ� ��protected�� �Ǵ� ��public���̾�� �Ѵ�.
	- ��static��,��final��,��private�� �޼ҵ�� �������̵�(Overriding)�� �� ����.
	- Exception�� �߰��� �Ұ����ϴ�.
	  ��, ���� Ŭ������ �޼ҵ尡 ������ �ִ� ���� ���� ���׿� 
	  ���ο� Exception�� �߰��ϴ� ���� �Ұ����ϴٴ� ���̴�.

*/

// �θ� Ŭ���� (���� Ŭ����, super class)
class SuperTest110
{
	private int a = 5;
	protected int b = 10;
	public int c  = 20;

	public void write()
	{
		System.out.println("Super write() : " + a + " : " + b + " : " + c);
	}
}

// �ڽ� Ŭ���� (���� Ŭ����, sub class)
class SubTest110 extends SuperTest110
{
	/*
	protected int b = 10;
	public int c  = 20;

	public void write()
	{
		System.out.println("Super write() : " + a + " : " + b + " : " + c);
	}
	*/

	protected int b = 100;
	
	public void print()
	{
		// System.out.println("Sub print() : " + a + " : " + b + " : " + c);
		// ������ ����
		// ���� Ŭ�������� ����� ���� a ���� ������ �� ����.
		// private �����̱� ������.

		System.out.println("Sub print() : " + b + " : " + c);
		System.out.println("Sub print() : " + b );			//Sub print() : 100
		System.out.println("Sub print() : " + this.b );		//Sub print() : 100	
		System.out.println("Sub print() : " + super.b );	//Sub print() : 10
		// ���� b�� ���� ����� ���� �ٸ� b�� ���� �� ����� �̷������.
		// ���� Ŭ�������� ����� b, ���� Ŭ�������� ����� b


		System.out.println("Sub print() : " + c );			//Sub print() : 20
		System.out.println("Sub print() : " + this.c );		//Sub print() : 20	
		System.out.println("Sub print() : " + super.c );	//Sub print() : 20
		// ���� c�� �����ϴµ� �ƹ��� ����� ������ ����.
		// ���� Ŭ�������� ����� c
	}

	@Override
	public void write()
	{
		//System.out.println("Super write() : " + a + " : " + b + " : " + c);
		// ������ ����
		// ���� Ŭ�������� ����� ���� a ���� ������ �� ����.
		// private �����̱� ������.
	
		System.out.println("Sub write() : " + b + " : " + c);
	}
}

// main() �޼ҵ带 �����ϴ� �ܺ��� �ٸ� Ŭ����
public class Test110
{
	public static void main(String[] args)
	{
		// ���� Ŭ����(SubTest110) �ν��Ͻ� ����
		SubTest110 ob = new SubTest110();	

		ob.print();
		// Sub print() : 100 : 20

		ob.write();
		// Super write() : 5 : 10 : 20
		

		System.out.println("-------------------------------------���м�");
		
		System.out.println(ob.b);
		// 100
		
		System.out.println(((SuperTest110)ob).b); 
		// 10
		// ((SuperTest110)ob) => ��ġ ����ȯ
		// �� ���� �θ�
		// ob��ü�� �θ� Ŭ������ b�� �ҷ����� �ʹٸ�?

		((SuperTest110)ob).write();
		// Sub write() : 100 : 20 
		// �̹� �������̵� �ؼ� �ڽ� ��ü�� ���ؼ��� �θ�Ŭ������ write�� ���ҷ��´�.
		// �������̵��� ����� �����̴ϱ� �̹� ���� ��.
		// �� �޼ҵ�� ������ �� �����Ͽ� ������ ��
	}
}