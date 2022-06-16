package mainPackages;

import basePackages.BaseFunc;
import basePackages.GameEndClass;
import basePackages.ImgClass;

//오른쪽 엔딩 관련 클래스를 모아 두는 곳 입니다.
//들어 가야 할것들
//- 선택하는 메소드(이 클래스의 중심인 클래스)-담당 : ?? (메소드 이름 : rightMethod)
//- 주택가, 주택-주인공집(좀 먼)-담당 : 박선주 (메소드 이름 : houseMethod)
//- 아파트 4층 -담당 : 조예서 (메소드 이름 : floor4Method)
//- 아파트 친구(연우)집(11)(진엔딩)-담당 : 박선주 (메소드 이름 : floorFriendMethod)
//- 아파트 옥상-담당 : 권하은 (메소드 이름 : rooftopMethod)
public class RightEndingClass {
	public static void rooftopMethod() { //권하은
		BaseFunc.countCh2("▷ 옥상... 빨간마스크는 높은 곳을 싫어한다는 소리를 들은것같아....");
		BaseFunc.countStr("");
		BaseFunc.countCh2("(나는 재빨리 맨 위층으로 가서 옥상 문을 열었다.)");
		BaseFunc.countCh2("(다행히 옥상문은 열려있었고 나는 문 밖으로 나갔다.)");
		BaseFunc.countCh2("(그리고 빨간마스크의 위치를 확인 하기위해 아파트 입구를 확인했다....)");
		BaseFunc.countStr("");
		BaseFunc.countCh2("▷ 어.....?");
		BaseFunc.countStr("");
		BaseFunc.countCh2("(갑자기 몸이 앞으로 기울었다.)");
		BaseFunc.countCh2("(그리곤 바닥을 향해 곤두박질 쳤다...)");
		BaseFunc.countStr("");
		BaseFunc.countStr("▷ 몸이 마비된 것 같아...");
		BaseFunc.countStr("");
		BaseFunc.countCh2("(눈 앞이 흐려진다.)");
		BaseFunc.countCh2("(내가 오늘 야자를 끝내고 걷던 골목이 보이는 듯 하다.)");
		BaseFunc.countStr("");
		BaseFunc.countCh2("▷ 이건... 주마등인가...");
		BaseFunc.countStr("");
		BaseFunc.countCh2("(옥상에 보이는 붉은 실루엣....)");
		BaseFunc.countCh2("(빨간마스크의 목소리가 희미하게 들린다...)");
		BaseFunc.margin20();
		ImgClass.RadMaskImg1();
		BaseFunc.margin10();
		BaseFunc.countCh2("\"나... 예뻐...?\"");
		GameEndClass.gameEndIn();
	}

}
