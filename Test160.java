/* ==============================================
 	 �÷��� �����ӿ�ũ(Collection Framework)                           
===============================================*/

/*
 �� Enumeration �� Iterator �������̽�

	Collection Framework����
	Enumeration �� Iterator��� �������̽��� �ִ�.
	�������� �ǹ̷δ� �ݺ�, ��ȯ�̶�� �ǹ̸� ������ ������
	� ��ü���� ������ ���� ��,
	�� ��ü���� � ������ ���� �ϳ��� �����Ͽ� ����ϱ� ����
	�������̽���� �� �� �ִ�.

	- java.util.Enumeration<E> �������̽�
	  : �� �������̽��� ���� �� ���� �޼ҵ常�� �����ϸ�
	  ��hasMoreElement()���޼ҵ带 ����
	  �������̽� �ȿ� ���� ��Ұ� �ִ����� ���� ���Ǹ� �Ѵ�.
	  ���� true�� ��ȯ�Ǿ��ٸ� ���� �ε����� ��Ұ� �����Ѵٴ� �ǹ��̸�
	  ��nextElement()�� �޼ҵ�� ���� ��Ҹ� ������ ����ϸ� �Ǵ� ���̴�.

	  ex) // v ��� ���� �ڷᱸ���� ����� ��� ��� ���� �� ���
	  for (Enumeration e = v.element(); e.hasMoreElement();)
	  {
		System.out.println(e.nextElement());
	  }

	- java.util.Iterator<E> �������̽�
	  : Enumeration ���� �������� ���� ��remove()�� �޼ҵ尡 �߰��� �� ���̴�.
	    Iterator�� ������ �ִ� ��hasNext()�� �� ��next()�� �޼ҵ��
		�̸��� �ణ �ٸ� �� Enumeration �������̽��� ������ �ִ�
		��hasMoreElement()�� �� ��nextElement()�� ��
		��Ȯ�� ��ġ�ϴ� ����� �����Ѵ�.
		Enumeration ��� Iterator�� JDK 1.2 ���� �߰��Ͽ� ����ϰ� �� ������
		Enumeration �������̽��� ���� ������ ��Ҹ� ������ ����� ���� ������
		�̸� �����ϱ� ���� ���� ���� Iterator �������̽��̴�.

*/
import java.util.Vector;
import java.util.Enumeration;
import java.util.Iterator;

public class Test160
{
	public static void main(String[] args)
	{
		// ���� �ڷᱸ�� v �ν��Ͻ� ����
		Vector<String> v = new Vector<String>();

		// ���� �ڷᱸ�� v ��� �߰�
		v.add("Java");
		v.add("Oracle");		
		v.add("Jsp");
		v.add("Servlet");
		v.add("Spring");


		// �� Enumeration
		//	   - hasMoreElements()
		//	   - nextElement()
		Enumeration<String> e = v.elements();
		while (e.hasMoreElements()) // true / false ���� ��ȯ
		{
			System.out.println(e.nextElement());
		}
		System.out.println();
		//	Java
		//	Oracle
		//	Jsp
		//	Servlet
		//	Spring

		System.out.println("-----------���м�------------");

		// �� Iterator
		//	   - hasNext()
		//	   - next()
		v.iterator();
		Iterator<String> it = v.iterator();
		while (it.hasNext()) // true / false ���� ��ȯ
		{
			System.out.println(it.next());
		}
		System.out.println();
		//	Java
		//	Oracle
		//	Jsp
		//	Servlet
		//	Spring
	}
}