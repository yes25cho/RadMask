package mainPackages;
<<<<<<< HEAD
=======

import javax.swing.plaf.basic.BasicBorders.MarginBorder;

import basePackages.BaseFunc;
import basePackages.GameOverClass;
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
		ImgClass.RadMaskImg1();
		BaseFunc.countCh2("\"나... 예뻐...?\"");
		BaseFunc.margin5();
		GameOverClass.gameOverIn();
	}
>>>>>>> branch 'kwonha' of https://github.com/yes25cho/RadMask.git

import java.util.Scanner;

import basePackages.*;

//�삤瑜몄そ �뿏�뵫 愿��젴 �겢�옒�뒪瑜� 紐⑥븘 �몢�뒗 怨� �엯�땲�떎.
//�뱾�뼱 媛��빞 �븷寃껊뱾
//- �꽑�깮�븯�뒗 硫붿냼�뱶(�씠 �겢�옒�뒪�쓽 以묒떖�씤 �겢�옒�뒪)-�떞�떦 : ?? (硫붿냼�뱶 �씠由� : rightMethod)
//- 二쇳깮媛�, 二쇳깮-二쇱씤怨듭쭛(醫� 癒�)-�떞�떦 : 諛뺤꽑二� (硫붿냼�뱶 �씠由� : houseMethod)
//- �븘�뙆�듃 4痢� -�떞�떦 : 議곗삁�꽌 (硫붿냼�뱶 �씠由� : floor4Method)
//- �븘�뙆�듃 移쒓뎄(�뿰�슦)吏�(11)(吏꾩뿏�뵫)-�떞�떦 : 諛뺤꽑二� (硫붿냼�뱶 �씠由� : floorFriendMethod)
//- �븘�뙆�듃 �삦�긽-�떞�떦 : 沅뚰븯��� (硫붿냼�뱶 �씠由� : rooftopMethod)
public class RightEndingClass {
	static Scanner scStr = new Scanner(System.in);
	
	public static void rightMethod() {
		BaseFunc.countStr("(�뼵�젣源뚯�� �떖由� �닔�뒗 �뾾�쑝�땲 �뼱�뵒�뱺 �뱾�뼱 媛��빞寃좊떎..)");
		BaseFunc.countStr("        �뼳 �븘�뙆�듃(移쒓뎄 吏묒씠 �엳�떎.)            �뼳 二쇳깮(吏묒씠 �엳�떎.)");
		BaseFunc.countStr("");
		PrintMes.printChoose();
		String choose = "";
		choose = scStr.nextLine();
		BaseFunc.margin5();
		if (choose.equals("�븘�뙆�듃")) {
			floor();
		} else if (choose.equals("二쇳깮")) {
			houseMethod();
		} else {
			PrintMes.printReCho();
			BaseFunc.margin5();
			rightMethod();// �떎�떆 �엯�젰 諛쏅룄濡� �젣洹� �샇異�
		}
	}
	public static void floor() {
		BaseFunc.countStr("�뼴 �솕湲� �빐�뒗�뜲 紐뉗링�쑝濡� 媛�吏�?");
		BaseFunc.countStr("        �뼳 1                  �뼳 9");
		BaseFunc.countStr("        �뼳 2                  �뼳 10");
		BaseFunc.countStr("        �뼳 3                  �뼳 11(移쒓뎄吏�)");
		BaseFunc.countStr("        �뼳 4                  �뼳 12");
		BaseFunc.countStr("        �뼳 5                  �뼳 13");
		BaseFunc.countStr("        �뼳 6                  �뼳 14");
		BaseFunc.countStr("        �뼳 7                  �뼳 15");
		BaseFunc.countStr("        �뼳 8                  �뼳 �삦�긽");
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
		case "�삦�긽":
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
	public static void floor4Method() {//議곗삁�꽌 �옉�꽦 
		BaseFunc.margin5();
		BaseFunc.count();
		BaseFunc.count();
		BaseFunc.countCh2("��� �궛嫄닿��?... �궡�븯�떎��� ");
		BaseFunc.count();
		BaseFunc.count();
		BaseFunc.margin5();
		BaseFunc.countCh2("洹몃븣 �씠�썑濡� �굹�뒗 鍮④컙 留덉뒪�겕瑜� 蹂몄쟻��� �뾾�떎..");
		BaseFunc.count();
		BaseFunc.countCh2("�븘�땲 洹몃궇 �옒紐� 蹂� 寃껋씪 吏��룄 紐⑤Ⅴ寃좊떎..");
		BaseFunc.count();
		BaseFunc.countCh2("洹몃옒�꽌 �굹�뒗 洹몃궇 �씪�쓣 洹� �늻援ъ뿉寃뚮룄 留먰븯吏� �븡�븯�떎.");
		BaseFunc.count();
		BaseFunc.countCh2("�씠�윴 �꽣臾대땲 �뾾�뒗 �씪��� 洹� �늻援щ룄 誘우�� �븡�쓣 嫄곌린�뿉..."); 
		BaseFunc.count();
		BaseFunc.countCh2("�굹 �삉�븳 洹몃윴 �꽣臾대땲 �뾾�뒗 �씠�빞湲곕�� 誘우���븡�뒗 �뼱瑜몄씠 �릺�뿀�떎.");
		BaseFunc.margin10();
		GameEndClass.gameEndIn();
	}
//				The End
//				�떦�떊�쓽 �슜湲곗뿉 諛뺤닔瑜쇄�� �궡�젮�뒗 �뱶由닿쾶(�뿀臾� �뿏�뵫) (占ｂ늾占ｏ푾絶�"
	
	
	public static void houseMethod() {
		int countH=PrologueClass.Plc.count;
		BaseFunc.margin20();
		///////////////////////////////�뵜�젅�씠
		BaseFunc.count();
		BaseFunc.count();
		///////////////////////////////�뵜�젅�씠
		BaseFunc.countStr("(�뮘�뿉 �씤湲곗쿃�씠 �뒓猿댁쭊�떎.)");
		///////////////////////////////�뵜�젅�씠
		BaseFunc.count();
		BaseFunc.count();
		///////////////////////////////�뵜�젅�씠
		BaseFunc.countCh1("�굹 �삁六�...?");
		BaseFunc.countCh("(�뮘�뿉�꽌 鍮④컙留덉뒪�겕媛� 誘몄튇�벏�씠 已볦븘�삩�떎.)");
		BaseFunc.countCh("(鍮⑤━ 鍮꾨��踰덊샇瑜� ����뼱�빞�븯�뒗�뜲... 癒몃━媛� �깉�븯�뼏�떎.)");
		BaseFunc.countCh("(踰덊샇媛� 湲곗뼲�씠 �븞�궃�떎... )");
		BaseFunc.countCh("(�겙�씪�씠�떎... 鍮⑤━ 癒몃━瑜� 援대젮蹂댁옄.)");
		////////////////////////////////////// 5踰� �씠�긽 二쎌뿀�쓣 �떆 => �엺�듃 異쒕젰
		if(countH >= 5) {
			BaseFunc.countStr("\n\ndufdufdltkadh\n\n");
		}
		System.out.print("鍮꾨��踰덊샇瑜� �엯�젰�븯�꽭�슂 : ");
//      long then = System.currentTimeMillis(); //�떆媛� 珥덉꽭湲�
		String password = scStr.nextLine();
//     	long now = System.currentTimeMillis(); //�떆媛� 珥덉꽭湲�
//		long time = (now-then)/1000;
//      System.out.println(time+"珥�"); //珥� 異쒕젰
//		if(time>10){ // 10珥� �꽆�뼱媛붿쓣 �븣
//      	++countH;
//			if(GameOverClass.gameOverIn()==1) 
//				houseMethod();
//        }
		if(password.equals("1010235")) { //password媛� 留욎븯�쓣 �븣
			///////////////////////////////�뵜�젅�씠
			BaseFunc.count();
			BaseFunc.count();
			///////////////////////////////�뵜�젅�씠
			BaseFunc.margin20();
			BaseFunc.countCh2("�쁽愿�臾몄쓣 �옱鍮⑤━ �뿴怨� �뱾�뼱�삩 �굹�뒗 �돺�궗由� 吏묒븞�쑝濡� �뱾�뼱媛�吏� 紐삵븯怨�");
			BaseFunc.countCh2("�쁽愿��뿉 �븳李몄쓣 �꽌 �엳�뿀�떎.");
			BaseFunc.countCh2("�떎�떆�뒗... �씠�윴 寃쏀뿕�쓣 �븯怨� �떆吏� �븡�떎...");
			BaseFunc.count();
			BaseFunc.count();
			BaseFunc.margin20();
			//###湲곕낯�뿏�뵫 異쒕젰
			BaseFunc.margin5();
			BaseFunc.countCh2("洹몃븣 �씠�썑濡� �굹�뒗 鍮④컙 留덉뒪�겕瑜� 蹂몄쟻��� �뾾�떎..");
			BaseFunc.count();
			BaseFunc.countCh2("�븘�땲 洹몃궇 �옒紐� 蹂� 寃껋씪 吏��룄 紐⑤Ⅴ寃좊떎..");
			BaseFunc.count();
			BaseFunc.countCh2("洹몃옒�꽌 �굹�뒗 洹몃궇 �씪�쓣 洹� �늻援ъ뿉寃뚮룄 留먰븯吏� �븡�븯�떎.");
			BaseFunc.count();
			BaseFunc.countCh2("�씠�윴 �꽣臾대땲 �뾾�뒗 �씪��� 洹� �늻援щ룄 誘우�� �븡�쓣 嫄곌린�뿉..."); 
			BaseFunc.count();
			BaseFunc.countCh2("�굹 �삉�븳 洹몃윴 �꽣臾대땲 �뾾�뒗 �씠�빞湲곕�� 誘우���븡�뒗 �뼱瑜몄씠 �릺�뿀�떎.");
			BaseFunc.margin10();
			GameEndClass.gameEndIn();
		}
		else {
			++countH;
			if(GameOverClass.gameOverIn()==1) 
				houseMethod();
		}
	}
	
	
	public static void floorFriendMethod() {
		String name=PrologueClass.Plc.playerName;
		String plcGender=PrologueClass.Plc.gender;	//�꽦蹂� ����옣
		BaseFunc.margin20();
		BaseFunc.countStr("(移쒓뎄吏� �븵�뿉 �룄李⑺뻽�떎.)");
		///////////////////////////////�뵜�젅�씠
		BaseFunc.count();
		BaseFunc.count();
		///////////////////////////////�뵜�젅�씠
		BaseFunc.countChNoLn("(�씡-");
		BaseFunc.countCh1("�삦)");
		///////////////////////////////�뵜�젅�씠
		BaseFunc.count();
		BaseFunc.count();
		///////////////////////////////�뵜�젅�씠
		BaseFunc.countStr("(踰⑥쓣 �늻瑜닿퀬 移쒓뎄瑜� 遺덈���떎.)");
		///////////////////////////////�뵜�젅�씠
		BaseFunc.count();
		BaseFunc.count();
		BaseFunc.countStr("");
		///////////////////////////////�뵜�젅�씠
		BaseFunc.countCh2("�뼴 �뿰�슦�빞...");
		BaseFunc.countStrNoLn("�뿰�슦 : ");
		BaseFunc.countCh2("�늻援ъ꽭�슂??");
		///////////////////////////////�뵜�젅�씠
		BaseFunc.count();
		BaseFunc.count();
		BaseFunc.countStr("");
		///////////////////////////////�뵜�젅�씠
		BaseFunc.countStr("(吏묒븞�뿉�꽌 �씤湲곗쿃�씠 �뱾由ш퀬 移쒓뎄�쓽 ����떟�냼由ш�� �뱾�젮�삩�떎.)");
		///////////////////////////////�뵜�젅�씠
		BaseFunc.count();
		BaseFunc.count();
		BaseFunc.countStr("");
		///////////////////////////////�뵜�젅�씠
		BaseFunc.countCh2("�뼴 �떎�뻾�씠�떎...");
		///////////////////////////////�뵜�젅�씠
		BaseFunc.margin20();
		BaseFunc.count();
		BaseFunc.count();
		BaseFunc.count();
		BaseFunc.count();
		BaseFunc.countStr("");
		///////////////////////////////�뵜�젅�씠
		ImgClass.RadMaskImg3();
		for(int i =0; i<150;i++) {
			BaseFunc.countStrNoLn("�굹 �삁六�...?");
			if(i%12==0) {
				BaseFunc.countStr("");
			}
		}
		BaseFunc.margin20();
		
		///////////////////////////////�뵜�젅�씠
		BaseFunc.countCh2("     �떎醫� 泥��냼�뀈 �젙蹂�         ");
		///////////////////////////////�뵜�젅�씠
		BaseFunc.count();
		BaseFunc.count();
		BaseFunc.countStr("");
		///////////////////////////////�뵜�젅�씠
		//###占쏙옙占싸곤옙 占싱몌옙
		BaseFunc.countCh2("       �씠由� : "+name+"       ");
		///////////////////////////////�뵜�젅�씠
		BaseFunc.count();
		BaseFunc.count();
		///////////////////////////////�뵜�젅�씠
		//###占쏙옙占싸곤옙 占쏙옙占쏙옙
		BaseFunc.countCh2("       �굹�씠 : 18       ");
		BaseFunc.countCh2("       �꽦蹂� : "+(plcGender.equals("�뿬")?"�뿬":plcGender.equals("�궓")?"�궓":" "));
		////////////////////////////////
		///////////////////////////////�뵜�젅�씠
		BaseFunc.count();
		BaseFunc.count();
		///////////////////////////////�뵜�젅�씠
		BaseFunc.margin20();
		BaseFunc.countStrNoLn("�쑀吏� : ");
		BaseFunc.countCh2("�샊�떆 "+name+" �씠�빞湲� �뱾�뿀�뼱?");
		BaseFunc.countCh2("洹몄��猿� 媛묒옄湲� �떎醫낅릱�뒗�뜲, 洹몃궇 �빞�옄 �걹�굹怨� �븘臾대룄 紐삳뇬�떎�뒗�뜲...?");
		///////////////////////////////�뵜�젅�씠
		BaseFunc.count();
		BaseFunc.count();
		///////////////////////////////�뵜�젅�씠
		BaseFunc.countStrNoLn("\n�뿰�슦 : ");
		BaseFunc.countCh2("�븘..洹쇰뜲 �궡媛� 洹몃궇 諛뽰뿉�꽌"+name+"紐⑹냼由ш�� �뱾�젮�꽌 �굹媛�遊ㅼ뿀嫄곕뱺..?");
		BaseFunc.countCh2("    洹쇰뜲 �븘臾대룄 �뾾�뿀�뼱...");
		BaseFunc.countCh2("    臾댁뒯�씪�씠 �엳�뾿�뜕嫄멸퉴...?");
		///////////////////////////////�뵜�젅�씠
		BaseFunc.count();
		BaseFunc.count();
		BaseFunc.countStr("    ...");
		///////////////////////////////�뵜�젅�씠
		BaseFunc.countCh2("    �옒紐삳뱾��� 嫄멸퉴...?");
		///////////////////////////////�뵜�젅�씠
		BaseFunc.count();
		BaseFunc.count();
		BaseFunc.count();
		BaseFunc.count();
		///////////////////////////////�뵜�젅�씠
		BaseFunc.margin20();
		BaseFunc.countCh1("�뼴  (�쓳..�쓳..)"); //二쇱씤怨�		
		BaseFunc.margin20();
		GameEndClass.gameEndIn();
	}
	
}
