/*=====================
  ���� �迭 ����
  - �迭�� ����� �ʱ�ȭ
  - �迭�� �⺻�� Ȱ��
=======================*/

// ����ڷκ��� ó�� �Է¹��� �ο� �� ��ŭ��
// �л� �̸��� ��ȭ��ȣ�� �Է¹ް�
// �Է¹��� ������ ��ü ����ϴ� ���α׷��� �����Ѵ�.
// ��, �迭�� Ȱ���Ͽ� ó���� �� �ֵ��� �Ѵ�.

// ���� ��)
// �Է� ó�� �� �л� �� �Է�(��, 1~10) : 24
// �Է� ó�� �� �л� �� �Է�(��, 1~10) : 3
// �̸� ��ȭ��ȣ �Է�[1](���� ����) : �չ��� 010-1111-1111
// �̸� ��ȭ��ȣ �Է�[2](���� ����) : ä���� 010-2222-2222
// �̸� ��ȭ��ȣ �Է�[3](���� ����) : ������ 010-3333-3333

//------------------------
// ��ü �л� �� : 3��
//------------------------
//   �̸�    ��ȭ��ȣ
// �չ���  010-1111-1111	
// ä����  010-2222-2222
// ������  010-3333-3333
//------------------------
//����Ϸ��� �ƹ� Ű�� ��������...


import java.util.Scanner;

public class Test077
{
	public static void main(String[] args)
	{
	//Scanner �ν��Ͻ� ����
    Scanner sc = new Scanner(System.in);

	//����ڰ� �Է��ϴ� �л� ���� ��Ƶ� ����
    int memCount = 0;

	do
	{
		System.out.print("�Է� ó���� �л� �� �Է�(��, 1~10) : ");
        memCount = sc.nextInt();
	}
	while (memCount<1 || memCount>10);
    
	//�׽�Ʈ
	//System.out.println("����ڰ� �Է��� �ο��� Ȯ�� : " + memCount);

	//�迭 ����(�̸� �迭, ��ȭ��ȣ �迭)
	// - ����ڷκ��� �Է¹��� �ο��� ��ŭ�� �迭�� ����

	//�̸� ���� �迭
	String[] names = new String[memCount];

	//��ȭ��ȣ ���� �迭
	String[] tels = new String[memCount];
	//��String[] tels = new String[names.lenght];�� �� ������ ����
	
	for (int i=0; i<memCount; i++)
	{ 
	System.out.printf("�̸� ��ȭ��ȣ �Է�[%d](���� ����) : ", (i+1));
	 // �չ��� 010-1111-1111
     names[i] = sc.next();
     tels[i] = sc.next();
	}
	

	// ���� ���(�̸�, ��ȭ��ȣ) ���
	System.out.println();
	System.out.println("---------------------------------");
	System.out.printf("��ü �л� �� : %d��\n", memCount);
	System.out.println("---------------------------------");
	System.out.println("�̸�    ��ȭ��ȣ");

	for(int m=0; m<memCount; m++)
		System.out.printf("%4s %14s\n", names[m], tels[m]);
	
	System.out.println("---------------------------------");


	
	}
}


//���� Ǭ ��
/*
import java.util.Scanner;

public class Test077
{
	public static void main(String[] args)
	{

    Scanner sc = new Scanner(System.in);
    int n;
    String[] name;
    String[] tel;
    
     do{
        System.out.print("�Է� ó���� �л� �� �Է�(��, 1~10) : ");
        n = sc.nextInt();
    }while(n<1 || n>10);
 
    name = new String[n];
    tel = new String[n];
    
    for(int i=0;i<n;i++) {
        System.out.printf("�̸� ��ȭ��ȣ �Է�[%d](���� ����) : ", i+1);
        name[i] = sc.next();
        tel[i] = sc.next();
    }
    
    // ����ϱ�
    System.out.println("---------------------------------");
    System.out.printf("��ü �л� �� : %d��\n", n);
    System.out.println("---------------------------------");
    System.out.println("�̸�\t��ȭ��ȣ");
    for(int i=0;i<n;i++)
        System.out.println(name[i]+" "+tel[i]);
    
    System.out.println("---------------------------------");
 
    }
 
}
*/
//������
/*
�Է� ó���� �л� �� �Է�(��, 1~10) : 3
�̸� ��ȭ��ȣ �Է�[1](���� ����) : �չ��� 010-1111-1111
�̸� ��ȭ��ȣ �Է�[2](���� ����) : ä���� 010-2222-2222
�̸� ��ȭ��ȣ �Է�[3](���� ����) : ������ 010-3333-3333
---------------------------------
��ü �л� �� : 3��
---------------------------------
�̸�    ��ȭ��ȣ
�չ��� 010-1111-1111
ä���� 010-2222-2222
������ 010-3333-3333
---------------------------------
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

*/
