package mainPackages;
<<<<<<< HEAD
=======

import javax.swing.plaf.basic.BasicBorders.MarginBorder;

import basePackages.BaseFunc;
import basePackages.GameOverClass;
import basePackages.ImgClass;

//¿À¸¥ÂÊ ¿£µù °ü·Ã Å¬·¡½º¸¦ ¸ğ¾Æ µÎ´Â °÷ ÀÔ´Ï´Ù.
//µé¾î °¡¾ß ÇÒ°Íµé
//- ¼±ÅÃÇÏ´Â ¸Ş¼Òµå(ÀÌ Å¬·¡½ºÀÇ Áß½ÉÀÎ Å¬·¡½º)-´ã´ç : ?? (¸Ş¼Òµå ÀÌ¸§ : rightMethod)
//- ÁÖÅÃ°¡, ÁÖÅÃ-ÁÖÀÎ°øÁı(Á» ¸Õ)-´ã´ç : ¹Ú¼±ÁÖ (¸Ş¼Òµå ÀÌ¸§ : houseMethod)
//- ¾ÆÆÄÆ® 4Ãş -´ã´ç : Á¶¿¹¼­ (¸Ş¼Òµå ÀÌ¸§ : floor4Method)
//- ¾ÆÆÄÆ® Ä£±¸(¿¬¿ì)Áı(11)(Áø¿£µù)-´ã´ç : ¹Ú¼±ÁÖ (¸Ş¼Òµå ÀÌ¸§ : floorFriendMethod)
//- ¾ÆÆÄÆ® ¿Á»ó-´ã´ç : ±ÇÇÏÀº (¸Ş¼Òµå ÀÌ¸§ : rooftopMethod)
public class RightEndingClass {
	public static void rooftopMethod() { //±ÇÇÏÀº
		BaseFunc.countCh2("¢¹ ¿Á»ó... »¡°£¸¶½ºÅ©´Â ³ôÀº °÷À» ½È¾îÇÑ´Ù´Â ¼Ò¸®¸¦ µéÀº°Í°°¾Æ....");
		BaseFunc.countStr("");
		BaseFunc.countCh2("(³ª´Â Àç»¡¸® ¸Ç À§ÃşÀ¸·Î °¡¼­ ¿Á»ó ¹®À» ¿­¾ú´Ù.)");
		BaseFunc.countCh2("(´ÙÇàÈ÷ ¿Á»ó¹®Àº ¿­·ÁÀÖ¾ú°í ³ª´Â ¹® ¹ÛÀ¸·Î ³ª°¬´Ù.)");
		BaseFunc.countCh2("(±×¸®°í »¡°£¸¶½ºÅ©ÀÇ À§Ä¡¸¦ È®ÀÎ ÇÏ±âÀ§ÇØ ¾ÆÆÄÆ® ÀÔ±¸¸¦ È®ÀÎÇß´Ù....)");
		BaseFunc.countStr("");
		BaseFunc.countCh2("¢¹ ¾î.....?");
		BaseFunc.countStr("");
		BaseFunc.countCh2("(°©ÀÚ±â ¸öÀÌ ¾ÕÀ¸·Î ±â¿ï¾ú´Ù.)");
		BaseFunc.countCh2("(±×¸®°ï ¹Ù´ÚÀ» ÇâÇØ °ïµÎ¹ÚÁú ÃÆ´Ù...)");
		BaseFunc.countStr("");
		BaseFunc.countStr("¢¹ ¸öÀÌ ¸¶ºñµÈ °Í °°¾Æ...");
		BaseFunc.countStr("");
		BaseFunc.countCh2("(´« ¾ÕÀÌ Èå·ÁÁø´Ù.)");
		BaseFunc.countCh2("(³»°¡ ¿À´Ã ¾ßÀÚ¸¦ ³¡³»°í °È´ø °ñ¸ñÀÌ º¸ÀÌ´Â µí ÇÏ´Ù.)");
		BaseFunc.countStr("");
		BaseFunc.countCh2("¢¹ ÀÌ°Ç... ÁÖ¸¶µîÀÎ°¡...");
		BaseFunc.countStr("");
		BaseFunc.countCh2("(¿Á»ó¿¡ º¸ÀÌ´Â ºÓÀº ½Ç·ç¿§....)");
		BaseFunc.countCh2("(»¡°£¸¶½ºÅ©ÀÇ ¸ñ¼Ò¸®°¡ Èñ¹ÌÇÏ°Ô µé¸°´Ù...)");
		ImgClass.RadMaskImg1();
		BaseFunc.countCh2("\"³ª... ¿¹»µ...?\"");
		BaseFunc.margin5();
		GameOverClass.gameOverIn();
	}
>>>>>>> branch 'kwonha' of https://github.com/yes25cho/RadMask.git

import java.util.Scanner;

import basePackages.*;

//ì˜¤ë¥¸ìª½ ì—”ë”© ê´€ë ¨ í´ë˜ìŠ¤ë¥¼ ëª¨ì•„ ë‘ëŠ” ê³³ ì…ë‹ˆë‹¤.
//ë“¤ì–´ ê°€ì•¼ í• ê²ƒë“¤
//- ì„ íƒí•˜ëŠ” ë©”ì†Œë“œ(ì´ í´ë˜ìŠ¤ì˜ ì¤‘ì‹¬ì¸ í´ë˜ìŠ¤)-ë‹´ë‹¹ : ?? (ë©”ì†Œë“œ ì´ë¦„ : rightMethod)
//- ì£¼íƒê°€, ì£¼íƒ-ì£¼ì¸ê³µì§‘(ì¢€ ë¨¼)-ë‹´ë‹¹ : ë°•ì„ ì£¼ (ë©”ì†Œë“œ ì´ë¦„ : houseMethod)
//- ì•„íŒŒíŠ¸ 4ì¸µ -ë‹´ë‹¹ : ì¡°ì˜ˆì„œ (ë©”ì†Œë“œ ì´ë¦„ : floor4Method)
//- ì•„íŒŒíŠ¸ ì¹œêµ¬(ì—°ìš°)ì§‘(11)(ì§„ì—”ë”©)-ë‹´ë‹¹ : ë°•ì„ ì£¼ (ë©”ì†Œë“œ ì´ë¦„ : floorFriendMethod)
//- ì•„íŒŒíŠ¸ ì˜¥ìƒ-ë‹´ë‹¹ : ê¶Œí•˜ì€ (ë©”ì†Œë“œ ì´ë¦„ : rooftopMethod)
public class RightEndingClass {
	static Scanner scStr = new Scanner(System.in);
	
	public static void rightMethod() {
		BaseFunc.countStr("(ì–¸ì œê¹Œì§€ ë‹¬ë¦´ ìˆ˜ëŠ” ì—†ìœ¼ë‹ˆ ì–´ë””ë“  ë“¤ì–´ ê°€ì•¼ê² ë‹¤..)");
		BaseFunc.countStr("        â–¶ ì•„íŒŒíŠ¸(ì¹œêµ¬ ì§‘ì´ ìˆë‹¤.)            â–¶ ì£¼íƒ(ì§‘ì´ ìˆë‹¤.)");
		BaseFunc.countStr("");
		PrintMes.printChoose();
		String choose = "";
		choose = scStr.nextLine();
		BaseFunc.margin5();
		if (choose.equals("ì•„íŒŒíŠ¸")) {
			floor();
		} else if (choose.equals("ì£¼íƒ")) {
			houseMethod();
		} else {
			PrintMes.printReCho();
			BaseFunc.margin5();
			rightMethod();// ë‹¤ì‹œ ì…ë ¥ ë°›ë„ë¡ ì œê·€ í˜¸ì¶œ
		}
	}
	public static void floor() {
		BaseFunc.countStr("â–· ì™”ê¸´ í•´ëŠ”ë° ëª‡ì¸µìœ¼ë¡œ ê°€ì§€?");
		BaseFunc.countStr("        â–¶ 1                  â–¶ 9");
		BaseFunc.countStr("        â–¶ 2                  â–¶ 10");
		BaseFunc.countStr("        â–¶ 3                  â–¶ 11(ì¹œêµ¬ì§‘)");
		BaseFunc.countStr("        â–¶ 4                  â–¶ 12");
		BaseFunc.countStr("        â–¶ 5                  â–¶ 13");
		BaseFunc.countStr("        â–¶ 6                  â–¶ 14");
		BaseFunc.countStr("        â–¶ 7                  â–¶ 15");
		BaseFunc.countStr("        â–¶ 8                  â–¶ ì˜¥ìƒ");
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
		case "ì˜¥ìƒ":
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
	public static void floor4Method() {//ì¡°ì˜ˆì„œ ì‘ì„± 
		BaseFunc.margin5();
		BaseFunc.count();
		BaseFunc.count();
		BaseFunc.countCh2("â€¦ ì‚°ê±´ê°€?... ì‚´ì•˜ë‹¤â€¦ ");
		BaseFunc.count();
		BaseFunc.count();
		BaseFunc.margin5();
		BaseFunc.countCh2("ê·¸ë•Œ ì´í›„ë¡œ ë‚˜ëŠ” ë¹¨ê°„ ë§ˆìŠ¤í¬ë¥¼ ë³¸ì ì€ ì—†ë‹¤..");
		BaseFunc.count();
		BaseFunc.countCh2("ì•„ë‹ˆ ê·¸ë‚  ì˜ëª» ë³¸ ê²ƒì¼ ì§€ë„ ëª¨ë¥´ê² ë‹¤..");
		BaseFunc.count();
		BaseFunc.countCh2("ê·¸ë˜ì„œ ë‚˜ëŠ” ê·¸ë‚  ì¼ì„ ê·¸ ëˆ„êµ¬ì—ê²Œë„ ë§í•˜ì§€ ì•Šì•˜ë‹¤.");
		BaseFunc.count();
		BaseFunc.countCh2("ì´ëŸ° í„°ë¬´ë‹ˆ ì—†ëŠ” ì¼ì€ ê·¸ ëˆ„êµ¬ë„ ë¯¿ì§€ ì•Šì„ ê±°ê¸°ì—..."); 
		BaseFunc.count();
		BaseFunc.countCh2("ë‚˜ ë˜í•œ ê·¸ëŸ° í„°ë¬´ë‹ˆ ì—†ëŠ” ì´ì•¼ê¸°ë¥¼ ë¯¿ì§€ì•ŠëŠ” ì–´ë¥¸ì´ ë˜ì—ˆë‹¤.");
		BaseFunc.margin10();
		GameEndClass.gameEndIn();
	}
//				The End
//				ë‹¹ì‹ ì˜ ìš©ê¸°ì— ë°•ìˆ˜ë¥¼â€¦ ì‚´ë ¤ëŠ” ë“œë¦´ê²Œ(í—ˆë¬´ ì—”ë”©) (ï¿£âˆ‡ï¿£ï¾‰ï¾‰"
	
	
	public static void houseMethod() {
		int countH=PrologueClass.Plc.count;
		BaseFunc.margin20();
		///////////////////////////////ë”œë ˆì´
		BaseFunc.count();
		BaseFunc.count();
		///////////////////////////////ë”œë ˆì´
		BaseFunc.countStr("(ë’¤ì— ì¸ê¸°ì²™ì´ ëŠê»´ì§„ë‹¤.)");
		///////////////////////////////ë”œë ˆì´
		BaseFunc.count();
		BaseFunc.count();
		///////////////////////////////ë”œë ˆì´
		BaseFunc.countCh1("ë‚˜ ì˜ˆë»...?");
		BaseFunc.countCh("(ë’¤ì—ì„œ ë¹¨ê°„ë§ˆìŠ¤í¬ê°€ ë¯¸ì¹œë“¯ì´ ì«“ì•„ì˜¨ë‹¤.)");
		BaseFunc.countCh("(ë¹¨ë¦¬ ë¹„ë°€ë²ˆí˜¸ë¥¼ í’€ì–´ì•¼í•˜ëŠ”ë°... ë¨¸ë¦¬ê°€ ìƒˆí•˜ì–—ë‹¤.)");
		BaseFunc.countCh("(ë²ˆí˜¸ê°€ ê¸°ì–µì´ ì•ˆë‚œë‹¤... )");
		BaseFunc.countCh("(í°ì¼ì´ë‹¤... ë¹¨ë¦¬ ë¨¸ë¦¬ë¥¼ êµ´ë ¤ë³´ì.)");
		////////////////////////////////////// 5ë²ˆ ì´ìƒ ì£½ì—ˆì„ ì‹œ => íŒíŠ¸ ì¶œë ¥
		if(countH >= 5) {
			BaseFunc.countStr("\n\ndufdufdltkadh\n\n");
		}
		System.out.print("ë¹„ë°€ë²ˆí˜¸ë¥¼ ì…ë ¥í•˜ì„¸ìš” : ");
//      long then = System.currentTimeMillis(); //ì‹œê°„ ì´ˆì„¸ê¸°
		String password = scStr.nextLine();
//     	long now = System.currentTimeMillis(); //ì‹œê°„ ì´ˆì„¸ê¸°
//		long time = (now-then)/1000;
//      System.out.println(time+"ì´ˆ"); //ì´ˆ ì¶œë ¥
//		if(time>10){ // 10ì´ˆ ë„˜ì–´ê°”ì„ ë•Œ
//      	++countH;
//			if(GameOverClass.gameOverIn()==1) 
//				houseMethod();
//        }
		if(password.equals("1010235")) { //passwordê°€ ë§ì•˜ì„ ë•Œ
			///////////////////////////////ë”œë ˆì´
			BaseFunc.count();
			BaseFunc.count();
			///////////////////////////////ë”œë ˆì´
			BaseFunc.margin20();
			BaseFunc.countCh2("í˜„ê´€ë¬¸ì„ ì¬ë¹¨ë¦¬ ì—´ê³  ë“¤ì–´ì˜¨ ë‚˜ëŠ” ì‰½ì‚¬ë¦¬ ì§‘ì•ˆìœ¼ë¡œ ë“¤ì–´ê°€ì§€ ëª»í•˜ê³ ");
			BaseFunc.countCh2("í˜„ê´€ì— í•œì°¸ì„ ì„œ ìˆì—ˆë‹¤.");
			BaseFunc.countCh2("ë‹¤ì‹œëŠ”... ì´ëŸ° ê²½í—˜ì„ í•˜ê³  ì‹œì§€ ì•Šë‹¤...");
			BaseFunc.count();
			BaseFunc.count();
			BaseFunc.margin20();
			//###ê¸°ë³¸ì—”ë”© ì¶œë ¥
			BaseFunc.margin5();
			BaseFunc.countCh2("ê·¸ë•Œ ì´í›„ë¡œ ë‚˜ëŠ” ë¹¨ê°„ ë§ˆìŠ¤í¬ë¥¼ ë³¸ì ì€ ì—†ë‹¤..");
			BaseFunc.count();
			BaseFunc.countCh2("ì•„ë‹ˆ ê·¸ë‚  ì˜ëª» ë³¸ ê²ƒì¼ ì§€ë„ ëª¨ë¥´ê² ë‹¤..");
			BaseFunc.count();
			BaseFunc.countCh2("ê·¸ë˜ì„œ ë‚˜ëŠ” ê·¸ë‚  ì¼ì„ ê·¸ ëˆ„êµ¬ì—ê²Œë„ ë§í•˜ì§€ ì•Šì•˜ë‹¤.");
			BaseFunc.count();
			BaseFunc.countCh2("ì´ëŸ° í„°ë¬´ë‹ˆ ì—†ëŠ” ì¼ì€ ê·¸ ëˆ„êµ¬ë„ ë¯¿ì§€ ì•Šì„ ê±°ê¸°ì—..."); 
			BaseFunc.count();
			BaseFunc.countCh2("ë‚˜ ë˜í•œ ê·¸ëŸ° í„°ë¬´ë‹ˆ ì—†ëŠ” ì´ì•¼ê¸°ë¥¼ ë¯¿ì§€ì•ŠëŠ” ì–´ë¥¸ì´ ë˜ì—ˆë‹¤.");
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
		String plcGender=PrologueClass.Plc.gender;	//ì„±ë³„ ì €ì¥
		BaseFunc.margin20();
		BaseFunc.countStr("(ì¹œêµ¬ì§‘ ì•ì— ë„ì°©í–ˆë‹¤.)");
		///////////////////////////////ë”œë ˆì´
		BaseFunc.count();
		BaseFunc.count();
		///////////////////////////////ë”œë ˆì´
		BaseFunc.countChNoLn("(ëµ-");
		BaseFunc.countCh1("ë˜¥)");
		///////////////////////////////ë”œë ˆì´
		BaseFunc.count();
		BaseFunc.count();
		///////////////////////////////ë”œë ˆì´
		BaseFunc.countStr("(ë²¨ì„ ëˆ„ë¥´ê³  ì¹œêµ¬ë¥¼ ë¶ˆë €ë‹¤.)");
		///////////////////////////////ë”œë ˆì´
		BaseFunc.count();
		BaseFunc.count();
		BaseFunc.countStr("");
		///////////////////////////////ë”œë ˆì´
		BaseFunc.countCh2("â–· ì—°ìš°ì•¼...");
		BaseFunc.countStrNoLn("ì—°ìš° : ");
		BaseFunc.countCh2("ëˆ„êµ¬ì„¸ìš”??");
		///////////////////////////////ë”œë ˆì´
		BaseFunc.count();
		BaseFunc.count();
		BaseFunc.countStr("");
		///////////////////////////////ë”œë ˆì´
		BaseFunc.countStr("(ì§‘ì•ˆì—ì„œ ì¸ê¸°ì²™ì´ ë“¤ë¦¬ê³  ì¹œêµ¬ì˜ ëŒ€ë‹µì†Œë¦¬ê°€ ë“¤ë ¤ì˜¨ë‹¤.)");
		///////////////////////////////ë”œë ˆì´
		BaseFunc.count();
		BaseFunc.count();
		BaseFunc.countStr("");
		///////////////////////////////ë”œë ˆì´
		BaseFunc.countCh2("â–· ë‹¤í–‰ì´ë‹¤...");
		///////////////////////////////ë”œë ˆì´
		BaseFunc.margin20();
		BaseFunc.count();
		BaseFunc.count();
		BaseFunc.count();
		BaseFunc.count();
		BaseFunc.countStr("");
		///////////////////////////////ë”œë ˆì´
		ImgClass.RadMaskImg3();
		for(int i =0; i<150;i++) {
			BaseFunc.countStrNoLn("ë‚˜ ì˜ˆë»...?");
			if(i%12==0) {
				BaseFunc.countStr("");
			}
		}
		BaseFunc.margin20();
		
		///////////////////////////////ë”œë ˆì´
		BaseFunc.countCh2("     ì‹¤ì¢… ì²­ì†Œë…„ ì •ë³´         ");
		///////////////////////////////ë”œë ˆì´
		BaseFunc.count();
		BaseFunc.count();
		BaseFunc.countStr("");
		///////////////////////////////ë”œë ˆì´
		//###ï¿½ï¿½ï¿½Î°ï¿½ ï¿½Ì¸ï¿½
		BaseFunc.countCh2("       ì´ë¦„ : "+name+"       ");
		///////////////////////////////ë”œë ˆì´
		BaseFunc.count();
		BaseFunc.count();
		///////////////////////////////ë”œë ˆì´
		//###ï¿½ï¿½ï¿½Î°ï¿½ ï¿½ï¿½ï¿½ï¿½
		BaseFunc.countCh2("       ë‚˜ì´ : 18       ");
		BaseFunc.countCh2("       ì„±ë³„ : "+(plcGender.equals("ì—¬")?"ì—¬":plcGender.equals("ë‚¨")?"ë‚¨":" "));
		////////////////////////////////
		///////////////////////////////ë”œë ˆì´
		BaseFunc.count();
		BaseFunc.count();
		///////////////////////////////ë”œë ˆì´
		BaseFunc.margin20();
		BaseFunc.countStrNoLn("ìœ ì§„ : ");
		BaseFunc.countCh2("í˜¹ì‹œ "+name+" ì´ì•¼ê¸° ë“¤ì—ˆì–´?");
		BaseFunc.countCh2("ê·¸ì €ê»˜ ê°‘ìê¸° ì‹¤ì¢…ëëŠ”ë°, ê·¸ë‚  ì•¼ì ëë‚˜ê³  ì•„ë¬´ë„ ëª»ë´¤ë‹¤ëŠ”ë°...?");
		///////////////////////////////ë”œë ˆì´
		BaseFunc.count();
		BaseFunc.count();
		///////////////////////////////ë”œë ˆì´
		BaseFunc.countStrNoLn("\nì—°ìš° : ");
		BaseFunc.countCh2("ì•„..ê·¼ë° ë‚´ê°€ ê·¸ë‚  ë°–ì—ì„œ"+name+"ëª©ì†Œë¦¬ê°€ ë“¤ë ¤ì„œ ë‚˜ê°€ë´¤ì—ˆê±°ë“ ..?");
		BaseFunc.countCh2("    ê·¼ë° ì•„ë¬´ë„ ì—†ì—ˆì–´...");
		BaseFunc.countCh2("    ë¬´ìŠ¨ì¼ì´ ìˆì—‡ë˜ê±¸ê¹Œ...?");
		///////////////////////////////ë”œë ˆì´
		BaseFunc.count();
		BaseFunc.count();
		BaseFunc.countStr("    ...");
		///////////////////////////////ë”œë ˆì´
		BaseFunc.countCh2("    ì˜ëª»ë“¤ì€ ê±¸ê¹Œ...?");
		///////////////////////////////ë”œë ˆì´
		BaseFunc.count();
		BaseFunc.count();
		BaseFunc.count();
		BaseFunc.count();
		///////////////////////////////ë”œë ˆì´
		BaseFunc.margin20();
		BaseFunc.countCh1("â–·  (í‘..í‘..)"); //ì£¼ì¸ê³µ		
		BaseFunc.margin20();
		GameEndClass.gameEndIn();
	}
	
}
