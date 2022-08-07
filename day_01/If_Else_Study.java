package day_01;

public class If_Else_Study {
	public static void main(String[] args) {
		int x = 7, temp = 0;
		
		if(x % 2 == 0) {
			System.out.println("x는 짝수입니다!!"); x++;
			int y = x;
		}
		else {
			System.out.println("x는 홀수입니다!!"); x++;
			int b = 10; temp = b;
		}
		// y의 최종값은? 결과적으로 출력하면 에러남.. if문이 끝나면 쓸 수 없음.
		
		System.out.println(temp);
		
	}
}

