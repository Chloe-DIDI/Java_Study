/*===============================================
  ■■■ 연산자(Operator) ■■■
  - 비트 단위 연산자
  - 비트 shift 연산
=================================================*/

public class Test023
{
	public static void main(String[] args)
	{
								//							  |   <<3칸 이동
		int x = 128;			// 00000000 00000000 00000000 10000000
								// 00000000 00000000 00000100 00000000
								//						  | <- 여기로옴 = 1024

		System.out.printf("x <<3 : %d\n", x<<3);
		System.out.printf("x * 8 : %d\n", x*8); //8은 2의3승
		//--==>> x <<3 : 1024
		//		 x * 8 : 1024

		System.out.printf("x >>3 : %d\n", x>>3);
		System.out.printf("x / 8 : %d\n", x/8);
		//--==> x >>3 : 16
		//		x / 8 : 16

		//                            |		>>3칸이동
		// 00000000 00000000 00000000 10000000
		// 00000000 00000000 00000000 00010000
		//						         | <- 여기로옴 = 16

		//  >> → 비트열 이동 시 빈 자리에 양수 → 0 / 음수 → 1  ==>부호 유지
		// >>> → 비트열 이동 시 빈 자리에 무조건 0 삽입


		System.out.printf("x << 24 : %d\n", x<<24);
		//--==>> x <<24 : -2147483648
		// 10000000 00000000 00000000 00000000
		// |
		

		System.out.printf("x << 25 : %d\n", x <<25);
		System.out.printf("x << 26 : %d\n", x <<26); 
		System.out.printf("x << 31 : %d\n", x <<31); 
		//--==>>	x << 25 : 0
	 	//			x << 26 : 0
		//			x << 31 : 0

		System.out.printf("x << 32 : %d\n", x <<32); 
		//--==>>	x << 32 : 128

	}
}