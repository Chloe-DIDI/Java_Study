/*===============================================
  ���� ������(Operator) ����
  - ���� ������ == ���� ������
=================================================*/


//����ڷκ��� ������ ������ �Է¹޾�
//�Է¹��� ������ ��������, ��������, 0���� �����Ͽ�
//�� ����� ����ϴ� ���α׷��� �����Ѵ�
//��, �Է� �����ʹ� BufferedReader �� readLine() �� ���� �Ѱܹ��� �� �ֵ��� �Ѵ�.
//����, ���� ������(���׿�����)�� Ȱ���Ͽ� ����� ������ �� �ֵ��� �Ѵ�.

//���� ��)
//������ ���� �Է� : -12
//-12 �� ����
//����Ϸ��� �ƹ� Ű�� ��������...

//������ ���� �Է� : 257
//257 �� ���
//����Ϸ��� �ƹ� Ű�� ��������...

//������ ���� �Է� : 0
// 0 �� ��
//����Ϸ��� �ƹ� Ű�� ��������...


import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
//import.java.io.*;    //-->>

public class Test027
{
	public static void main(String[] args) throws IOException
	{
		//�� �ֿ� ���� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n;					//-����� �Է°��� ���� ����
		String strResult;		//--�������� ������� ������ �Ǻ������ ��������

				//�� ���� �� ó��
				System.out.print("������ ���� �Է� : ");
				n=Integer.parseInt(br.readLine());
				/*
				n�� 0���� ũ�� �� true  �� n �� ��� 
							   �� false �� n �� �۴� �� true  �� n �� ����
							   						 �� false �� n �� ��
									------------------------------------------							   
							   �� false �� n �� ���� �Ǵ� �� �̶�� �� �� ����
				*/
				
				
				strResult = (n>0) ? ("���") : ((n<0) ? ("����") : ("��") );
				//10
				//strResult = (10>0) ? ("���") : ((n<0) ? ("����") : ("��") );
				//strResult = (true) ? ("���") : ((n<0) ? ("����") : ("��") );
				//strResult = "���"

				//-4
				//strResult = (-4>0) ? ("���") : ((n<0) ? ("����") : ("��") );
				//strResult = (false) ? ("���") : ((n<0) ? ("����") : ("��") );
				//strResult = (false) ? ("���") : ((-4<0) ? ("����") : ("��") );
				//strResult = (false) ? ("���") : ((true) ? ("����") : ("��") );
				//strResult = (false) ? ("���") : ("����");
				//strResult = "����"

				//0
				//strResult = (0>0) ? ("���") : ((n<0) ? ("����") : ("��") );
				//strResult = (false) ? ("���") : ((n<0) ? ("����") : ("��") );
				//strResult = (false) ? ("���") : ((0<0) ? ("����") : ("��") );
				//strResult = (false) ? ("���") : ((false) ? ("����") : ("��") );
				//strResult = "��"


				// �� ��� ���

				System.out.println(n + "��" + strResult);
	}
}


//������
/*
������ ���� �Է� : 0
0�濵
*/


//�� Ǯ��
/*
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test027
{
	public static void main(String[] args) throws IOException
	{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n;
		String strResult;

		System.out.print("������ ���� �Է� : ");
		n = Integer.parseInt(br.readLine());


		strResult = (n>0) ? "���" : (n==0 ? "��" : "����");

		System.out.printf("%d �� %s\n", n, strResult);
	
	}
}*/
//������
/*
 

*/

		