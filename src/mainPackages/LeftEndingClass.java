package mainPackages;

import java.util.Scanner;

import basePackages.*;

//왼쪽 엔딩 관련 클래스를 모아 두는 곳 입니다.
//들어 가야 할것들
//- 선택하는 메소드(이 클래스의 중심인 클래스)-담당 : ?? (메소드 이름 : leftMethod)
//- 세탁소(허무엔딩)-담당 : 조예서 (메소드 이름 : cleanerMethod)
//- 파출소(해피엔딩/배드엔딩)-담당 : 박선주 (메소드 이름 : policeMethod)
//- 교회(해피엔딩/배드엔딩)-담당 : 권하은 (메소드 이름 : churchMethod)
public class LeftEndingClass {
	static Scanner scStr = new Scanner(System.in);
	public static void leftMethod() {
		BaseFunc.countStr("(언제까지 달릴 수는 없으니 어디든 들어 가야겠다..)");
		BaseFunc.countStr("        ▶ 파출소                          ▶ 교회");
		BaseFunc.countStr("        ▶ 세탁소 ");
		BaseFunc.countStr("");
		PrintMes.printChoose();
		String choose = "";
		choose = scStr.nextLine();
		BaseFunc.margin5();
		if (choose.equals("파출소")) {
			policeMethod();
		} else if (choose.equals("교회")) {
			churchMethod();
		} else if (choose.equals("세탁소")) {
			cleanerMethod();
		} else {
			PrintMes.printReCho();
			BaseFunc.margin5();
			leftMethod();// 다시 입력 받도록 제귀 호출
		}
	}
	public static void cleanerMethod() {
		String plcGender=PrologueClass.Plc.gender;	//성별 저장
		BaseFunc.countStr("(세탁소로 무작정 뛰기 시작하였다.)");
		BaseFunc.countCh2("\"나... 예... 쁘... 냐...고....!\"");
		BaseFunc.countStr("");
		BaseFunc.countStr("(뒤에서 소리치는 빨간 마스크의 목소리가 들린다.)");
		BaseFunc.countStr("(희미하게 불이 켜져 있는 세탁소에 드디어 도착했다.)");
		BaseFunc.margin5();
		BaseFunc.countStr("----마감 내일 다시 찾아 와 주세요----");
		BaseFunc.margin5();
		BaseFunc.countCh2("(다행이도 세탁소의 문은 열어져있다.)"); 
		BaseFunc.countStr("(이 안으로 들어가야 겠다.)");
		BaseFunc.countStr("(세탁소 문을 열고 들어서자 세제냄새와 사장님의 포마드 냄새가 난다.)");
		BaseFunc.countStr("(나는 계산대 속으로 들어가 숨었다."); 
		BaseFunc.countStr("");
		BaseFunc.countCh2("▷ 사장님 문은 좀 잠그고 다니시라니까... 걱정하는 딸의 마음을 몰라요...");
		BaseFunc.countCh2("▷ 아무튼  사장님의 문을 안 잠구시는 습관이 나를 살렸다....");
		BaseFunc.countStr("");
		BaseFunc.countCh1("끼이익..");
		ImgClass.RadMaskImg3();
		BaseFunc.countCh2("▷ 아… 들어오면서 문을 안잠궜었나.. 난 이제 죽는구나…");
		BaseFunc.countStr("");
		BaseFunc.countStrNoLn("아빠(세탁소 사장님) : ");
		BaseFunc.countCh2("하.. 또 문을 안 잠그고 나갔구만 것 참..ㅎㅎ"); 
		BaseFunc.countStr("");
		BaseFunc.countCh2("(사장님아니 아빠의 목소리가 들리는 순간.. 빨간 마스크가 내 눈 앞에서  사라졌다.)");
		BaseFunc.countCh2("(아빠의 손에는 방금 화장실에서 머리를 정리 하고 왔는지 포마드가 들려 있었다.)");
		BaseFunc.countCh2("(그래 포마드 아빠의 포마드가 나를 살렸다...)");
		BaseFunc.countStr("");
		BaseFunc.countStrNoLn("아빠(세탁소 사장님) : ");
		BaseFunc.countCh2("엇..! "+(plcGender.equals("여")?"딸":plcGender.equals("남")?"아들":"너")
				+" 왜 거기있어? 옷은 왜이렇게 다 젖었고 비 맞고 왔어?");
		BaseFunc.countStr("");
		BaseFunc.countCh2("▷ 아니.. 또 문 안 잠구고 갔을 까봐.. 혹시 몰라서 왔지");
		BaseFunc.countStrNoLn("아빠(세탁소 사장님) : ");
		BaseFunc.countCh2("아빠 세탁소도 신경 써주고우리 "+
				(plcGender.equals("여")?"딸":plcGender.equals("남")?"아들":"")
				+"다컸네. 마감하다가 화장실이 급해서 참을 수가 있어야지...허허");
		BaseFunc.countCh2("               거의다 되었어 같이 집에 가자");
		BaseFunc.margin10();
		BaseFunc.countCh2("그때 이후로 나는 빨간 마스크를 본적은 없다..");
		BaseFunc.countCh2("아니 그날 잘못 본 것일 지도 모르겠다.."); 
		BaseFunc.countCh2("그래서 나는 그날 일을 그 누구에게도 말하지 않았다."); 
		BaseFunc.countCh2("이런 터무니 없는 일은 그 누구도 믿지 않을 거기에...");
		BaseFunc.countCh2("나 또한 그런 터무니 없는 이야기를 믿지않는 어른이 되었다.");
		GameEndClass.gameEndIn();
	}
	public static void policeMethod(){
		//선주
	}
	public static void churchMethod(){
		//하은
	}
}
