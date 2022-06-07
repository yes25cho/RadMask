  package basePackages;

public class PrintMes{
//	printExceHome메서드
	public static void printExceHome(){
//	- 홈화면에서 예외 답 받았을 때 출력	
		System.out.println();
		BaseFunc.countCh2("▷ ...쓰여져 있는 메뉴 중에서 골라야 할 것 같다");
		System.out.println();
		System.out.println();
	}
	
//	printExce메서드
	public static void printExce(){
//	- 게임 중에 예외의 답을 받았을 때 출력
		System.out.println();
		BaseFunc.countCh2("▷ ...");
		BaseFunc.countCh2("▷ 어라...?");
		BaseFunc.countCh2("▷ 그건 안되는 것 같다 다시 생각을 해서 정해 보자...");
		System.out.println();
		System.out.println();
	}
	
//	printManner메서드
	public static void printManner(){
//	- 설명 하기 설명문 출력
		System.out.println();
		System.out.println("----------- 하는 방법 -----------");
		System.out.println("1. 이야기를 읽으며 이야기에 스며드십시오");
		System.out.println("2. 선택지가 나오면 자신이 원하는 \n   선택지를 입력하십시오");
		System.out.println("3. 실패해도 히든 엔딩들도 있으니 \n   계속 도전해 보십시오");
		System.out.println("4. 머니머니 해도 즐기면서 하십시오");
		BaseFunc.countCh2("¿. rhxh포를 aks끽 하tlaq시오..TKFFUWNJ");
		System.out.println();
		System.out.println();
		System.out.println("        ▶돌아가기                              ▶시작하기");
		printChoose();
	}
	
//	printHome메서드
	public static void printHome(){
//	- 홈화면 출력
		System.out.println();
		BaseFunc.countCh("          빨   간      마   스   크      피   하   기");
		BaseFunc.count();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("        ▶설명보기                              ▶시작하기");
		printChoose();
	}
	
//	printOver메서드	
	public static void printOver(){
//	- 기본 적인 게임임 오버 화면 출력
		System.out.println();
		BaseFunc.countCh("          당  신  은   죽  었  습  니  다   .  .  . ");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("          ▶다시하기                              ▶홈으로");
		printChoose();
	}
	
//	printEnd메서드
	public static void printEnd() {
//	- 기본 적인 게임임 오버 화면 출력
		System.out.println();
		BaseFunc.countCh("            T   h   e      E   n   d");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("          ▶다시하기                              ▶홈으로");
		printChoose();
	}

//	printChoose메서드
	public static void printChoose(){
//	- 	선택 입력 문구 출력	
		System.out.println();
		System.out.print("       선택지를 입력하시오  : ");
	}
	
//	printReCho메서드
	public static void printReCho(){
//	- 	선택 다시 입력 문구 출력
		PrintMes.printExceHome();
		System.out.println("다시 선택 : ");
	}
}
