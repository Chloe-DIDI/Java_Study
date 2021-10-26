

public class InfRecul
{
	public static void main(String[] args)
	{
		showHi(5);					// 이거의 뜻은 밑에 Hi를 5번 출력하게~!
									// 매개변수 5
	} 

	public static void showHi(int cnt)	// 5
	{
		System.out.println("Hi~");
		
		if(cnt==1)				// 이렇게해도되고 // 	if(cnt--==1)
			return;								  //	return;
		showHi(--cnt);							  //	showHi(cnt);
	}							//해도 나옴~!
}


/*
		public static void showHi(5)	
	{
		System.out.println("Hi~");			
		//showHi(--5);						//포스트픽스니까 showHi(5)
		showHi(4)
		if(cnt==1)					
			return;			
	}
}
		*/