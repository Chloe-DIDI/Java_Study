

public class InfRecul
{
	public static void main(String[] args)
	{
		showHi(5);					// �̰��� ���� �ؿ� Hi�� 5�� ����ϰ�~!
									// �Ű����� 5
	} 

	public static void showHi(int cnt)	// 5
	{
		System.out.println("Hi~");
		
		if(cnt==1)				// �̷����ص��ǰ� // 	if(cnt--==1)
			return;								  //	return;
		showHi(--cnt);							  //	showHi(cnt);
	}							//�ص� ����~!
}


/*
		public static void showHi(5)	
	{
		System.out.println("Hi~");			
		//showHi(--5);						//����Ʈ�Ƚ��ϱ� showHi(5)
		showHi(4)
		if(cnt==1)					
			return;			
	}
}
		*/