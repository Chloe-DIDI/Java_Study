/* ==============================================
 	 �÷��� �����ӿ�ũ(Collection Framework)     
===============================================*/

// ���� �ڷᱸ�� ��ü ���� �� ���� ��
// ����� ���� Ŭ���� Ȱ�� �� �ڷ���

import java.util.Vector;


// ����� ���� Ŭ���� ���� �� �ڷ���ó�� Ȱ��
class MyData
{
	// �ֿ� �Ӽ� ���� �� �ֿ� ���� ����(��� ����)
	private String name;	// �̸�
	private int age;		// ����

	// getXxx()	�� getter
	// setXxx()	�� setter

	// getter / setter ����
	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public void setAge(int age)
	{
		this.age = age;
	}
	
	// ������ (�Ű����� 2���� ������) �� ����� ���� ������
	public MyData(String name, int age)
	{
		this.name = name;
		this.age = age;
	}

	// ������ (�Ű����� ���� ������) �� ����� ���� ������
	public MyData()
	{
		name = "";
		age = 0;
	}

}
public class Test158
{
	public static void main(String[] args)
	{
		// ���� �ڷᱸ�� ����
		Vector<MyData> v = new Vector<MyData>();

		// ���� �ڷᱸ�� v��
		// ä���� 13�� /  ������ 7�� / ������ 5��
		// ��Ƴ���

		// ��
		/*
		MyData st1 = new MyData();
		st1.setName("ä����");
		st1.setAge(13);
	
		MyData st2 = new MyData();
		st2.setName("������");
		st2.setAge(7);

		MyData st3 = new MyData();
		st3.setName("������");
		st3.setAge(5);
		
		v.add(st1);
		v.add(st2);
		v.add(st3);
		*/
		
		// ��
		/*
		MyData st1 = new MyData("ä����",13);
		MyData st2 = new MyData("������",7);
		MyData st3 = new MyData("������",5);
		
		v.add(st1);
		v.add(st2);
		v.add(st3);
		*/

		// ��
		v.add(new MyData("ä����",13));
		v.add(new MyData("������",7)); 
		v.add(new MyData("������",5)); 

		// ���� �ڷᱸ�� v�� ��� ����(���) ��ü ����ϱ�
		// ���� ��)
		// �̸� : ä����, ���� : 13��
		// �̸� : ������, ���� : 7��
		// �̸� : ������, ���� : 5��

		// ��
		for ( MyData md : v )
			System.out.printf("�̸� : %s, ���� : %d��\n", md.getName(), md.getAge());
		System.out.println();
		
		// ��
		for (int i=0;i<v.size();i++)
			System.out.printf("�̸� : %s, ���� : %d��\n", v.elementAt(i).getName(), v.elementAt(i).getAge());
		System.out.println();

		// ��
		for ( Object temp : v )
		//	 ------------- ��ĳ���� (MyData�� Object ��������)
			System.out.printf("�̸� : %s, ���� : %d��\n", ((MyData)temp).getName(), ((MyData)temp).getAge());
		//												   ------------- �ٿ�ĳ����
		System.out.println();

		// �̸� : ä����, ���� : 13��
		// �̸� : ������, ���� : 7��
		// �̸� : ������, ���� : 5��

	}
}





