/*===============================================
	���� �ڹ��� �⺻ ���α׷��� ����
	- ������ �ڷ���
	- �ڹ��� �⺻ ����� : BufferedReader Ŭ����
=================================================*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test011
{
	public static void main(String[] args) throws IOException
	{												//�蹮���߻��� �޴���
												//��������Ű�½°��������δ���������
											//�̶�!!�׷��� ���� import.java.io.~
											//�� �����ص� java���� io �ȿ� �޴����� �ִ�.��� ��
		//BufferedReader �ν��Ͻ� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


		//int n;
		//double d;
		//BufferedReader br;

		//�ֿ� ���� ����
		int r;							//--������
		final double PI = 3.141592;		//--������
		double a, b;					//--����, �ѷ�

		//���� �� ó��
		//�� ����ڿ��� �ȳ� �޼��� ���
		System.out.print("���� ������ �Է� : ");
							//����ڸ� �Է��ѰŰ� �ؿ� r.br~���⿡ ���Ե�
		//�� ����ڰ� �Է��� ���� �޾ƿ� ������ ���� r �� ���
		//r = br.readLine();
		//r = "20"; �� ��= "20"�̶� ���������� r�� int�� ����Ǿ��⶧���� �ؿ���Ӽ���
		
		//Integer.parseInt() �� �Ű������� �Ѱܹ��� ���ڿ� �����͸� ���������� ��ȯ
		r = Integer.parseInt(br.readLine()); 
		// r = Integer.parseInt("20") �� ���������� �����Ұž�
		// r = 20; �� ���������� �ٲ�
		//--����ڰ� �Է��� ���� BufferedReader(br)�� ��readLine()��
		//	�޼ҵ带 Ȱ���Ͽ� ���ڿ� ���·� �о���� ��
		//	�� ���� ��Integer.parseInt()���� ���� ������(������)���� ��ȯ�� ��
		//���� ������ ������ ���� r�� ��Ƴ���

		// �� ���� �� �ѷ� ����
		a = r * r * PI;
		b = r * 2 * PI;

		// ��� ���
		//System.out.println(">> ���� : "+a);
		//System.out.println(">> ���� : "+b);

		//System.out.printf(">> ���� : ��\n", �ۿ� ���� ��);
		//System.out.printf(">> �ѷ� : ��\n", �ۿ� ���� ��);
		//System.out.printf(">> ���� : %f\n", a);
		//System.out.printf(">> �ѷ� : %f\n", b);

		//System.out.printf(">> ���� : %.2f\n", a);
		//System.out.printf(">> �ѷ� : %.2f\n", b);	
		//-- ��%f���� ���� ��¿� �޼ҵ忡�� �Ǽ����� ��Ƴ��� �ɼ� ����
		//	 ��%.2f���� �Ҽ��� ���� �����ڸ����� ǥ���ϰڴٴ� �ǹ�


	}
}