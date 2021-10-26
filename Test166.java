/* ==============================================
 	 �÷��� �����ӿ�ũ(Collection Framework)                           
===============================================*/

// Map �� Hashtable, HashMap
// - java.util.Map �������̽���	
//	 Ű(Key)�� ��(value)�� ����(mapping)�ϸ�,
//	 ������ Ű�� ����� �� ����, �����ؾ� �ϸ�(�����ؾ� �ϸ�)
//	 �� Ű�� �� ���� ������ �����ؾ� �Ѵ�.
//	 ��, �ϳ��� Ű ���� �����ϴ� �ϳ��� ���� ���� �ڷᱸ���̴�.

/*
 �� Hashtable<K, V> Ŭ����
 	
	- �ؽ����̺� ������ ��ü �𵨸��� Ŭ������ 
	  �˻��� �����ϱ� ������ ��� �󵵰� ���� �� ���Ѵ�.

	- �ؽ����̺��̶� Ű(key)�� �׿� �����ϴ� ������(value)��
	  ���е� ������ �����̴�.

	- �����͸� �����ϰ�, �˻��ϱ� ���ؼ� Ű(key)�� �����ϸ�
	  �� ���������� Ű ���� �ο��ϸ� �ش� �����Ͱ� ��ȯ�ȴ�.

	- ����, Hashtable Ŭ������ key �Ǵ� value �� ������ null�� ������� �ʴ´�.
*/

import java.util.Hashtable;

public class Test166
{
	private static final String[] names
		= {"���±�","������","������","�չ���","�ּ���","����ȣ"};

	private static final String[] tels
		= {"7202","9032","8143","7043","6988","5057"};

	public static void main(String[] args)
	{
		// Hashtable �ڷᱸ�� �ν��Ͻ� ����
		Hashtable<String, String> ht = new Hashtable<String, String>();

		// ht ��� ����� Hashtable �ڷᱸ����
		// �迭(names, tels)�� ����ִ� �����͸� ��ҷ� ��Ƴ���
		// �� put(k,v)

		for (int i=0;i<names.length;i++)
		{
			ht.put(names[i], tels[i]);
		}

		// ht ��� Hashtable �� ���� key �� �̿��Ͽ� �˻�
		// �� get(k)
		String findName1 = "������";
		String str = ht.get(findName1);
		if (str != null)
			System.out.println(findName1 + " ��ȭ��ȣ : " + str);
		System.out.println();
		// ������ ��ȭ��ȣ : 8143


		// ht ��� Hashtable �ڷᱸ���� key�� �����ϴ����� ���� Ȯ��
		// �� containsKey(k)
		String findName2 = "������";
		if (ht.containsKey(findName2))
			System.out.println(findName2 + " �����Ͱ� �����մϴ�. ");
		else
			System.out.println(findName2 + " �����Ͱ� �������� �ʽ��ϴ�. ");
		System.out.println();
		// ������ �����Ͱ� �������� �ʽ��ϴ�.

		String findName3 = "����ȣ";
		if (ht.containsKey(findName3))
			System.out.println(findName3 + " �����Ͱ� �����մϴ�. ");
		else
			System.out.println(findName3 + " �����Ͱ� �������� �ʽ��ϴ�. ");
		System.out.println();
		// ����ȣ �����Ͱ� �����մϴ�.


		// ht ��� Hasttable �ڷᱸ���� value �� �����ϴ����� ���� Ȯ��
		// �� contains()
		String findTel1 = "7202";
		if (ht.contains(findTel1))
			System.out.println(findTel1 + " �����Ͱ� �����մϴ�. ");
		else
			System.out.println(findTel1 + " �����Ͱ� �������� �ʽ��ϴ�. ");
		System.out.println();
		// 7202 �����Ͱ� �����մϴ�.

		
		// ht ��� Hasttable �ڷᱸ������ �������� ������ ����
		// �� remove()
		ht.remove("������");
		// ��remove()�� �޼ҵ�� ���ڰ����� key �� �Ѱܹ����� 
		//  �� ��, key�� �����Ǵ� ���� �ƴϴ�.
		//  �ش� key�� ����Ǿ�(���εǾ�) �ִ� value �� �Բ� remove() �ȴ�.
		if (ht.containsKey("������"))
			System.out.println("������ �����մϴ�. ");
		else
			System.out.println("��𰬾�?");
		System.out.println();
		// ��𰬾�?


		// ����(remove()) ���� value �����ϴ��� Ȯ��
		if (ht.contains("9032"))
			System.out.println("9032 �����Ͱ� �����մϴ�. ");
		else
			System.out.println("9032 �����Ͱ� �������� �ʽ��ϴ�. ");
		System.out.println();
		// 9032 �����Ͱ� �������� �ʽ��ϴ�.

	
		// null ���� ó�� ����
		// ht.put(null, null);		// key �� value ��� null	�� ��Ÿ�ӿ���
		// ht.put("������", null);	// value �� null			�� ��Ÿ�ӿ���
		// ht.put(null, "2587");	// key �� null				�� ��Ÿ�ӿ���

	
		// �ߺ��� key �Է�
		ht.put("�չ���","1234");
	
		System.out.println(ht.get("�չ���"));
		System.out.println();
		// 1234
		// ���� "7043" ���� "1234"�� ����Ǿ����� Ȯ��
		// (����� ����)


		// �ߺ��� value �Է�
		ht.put("�Ǽ���","8143");

		System.out.println(ht.get("������"));
		System.out.println(ht.get("�Ǽ���"));
		System.out.println();
		// 8143
		// 8143

		// �� value�� �ߺ��� ���� �ԷµǾ ���� �����Ϳ� �ƹ��� ������ ��ġ�� ����.

	}
}




