/*===============================================
  ���� �ڹ��� �⺻ ���α׷��� ����
  - �ڹ��� �⺻ ����� : java.util.Scanner
=================================================*/

//��java.util.Scanner
//	�ܶ� ���� ������ ����Ͽ� �Է��� ��ū�� ���� �����ϸ�
//	����Ʈ(default)�� ���Ǵ� �ܶ����ڴ� �����̴�.
//	�ۼ��� ���� ��ū�� ��next()�� �޼ҵ带 ���
//	�ٸ� ����(�ڷ���)�� ������ ��ȯ�� �� �ִ�.

//������ 90 80 70

import java.util.Scanner;

public class Test017
{
	public static void main(String[] args)
	{
		//�� �ֿ� ���� ����
		Scanner sc = new Scanner(System.in);
		String name;
		int kor, eng, mat, tot;

		//�� ���� �� ó��
		System.out.print("�̸� �������� �������� �������� �Է�(���� ����) : ");
		//--������ 90 80 70

		//����ڰ� �Է��� ����Ƽ���� ������ ������ ��Ƴ���
		name = sc.next();
		kor = sc.nextInt();
		eng = sc.nextInt();
		mat = sc.nextInt();


		//���� ����
		tot = kor + eng + mat;			//-->>��� ��
		//tot = name + kor + eng + mat;  -->> �̰� ���ڿ� ���տ����� �Ͼ

		//�� ��� ���
		System.out.println();
		System.out.println(">> �̸� : " + name);
		System.out.println(">> ���� : " + tot );
	}
}
//������
/*

�̸� �������� �������� �������� �Է�(���� ����) : ������ 90 80 70

>> �̸� : ������
>> ���� : 240
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

*/