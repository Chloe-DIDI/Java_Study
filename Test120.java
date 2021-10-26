/*===========================
  ���� Ŭ���� ��� ����
  - ��ø Ŭ����
===========================*/

// outer Ŭ����
class InnerOuterTest
{
	static int a = 10;			//��������, Test2�� �������, static����(class����, Ŭ��������)
	int b = 20;					//��������, Test2�� �������, non-static����(instance����, �ν��Ͻ�����)


	//inner
	class InnerNested
	{
		int c = 30;
	
			void write()		
			{
				System.out.println("inner �� write()...");
				System.out.println("a : " + a);
				System.out.println("b : " + b);
				System.out.println("c : " + c);
				
			}
	} //end class InnerNested

		// �޼ҵ� �ȿ� �����ϴ� �Ǵٸ� Ŭ����(���� Ŭ����, ���� Ŭ����, local class)
		// inner Ŭ����
		
		void write()		// �� �� ��° write() �޼ҵ�
		{
			System.out.println("outer �� write()...");
 		}
	}//end class InnerOuterTest


	
//main() �޼ҵ带 �����ϰ� �ִ� �ܺ��� �ٸ� Ŭ����
public class Test120
{
	public static void main(String[] args)
	{
		// outer �� �ν��Ͻ� ����
		InnerOuterTest ob2 = new InnerOuterTest();
		ob2.write();			//-- outer �� write() �޼ҵ� ȣ��

		//InnerOuterTest.InnerNested ob3 = new InnerOuterTest.InnerNested();
		//--==>> ���� �߻�(������ ����)

		//InnerNested ob4 = new InnerNested();
		//--==>> ���� �߻�(������ ����)

		// �� ��ø ���� Ŭ����(static ��ø Ŭ����)�ʹ� �޸�
		//	  �ܺ� Ŭ������ �ν��Ͻ�(��ü)�� ������� �ʰ�
		//	  �ܵ����� ���� Ŭ������ �ν��Ͻ��� �����ϴ� ���� �Ұ����ϴ�.

		// �� check ~!!!
		//	  Test118.java ���ϰ� ���� ��~!!!

		//��new InnerOuterTest.new InnerNested();��

		InnerOuterTest.InnerNested ob5 = ob2.new InnerNested();
		ob5.write();
		/*
		 inner �� write()...
		a : 10
		b : 20
		c : 30
		*/

		InnerOuterTest.InnerNested ob6 = new InnerOuterTest().new InnerNested();
		ob6.write();
		/*
		inner �� write()...
		a : 10
		b : 20
		c : 30
		*/

		// outerŬ������.innerŬ������ ���������� = new outer������().new inner������();

		// cf) static �� ��ø ���� Ŭ����
		// Test.StaticNested ob = new Test.StaticNested();

		// outerŬ������.innerŬ������ ���������� = new outerŬ������.inner������();





	}
}