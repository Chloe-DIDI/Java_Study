/* =======================================
		      Ŭ���� ���
		- �������̽�(Interface)
========================================*/

// �� �ǽ� ����
// ���� ó�� ���α׷��� �����Ѵ�.
// ��, �������̽��� Ȱ���� �� �ֵ��� �Ѵ�.

// ���� ��)
// �ο� �� �Է�(1~10) : 2
// 1��° �л��� �й� �̸� �Է�(���� ����) : 2108006�Ǽ���
// ���� ���� ���� ���� �Է�	  (���� ����) : 90 100 85
// 2��° �л��� �й� �̸� �Է�(���� ����) : 2108024 ��ҿ�
// ���� ���� ���� ���� �Է�	  (���� ����) : 85 70 65

// 2108006 �Ǽ���	  90 100 85		  275		91
//					  ��  �� ��
// 2108024 ��ҿ�	  85 70 65		  220		73
//					  �� �� ��

// ����Ϸ��� �ƹ� Ű�� ��������...

// �Ӽ��� �����ϴ� Ŭ����
import java.util.Scanner;
import java.io.IOException;

class Record
{
	String hak, name;		//-- �й�, �̸�
	int kor, eng, mat;		//-- ����, ����, ���� ����
	int tot, avg;			//-- ����, ���(���ǻ� ���� ó��)
}
// �������̽�
interface Sungjuk
{
	public void set();		//-- �ο� �� ����
	public void input();	//-- �� ������ �Է�
	public void print();	//-- ��� ���
}

// ���� �ذ� �������� �����ؾ� �� Ŭ���� �� Sungjuk �������̽��� �����ϴ� Ŭ����
class SungjukImpl implements Sungjuk
{
	int num,i,j;
	int[][] temp;
	char[][] rank;
	Record[] rc;
	
	@Override
	public void set()
	{
		Scanner sc = new Scanner(System.in);
	
		do
		{
			System.out.print("�ο� �� �Է�(1~10) : ");
			num = sc.nextInt();
		}
		while (num<1 || num>10);
		
		rc = new Record[num];
		temp = new int[num][3];
		rank = new char[num][3];
	}

	@Override
	public void input()
	{
		Scanner sc = new Scanner(System.in);
		for (i=0; i<num; i++)
		{
			rc[i] = new Record();

			System.out.printf("%d��° �л��� �й� �̸� �Է�(���� ����) : ",(i+1));

			rc[i].hak = sc.next();
			rc[i].name = sc.next();

			System.out.printf("���� ���� ���� ���� �Է�   (���� ����) : ");

			temp[i][0] = rc[i].kor = sc.nextInt();
			temp[i][1] = rc[i].eng = sc.nextInt();
			temp[i][2] = rc[i].mat = sc.nextInt();

			rc[i].tot = rc[i].kor + rc[i].eng + rc[i].mat;
			rc[i].avg = rc[i].tot/3;
		}

		System.out.println();
		for (i=0; i<num; i++)
		{
			for(j=0; j<3; j++)
			{
				switch (temp[i][j] - temp[i][j]%10)
				{
					case 100: case 90: rank[i][j]='��'; break;
					case 80: rank[i][j]='��'; break;
					case 70: rank[i][j]='��'; break;
					case 60: rank[i][j]='��'; break;
					default: rank[i][j]='��'; break;
				}
			}
		}
	}
 // Sungjuk �������̽��� ��� �޼ҵ带 Override���� ������ SungjukImpl Ŭ������ �߻�Ŭ������ �Ǳ⶧���� Override����� �Ѵ�.
 //-- Sungjuk �������̽��� print() �޼ҵ带 Override�� SungjukImpl Ŭ������ print() �޼ҵ�
	@Override
	public void print()
	{
		System.out.println();
		//-- �Էµ� ������� �и���Ű�� ���� ������ ���ش�.
		for (i=0; i<num; i++)	//-- ���������� �Էµ� �ο���(num)��ŭ �ݺ��ϸ� ù��° �л�(re[0], rank[0])���� ���۵ȴ�.
		{			
			System.out.printf("%s  %s  %3d %3d %3d\t%3d  %3d\n", rc[i].hak, rc[i].name, rc[i].kor, rc[i].eng, rc[i].mat, rc[i].tot, rc[i].avg);
			//-- �й�, �̸�, ��������, ��������, ��������, ����, ����� ����Ѵ�.
			System.out.printf("\t\t%3c%3c%3c\n", rank[i][0], rank[i][1], rank[i][2]);
			//-- rank[][] �迭�� �ش� �л��� ������(rank[i][0]), ������(rank[i][1]), ���е��(rank[i][2])�� ��� �ִ�.
			//   ���� �ش� rc[i] �л��� ����� ��µȴ�.
		}
	}//end print()
}


// main() �޼ҵ带 �����ϴ� �ܺ��� �ٸ� Ŭ����	
public class Test117
{
	public static void main(String[] args)
	{
		Sungjuk ob;

		// ���� �ذ� �������� �ۼ��ؾ� �� ob ����

		ob = new SungjukImpl();


		ob.set();
		ob.input();
		ob.print();

	}
}