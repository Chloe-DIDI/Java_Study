/* ==============================================
 	 �÷��� �����ӿ�ũ(Collection Framework)                           
===============================================*/

// Set �� HashSet, TreeSet
// - ���� ����.
// - �ߺ��� ������� �ʴ� ����(�⺻)

/*
 �� TreeSet<E> Ŭ����

 	java.util.HashSet<E> Ŭ������ 
	Set �������̽��� ����� SortedSet �������̽��� ������ Ŭ������
	�����͸� �߰��ϸ� �����͵��� �ڵ����� �������� ������ ����ȴ�.

*/
import java.util.TreeSet;
import java.util.Iterator;
import java.util.Comparator;

public class Test165
{
	public static void main(String[] args)
	{
		// TreeSet �ڷᱸ�� �ν��Ͻ� ����
		TreeSet<String> set = new TreeSet<String>();

		// TreeSet �ڷᱸ�� set�� ��� �߰� �� add();
		set.add("�Ͽ��ǿ����̴¼�");
		set.add("�̿��������");
		set.add("�Ʊ����Ѹ�");
		set.add("�͸���Į��");
		set.add("�ܿ�ձ�");
		set.add("¯���¸�����");
		set.add("�λ��̵�ƿ�");
		set.add("�̷��ҳ��ڳ�");
		set.add("���ɰ���");

		// Iterator�� Ȱ���� set ��� ��ü ���
		Iterator<String> it = set.iterator();
		while (it.hasNext())
		{
			System.out.print(it.next() + " ");
		}
		System.out.println();
		// �ܿ�ձ� �͸���Į�� �̷��ҳ��ڳ� �Ʊ����Ѹ� ���ɰ��� �̿�������� �λ��̵�ƿ� ¯���¸����� �Ͽ��ǿ����̴¼�

		
  //================================================================

		// TreeSet�� ��ü�� �����Ѵٸ�?
		
		// TreeSet �ڷᱸ�� �ν��Ͻ� ����
		// TreeSet<GradeVO> set2 = new TreeSet<GradeVO>();
		TreeSet<GradeVO> set2 = new TreeSet<GradeVO>(new MyComparator<GradeVO>());
		
		// set2.add(GradeVO);	: ��ü�� ���� �� ����. �ν��Ͻ� �����ؼ� �־�� ��.
		// GradeVO ob = new GradeVO();
		set2.add(new GradeVO("20211523", "���", 90, 80, 70));
		set2.add(new GradeVO("20211524", "����", 91, 81, 71));
		set2.add(new GradeVO("20211525", "�ڹ�", 98, 78, 88));
		set2.add(new GradeVO("20211526", "����", 72, 49, 99));
		set2.add(new GradeVO("20211527", "����", 56, 31, 90));

		// Iterator �� Ȱ���� set ��� ��ü ���
		/*
		Iterator<GradeVO> it2 = set2.iterator();
		while (lt2.hasNext())
			System.out.print(it2.next() + " ");
		System.out.println();
		*/
		// ������ �����߻�

		// MyComparator Ŭ���� ���� / TreeSet ���� ���� ���� �� �ٽ� ����
		/*
		Iterator<GradeVO> it2 = set2.iterator();
		while (it2.hasNext())
			System.out.print(it2.next() + " ");
		System.out.println();
		*/
		// GradeVO@15db9742 GradeVO@6d06d69c GradeVO@7852e922 GradeVO@4e25154f GradeVO@70dea4e
		// GradeVO�� ����߱� ������ �ؽ��ڵ尡 ���
		// �Ӽ������� �� ���!
	
		Iterator<GradeVO> it2 = set2.iterator();
		while (it2.hasNext())		
		{
			GradeVO vo = it2.next();
			System.out.printf("%7s %7s %4d %4d %4d %6d\n",
							vo.getHak(), vo.getName(), vo.getKor(), vo.getEng(),
				vo.getMat(), vo.getTot());
		}
		System.out.println();
		
		
		
	}	
}

// VO �� Value Object 
// DTO �� Data Transfer Object
// DAO �� Data Access Object
class GradeVO
{
	// �ֿ� �Ӽ� ����
	private String hak;			// �й�
	private String name;		// �̸�
	private int kor, eng, mat;	// ��������, ��������, ��������

	// ����� ���� ������ �� 5���� �Ű������� ���� ������
	GradeVO(String hak, String name, int kor, int eng, int mat)
	{
		this.hak = hak; 
		this.name = name;
		this.kor = kor; 
		this.eng = eng; 
		this.mat = mat; 
	}

	// ����� ���� ������ �� �Ű����� ���� ������
	// �Ű������� �����ϴ� �����ڸ� ����� ���� �����ڷ� �����Ͽ��� ������
	// default �����ڰ� �ڵ����� ���Ե��� ���� ���� ����Ͽ�
	// �߰��� ������ ������
	GradeVO()
	{
	}
	
	String getHak()
	{
		return hak;
	}

	void setHak(String hak)
	{
		this.hak = hak;
	}

	String getName()
	{
		return name;
	}

	void setName(String name)
	{
		this.name = name;
	}
	
	int getKor()
	{
		return kor;
	}

	void setKor(int kor)
	{
		this.kor = kor;
	}

	int getEng()
	{
		return eng;
	}

	void setEng(int eng)
	{
		this.eng = eng;
	}

	int getMat()
	{
		return mat;
	}

	void setMat(int mat)
	{
		this.mat = mat;
	}

	// �߰� �޼ҵ� ����(���� ����)
	int getTot()
	{
		return kor + eng + mat;
	}
}


class MyComparator<T> implements Comparator<T>
// T - the type of objects that may be compared by this comparator
//	Comparator �������̽��� ����ؼ� Ŭ������ �����ϰ�,
//	������ ��Ƽ� �񱳰� �̷������� �������̵��Ѵ�.
{
	@Override
	public int compare(T o1 ,T o2)	// ��ҿ� ��Ҹ� ���ؼ� 
	{
		GradeVO s1 = (GradeVO)o1;
		GradeVO s2 = (GradeVO)o2;

		// �й� ����(��������)
		// return Integer.parseInt(s1.getHak()) - Integer.parseInt(s2.getHak());
		//			��20211523��						��20211524��
		// return 20211523 - 20211524;
		// -1

		// �й� ����(��������)
		// return Integer.parseInt(s2.getHak()) - Integer.parseInt(s1.getHak());

		// ���� ����(��������)
		// return s1.getTot() - s2.getTot();

		// ���� ����(��������)
		// return s2.getTot() - s1.getTot();

		
		// �̸� ����(��������)
		// return s1.getName().compareTo(s2.getName());

		// �̸� ����(��������)
		return s2.getName().compareTo(s1.getName());
	}
}

