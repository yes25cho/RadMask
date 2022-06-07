package basePackages;

import java.util.Scanner;

import mainPackages.PrologueClass;

public class GameEndClass {
	static Scanner sc = new Scanner(System.in);
	static String goHome = new String("홈으로");
	static String rePlay = new String("다시하기");
//	gameEndIn메서드
	public static void gameEndIn(){
//	- 엔딩 화면에서 선택 입력받음		
		PrintMes.printEnd();
		String chooseM="";
		chooseM = sc.next();
		gameEndChoose(chooseM);
	}
	
//	gameEndChoose메서드
	public static void gameEndChoose(String choose){
//	- ‘gameEndIn’에서 선택 입력받은 내용 조건에 맞게 실행 
//	- 거의 직접적으로 사용 하지 않을 클래스
		if(choose.equals(goHome)) {
			HomeClass.homeIn();
		}
		if(choose.equals(rePlay)) {
			PrologueClass.prologueMethod();
		}
		else {
			PrintMes.printReCho();
			String chooseM=" ";
			chooseM = sc.next();
			gameEndChoose(chooseM); 
		}
	}
	
}
