package mainPackages;

import basePackages.BaseFunc;

//왼쪽 엔딩 관련 클래스를 모아 두는 곳 입니다.
//들어 가야 할것들
//- 선택하는 메소드(이 클래스의 중심인 클래스)-담당 : ?? (메소드 이름 : leftMethod)
//- 세탁소(허무엔딩)-담당 : 조예서 (메소드 이름 : cleanerMethod)
//- 파출소(해피엔딩/배드엔딩)-담당 : 박선주 (메소드 이름 : policeMethod)
//- 교회(해피엔딩/배드엔딩)-담당 : 권하은 (메소드 이름 : churchMethod)
public class LeftEndingClass {
	public static void policeMethod() {
		BaseFunc.margin20();
		BaseFunc.countStr("(나는 시내입구에 가장 가까운 파출서로 다름박질했다.)");
		BaseFunc.count();
		BaseFunc.countStr("(숨이 가쁘도록 서 입구까지 뛰었다.)");
		BaseFunc.countCh1("\"▷허...헉..\"");
		BaseFunc.countStr("(문을 박차고 들어가자 야간근무를 하고 있던 경찰관 1명이 화들짝 놀란다.)");
		BaseFunc.count();
		BaseFunc.count();
		BaseFunc.count();
		BaseFunc.count();
		BaseFunc.margin10();
		BaseFunc.countStrNoLn("경찰관 : ");
		BaseFunc.countCh2("무슨일 이십니까?"); //경찰관
		BaseFunc.countStr("(공포에 온몸을 떨고있는 나를 보며 경찰관은 편히 자리에 앉으라고 하였다.)");
		BaseFunc.countStr("(경찰이 내온 녹차에 눈길도 주지않았다.)");
		BaseFunc.countCh2("\"▷저...를 계속 쪼, 쫓아오는 빨간 마스크가 있어..있어..요\"");
		BaseFunc.countCh2("\"▷아. 아까부터 계속, 학교에서 부터.. 절 쫓아와요.. 도와주세요\"");
		BaseFunc.count();
		BaseFunc.count();
		BaseFunc.count();
		BaseFunc.countStr("(경찰은 내 이야기를 다 듣고는 심각해 보이는 눈치는 아니였다.)");
		BaseFunc.countStrNoLn("경찰관 : ");
		BaseFunc.countCh2("\"학생, 너무 공부를 열심히 한거 아니야?\"");
	}
}
