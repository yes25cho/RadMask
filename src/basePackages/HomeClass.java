package basePackages;

import java.util.Scanner;

import mainPackages.PrologueClass;

public class HomeClass {
	static Scanner sc = new Scanner(System.in);
	static String start = new String("시작하기");
	static String man = new String("설명보기");
	static String back = new String("돌아가기");
//	homeIn메서드
	public static void homeIn(){
//	- 홈화면에서 선택 입력받음
		PrintMes.printHome();
		String chooseM="";
		chooseM = sc.next();
		homeChoose(chooseM);
	}
//	manner메서드
	public static void manner(){
//	- 설명화면표시 및 선택 입력받음	
		PrintMes.printManner();
		String chooseM=" ";
		chooseM = sc.next();
		homeChoose(chooseM);
	}
//	homeChoose메서드
	public static void homeChoose(String choose){
//	- ‘gameOverIn’에서 선택 입력받은 내용 조건에 맞게 실행 및 반환 
//	- 거의 직접적으로 사용 하지 않을 클래스	
		if(choose.equals(start)) {
			PrologueClass.prologueMethod();
		}
		else if(choose.equals(man)) {
			manner();
		}
		else if(choose.equals(back)) {
			homeIn();
		}
		else {
			PrintMes.printReCho();
			String chooseM=" ";
			chooseM = sc.next();
			homeChoose(chooseM);
		}
	}
}
