/*===========================================================
  ���� ���� �帧�� ��Ʈ��(���, ���ǹ��� �ݺ���) ����
  - �ݺ���(while��) �ǽ�
=============================================================*/

// ����ڷκ��� ������ ������ �Է¹޾�
// �Է¹��� ������ �Ҽ����� �ƴ����� �Ǻ��Ͽ�
// ����� ����ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
// ������ ���� �Է� : 10
// 10 �� �Ҽ� �ƴ�
// ����Ϸ��� �ƹ� Ű�� ��������...

// ���� ��)
// ������ ���� �Է� : 11
// 10 �� �Ҽ�
// ����Ϸ��� �ƹ� Ű�� ��������...

// �� �Ҽ� : 1 �Ǵ� �ڱ� �ڽ��� �� �̿��� � ���ε� ������ �������� �ʴ� ��.
//			 ��, 1�� �Ҽ� �ƴ�.

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Test046
{
	public static void main(String[] args) throws IOException
	{

		// �� �ֿ� ���� ���� 		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				
		int num;    //--����� �Է°��� ��Ƴ� ����
		System.out.print("������ ���� �Է� : ");
		num = Integer.parseInt(br.readLine());

		int n = 2;	//--�Է°��� ������� ������������ ������ ����
					//  (1�� ����)		  5 �� 2 3 4
		boolean flag = true;	//���~�Ҽ���~!!
		

		while (n<num)		//num=5 �� n=2~4	//num=15 ��n=2~14
		{

			//�Է°�(num=5)�� n(2,3,4)�� ������ ���������� Ȯ��
			if(num%n==0)	//���� 0���� �������� ���� �Ҽ� �ƴ�
			{	
				//num�� �Ҽ��� �ƴϴ�.
				flag = false;		//--����~ �Ҽ��� �ƴϾ���~!!!
						break;
			}
				n++;
		}

		//�� ��� ��� (��� ���� �����ؾ� �� �߰� Ȯ�� �� 1���� �ƴ����� ���� �߰� ����)
				
		if(flag == true && num!=1) //flag==true�� �Ҽ���¶�
			System.out.printf("%d -> �Ҽ�\n",num); 
		else 
			System.out.printf("%d -> �Ҽ� �ƴ�\n",num);

	}
}

		// �߰� Ȯ��


		//�� ��� ���

	


/*		// ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n, a = 1;				
			
		String result = "�Ҽ� �ƴ�";
		
		// ���� �� ó��

		System.out.print("������ ���� �Է�: ");
		a = Integer.parseInt(br.readLine());

		while(a<=n)
		{
			n++;

			if(m%n==0) 
				{
				result="�Ҽ� �ƴ�";	break;
			}
			else if (m==n)
			{
				result="�Ҽ�";
			}
		}
		System.out.printf("%d �� %s\n", m, result);

	}
}
*/
//���� ���
