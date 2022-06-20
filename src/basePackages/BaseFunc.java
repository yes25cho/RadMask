package basePackages;

import java.util.concurrent.TimeUnit;

public class BaseFunc {
//딜레이
//*글자 단위 딜레이 
	
//	countCh2 메서드
	public static void countCh2(String mes){
//	- 기본적으로 많이 사용 하는 딜레이 메소드  
//	- 한 글자씩 출력
		try {
			for (int i = 0; i < mes.length(); i++) {
				TimeUnit.NANOSECONDS.sleep(200000000);
				System.out.print(mes.charAt(i));
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println();
	}
	
//	countCh2NoLn 메서드
	public static void countCh2NoLn(String mes){
//	- 기본적으로 많이 사용 하는 딜레이 메소드 
//	- 한 글자씩 출력
//	- 마지막 줄 바꿈 없음
		try {
			for (int i = 0; i < mes.length(); i++) {
				TimeUnit.NANOSECONDS.sleep(290000000);
				System.out.print(mes.charAt(i));
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
//	countCh1 메서드
	public static void countCh1(String mes) {
//	- 느린 딜레이 메소드 
//	- 한 글자씩 출력
		try {
			for (int i = 0; i < mes.length(); i++) {
				TimeUnit.NANOSECONDS.sleep(2000000000);
				System.out.print(mes.charAt(i));
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		 System.out.println();
	}	
	
// countCh1NoLn 메서드
	public static void countCh1NoLn(String mes) {
//	- 느린 딜레이 메소드 
//	- 한 글자씩 출력
//	- 마지막 줄 바꿈 없음
		try {
			for (int i = 0; i < mes.length(); i++) {
				TimeUnit.NANOSECONDS.sleep(290000000);
				System.out.print(mes.charAt(i));
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}	
	
//	countCh 메서드
	public static void countCh(String mes) {
//	- 빠른 딜레이 메소드 
//	- 한 글자씩 출력
		try {
			for (int i = 0; i < mes.length(); i++) {
				TimeUnit.NANOSECONDS.sleep(99900000);
				System.out.print(mes.charAt(i));
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println();
	}
//	countChNoLn 메서드
	public static void countChNoLn(String mes) {
//	- 빠른 딜레이 메소드 
//	- 한 글자씩 출력
//	- 마지막 줄 바꿈 없음
		try {
			for (int i = 0; i < mes.length(); i++) {
				TimeUnit.NANOSECONDS.sleep(99900000);
				System.out.print(mes.charAt(i));
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

//*문장 단위 딜레이
//	countStr 메서드
	public static void countStr(String mes) {
//	- 기본적으로 많이 사용 하는 딜레이 메소드 
//	- 매개변수로 받은 문자열 전부 출력
		try {
			TimeUnit.NANOSECONDS.sleep(1000000000);			
			System.out.println(mes);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

//	countStrNoLn메서드
	public static void countStrNoLn(String mes) {
//	- 기본적으로 많이 사용 하는 딜레이 메소드 
//	- 매개변수로 받은 문자열 전부 출력
//	- 마지막 줄 바꿈 없음
		try {
			TimeUnit.NANOSECONDS.sleep(1000000000);			
			System.out.print(mes);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
//	count메서드
	public static void count() {
//	- 딜레이 메소드 
//	- 딜레이하는 기능만 있는 메소드
//	- 매개 변수가 없다.
		try {
			TimeUnit.NANOSECONDS.sleep(1000000000);			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
//여백
//	margin20메서드
	public static void margin20() {
//	- 20줄의 공백을 넣는 메소드
		for(int i=0; i<=20; i++) {
			System.out.println();
		}
	}
//	margin10메서드
	public static void margin10() {
//	- 10줄의 공백을 넣는 메소드
		for(int i=0; i<=10; i++) {
			System.out.println();
		}
	}
//	margin5메서드
	public static void margin5() {
//	- 5줄의 공백을 넣는 메소드
		for(int i=0; i<=5; i++) {
			System.out.println();
		}
	}
	public static void endingCredit() {
		countStr("              제     작     진 ");
		countStr("       조   예   서      개발 총괄");
		countStr("                            스토리 제작");
		countStr("                            패키지 개발");
		countStr("                            골목길 스토리 개발 ");
		countStr("                            아파트 4층 스토리 개발");
		countStr("                            세탁소 스토리 개발");
		countStr("                 ");
		countStr("       박   선   주      디자인 총괄");
		countStr("                            빨간 마스트 얼굴 제작 ");
		countStr("                            스토리 제작");
		countStr("                            파출소 스토리 개발");
		countStr("                            주택(주인공집) 스토리 개발");
		countStr("                            아이콘 제작(넣을 수 있길..)");
		countStr("                 ");
		countStr("       권   하   은      연출 총괄");
		countStr("                            지도 제작");
		countStr("                            스토리 제작");
		countStr("                            교회 스토리 개발");
		countStr("                            옥상 스토리 개발");
		countStr("");
		countStr("       제   작   팀      3! 4! 포마드");
		countStr("");
		GameEndClass.gameEndIn();
	}
}
