package mainPackages;

import java.util.Scanner;

import basePackages.*;

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
	public static void rooftopMethod(){}
	public static void floor4Method() {//조예서 작성 
		BaseFunc.margin5();
		BaseFunc.count();
		BaseFunc.count();
		BaseFunc.countCh2("… 산건가?... 살았다… ");
		BaseFunc.count();
		BaseFunc.count();
		BaseFunc.margin5();
		BaseFunc.countCh2("그때 이후로 나는 빨간 마스크를 본적은 없다..");
		BaseFunc.count();
		BaseFunc.countCh2("아니 그날 잘못 본 것일 지도 모르겠다..");
		BaseFunc.count();
		BaseFunc.countCh2("그래서 나는 그날 일을 그 누구에게도 말하지 않았다.");
		BaseFunc.count();
		BaseFunc.countCh2("이런 터무니 없는 일은 그 누구도 믿지 않을 거기에..."); 
		BaseFunc.count();
		BaseFunc.countCh2("나 또한 그런 터무니 없는 이야기를 믿지않는 어른이 되었다.");
		BaseFunc.margin10();
		BaseFunc.endingCredit();
	}
//				The End
//				당신의 용기에 박수를… 살려는 드릴게(허무 엔딩) (￣∇￣ﾉﾉ"
	
	
	public static void houseMethod() {
		int countH=PrologueClass.Plc.count;
		BaseFunc.margin20();
		///////////////////////////////딜레이
		BaseFunc.count();
		BaseFunc.count();
		///////////////////////////////딜레이
		BaseFunc.countStr("(뒤에 인기척이 느껴진다.)");
		///////////////////////////////딜레이
		BaseFunc.count();
		BaseFunc.count();
		///////////////////////////////딜레이
		BaseFunc.countCh1("나 예뻐...?");
		BaseFunc.countCh("(뒤에서 빨간마스크가 미친듯이 쫓아온다.)");
		BaseFunc.countCh("(빨리 비밀번호를 풀어야하는데... 머리가 새하얗다.)");
		BaseFunc.countCh("(번호가 기억이 안난다... )");
		BaseFunc.countCh("(큰일이다... 빨리 머리를 굴려보자.)");
		////////////////////////////////////// 5번 이상 죽었을 시 => 힌트 출력
		if(countH >= 5) {
			BaseFunc.countStr("\n\ndufdufdltkadh\n\n");
		}
		System.out.print("비밀번호를 입력하세요 : ");
//      long then = System.currentTimeMillis(); //시간 초세기
		String password = scStr.nextLine();
//     	long now = System.currentTimeMillis(); //시간 초세기
//		long time = (now-then)/1000;
//      System.out.println(time+"초"); //초 출력
//		if(time>10){ // 10초 넘어갔을 때
//      	++countH;
//			if(GameOverClass.gameOverIn()==1) 
//				houseMethod();
//        }
		if(password.equals("1010235")) { //password가 맞았을 때
			///////////////////////////////딜레이
			BaseFunc.count();
			BaseFunc.count();
			///////////////////////////////딜레이
			BaseFunc.margin20();
			BaseFunc.countCh2("현관문을 재빨리 열고 들어온 나는 쉽사리 집안으로 들어가지 못하고");
			BaseFunc.countCh2("현관에 한참을 서 있었다.");
			BaseFunc.countCh2("다시는... 이런 경험을 하고 시지 않다...");
			BaseFunc.count();
			BaseFunc.count();
			BaseFunc.margin20();
			//###기본엔딩 출력
			BaseFunc.margin5();
			BaseFunc.countCh2("그때 이후로 나는 빨간 마스크를 본적은 없다..");
			BaseFunc.count();
			BaseFunc.countCh2("아니 그날 잘못 본 것일 지도 모르겠다..");
			BaseFunc.count();
			BaseFunc.countCh2("그래서 나는 그날 일을 그 누구에게도 말하지 않았다.");
			BaseFunc.count();
			BaseFunc.countCh2("이런 터무니 없는 일은 그 누구도 믿지 않을 거기에..."); 
			BaseFunc.count();
			BaseFunc.countCh2("나 또한 그런 터무니 없는 이야기를 믿지않는 어른이 되었다.");
			BaseFunc.margin10();
			BaseFunc.endingCredit();
		}
		else {
			++countH;
			if(GameOverClass.gameOverIn()==1) 
				houseMethod();
		}
	}
	
	
	public static void floorFriendMethod() {
		String name=PrologueClass.Plc.playerName;
		String plcGender=PrologueClass.Plc.gender;	//성별 저장
		BaseFunc.margin20();
		BaseFunc.countStr("(친구집 앞에 도착했다.)");
		///////////////////////////////딜레이
		BaseFunc.count();
		BaseFunc.count();
		///////////////////////////////딜레이
		BaseFunc.countChNoLn("(띵-");
		BaseFunc.countCh1("똥)");
		///////////////////////////////딜레이
		BaseFunc.count();
		BaseFunc.count();
		///////////////////////////////딜레이
		BaseFunc.countStr("(벨을 누르고 친구를 불렀다.)");
		///////////////////////////////딜레이
		BaseFunc.count();
		BaseFunc.count();
		BaseFunc.countStr("");
		///////////////////////////////딜레이
		BaseFunc.countCh2("▷ 연우야...");
		BaseFunc.countStrNoLn("연우 : ");
		BaseFunc.countCh2("누구세요??");
		///////////////////////////////딜레이
		BaseFunc.count();
		BaseFunc.count();
		BaseFunc.countStr("");
		///////////////////////////////딜레이
		BaseFunc.countStr("(집안에서 인기척이 들리고 친구의 대답소리가 들려온다.)");
		///////////////////////////////딜레이
		BaseFunc.count();
		BaseFunc.count();
		BaseFunc.countStr("");
		///////////////////////////////딜레이
		BaseFunc.countCh2("▷ 다행이다...");
		///////////////////////////////딜레이
		BaseFunc.margin20();
		BaseFunc.count();
		BaseFunc.count();
		BaseFunc.count();
		BaseFunc.count();
		BaseFunc.countStr("");
		///////////////////////////////딜레이
		ImgClass.RadMaskImg3();
		for(int i =0; i<150;i++) {
			BaseFunc.countStrNoLn("나 예뻐...?");
			if(i%12==0) {
				BaseFunc.countStr("");
			}
		}
		BaseFunc.margin20();
		
		///////////////////////////////딜레이
		BaseFunc.countCh2("     실종 청소년 정보         ");
		///////////////////////////////딜레이
		BaseFunc.count();
		BaseFunc.count();
		BaseFunc.countStr("");
		///////////////////////////////딜레이
		//###���ΰ� �̸�
		BaseFunc.countCh2("       이름 : "+name+"       ");
		///////////////////////////////딜레이
		BaseFunc.count();
		BaseFunc.count();
		///////////////////////////////딜레이
		//###���ΰ� ����
		BaseFunc.countCh2("       나이 : 18       ");
		BaseFunc.countCh2("       성별 : "+(plcGender.equals("여")?"여":plcGender.equals("남")?"남":" "));
		////////////////////////////////
		///////////////////////////////딜레이
		BaseFunc.count();
		BaseFunc.count();
		///////////////////////////////딜레이
		BaseFunc.margin20();
		BaseFunc.countStrNoLn("유진 : ");
		BaseFunc.countCh2("혹시 "+name+" 이야기 들었어?");
		BaseFunc.countCh2("그저께 갑자기 실종됐는데, 그날 야자 끝나고 아무도 못봤다는데...?");
		///////////////////////////////딜레이
		BaseFunc.count();
		BaseFunc.count();
		///////////////////////////////딜레이
		BaseFunc.countStrNoLn("\n연우 : ");
		BaseFunc.countCh2("아..근데 내가 그날 밖에서"+name+"목소리가 들려서 나가봤었거든..?");
		BaseFunc.countCh2("    근데 아무도 없었어...");
		BaseFunc.countCh2("    무슨일이 있엇던걸까...?");
		///////////////////////////////딜레이
		BaseFunc.count();
		BaseFunc.count();
		BaseFunc.countStr("    ...");
		///////////////////////////////딜레이
		BaseFunc.countCh2("    잘못들은 걸까...?");
		///////////////////////////////딜레이
		BaseFunc.count();
		BaseFunc.count();
		BaseFunc.count();
		BaseFunc.count();
		///////////////////////////////딜레이
		BaseFunc.margin20();
		BaseFunc.countCh1("▷  (흑..흑..)"); //주인공		
		BaseFunc.margin20();
		BaseFunc.endingCredit();
	}
	
}
