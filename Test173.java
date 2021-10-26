/* =======================================
 	  ��ü ����ȭ(Object Serialization)             
==========================================*/

/*
�� ��ü ����ȭ(Object Serialization)��

   �޸𸮿� ������ Ŭ���� ��ü���� ��� ������ ���� ���¸�
   �״�� �����ؼ� ���Ͽ� �����ϰų�
   ��Ʈ��ũ�� ���� ������ �� �ִ� �������
   ��� ������ ���� �����Ѵٰų�
   �ٸ� ��Ʈ��ũ�� �ִ� ȣ��Ʈ�� ���� ���� ��� ����ϰ� �ȴ�.

					------ ���빰�̶� ��ü�� �����ϴ� �����͵�,,
   ��, ��ü ����ȭ�� ���빰�� ����Ʈ ������ ��ȯ�Ͽ� 
   ����(����) �Ǵ� ��Ʈ��ũ�� ���� �ۼ���(��Ʈ��)�� �����ϰ�
   ������ִ� ������ �� ��, ��ü�� ��� ������ �޸𸮸�����
   ������ ���� ���Ѵ�.

   ����, �޼ҵ�� �����ڴ� ��ü ����ȭ�� ��󿡼� ���ܵȴ�~!!! check~!!!!!!!


�� ��ü ����ȭ�� ����

   ��ü ��ü�� ������ ����� ���Ŀ� ���ֹ����ʰ�
   ��ü�� ���Ͽ� ���������ν� ���Ӽ�(������)�� ������ �� ������
   ��ü ��ü�� ��Ʈ��ũ�� ���� �ս��� ��ȯ�� �� �ְ� �ȴ�.

   ��ü ����ȭ�� �ڹ� 1.1 ���Ŀ� ���ԵǾ��µ�
   �� ������ RMI(���ݰ�ü���) �� Bean(��¥ �׳� Bean ��ü/��;ƴϴ�) �����̾���.
   RMI�� ���� ��ü ����� �����ؾ� �ϱ� ������
   ��ü�� �״�� �̵��� �� �־�� �Ѵ�.
   ���� �̸� �����ϱ� ���ؼ��� ��ü ����ȭ�� �ʼ����̾���.

   ���� Bean �� ���� �� ���¿� ���� ������ ������ ��
   �� ��ü ����ȭ�� ����ϸ� ���ϰ� ��ü ���¸� ������ �� �ִ�.

�� RMI(Remote Method Invocation)
   ���� �ٸ� ���� �����ġ�� �����ϴ� �Լ���
   ȣ���ϰ� �����ϴ� ����� ����Ѵ�.
   ���� �ٸ� ��� ������ ��ġ�� ������ ���� ��ü�� ����
   ��� ������ �����ϴ� �������� �����ϸ� ���ڴ�.

�� Bean(��)
   C/S ������ �𵨿��� ������ ������ �ش��ϸ�
   ���� ������ ����Ʈ���� ��ü�� ���� �� �ְ� �ϴ� ������Ʈ ���.
   �ۼ��� ��ü�� ������ �����ϸ� ������Ʈ�� ���� ���Խ�ų �� �ֵ��� �Ѵ�.
   Ŭ���̾�Ʈ���� ���̶�� ���α׷� ������Ʈ�� �й��ϴ� ������� ó��

 �� �������̽�
   
   ��ü ����ȭ�� �ϱ� ���� ���� ��ü ����ȭ�� �����ϵ���
   java.io.Serialization �������̽��� ������ �־�� �Ѵ�.
   �� �������̽��� ��ü ����ȭ�� �����Ǿ�� �Ѵٴ� ����� 
   jvm���� �˷��ִ� ������ �Ѵ�.
   ����,  �������̽��� 
   �ٸ� �������̽��� �޸� �����ؾ� �� �޼ҵ尡 ���� ������ 
   ���� ���� ���ָ� �ȴ�.

   ����)
   1
   public class Ŭ������ implemnetns Serialization
   {
	   //...
   }


   2
   Serialization �������̽��� ������ ��
   ObjectInputStream Ŭ������ ObjectOutputStream Ŭ������ �̿��Ͽ�
   ��ü ������ ������� �����ϰ� �ȴ�.

   �� ��� ������ static ���� ����� ���
   (��, Ŭ���� ������ ���)
   ��ü ����ȭ�� ��󿡼� ���ܵȴ�.

   �� Object Stream

   java.io.ObjectInputStream
   ObjectInputStream =Ŭ������ ObjectOutputStream Ŭ������ ����
   ���Ͽ� ����Ǿ� �ִ� ��ü�� ��Ʈ��ũ�� ���� ���޵� ��ü��
   ����ȭ�� ��ü�ϴ� ����� �����Ѵ�.
   ��, java.io.Serialization �������̽���
   java.io.Enternalizable �������̽��� �������ִ� ��ü�� ���ؼ��� 
   ����� �����ϴ�.
   ��, Serialization �������̽��� Enternalizable �������̽��� 
   ������ ��ü������ ����� �����ϴٴ� ���̴�. 
   �̶�, readObject() �޼ҵ带 �̿��Ͽ�
   ��Ʈ�����κ��� ����ȭ�� ��ü�� ���� �� ������
    �̷��� ���� ��ü�� �迭, ���ڿ� �Ǵ� �� ��ü �� 
	������ ��(Type)���� ĳ���� �� �־�� �Ѵ�.
*/

import java.io.File;
import java.util.Hashtable;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Enumeration;

//�ؽ����̺� ���� ���Ͽ� �����ϱ�
public class Test173
{
	public static void main(String[] args) throws Exception
	{
		String appDir = System.getProperty("user.dir");

		// �׽�Ʈ
		//System.out.println(appDir);
		//--==>> C:\JavaStudy

		// ���� ��ü ����
		File f0 = new File(appDir, "\\data\\test.ser");
		//-- appDir �� C:\JavaStudy
		//-- appDir ��ġ(���)�� �߽����� "\\data\\test.ser"�� 
		//	 �����ϰڴٴ� �ǹ�.
		//-- ��������� ��C:\JavaStudy\data\test.ser�� ����

		// �׽�Ʈ(Ȯ��)
		// ��
		//System.out.println(f0.getParentFile().exists());
		//--==>> false

		// �׽�Ʈ(Ȯ��)
		// �� ��C:\JavaStudy�� ��ο� ��data�� ���͸� ���� �� Ȯ��
		//System.out.println(f0.getParentFile().exists());
		//--==>> true

		//���͸� ������ �������� �ʴ� ��Ȳ�̶��...
		if(!f0.getParentFile().exists())
		{
			//���͸��� ����ڴ�.
			f0.getParentFile().mkdir();
		}

		// Hashtable �ڷᱸ�� �ν��Ͻ� ����
		Hashtable<String, String> h1 = new Hashtable<String, String>();

		// ������ h1 �̶�� Hashtable �ڷᱸ���� ��� �߰�
		h1.put("3", "������");
		h1.put("4", "������");
		h1.put("2", "�ٴٴ�");
		h1.put("5", "����");
		h1.put("1", "������");

		// �׽�Ʈ(Ȯ��)
		System.out.println(h1.get("1"));
		//--==>> ������

		// ���� ���� ��� ��Ʈ�� ����(�������� ����)
		FileOutputStream fos = new FileOutputStream(f0);//f0��� �踦 ����
		//-- ���� ���� ��� ��Ʈ��(���ٱ�)�� 
		//	 f0 ��� ���� ��ü�� ���ڴ�... (��� ������ �� �ֵ���...)
		//InputStreamReader isr = new InputStreamReader(System.in);

		// ��ü ���� ��� ��Ʈ�� ����
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		//-- ��ü ���� ��� ��Ʈ��(���ٱ�)����
		//   fos ��� ���� ���� ��� ��Ʈ���� ���ΰڴ�.
		//BufferedReader br = new BufferedReader(isr);

		// ���� ������ ������ ����
		//ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f0));

		//���� ����� ���� ���������� ������ ����
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


		//�� ObjectOutputStream Ŭ������ 
		//	 ��ü���� ����ϴ� ����� �����ϴ� Ŭ������
		//	 ��� ��Ʈ���� ����ϱ� ����
		//   ���������� ��ü ����ȭ�� �����ϰ� �ȴ�.
		//   �ڹ� �⺻�� ������ �Ǵ� ��ü����
		//   ���Ͽ� �����ϰų� ��Ʈ��ũ�� ���� �����ϱ� ����
		//   ������ ��ü�� ����ȭ�ϴ� ����� �����ϴ� ���̴�.

		// ������ ��Ʈ���� ������ ��ü�� ���
		oos.writeObject(h1);

		oos.close();
		//-- ObjectOutputStream ���ҽ� �ݳ�

		fos.close();
		//-- FileOutputStream ���ҽ� �ݳ�

		// �������� ��~!!!!!

		//-----------------------------------------------------------����ȭ

//����� ���� ���� �ؽ����̺�� �ҷ�����
		// �о���̱� ����~!!!!

		if (f0.exists())		//--f0 ���� ��ü�� �����Ѵٸ�...
		{						//oputput���� ���������� �о���̶� input
			FileInputStream fis = new FileInputStream(f0);
			ObjectInputStream ois = new ObjectInputStream(fis);

			//ois(ObjectInputStream)�� ���� �о���� ��ü(Object)�� ( �� readObject �� ���� ó��)
			// ������ ��(Hashtable)���� ĳ�����Ͽ�
			// h2 ��� Hashtable �ڷᱸ���� ��Ƴ���
			Hashtable h2 = (Hashtable)ois.readObject();
			//���� �����̶� �ؿ� �����̶� ���� ��
			// Object obj = ois.readObject();
			// Hashtable h2 = (Hashtable)obj;
			
			ois. close();
			//-- ois ���ҽ� �ݳ� �� ObjectInputStream ���ҽ� �ݳ�

			fis.close();
			//-- fis ���ҽ� �ݳ� �� FileInputStream ���ҽ� �ݳ�

			//-------------------------------------------������� �����ϸ� �о���̴� �۾� ��~!!!!!!!


			// �о���� h2 ��ü�� ���� Ȯ�� 
			String key;
			String value;

			// �� Iterator ����� �� ����
			Enumeration e = h2.keys();

			while (e.hasMoreElements())
			{
				key = (String)e.nextElement();
				//-- key ���� �о���̴� ����

				//Ȯ�� 
				//System.out.println(key);
				//--==>>
				/*
				5
				4
				3
				2
				1
				*/

				value = (String)h2.get(key);
				//-- key �� Ȱ���Ͽ� value ��� ����

				System.out.println(key + " �� " + value);
				//--==>> 
				/*
				5 �� ����
				4 �� ������
				3 �� ������
				2 �� �ٴٴ�
				1 �� ������
				*/
			}
		}
			
	}
}
