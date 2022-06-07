package mainPackages;

import basePackages.*;

//프롤로그 관련 클래스를 모아 두는 곳 입니다.
//들어 가야 할것들
////- 선택하는 메소드(이 클래스의 중심인 클래스)-담당 : 조예서 (메소드 이름 : )
//- 프롤로그 내용-담당 : 조예서 (메소드 이름 : prologueMethod)
//- 선택 하는 내용-담당 : 조예서	(메소드 이름 : prologueChoMethod)
public class PrologueClass {
	public static void prologueMethod(){
		BaseFunc.margin10();
		BaseFunc.countStr("");
		BaseFunc.countCh2("OO구에서 20대 대학생이 갑작스럽게  실종되는 사건이 발생 되었습니다.");
		BaseFunc.countCh2("피해자는 대학교에서 집으로 귀가하다 실종된 것으로 알려져…");
		BaseFunc.countCh2("탓...");
		BaseFunc.countStr("");
		BaseFunc.countCh2("\"다녀올게\"");
		BaseFunc.countStr("");
		BaseFunc.countStr("세상에는 이해할수 없는 일들이 일어난다.");
		BaseFunc.countStr("하지만 나랑은 멀게 느껴지는 이야기들이다.");
		BaseFunc.countStr("");
		BaseFunc.countCh2("\"어제 실종 사건봤어? 그거 빨간마스크의 짓이래\"");
		BaseFunc.countCh2("\"에이 먼 소리야 ㅋㅋ\"");
		BaseFunc.countStr("");
		BaseFunc.countStr("이렇게 실없는 괴담들도 다 말도 안되는 이야기라고… ");
		BaseFunc.countStr("");
		BaseFunc.countCh2("\"다들 야자 잘하고들 집에 가고 이상!\"");
		BaseFunc.countStr("");
		BaseFunc.countStrNoLn("야자 처럼 지루한 내 일상은 오늘도 이렇게");
		BaseFunc.countCh1("…zzZZ");
		BaseFunc.countStr("");
		BaseFunc.countCh2("\"야 일어나 집에 안가?\"");
		BaseFunc.countCh2("\"어..응  금방 챙길게 가자\"");
		BaseFunc.countStr("(계단 내려 가던 중)");
		BaseFunc.countCh2("\"어..? 야 비온다.\"");
		BaseFunc.countStr("일기예보에는 이런 말이…");
		BaseFunc.countStr("아 뉴스 보다 껐구나..");
		BaseFunc.countCh2("\"야 나 교실에 우산 두고와서 너희 먼저가!\"");
		BaseFunc.countStr("가끔 머피의 법칙같은 일이 일어나는 것 을 제외하고는 진짜로 평범한 인생이다.");
		prologueChoMethod();
	}
	public static void prologueChoMethod(){
		BaseFunc.countStr("");
		BaseFunc.countStr("(우산찾고 내려왔다)"); 
		BaseFunc.countCh2("촥..! 톡톡톡도..톡톡도..톡톡톡도..톡톡도..톡톡톡도..");
		BaseFunc.countStr("");
		BaseFunc.countStr("어둡고 사람도 없고 비오니까 원래 알던길도 더 무섭게 느껴진다…");
		BaseFunc.countStr("");
		BaseFunc.countCh1("또각..또각..");
		BaseFunc.countStr("");
		BaseFunc.countCh2("엇..?");
		BaseFunc.countStr("뒤에 인기척이 느껴진다.");
		int cho = GameOverClass.gameOverIn();
		if(cho==1) {
			prologueChoMethod();
		}
	}
}
