/* ==============================================
 	 �÷��� �����ӿ�ũ(Collection Framework)                           
===============================================*/

/*
 ��	Vector (����)

	�ڹ��� �ڷ� ���� ����� �����ϴ� Ŭ������ �� ���� �⺻���� Ŭ������
	�迭�� ���������, �迭�� �޸� �ٸ� ������ ������ ���� ����
	������ ��Ҹ� ���� �� ������, �����Ͱ� �������� �ڵ����� ���� ������
	Ȯ���Ű�� �ȴ�.

	����, ��ü ���۷����� �����ϱ� ������
	JDK 1.5 �������� �ڹ� �⺻�� �����ʹ� ������ �� ��������
	JDK 1.5 ���ĺ��ʹ� ����ڽ� / �����ڽ� ����� �����Ǹ鼭
	�⺻ ���������� ������ ����������.

	���� Ŭ������ �⺻ ������ 
	������(Sequence) ������ ������ ����ϸ�
	������ ������ ������ �������� �ε��� ���� ���� ��ġ�� �����ϰ� �ȴ�.
	����, �ڷᱸ���� �� ���ܿ����� ������ ������ ť��
	���� �������� ������ ������ ���ð� �޸�
	������ ������ �ε��� ���� �̿��Ͽ� �ڷᱸ���� ������ �������� 
	���� �� ������ �����ϴ�.

	���Ϳ� ������ ������ 
	List �������̽��� ���� �����ް� �ֱ� ������
	List �������̽��� ��� �޼ҵ带 ����� �� �ִ�.

	- void add(int index, E element)
	- void insertElemetAt(E obj, int index)
	  �־��� ��ġ�� ��ü�� �����Ѵ�.
	  �־��� ��ġ�� ��ü���� ���������� �ϳ��� �̵��Ѵ�.

	- void addElement(E obj)
	- boolean add(E e)
	  ��ü�� ���� ���� �߰��Ѵ�.

	- void removeElement(int index)
	- E remove(int index)
	  �־��� ��ġ�� ��ü�� �����Ѵ�.
	  ���� �� �־��� ��ġ ������ ��ü���� �ϳ��� �������� �̵��Ѵ�.
   	 E remove(int index) �޼ҵ�� ����Ǿ��� ��ü�� ��ȯ�Ѵ�.

	- boolean removeElement(Object obj)
	- boolean remove(Object obj)
	  ��� ��ü�� �����Ѵ�.
	  ���� �� �־��� ��ġ ������ ��ü���� �ϳ��� �������� �̵��Ѵ�.
	  ��ü�� ���������� ���ŵǾ����� true�� ��ȯ�Ѵ�.

	- void removeAllElement()
	- void clear()
	  ������ ��� ��Ҹ� �����Ѵ�.

	- void setElementAt(E obj, int index)
	- E set(int index, E element)
	  ������ index ��ġ�� �־��� ��ü�� �����Ѵ�.
	  �־��� ��ġ�� ����Ǿ� �ִ� ��ü�� �Ҹ��Ѵ�. ( �� ������� ����)

	- E elementAt(int index)
	- E get(int index)
	  �־��� ��ġ�� ����Ǿ��ִ� ��ü�� ��ȯ�Ѵ�.

	- Enumeration<E> element()
	  ������ ��� ��Ҹ� ��ȯ�Ѵ�.

	- int indexOf(Object o)
	  �־��� ��ü�� ����� ��ġ�� ��ȯ�Ѵ�.
	  �������� ���� ��� ���������� ��ȯ�Ѵ�.

	- int indexOf(Object o, int index)
	  �־��� ��ü�� ����� ��ġ�� index ��ġ���� ã�Ƽ� ��ȯ�Ѵ�.
	  index ��ġ�� ��ĵ�� �����ϴ� ��ġ

	- boolean contains(Object o)
	  ���Ͱ� �־��� ��ü�� �����ϰ� �ִ����� ���θ� ��ȯ�Ѵ�.

	- void ensureCapacity(int minCapacity)
	  ������ �뷮�� �־��� ũŰ���� ũ���� �����Ѵ�.

	- E firstElement()
	  ������ ù ��° ����� �����͸� ��ȯ�Ѵ�.

	- E lastElement()
	  ������ ������ ����� �����͸� ��ȯ�Ѵ�.

	- void setSize(int newSize)
	  ������ ũ�⸦ �����Ѵ�.
	  ���� �־��� ũ�Ⱑ ���� ũ�⺸�� �۴ٸ� �������� ������.
	  �ݴ�� �־��� ũŰ�� ���� ũ�⺸�� ũ�ٸ�
	  �� ������ null�� ä��� �ȴ�.
	  (��ü�� �������� ������ �ǹ�)

	- int capacity()
	  ���� ������ �뷮�� ��ȯ�Ѵ�.

	- int size()
	  ���� ���Ϳ� ����� ��ü�� ����(size)�� ��ȯ�Ѵ�.

	- int trimToSize()
	  ������ �뷮�� ����� ��ü�� ������ �µ��� �ּ�ȭ�Ѵ�.
*/
import java.util.Vector;
import java.util.Iterator;

public class Test154
{
	private static final String[] colors = {"����", "���", "�ʷ�", "�Ķ�", "����", "����"};

	public static void main(String[] args)
	{
		int i;
		String str;

		// Vector(����) �ڷᱸ�� v ����
		Vector<Object> v = new Vector<Object>();

		// v ��� Vector(����) �ڷᱸ����
		// colors �迭�� ����ִ� ������ ��Ƴ���
		// add()
											
		for (i=0; i<colors.length;i++ )
		{
			v.add(colors[i]);
		}

/*                                				
	for ( String color : colors ) 				
	{                             				
		v.add(color);             				
	}                             				
*/                                				

		// ������(���) �߰�
		// addElement()
		v.addElement("�Ͼ�"); // ��ġ�� ���� ��������




		// firstElement()
		str = (String)v.firstElement();
		System.out.println("ù ��° ��� : " + str);
		// ù ��° ��� : ����

		// get()
		str = (String)v.get(1);	// �����̳� ť ó�� ������ ���� �ƴ϶� �迭ó�� �����ϴ� ����
		System.out.println("�� ��° ��� : " + str);
				
		str = (String)v.get(0);	// �翬�� ó�� ��� ���� ����
		System.out.println("ù ��° ��� : " + str);
		// �� ��° ��� : ���
		// ù ��° ��� : ����


		// elementAt()
		str = (String)v.elementAt(1);
		System.out.println("�� ��° ��� : " + str);
		// �� ��° ��� : ���

		// lastElement()
		str = (String)v.lastElement();
		System.out.println("������ ��� : " + str);
		// ������ ��� : ����

		// �� ������ �߰� �� 
		// ������ ��� : �Ͼ�

		// �� ���� �ڷᱸ���� ��� �߰� �� ( �� add() / addElement())
		//	  �ε��� ������(���� ��)�� ��ġ�� �߰��Ǵ� ���� Ȯ���� �� �ִ�.

		// �� ��ü ��� ��� �� ��ü ��� ����  
		// ��Iterator(���ͷ����� or �����ͷ�����)���� ���� ��ü ��ҿ� ������ ����
		// ��hasNext()�� : ���� ������ ��Ұ� �ִ����� ���θ� Ȯ���Ͽ� ��ȯ
		// ��next()��	 : ���� ������ ��Ҹ� ���������� ��ȯ
		
		Iterator<Object> it = v.iterator();

		while (it.hasNext())
		{
			str = (String)it.next();
			System.out.print(str + " ");
		}
		System.out.println();
		// ���� ��� �ʷ� �Ķ� ���� ���� �Ͼ�

	}
}

