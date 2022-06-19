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
	public static void leftMethod(){
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
	public static void churchMethod() {
		String dab;
		
		BaseFunc.countCh2("(달리던 중 앞에 교회가 보인다.)");
		////////////////////////////////딜레이
		BaseFunc.count();
		BaseFunc.count();
		BaseFunc.countStr("");
		BaseFunc.countCh2("▷ 교회다... 살았어!! 문도 열려있으니까 아직 사람이 있을거야!...");
		BaseFunc.countCh2("▷ 하나님 감사합니다! 이제 교회 열심히 다닐게요!!!");
		////////////////////////////////딜레이
		BaseFunc.count();
		BaseFunc.count();
		BaseFunc.countStr("");
		BaseFunc.countCh2("(교회 문을 열고 들어간다...)");
		////////////////////////////////딜레이
		BaseFunc.count();
		BaseFunc.count();
		BaseFunc.countStr("");
		BaseFunc.countCh2(".");
		////////////////////////////////딜레이
		BaseFunc.count();
		BaseFunc.count();
		BaseFunc.countStr("");
		BaseFunc.countCh2(".");
		////////////////////////////////딜레이
		BaseFunc.count();
		BaseFunc.count();
		BaseFunc.countStr("");
		BaseFunc.countCh2(".");
		////////////////////////////////딜레이
		BaseFunc.count();
		BaseFunc.count();
		BaseFunc.countStr("");
		BaseFunc.countCh2("▷ 어....?");
		BaseFunc.countCh2("▷ 아무도 없어?...");
		////////////////////////////////딜레이
		BaseFunc.count();
		BaseFunc.count();
		BaseFunc.countStr("");
		BaseFunc.countCh2("(그 때 뒤에서 들리는 목소리,)");
		////////////////////////////////딜레이
		BaseFunc.count();
		BaseFunc.count();
		ImgClass.RadMaskImg3();
		BaseFunc.countCh2("\"나... 예..뻐...?\"");
		////////////////////////////////딜레이
		BaseFunc.count();
		BaseFunc.count();
		BaseFunc.countStr("");
		BaseFunc.countCh2("(그녀가 마스크를 벗자, 귀까지 찢어진 입이 보였다.)");
		////////////////////////////////딜레이
		BaseFunc.count();
		BaseFunc.count();
		BaseFunc.countStr("");
		BaseFunc.countCh2("▷  뭐라고 대답해야 하지..? ");
		////////////////////////////////딜레이
		BaseFunc.count();
		BaseFunc.count();
		BaseFunc.countStr("");
		while(true) {
			System.out.println("          ▶ 네                               ▶ 아뇨");
			PrintMes.printChoose();
			dab = scStr.nextLine();
			////////////////////////////////딜레이
			BaseFunc.count();
			BaseFunc.count();
			BaseFunc.countStr("");	
			if(dab.equals("네")) {
				BaseFunc.countCh2("(그러자 빨간 마스크가 말했다.)");
				////////////////////////////////딜레이
				BaseFunc.count();
				BaseFunc.count();
				BaseFunc.countStr("");
				BaseFunc.countStrNoLn("빨간 마스크 : ");
				BaseFunc.countCh2("그럼...너도 똑같이 만들어줄게....");
				BaseFunc.countCh2("▷  네?!.. 잠깐만요!! ");
				////////////////////////////////딜레이
				BaseFunc.count();
				BaseFunc.count();
				BaseFunc.countStr("");
				BaseFunc.countCh2("(그녀가 내 입을 잡았다.)");
				////////////////////////////////딜레이
				BaseFunc.count();
				BaseFunc.count();
				BaseFunc.countStr("");
				BaseFunc.countStr("빨간 마스크 : ");
				BaseFunc.countCh2("너도.. 예뻐지는거야...");
				////////////////////////////////딜레이
				BaseFunc.count();
				BaseFunc.count();
				BaseFunc.countStr("");
				BaseFunc.margin5();
				BaseFunc.countCh2("\"투두둑....\"");
				BaseFunc.margin5();
				GameOverClass.gameOverIn();
			//	break;
			}else if(dab.contentEquals("아뇨")) {
				BaseFunc.countCh2("빨간 마스크 : 그래?...");
				////////////////////////////////딜레이
				BaseFunc.count();
				BaseFunc.count();
				BaseFunc.countStr("");
				BaseFunc.countCh2("(그녀가 내 입을 잡았다.)");
				////////////////////////////////딜레이
				BaseFunc.count();
				BaseFunc.count();
				BaseFunc.countStr("");
				BaseFunc.countCh2("▷  ?!.. ㅈ잠깐만..!! ");
				////////////////////////////////딜레이
				BaseFunc.count();
				BaseFunc.count();
				BaseFunc.countStr("");
				BaseFunc.countCh2("(그리곤 내 입을 관자놀이까지 찢었버렸다.)");
				////////////////////////////////딜레이
				BaseFunc.count();
				BaseFunc.count();
				BaseFunc.countStr("");
				BaseFunc.countCh2("빨간 마스크 : 이제 너보단 낫지?...");
				BaseFunc.margin5();
				GameOverClass.gameOverIn();
			//	break;
			}else {
				BaseFunc.countCh2("다시 입력하세요");
				continue;
			}
		}
	}
	
	public static void cleanerMethod() {
		String plcGender=PrologueClass.Plc.gender;	//성별 저장
		BaseFunc.countStr("(세탁소로 무작정 뛰기 시작하였다.)");
		BaseFunc.countCh2("\"나... 예... 쁘... 냐...고....!\"");
		////////////////////////////////딜레이
		BaseFunc.count();
		BaseFunc.count();
		BaseFunc.countStr("");
		BaseFunc.countStr("(뒤에서 소리치는 빨간 마스크의 목소리가 들린다.)");
		BaseFunc.countStr("(희미하게 불이 켜져 있는 세탁소에 드디어 도착했다.)");
		////////////////////////////////딜레이
		BaseFunc.count();
		BaseFunc.count();
		BaseFunc.margin5();
		BaseFunc.countStr("----마감 내일 다시 찾아 와 주세요----");
		////////////////////////////////딜레이
		BaseFunc.count();
		BaseFunc.count();
		BaseFunc.margin5();
		BaseFunc.countCh2("(다행이도 세탁소의 문은 열어져있다.)"); 
		BaseFunc.countStr("(이 안으로 들어가야 겠다.)");
		BaseFunc.countStr("(세탁소 문을 열고 들어서자 세제냄새와 사장님의 포마드 냄새가 난다.)");
		BaseFunc.countStr("(나는 계산대 속으로 들어가 숨었다."); 
		////////////////////////////////딜레이
		BaseFunc.count();
		BaseFunc.count();
		BaseFunc.countStr("");
		BaseFunc.countCh2("▷ 사장님 문은 좀 잠그고 다니시라니까... 걱정하는 딸의 마음을 몰라요...");
		BaseFunc.countCh2("▷ 아무튼  사장님의 문을 안 잠구시는 습관이 나를 살렸다....");
		////////////////////////////////딜레이
		BaseFunc.count();
		BaseFunc.count();
		BaseFunc.countStr("");
		BaseFunc.countCh1("끼이익..");
		////////////////////////////////딜레이
		BaseFunc.count();
		BaseFunc.count();
		ImgClass.RadMaskImg3();
		////////////////////////////////딜레이
		BaseFunc.count();
		BaseFunc.count();
		BaseFunc.countCh2("▷ 아… 들어오면서 문을 안잠궜었나.. 난 이제 죽는구나…");
		////////////////////////////////딜레이
		BaseFunc.count();
		BaseFunc.count();
		BaseFunc.countStr("");
		BaseFunc.countStrNoLn("아빠(세탁소 사장님) : ");
		BaseFunc.countCh2("하.. 또 문을 안 잠그고 나갔구만 것 참..ㅎㅎ"); 
		////////////////////////////////딜레이
		BaseFunc.count();
		BaseFunc.count();
		BaseFunc.countStr("");
		BaseFunc.countCh2("(사장님아니 아빠의 목소리가 들리는 순간.. 빨간 마스크가 내 눈 앞에서  사라졌다.)");
		BaseFunc.countCh2("(아빠의 손에는 방금 화장실에서 머리를 정리 하고 왔는지 포마드가 들려 있었다.)");
		BaseFunc.countCh2("(그래 포마드 아빠의 포마드가 나를 살렸다...)");
		////////////////////////////////딜레이
		BaseFunc.count();
		BaseFunc.count();
		BaseFunc.countStr("");
		BaseFunc.countStrNoLn("아빠(세탁소 사장님) : ");
		BaseFunc.countCh2("엇..! "+(plcGender.equals("여")?"딸":plcGender.equals("남")?"아들":"너")
				+" 왜 거기있어? 옷은 왜이렇게 다 젖었고 비 맞고 왔어?");
		////////////////////////////////딜레이
		BaseFunc.count();
		BaseFunc.count();
		BaseFunc.countStr("");
		BaseFunc.countCh2("▷ 아니.. 또 문 안 잠구고 갔을 까봐.. 혹시 몰라서 왔지");
		BaseFunc.countStrNoLn("아빠(세탁소 사장님) : ");
		BaseFunc.countCh2("아빠 세탁소도 신경 써주고우리 "+
				(plcGender.equals("여")?"딸":plcGender.equals("남")?"아들":"")
				+"다컸네. 마감하다가 화장실이 급해서 참을 수가 있어야지...허허");
		BaseFunc.countCh2("               거의다 되었어 같이 집에 가자");
		////////////////////////////////딜레이
		BaseFunc.count();
		BaseFunc.count();
		BaseFunc.margin20();
		BaseFunc.countCh2("그때 이후로 나는 빨간 마스크를 본적은 없다..");
		BaseFunc.countCh2("아니 그날 잘못 본 것일 지도 모르겠다.."); 
		BaseFunc.countCh2("그래서 나는 그날 일을 그 누구에게도 말하지 않았다."); 
		BaseFunc.countCh2("이런 터무니 없는 일은 그 누구도 믿지 않을 거기에...");
		BaseFunc.countCh2("나 또한 그런 터무니 없는 이야기를 믿지않는 어른이 되었다.");
		GameEndClass.gameEndIn();
	}
	public static void policeMethod(){
		//선주
		BaseFunc.margin20();
		BaseFunc.countStr("(나는 시내입구에 가장 가까운 파출서로 다름박질했다.)");
		BaseFunc.count();
		BaseFunc.countStr("(숨이 가쁘도록 서 입구까지 뛰었다.)");
		BaseFunc.count();
		BaseFunc.count();
		BaseFunc.countStr("");
		BaseFunc.countCh2("▷ 허...헉..");
		////////////////////////////////딜레이
		BaseFunc.count();
		BaseFunc.count();
		BaseFunc.countStr("");
		///////////////////////////////딜레이
		BaseFunc.countStr("(문을 박차고 들어가자 야간근무를 하고 있던 경찰관 1명이 화들짝 놀란다.)");
		////////////////////////////////딜레이
		BaseFunc.count();
		BaseFunc.count();
		BaseFunc.count();
		BaseFunc.count();
		///////////////////////////////딜레이
		BaseFunc.countStr("");
		BaseFunc.countStrNoLn("경찰관: ");
		BaseFunc.countCh2("무슨일 이십니까?"); //경찰관
		////////////////////////////////딜레이
		BaseFunc.count();
		BaseFunc.count();
		BaseFunc.countStr("");
		///////////////////////////////딜레이
		BaseFunc.countStr("(공포에 온몸을 떨고있는 나를 보며 경찰관은 편히 자리에 앉으라고 하였다.)");
		////////////////////////////////딜레이
		BaseFunc.count();
		BaseFunc.count();
		///////////////////////////////딜레이
		BaseFunc.countStr("(나는 경찰이 내온 녹차에 눈길도 주지않았다.)");
		////////////////////////////////딜레이
		BaseFunc.count();
		BaseFunc.count();
		BaseFunc.countStr("");
		///////////////////////////////딜레이
		BaseFunc.countCh2("▷ 저...를 계속 쪼, 쫓아오는 빨간 마스크가 있어..있어..요");
		BaseFunc.countCh2("아. 아까부터 계속, 학교에서 부터.. 절 쫓아와요.. 도와주세요...");
		///////////////////////////////딜레이
		BaseFunc.count();
		BaseFunc.count();
		BaseFunc.countStr("");
		///////////////////////////////딜레이
		BaseFunc.countStr("(경찰은 내 이야기를 다 듣고는 심각해 보이는 눈치는 아니였다.)");
		///////////////////////////////딜레이
		BaseFunc.count();
		BaseFunc.count();
		BaseFunc.countStr("");
		///////////////////////////////딜레이
		BaseFunc.countStrNoLn("경찰관 : ");
		BaseFunc.countCh2("학생, 너무 공부를 열심히 한거 아니야?");
		BaseFunc.countCh2("         공부도 쉬엄쉬엄해야지 너무 그렇게 무리하면...");
		BaseFunc.countStr("");
		BaseFunc.countCh2("(...)");
		////////////////////////////////딜레이
		BaseFunc.count();
		BaseFunc.count();
		///////////////////////////////딜레이
		BaseFunc.margin10(); //20칸 띄우기
		BaseFunc.countCh2("(내가 잘못 본거라고??)");
		BaseFunc.countCh1NoLn("(아닌데...)");
		BaseFunc.margin10(); //20칸 띄우기
		BaseFunc.countCh("봤는데... 봤는데... 봤는데... 봤는데...봤는데... 봤는데... 봤는데... 봤는데...봤는데... 봤는데... ");
		for(int i =0; i<150;i++) {
			BaseFunc.countStrNoLn("봤는데...");
			if(i%12==0) {
				BaseFunc.countStr("");
			}
		}
		BaseFunc.countStr("");
		BaseFunc.countCh("(흐릿하게 이상한 형체가 보인...)");
		// ###빨간마스크 출력 오류
		ImgClass.RadMaskImg3();
		////////////////////////////////딜레이
		BaseFunc.count();
		BaseFunc.count();
		BaseFunc.count();
		BaseFunc.count();
		BaseFunc.count();
		////////////////////////////////딜레이
		BaseFunc.margin20();
		//////////////////////////////베드엔딩
		BaseFunc.countStrNoLn("(뉴스소리)");
		////////////////////////////////딜레이
		BaseFunc.count();
		BaseFunc.count();
		////////////////////////////////딜레이
		/////////////////////////////////뉴스
		// ###뉴스에서 나오는 플레이어 성별 어떻게 출력??
		BaseFunc.countCh2("oo구에서 갑작스럽게 실종된 10대 여학생/남학생과");
		BaseFunc.countCh2("그 시각 파출소에서 경비를 서고 있던 경찰관이 실종되는 사건이 발생되었다고 합니다.");
		BaseFunc.countCh2("지난번 20대 대학생 실종과 비슷한 형태를 띄고 있어 더욱 화제가 되고있습니다.");
		BaseFunc.countCh2("현재 조사하고 있는 경찰관은 실종된 시각, 파출소 내부 cctv가 갑자기 꺼진 것으로 인하여");
		BaseFunc.countCh2("수사의 난항을 겪고 있습니다.");
		/////////////////////////////////뉴스
		////////////////////////////////딜레이
		BaseFunc.count();
		BaseFunc.count();
		BaseFunc.count();
		BaseFunc.margin5();
		////////////////////////////////딜레이
		BaseFunc.countStrNoLn("한 학생의 엄마: ");
		BaseFunc.countCh2("아이구 말세야... 너 오늘은 일찍 들어와라.");
		BaseFunc.countStrNoLn("학생: ");
		BaseFunc.countCh2("응 다녀올게...");
		////////////////////////////////딜레이
		BaseFunc.margin20();
		BaseFunc.count();
		BaseFunc.count();
		BaseFunc.count();
		BaseFunc.count();
		BaseFunc.count();
		BaseFunc.margin20();
		////////////////////////////////딜레이
		BaseFunc.countStr("(탓...)");
		////////////////////////////////딜레이
		BaseFunc.count();
		BaseFunc.count();
		BaseFunc.count();
		BaseFunc.count();
		BaseFunc.count();
		BaseFunc.margin20();
		////////////////////////////////딜레이
		GameEndClass.gameEndIn();
	}
}
