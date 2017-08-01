package prob3;

public class Prob3 {
	public static void main(String args[]) {
		char c[] = { 'T', 'h', 'i', 's', ' ', 'i', 's', ' ', 'a', ' ', 'p', 'e', 'n', 'c', 'i', 'l', '.' };

		// 원래 배열 원소 출력
		printCharArray(c);

		// 공백 문자 바꾸기
		replaceSpace(c);

		// 수정된 배열 원소 출력
		printCharArray(c);
	}
	
	// 문자열 중 특정 문자 치환
	public static void replaceSpace(char a[]) 
	{
		for(int i=0; i<a.length; i++)
		{
			if(a[i] == ' ') a[i] = ',';
		}
	}
	   
	// 문자열 배열 출력
	public static void printCharArray(char a[]) 
	{
		System.out.println("");
		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i]);
		}
	}

}
