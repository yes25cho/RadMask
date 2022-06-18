package mainPackages;

import basePackages.BaseFunc;
import basePackages.GameOverClass;
import basePackages.ImgClass;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
//오른쪽 엔딩 관련 클래스를 모아 두는 곳 입니다.
//들어 가야 할것들
//- 선택하는 메소드(이 클래스의 중심인 클래스)-담당 : ?? (메소드 이름 : rightMethod)
//- 주택가, 주택-주인공집(좀 먼)-담당 : 박선주 (메소드 이름 : houseMethod)
//- 아파트 4층 -담당 : 조예서 (메소드 이름 : floor4Method)
//- 아파트 친구(연우)집(11)(진엔딩)-담당 : 박선주 (메소드 이름 : floorFriendMethod)
//- 아파트 옥상-담당 : 권하은 (메소드 이름 : rooftopMethod)

class Mythread implements Runnable{ //멀티스레드
	public void run() {
		try{
			Thread.sleep(10000);
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}

public class RightEndingClass {
	static int count = 1; //전역변수
	public static void houseMethod() {
		Scanner sc = new Scanner(System.in);
//		BaseFunc.margin20();
//		////////////////////////////////딜레이
//		BaseFunc.count();
//		BaseFunc.count();
//		///////////////////////////////딜레이
//		BaseFunc.countStr("뒤에 인기척이 느껴진다.");
//		////////////////////////////////딜레이
//		BaseFunc.count();
//		BaseFunc.count();
//		///////////////////////////////딜레이
//		BaseFunc.countStr("나 예뻐...? 나 예뻐...? 나 예뻐...? 나 예뻐...?나 예뻐...? 나 예뻐...?나 예뻐...? 나 예뻐...?나 예뻐...? 나 예뻐...?");
//		BaseFunc.countStr("나 예뻐...? 나 예뻐...? 나 예뻐...? 나 예뻐...?나 예뻐...? 나 예뻐...?나 예뻐...? 나 예뻐...?나 예뻐...? 나 예뻐...?");
//		BaseFunc.countStr("나 예뻐...? 나 예뻐...? 나 예뻐...? 나 예뻐...?나 예뻐...? 나 예뻐...?나 예뻐...? 나 예뻐...?나 예뻐...? 나 예뻐...?");
//		BaseFunc.countStr("나 예뻐...? 나 예뻐...? 나 예뻐...? 나 예뻐...?나 예뻐...? 나 예뻐...?나 예뻐...? 나 예뻐...?나 예뻐...? 나 예뻐...?");
//		BaseFunc.countStr("나 예뻐...? 나 예뻐...? 나 예뻐...? 나 예뻐...?나 예뻐...? 나 예뻐...?나 예뻐...? 나 예뻐...?나 예뻐...? 나 예뻐...?");
//		BaseFunc.countStr("나 예뻐...? 나 예뻐...? 나 예뻐...? 나 예뻐...?나 예뻐...? 나 예뻐...?나 예뻐...? 나 예뻐...?나 예뻐...? 나 예뻐...?");
//		BaseFunc.countStr("나 예뻐...? 나 예뻐...? 나 예뻐...? 나 예뻐...?나 예뻐...? 나 예뻐...?나 예뻐...? 나 예뻐...?나 예뻐...? 나 예뻐...?");
//		BaseFunc.countStr("나 예뻐...? 나 예뻐...? 나 예뻐...? 나 예뻐...?나 예뻐...? 나 예뻐...?나 예뻐...? 나 예뻐...?나 예뻐...? 나 예뻐...?");
//		BaseFunc.countStr("나 예뻐...? 나 예뻐...? 나 예뻐...? 나 예뻐...?나 예뻐...? 나 예뻐...?나 예뻐...? 나 예뻐...?나 예뻐...? 나 예뻐...?");
//		BaseFunc.countStr("나 예뻐...? 나 예뻐...? 나 예뻐...? 나 예뻐...?나 예뻐...? 나 예뻐...?나 예뻐...? 나 예뻐...?나 예뻐...? 나 예뻐...?");
//		BaseFunc.countStr("나 예뻐...? 나 예뻐...? 나 예뻐...? 나 예뻐...?나 예뻐...? 나 예뻐...?나 예뻐...? 나 예뻐...?나 예뻐...? 나 예뻐...?");
//		BaseFunc.countStr("나 예뻐...? 나 예뻐...? 나 예뻐...? 나 예뻐...?나 예뻐...? 나 예뻐...?나 예뻐...? 나 예뻐...?나 예뻐...? 나 예뻐...?");
//		BaseFunc.countStr("나 예뻐...? 나 예뻐...? 나 예뻐...? 나 예뻐...?나 예뻐...? 나 예뻐...?나 예뻐...? 나 예뻐...?나 예뻐...? 나 예뻐...?");
//		BaseFunc.countStr("나 예뻐...? 나 예뻐...? 나 예뻐...? 나 예뻐...?나 예뻐...? 나 예뻐...?나 예뻐...? 나 예뻐...?나 예뻐...? 나 예뻐...?");
//		BaseFunc.countStr("나 예뻐...? 나 예뻐...? 나 예뻐...? 나 예뻐...?나 예뻐...? 나 예뻐...?나 예뻐...? 나 예뻐...?나 예뻐...? 나 예뻐...?");
//		BaseFunc.countCh("(뒤에서 빨간마스크가 미친듯이 쫓아온다.)");
//		BaseFunc.countCh("(빨리 비밀번호를 풀어야하는데... 머리가 새하얗다.)");
//		BaseFunc.countCh("(번호가 기억이 안난다... )");
		BaseFunc.countCh("(큰일이다.. 빨리 머리를 굴려보자.)");
		////////////////////////////////////// 5번 이상 죽었을 시 => 힌트 출력
		if(count >= 5) {
			BaseFunc.countStr("\n\ndufdufdltkadh\n\n");
		}
		System.out.print("비밀번호를 입력하세요: ");
        long then = System.currentTimeMillis(); //시간 초세기
		String password = sc.nextLine();
        long now = System.currentTimeMillis(); //시간 초세기
        long time = (now-then)/1000;
        System.out.println(time+"초"); //초 출력
        if(time>10){ // 10초 넘어갔을 때
        	++count;
        	int cho = GameOverClass.gameOverIn();
			if(cho==1) 
				houseMethod();
        }
		if(password.equals("1010235")) { //password가 맞았을 때
			///////////////////////////////딜레이
			BaseFunc.count();
			BaseFunc.count();
			///////////////////////////////딜레이
			BaseFunc.margin20();
			BaseFunc.countStr("현관문을 재빨리 열고 들어온 나는 쉽사리 집안으로 들어가지 못하고");
			BaseFunc.countStr("현관에 한참을 서 있었다.");
			BaseFunc.countStr("다시는... 이런 경험을 하고 시지 않다...");
			BaseFunc.count();
			BaseFunc.count();
			BaseFunc.margin20();
			//###기본엔딩 출력
		}
		else {
			++count;
			int cho = GameOverClass.gameOverIn();
			if(cho==1) 
				houseMethod();
		}
	}
	public static void floorFriendMethod() {
		BaseFunc.margin20();
		BaseFunc.countStr("(친구집 앞에 도착했다.)");
		////////////////////////////////딜레이
		BaseFunc.count();
		BaseFunc.count();
		///////////////////////////////딜레이
		BaseFunc.countChNoLn("(띵-");
		BaseFunc.countCh1("똥)");
		////////////////////////////////딜레이
		BaseFunc.count();
		BaseFunc.count();
		///////////////////////////////딜레이
		BaseFunc.countStr("(벨을 누르고 친구를 불렀다.)");
		////////////////////////////////딜레이
		BaseFunc.count();
		BaseFunc.count();
		///////////////////////////////딜레이
		BaseFunc.countCh2("▷ 연우야...");
		BaseFunc.countStrNoLn("연우: ");
		BaseFunc.countCh2("\"누구세요??\"");
		////////////////////////////////딜레이
		BaseFunc.count();
		BaseFunc.count();
		///////////////////////////////딜레이
		BaseFunc.countStr("(집안에서 인기척이 들리고 친구의 대답소리가 들려온다.)");
		////////////////////////////////딜레이
		BaseFunc.count();
		BaseFunc.count();
		///////////////////////////////딜레이
		BaseFunc.countCh2("▷ 다행이다...");
		////////////////////////////////딜레이
		BaseFunc.margin20();
		BaseFunc.count();
		BaseFunc.count();
		BaseFunc.count();
		BaseFunc.count();
		///////////////////////////////딜레이
		ImgClass.RadMaskImg3();
		BaseFunc.countStr("나 예뻐...? 나 예뻐...? 나 예뻐...? 나 예뻐...?나 예뻐...? 나 예뻐...?나 예뻐...? 나 예뻐...?나 예뻐...? 나 예뻐...?");
		BaseFunc.countStr("나 예뻐...? 나 예뻐...? 나 예뻐...? 나 예뻐...?나 예뻐...? 나 예뻐...?나 예뻐...? 나 예뻐...?나 예뻐...? 나 예뻐...?");
		BaseFunc.countStr("나 예뻐...? 나 예뻐...? 나 예뻐...? 나 예뻐...?나 예뻐...? 나 예뻐...?나 예뻐...? 나 예뻐...?나 예뻐...? 나 예뻐...?");
		BaseFunc.countStr("나 예뻐...? 나 예뻐...? 나 예뻐...? 나 예뻐...?나 예뻐...? 나 예뻐...?나 예뻐...? 나 예뻐...?나 예뻐...? 나 예뻐...?");
		BaseFunc.countStr("나 예뻐...? 나 예뻐...? 나 예뻐...? 나 예뻐...?나 예뻐...? 나 예뻐...?나 예뻐...? 나 예뻐...?나 예뻐...? 나 예뻐...?");
		BaseFunc.countStr("나 예뻐...? 나 예뻐...? 나 예뻐...? 나 예뻐...?나 예뻐...? 나 예뻐...?나 예뻐...? 나 예뻐...?나 예뻐...? 나 예뻐...?");
		BaseFunc.countStr("나 예뻐...? 나 예뻐...? 나 예뻐...? 나 예뻐...?나 예뻐...? 나 예뻐...?나 예뻐...? 나 예뻐...?나 예뻐...? 나 예뻐...?");
		BaseFunc.countStr("나 예뻐...? 나 예뻐...? 나 예뻐...? 나 예뻐...?나 예뻐...? 나 예뻐...?나 예뻐...? 나 예뻐...?나 예뻐...? 나 예뻐...?");
		BaseFunc.countStr("나 예뻐...? 나 예뻐...? 나 예뻐...? 나 예뻐...?나 예뻐...? 나 예뻐...?나 예뻐...? 나 예뻐...?나 예뻐...? 나 예뻐...?");
		BaseFunc.countStr("나 예뻐...? 나 예뻐...? 나 예뻐...? 나 예뻐...?나 예뻐...? 나 예뻐...?나 예뻐...? 나 예뻐...?나 예뻐...? 나 예뻐...?");
		BaseFunc.countStr("나 예뻐...? 나 예뻐...? 나 예뻐...? 나 예뻐...?나 예뻐...? 나 예뻐...?나 예뻐...? 나 예뻐...?나 예뻐...? 나 예뻐...?");
		BaseFunc.countStr("나 예뻐...? 나 예뻐...? 나 예뻐...? 나 예뻐...?나 예뻐...? 나 예뻐...?나 예뻐...? 나 예뻐...?나 예뻐...? 나 예뻐...?");
		BaseFunc.countStr("나 예뻐...? 나 예뻐...? 나 예뻐...? 나 예뻐...?나 예뻐...? 나 예뻐...?나 예뻐...? 나 예뻐...?나 예뻐...? 나 예뻐...?");
		BaseFunc.countStr("나 예뻐...? 나 예뻐...? 나 예뻐...? 나 예뻐...?나 예뻐...? 나 예뻐...?나 예뻐...? 나 예뻐...?나 예뻐...? 나 예뻐...?");
		BaseFunc.countStr("나 예뻐...? 나 예뻐...? 나 예뻐...? 나 예뻐...?나 예뻐...? 나 예뻐...?나 예뻐...? 나 예뻐...?나 예뻐...? 나 예뻐...?");
		BaseFunc.margin20();
		
		//////////////////////////////엔딩
		BaseFunc.countCh2("     실종 청소년 정보         ");
		////////////////////////////////딜레이
		BaseFunc.count();
		BaseFunc.count();
		///////////////////////////////딜레이
		//###주인공 이름
		BaseFunc.countStr("       (주인공 이름)       ");
		////////////////////////////////딜레이
		BaseFunc.count();
		BaseFunc.count();
		///////////////////////////////딜레이
		//###주인공 나이
		BaseFunc.countStr("       나이 : 18       ");
		BaseFunc.countStr("       성별 :        ");
		////////////////////////////////
		////////////////////////////////딜레이
		BaseFunc.count();
		BaseFunc.count();
		///////////////////////////////딜레이
		BaseFunc.margin20();
		BaseFunc.countStrNoLn("유진 : ");
		BaseFunc.countCh2("혹시 (주인공이름) 이야기 들었어?");
		BaseFunc.countCh2("그저께 갑자기 실종됐는데, 그날 야자 끝나고 아무도 못봤다는데...?");
		///////////////////////////////딜레이
		BaseFunc.count();
		BaseFunc.count();
		///////////////////////////////딜레이
		BaseFunc.countStrNoLn("\n연우 : ");
		BaseFunc.countCh2("아..근데 내가 그날 밖에서 (주인공이름) 목소리가 들려서 나가봤었거든..?");
		BaseFunc.countCh2("근데 아무도 없었어...");
		BaseFunc.countCh2("무슨일이 있엇던걸까...?");
		///////////////////////////////딜레이
		BaseFunc.count();
		BaseFunc.count();
		///////////////////////////////딜레이
		BaseFunc.countCh2("잘못들은 걸까...?");
		///////////////////////////////딜레이
		BaseFunc.count();
		BaseFunc.count();
		BaseFunc.count();
		BaseFunc.count();
		///////////////////////////////딜레이
		BaseFunc.margin20();
		BaseFunc.countCh1("▷ (흑..흑..)"); //주인공
		BaseFunc.margin20();
		BaseFunc.countCh2("The End");
	}
	
}
