package mainPackages;

import basePackages.*;

//기타 엔딩들을  모아 둔 클래스입니다.
//들어 가야 할것들
//- 히든엔딩! (빨간마스크와 나는 찐친)-담당 : 조예서(메소드 이름 : friendEndingMethod) 
public class EndingClass {
	public static void friendEndingMethod(){
		BaseFunc.margin10();
		BaseFunc.countCh2("빨간 마스크가 나랑 맞팔을 맺자고 하기에 서로 팔로우까지 주고 받았다.");
		BaseFunc.countCh2("요즘도 연락 자주하고 잘지내고 있다.");
		BaseFunc.countCh2("그래 귀신이든 인간이든 이런 관계를 친구라고 볼수 있다면 우리는 찐친일 것이다.");
		GameEndClass.gameEndIn();
	}
}
