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
				TimeUnit.NANOSECONDS.sleep(200000000);
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
				TimeUnit.NANOSECONDS.sleep(2000000000);
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
		for(int i=0; i<=10; i++) {
			System.out.println();
		}
	}
}
