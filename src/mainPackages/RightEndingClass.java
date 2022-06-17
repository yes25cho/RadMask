package mainPackages;

import java.util.Scanner;

import basePackages.BaseFunc;
import basePackages.GameEndClass;
import basePackages.GameOverClass;
import basePackages.PrintMes;

//오른쪽 엔딩 관련 클래스를 모아 두는 곳 입니다.
//들어 가야 할것들
//- 선택하는 메소드(이 클래스의 중심인 클래스)-담당 : ?? (메소드 이름 : rightMethod)
//- 주택가, 주택-주인공집(좀 먼)-담당 : 박선주 (메소드 이름 : houseMethod)
//- 아파트 4층 -담당 : 조예서 (메소드 이름 : floor4Method)
//- 아파트 친구(연우)집(11)(진엔딩)-담당 : 박선주 (메소드 이름 : floorFriendMethod)
//- 아파트 옥상-담당 : 권하은 (메소드 이름 : rooftopMethod)
public class RightEndingClass {
	static Scanner scStr = new Scanner(System.in);
	public static void rightMethod() {
		BaseFunc.countStr("(언제까지 달릴 수는 없으니 어디든 들어 가야겠다..)");
		BaseFunc.countStr("        ▶ 아파트(친구 집이 있다.)            ▶ 주택(집이 있다.)");
		BaseFunc.countStr("");
		PrintMes.printChoose();
		String choose = "";
		choose = scStr.nextLine();
		BaseFunc.margin5();
		if (choose.equals("아파트")) {
			floor();
		} else if (choose.equals("주택")) {
			houseMethod();
		} else {
			PrintMes.printReCho();
			BaseFunc.margin5();
			rightMethod();// 다시 입력 받도록 제귀 호출
		}
	}
	public static void floor() {
		BaseFunc.countStr("▷ 왔긴 해는데 몇층으로 가지?");
		BaseFunc.countStr("        ▶ 1                  ▶ 9");
		BaseFunc.countStr("        ▶ 2                  ▶ 10");
		BaseFunc.countStr("        ▶ 3                  ▶ 11(친구집)");
		BaseFunc.countStr("        ▶ 4                  ▶ 12");
		BaseFunc.countStr("        ▶ 5                  ▶ 13");
		BaseFunc.countStr("        ▶ 6                  ▶ 14");
		BaseFunc.countStr("        ▶ 7                  ▶ 15");
		BaseFunc.countStr("        ▶ 8                  ▶ 옥상");
		BaseFunc.margin5();
		PrintMes.printChoose();
		String floor = scStr.nextLine();
		switch (floor) {
		case "4":
			floor4Method();
			break;
		case "11":
			floorFriendMethod();
			break;
		case "옥상":
			rooftopMethod();
			break;
		case "1":case "2":case "3":case "5":
			case "6":case "7":case "8":case "9":
				case "10":case "12":case "13":case "14":
					if(GameOverClass.gameOverIn()==1) {
						floor();
					}
			break;
		default:
			break;
		}
	}
	public static void houseMethod(){}
	public static void floorFriendMethod(){}
	public static void rooftopMethod(){}
	public static void floor4Method() {//조예서 작성 
		BaseFunc.margin5();
		BaseFunc.countCh2("… 산건가?... 살았다… ");
		BaseFunc.margin5();
		BaseFunc.countCh2("그때 이후로 나는 빨간 마스크를 본적은 없다..");
		BaseFunc.countCh2("아니 그날 잘못 본 것일 지도 모르겠다..");
		BaseFunc.countCh2("그래서 나는 그날 일을 그 누구에게도 말하지 않았다.");
		BaseFunc.countCh2("이런 터무니 없는 일은 그 누구도 믿지 않을 거기에..."); 
		BaseFunc.countCh2("나 또한 그런 터무니 없는 이야기를 믿지않는 어른이 되었다.");
		GameEndClass.gameEndIn();
//				The End
//				당신의 용기에 박수를… 살려는 드릴게(허무 엔딩) (￣∇￣ﾉﾉ"

	}

	
}
