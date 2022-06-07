package basePackages;

import java.util.Scanner;

public class GameOverClass {
	static Scanner sc = new Scanner(System.in);
	static String goHome = new String("홈으로");
	static String rePlay = new String("다시하기");
//	gameOverIn메서드
	public static int gameOverIn(){
//	- 엔딩 화면에서 선택 입력받음
		PrintMes.printOver();
		String chooseM="";
		chooseM = sc.next();
		return gameOverChoose(chooseM);
	}
//	gameOverChoose메서드
	public static int gameOverChoose(String choose) {
//	- ‘gameOverIn’에서 선택 입력받은 내용 조건에 맞게 실행 및 반환 
//	- 거의 직접적으로 사용 하지 않을 클래스
//	- ‘홈으로’&예외 - 0을 리턴
//	- ‘다시하기’ - 1을 리턴		
		if(choose.equals(goHome)) {
			HomeClass.homeIn();
			return 0;
		}
		if(choose.equals(rePlay)) {
			return 1; 
		}
		else {
			PrintMes.printReCho();
			String chooseM=" ";
			chooseM = sc.next();
			gameOverChoose(chooseM);
			return 0; 
		}
	}
	
}
