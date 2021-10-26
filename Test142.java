
/*
�� java.util.Random Ŭ������

   ���� ������ ������ �߻����� �����ϴ� Ŭ�����̴�.
   Math Ŭ������ ���� �޼ҵ��� random() �޼ҵ嵵 
   ������ �߻����� �����ϴ� �޼ҵ�������
   0.0 ~ 1.0 ������ �Ǽ� ���¸� �߻��ϰ� �ǹǷ�
   �ʿ��� ���� ������ ������ ������ ���ؼ��� 
   �߰����� ������� �����ؾ� �Ѵ�.
   �׷��� �ڹٴ� ���� ������ ������ �߻������ִ� 
   ���� Ŭ������ Random Ŭ������ ������ �����ϰ� �ִ�.
*/


// �ζ� ��ȣ ������ (���� �߻� ���α׷�)

// ���α׷��� ����Ǹ� �⺻������ �ζǸ� 
// 5���� �����ϴ� ���α׷� ����
// (���� ��ȣ���� ū ������ ����)

// ���� ��)
// 2  4  6 23 41 42
//16 18 22 30 36 43
// 6 19 21 22 25 35
// 4 14 18 23 27 40
// 8 20 27 33 41 42
// ����Ϸ��� �ƹ� Ű�� ��������...

import java.util.Random;
import java.util.Arrays;

class Lotto
{
	// �迭 ���� ���� �� �޸� �Ҵ� �� �ζ� ��ȣ�� ��Ƶ� �迭�� 6ĭ
	private int[] num = new int[6];

	//getter
	public int[] getNum()
	{
		return num;
	}

	// 6���� ������ �߻���Ű�� �޼ҵ� ����
	public void start()
	{
		Random rd = new Random();

		int n;
		int cnt = 0;

		//check~!!!
		jump:		// ����� ����� �ٶ������� ���ϴ�

		while (cnt<6)	// �� �� 0 1 2 3 4 5
		{
				//re.nextInt(45);		// 0 ~ 44
			n = rd.nextInt(45)+1;		// 1 ~ 45
			// 45 13

			for (int i=0; i<cnt; i++)	// ��~ 0 �� �񱳾��� / 1��0 / 2��01/3��012/4��0123/5��01234 
			{
				if (num[i]==n)
				{
					// ������ �ٽ� �߻���ų �� �ֵ��� ó��
					continue jump;
				}
			}
			num[cnt++] = n;
		}
		// ���� �޼ҵ� ȣ��
		sorting();

	}// end start()

	//���� �޼ҵ� ����
	private void sorting()
	{
		Arrays.sort(num);	
	}

}

public class Test142
{
	public static void main(String[] args)
	{

		//Lotto Ŭ���� ��� �ν��Ͻ�����
		Lotto lotto = new Lotto();

		// �⺻ - 5����
		for (int i=1; i<=5; i++)
		{
			lotto.start();
			
			//��� ���
			for (int n : lotto.getNum())
			{
				System.out.printf("%4d", n);
			}
			System.out.println();
		}

	}
}
/*
		// �ν��Ͻ� ����
		Random rd = new Random();

		// �ֿ� ���� ����
		int temp[] = new int[6];	// ���� ���� ����
		boolean t = true;

		// �迭����
		for (int i=0; i<5; i++)	//������ ���� ����
		{
			// ���� �߻�
			for (int j=0; j<6; j++)	//�տ������� ��
			{
				//temp[j] = (int)Math.round(Math.random()*45);
				temp[j] = rd.nextInt(45)+1;

				for (int k=0; k<6; k++)	//�޹�ȣ��� ��
				{
					if (j==k)
						break;

					else if (temp[j]==temp[k])
					{
						temp[j] = rd.nextInt(45)+1;
						k=0;
					}
				}				
			}
			
			// ��������
			for (int a=0; a<temp.length-1; a++)
			{
				for (int b=a+1; b<temp.length; b++)
				{
					if (temp[a]>temp[b])
					{
						temp[a] = temp[a]^temp[b];
					temp[b] = temp[b]^temp[a];
						temp[a] = temp[a]^temp[b];
					}
				}
			}

			// ��� ���
			for (int n : temp)
				System.out.printf("%3d", n);
			System.out.println();
		}

	}//end main()

}*/

// ���� ���
/*
  2 18 21 30 36 39
  1  5  6 11 18 26
  3 15 20 22 25 35
  6  7 24 27 28 36
  4 11 14 24 29 44
*/