package mainPackages;

import java.util.Scanner;

import basePackages.BaseFunc;
import basePackages.GameOverClass;
//왼쪽 엔딩 관련 클래스를 모아 두는 곳 입니다.
//들어 가야 할것들
//- 선택하는 메소드(이 클래스의 중심인 클래스)-담당 : ?? (메소드 이름 : leftMethod)
//- 세탁소(허무엔딩)-담당 : 조예서 (메소드 이름 : cleanerMethod)
//- 파출소(해피엔딩/배드엔딩)-담당 : 박선주 (메소드 이름 : policeMethod)
//- 교회(해피엔딩/배드엔딩)-담당 : 권하은 (메소드 이름 : churchMethod)
import basePackages.ImgClass;
import basePackages.PrintMes;



public class LeftEndingClass {
	public static void churchMethod() {
				
		Scanner sc = new Scanner(System.in);
		String dab;
		
		BaseFunc.countCh2("(달리던 중 앞에 교회가 보인다.)");
		BaseFunc.countStr("");
		BaseFunc.countCh2("▷ 교회다... 살았어!! 문도 열려있으니까 아직 사람이 있을거야!...");
		BaseFunc.countCh2("▷ 하나님 감사합니다! 이제 교회 열심히 다닐게요!!!");
		BaseFunc.countStr("");
		BaseFunc.countCh2("(교회 문을 열고 들어간다...)");
		BaseFunc.countStr("");
		BaseFunc.countCh2(".");
		BaseFunc.countStr("");
		BaseFunc.countCh2(".");
		BaseFunc.countStr("");
		BaseFunc.countCh2(".");
		BaseFunc.countStr("");
		BaseFunc.countCh2("▷ 어....?");
		BaseFunc.countCh2("▷ 아무도 없어?...");
		BaseFunc.countStr("");
		BaseFunc.countCh2("(그 때 뒤에서 들리는 목소리,)");
		ImgClass.RadMaskImg3();
		BaseFunc.countCh2("\"나... 예..뻐...?\"");
		BaseFunc.countStr("");
		BaseFunc.countCh2("(그녀가 마스크를 벗자, 귀까지 찢어진 입이 보였다.)");
		BaseFunc.countStr("");
		BaseFunc.countCh2("▷  뭐라고 대답해야 하지..? ");
		BaseFunc.countStr("");

		
		while(true) {
			
			System.out.println("          ▶ 네                               ▶ 아뇨");
			PrintMes.printChoose();
			dab = sc.nextLine();
			
			BaseFunc.countStr("");	
			
			if(dab.equals("네")) {
				BaseFunc.countCh2("(그러자 빨간 마스크가 말했다.)");
				BaseFunc.countStr("");
				BaseFunc.countCh2("빨간 마스크 : 그럼...너도 똑같이 만들어줄게....");
				BaseFunc.countCh2("▷  네?!.. 잠깐만요!! ");
				BaseFunc.countStr("");
				BaseFunc.countCh2("(그녀가 내 입을 잡았다.)");
				BaseFunc.countStr("");
				BaseFunc.countCh2("빨간 마스크 : 너도.. 예뻐지는거야...");
				BaseFunc.margin5();
				BaseFunc.countCh2("\"투두둑....\"");
				BaseFunc.margin5();
				GameOverClass.gameOverIn();
			//	break;
			}else if(dab.contentEquals("아뇨")) {
				BaseFunc.countCh2("빨간 마스크 : 그래?...");
				BaseFunc.countStr("");
				BaseFunc.countCh2("(그녀가 내 입을 잡았다.)");
				BaseFunc.countStr("");
				BaseFunc.countCh2("▷  ?!.. ㅈ잠깐만..!! ");
				BaseFunc.countStr("");
				BaseFunc.countCh2("(그리곤 내 입을 관자놀이까지 찢었버렸다.)");
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
}
