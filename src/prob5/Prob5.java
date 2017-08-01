package prob5;

import java.util.Random;
import java.util.Scanner;

public class Prob5 {

	public static void main(String[] args) {

		
		
		// 게임 변수 초기화
		int minNumber = 1;
		int maxNumber = 100;

		// 정답 램덤하게 만들기
		Random random = new Random();
		int correctNumber = random.nextInt(maxNumber) + minNumber;

		//System.out.println( random );
		int count = 1;				// 회차 정보
		String answerStr = "y";		// 정답 시 계속 진행 여부
		System.out.println("수를 결정하였습니다. 맞추어 보세요.");
		Scanner s = new Scanner(System.in);
		
		do {
			System.out.println(minNumber + "-" + maxNumber);	// 최소값-최대값 입력안내문구
			System.out.print(count + ">>");
			int answerNum = s.nextInt();
		
			// 입력한 숫자에 대한 평가
			switch(diffMsg(correctNumber, answerNum))
			{
				case "UP" : minNumber = answerNum;
							count++;
							break;
				case "DOWN" : maxNumber = answerNum;
							count++;
							break;
				case "SAME" : System.out.print("다시 하시겠습니까(y/n)");
							answerStr = s.next();
							break;
			}
			
		} while(answerStr.equals("y"));
		
	}
	
	// 랜던값과 입력값 비교 결과 회신
	public static String diffMsg(int randomNum, int num)
	{
		String answer = "";
		
		if(num < randomNum)	
		{
			System.out.println("더 높게");
			answer = "UP";
		}
		else if(num > randomNum) 
		{
			System.out.println("더 낮게");
			answer = "DOWN";
		}
		else 
		{
			System.out.println("맞았습니다.");
			answer = "SAME";
		}
		
		return answer;
	}

}