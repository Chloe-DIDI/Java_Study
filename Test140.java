/*========================================
  ���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
  - Calender Ŭ����
==========================================*/

// �� �ǽ� ����
//	  ������ �������� �Է¹޴� ��¥��ŭ ���� ��, ��, ��, ������ Ȯ���Ͽ�
//	  ����� ����ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
// ���� ��¥ : 2021-8-11 ������
// �� �� ���� ��¥�� Ȯ���ϰ��� �Ͻʴϱ�? : 200

//=========[Ȯ�� ���]==========
// 200�� �� : xxxx-xx-xx x����
//==============================
//����Ϸ��� �ƹ� Ű�� ��������...

// �� ���� ��¥�� �������� �� ���� ���ϴ� ���� �޼ҵ�
//	  ����ü.add(Calendar.DATE, �� ��);��

import java.util.Scanner;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Test140
{
	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		Calendar ob = new GregorianCalendar();
		
		
		int days;
		String[] week = {"�Ͽ���", "������", "ȭ����", "������", "�����", "�ݿ���", "�����"};

		// ��, ��, ��, ����
		int y = ob.get(Calendar.YEAR);
		int m = ob.get(Calendar.MONTH)+1;	
		int d = ob.get(Calendar.DATE);
		int w = ob.get(Calendar.DAY_OF_WEEK)-1;

	
		System.out.printf("���� ��¥ : %d-%d-%d %s\n", y, m, d, week[w]);

	
		do
		{
			System.out.print(" �� �� ���� ��¥�� Ȯ���ϰ��� �Ͻʴϱ�? : ");
			days = sc.nextInt();
		}
		while (days<1);
		
		// �Է��� �� ��ŭ ��¥ �� ����
		ob.add(Calendar.DATE, days);

		
		y = ob.get(Calendar.YEAR); 
		m = ob.get(Calendar.MONTH)+1;	
		d = ob.get(Calendar.DATE);
		w = ob.get(Calendar.DAY_OF_WEEK)-1;

		
		System.out.println("\n===========[Ȯ�ΰ��]===========");
		System.out.printf("%d�� �� : %d-%d-%d %s\n", days, y, m, d, week[w]);
		System.out.println("================================");

	
	}
}
