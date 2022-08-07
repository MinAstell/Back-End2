package day_02;

public class For_Study {

	public static void main(String[] args) {
		
		int tot = 0;
		
		//syso를 입력 후 컨트롤 + 스페이스바를 누르고 엔터를 치면 프린트 메소드가 자동완성 됨.
		
		for(int i = 0; i < 100; i++) {
			System.out.println("i의 값은? " + (i+1));   // 증감연산은 맨 마지막에 진행
		}
		
		System.out.println();
		
		for(int i=1; i<=10; i++) {
			if(i%2 == 0) {
				System.out.println(i);
			}
		}
		
		System.out.println();
		
		for(int i=0; i<=5; i++) {
			if(i == 5) {
				System.out.println(i*2); break;
			}
			System.out.println(i);
		}
		
		System.out.println();
		
		for(int i=1; i<=10; i++) {
			tot += i; 
			
			if(i == 10) {
				System.out.println(tot+"\n");
			}
		}
		
		for(int i=1; i<=5; i++) {
			System.out.println("현재 i의 상태: " + i);
			
			if(i == 3) break;
		}
		
		System.out.println();
		
		int even = 0;
		for(int i=1; i<=10; i++) {
			if(i%2 == 0) {
				even++;
			}
		}
		
		System.out.println("짝수 개수: " + even);
		
		int tot2 = 0;
		for(int i=1; i<=20; i++) {
			tot2 += i;
			
			if(tot2 > 60) break;
		}
		
		System.out.println("60을 넘었습니다. >> i의 총합은: " + tot2);
	}
}

