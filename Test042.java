/*===========================================================
  ���� ���� �帧�� ��Ʈ��(���, ���ǹ��� �ݺ���) ����
  - �ݺ���(while��) �ǽ�
=============================================================*/


// ���� ��)
// 1 ���� 100���� ������ �� : 5050
// 1 ���� 100���� ¦���� �� : 2550
// 1 ���� 100���� Ȧ���� �� : 2500
// ����Ϸ��� �ƹ� Ű�� ��������...
public class Test042
{
	public static void main(String[] args) 
	{

		//�ֿ� ���� ����
		int n = 1, sum, even, odd;
		sum=even=odd=0;
		
		// ���� �� ó��
		while (n<=100)
		{
			//������ ó��
			sum += n;

			//¦���� ó��
			if (n%2==0)
			{
				even +=n;
			}

			//Ȧ���� ó��
			else if (n%2!=0)
			{
				odd +=n;
			}
		
			//������ ó��
			else
			{
			System.out.println("�Ǻ� �Ұ� ������");
				return;
			}

			n++;
		}

		
		// ��� ���

		System.out.println(" 1 ���� 100���� ������ �� " + sum);
		System.out.println(" 1 ���� 100���� ¦���� �� " + even );		
		System.out.println(" 1 ���� 100���� Ȧ���� �� " + odd );

/*
			if(n<=100)
			{
				sum += n;
			}
			else if (n%2==0)		
			{	
				even += n;
			}
			else if (n%2!=0)	 //Ȧ������ �Ǻ�
			{
				 odd += n;
			}
			else
			{
				System.out.println("�Ǻ� �Ұ� ������");
				return;
			}

		// ��� ���

		System.out.println(" 1 ���� 100���� ������ �� " + sum);
		System.out.println(" 1 ���� 100���� ¦���� �� " + even );		
		System.out.println(" 1 ���� 100���� Ȧ���� �� " + odd );
		*/
	}
}