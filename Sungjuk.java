/*==============================
  ���� Ŭ���� �ν��Ͻ� ����
    - Ŭ������ �ν��Ͻ� Ȱ��
================================*/

// 2. Sungjuk Ŭ����
//  - �ο� ���� �Է¹޾�, �Է¹��� �ο��� ��ŭ
//    �̸�, ��������, ��������, ���������� �Է¹ް�
//    ������ ����� �����ϴ� Ŭ������ ������ ��~!!!
//   �� �Ӽ� : �ο� ��, Record ������ �迭
//   �� ��� : �ο� �� �Է�, �� ������ �Է�, ���� �� ��� ����, ��� ���

import java.util.Scanner;

public class Sungjuk
{
	// �ֿ� �Ӽ� ����(�ֿ� ���� ����)
	int inwon;		//-- �ο� ��
	
	// �����̰� ������ Record �迭 �Ф�
	//Record rec;		//-- Record �迭(�л� �Ѹ� �� Record �迭 �� �� �� Ȱ��)
					//   Record �� ������� ������ ��ü�� ��Ƴ� �� �ִ� �迭
	
	// ���� ����Ǿ�� �� Record �迭
	Record[] rec;

	// ������~ ������ ������ �Ӽ� �� Record �迭 ������ ������...
	// ������Ÿ����... �̻��� �� ������...? �Ф�


	
	// �ֿ� �޼ҵ� ����(��� ����)
	// �� �ο� �� �Է�
	public void set()	// �̸� set
	{
		Scanner sc = new Scanner(System.in);

		do
		{
			System.out.print("�ο� �� �Է�(1~100): ");
			inwon = sc.nextInt();
		}
		while (inwon<1||inwon>100);

		// check~!!!
		// Record Ŭ������ ������� ������ ��ü(�ν��Ͻ�)�� ���� �� �ִ�
		// �迭���� inwon ��ŭ ����
		rec = new Record[inwon];		//�׸��� rec , �װ� inwon ��ŭ
		//-- Record �迭���� inwon ��ŭ ������ ������
		//	 Record Ŭ������ �ν��Ͻ��� ������ ���� �ƴϴ�.
	}

	// �ֿ� �޼ҵ� ����(��� ����)
	// �� �� ������ �Է�(���� �� ��� ���� ��� ����)
	public void input()
	{
		Scanner sc = new Scanner(System.in);

		String[] title = {"���� ���� : ","���� ���� : ","���� ���� : "};

		// �ο��� ��ŭ �ݺ� �� �ο� ���� ����Ͽ� ������� �迭�� ���̸�ŭ �ݺ�
		for (int i=0; i<inwon; i++) // for (int i=0; i<rec.length; i++)
		{

			//check~!!!
			//Record Ŭ���� ����� �ν��Ͻ� ����
			/*
			Record ob = new Record();
			rec[i] = ob;
			*/ // ���� /* �̰Ͱ� */ �ؿ� �� ���� ���̴�.
			rec[i] = new Record();

			System.out.printf("%d��° �л� �̸� �Է� : ", (i+1));
			//rec�迭��0��°���� �̸�= sc.nextInt();
			//		   ��i  ==>> rec�迭��i��°���� �̸�
			rec[i].name = sc.next();

			/*
			System.out.print("���� ���� : ");
			//rec�迭��i��°���� ����= sc.nextInt();
			rec[i].kor = sc.nextInt();
			System.out.print("���� ���� : ");
			//rec�迭��i��°���� ����= sc.nextInt();
			rec[i].eng = sc.nextInt();
			System.out.print("���� ���� : ");
			//rec�迭��i��°���� ����= sc.nextInt();
			rec[i].mat = sc.nextInt();
			*/

			for (int j=0; j<title.length; j++)	// 0 1 2 ������
			{
				//�ȳ� �޼��� ���
				System.out.print(title[j]);		

				//����ڰ� �Է��� �����͸� ���ھ�(score) �迭�� ��Ƴ���
				rec[i].score[j] = sc.nextInt();	//i��° �л��� score[0] �� ��������
												//i��° �л��� score[1] �� ��������
												//i��° �л��� score[2] �� ��������

				//����, ����, ���� ���� �����͸� �ݺ������� �Է¹޴� ����
				//���� �����ϱ�
				rec[i].tot += rec[i].score[j];

			}

			//��� �����ϱ�
			rec[i].avg = rec[i].tot / 3.0;
		
	
		}
	}//end input()


	// �ֿ� �޼ҵ� ����(��� ����)
	// �� ��� ���
	// ���±�	90  80  70  240  xx.xx	2
	// ä����   82  72  62  xxx  xx.xx	3
	// ����ȣ	98  88  78  xxx  xx.xx	1

	public void print()
	{

		// check~!!!!!
		// ���� ���� �޼ҵ� ȣ�� ~!!!!(���� �߰�)
		ranking();		// �ν��Ͻ� �޼ҵ�


		System.out.println();		//����

		//�л� �� �� �� �ݺ� ��±��� ����
		for (int i=0; i<inwon; i++)
		{
			// �̸� ���
			System.out.printf("%5s", rec[i].name);

			// ����(����,����,����) �ݺ� ���
			for (int j=0; j<3; j++)
			{
				System.out.printf("%4d", rec[i].score[j]);
			}

			// ����, ��� ���
			System.out.printf("%5d", rec[i].tot);
			System.out.printf("%8.2f", rec[i].avg);		
			
			// ������ ���� ��±��� �߰�~!!!!(���� �߰�)
			System.out.printf("%5d", rec[i].rank);		

	
			// ����
			System.out.println();

			
		}
	}//end print()
		
	 // �� ���� ���� �޼ҵ� �߰�~!!!
	 //    - Record �迭�� rank �Ӽ� �ʱ�ȭ ��� �� ��ȯ �ڷ��� void
	 //	   - Ŭ���� ���ο��� Ȱ���� �޼ҵ�� ���� �� �������� ������ private
	 private void ranking()
	 {
		 int i, j;			//--���� ����

		 // ��� �л����� ���(����, rank)�� 1�� �ʱ�ȭ
		 for (i=0; i<inwon; i++)
		 {
			 rec[i].rank = 1;
		 }

		 //�������...ex) 4���̶��... 
		 for (i=0; i<inwon-1; i++)	    //-- �� ����  0   1   2
		 {								//			    ��  ��  ��
			 for (j=i+1; j<inwon; j++)	//-- �� ��� 123  23  3
			 {
				 if (rec[i].avg > rec[j].avg)		//-- �񱳱����� ����� �񱳴���� ��պ��� ũ�ٸ�...
				 {
					 	rec[j].rank++;		//-- �񱳴���� rack�� 1��ŭ ����
				 }
				 else if (rec[j].avg > rec[i].avg)		//-- �� ����� ����� �񱳱����� ��պ��� ũ�ٸ�...
				 {
						rec[i].rank++;	 //-- �񱳱����� rank�� 1��ŭ ����
				 }
			 }
		 }

		
 	 }

}//end class()