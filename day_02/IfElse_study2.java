package day_02;

public class IfElse_study2 {

	public static void main(String[] args) {
		
		String name = "백경민";       
		
		//String은 클래스 타입이다. (앞의 문자가 대문자이면 클래스임)
		
		// name == "홍길동" 문법은 문자를 비교하는 것이 아님.
		// String은 클래스이므로 equals 메소드를 사용해서 비교하는 것이 옳음.
		// 메소드 추천 메뉴 보고싶으면 ctrl + spacebar (단축키).
		// if/else 문법에서 else는 최대한 쓰지 않는 것이 좀 더 깔끔한 코드임. (콜백지옥에 빠질 수 있음)
		
		if(name.equals("홍길동")) {
			System.out.println("로그인 완료!");
		}    
		if(!name.equals("홍길동")) {
			System.out.println("로그인 실패!");
		}
		
		boolean isLogin = true;    
		
		// boolean을 쓸 때 에는 앞이나 뒤에 is or has를 붙여서 변수명을 설정! (개발자 간의 규칙)
		// boolean을 flag 값이라고 부르기도 함!
		
		if(isLogin) {
			System.out.println("로그인 완료!");
		}
		if(!isLogin) {
			System.out.println("로그인 실패!");
		}
	}
}

