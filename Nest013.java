
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Nest013
{
	public static void main (String[] args) throws IOException
	{

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		String strName;
		int nKor, nEng, nMat;
		int nTot;

		String strTemp;

		System.out.print("이름을 입력하세요 : ");
		strName = br.readLine();

		System.out.print("국어 점수 입력 : ");
		strTemp = br.readLine();

		nKor = Integer.parseInt(strTemp);

		System.out.print("영어 점수 입력 : ");
		strTemp = br.readLine();

		nEng = Integer.parseInt(strTemp);

		System.out.print("수학 점수 입력 : ");
		strTemp = br.readLine();
		nMat = Integer.parseInt(strTemp);

		nTot = nKor + nEng + nMat;

		System.out.println("\n====[결과]====");

		System.out.printf("이름 : %s\n", strName);
		System.out.printf("총점 : %d\n", nTot);

	}
}

// 실행 결과
/*
이름을 입력하세요 : 이유빈
국어 점수 입력 : 90
영어 점수 입력 : 70
수학 점수 입력 : 80

====[결과]====
이름 : 이유빈
총점 : 240
계속하려면 아무 키나 누르십시오 . . .
*/








