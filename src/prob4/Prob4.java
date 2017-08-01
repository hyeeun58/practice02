package prob4;
public class Prob4 {

	public static void main(String[] args) {
		char[] c1 = reverse( "Hello World" );
		printCharArray( c1 );
		
		char[] c2 = reverse( "Java Programming!" );
		printCharArray( c2 );
	}
	
	// 문자열 순서 변경 
	public static char[] reverse(String str) 
	{
		/* 코드를 완성합니다 */
		// 문자열의 순서를 뒤집어서 char 배열로 리턴하는 메소드를 구현한다
		// 예를 들어 “Hi!” 라는 문자열을 파라미터로 전달 하면 {‘!’, ‘i’, ‘H’ } 배열을 반환 한다.
		char[] getChar = str.toCharArray();
		char[] changeChar = new char[getChar.length];
		
		for(int i=0; i<getChar.length; i++)
		{
			changeChar[i] = getChar[getChar.length-(i+1)];
		}
			
		return changeChar;
	}

	// 문자열 출력
	public static void printCharArray(char[] array)
	{
		/* 코드를 완성합니다 */
		// char[]을 받아들여 출력한다.
		// {‘!’, ‘i’, ‘H’}   배열을 파라미터로 전달하면 다음과 같이 출력된다.
		// !iH
		String getStr = "";
		for(int i=0; i<array.length; i++)
		{
			getStr += array[i];
		}
		System.out.println(getStr);
	}
}
