package day_02;

public class For_Study {

	public static void main(String[] args) {
		
		int tot = 0;
		
		//syso�� �Է� �� ��Ʈ�� + �����̽��ٸ� ������ ���͸� ġ�� ����Ʈ �޼ҵ尡 �ڵ��ϼ� ��.
		
		for(int i = 0; i < 100; i++) {
			System.out.println("i�� ����? " + (i+1));   // ���������� �� �������� ����
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
			System.out.println("���� i�� ����: " + i);
			
			if(i == 3) break;
		}
		
		System.out.println();
		
		int even = 0;
		for(int i=1; i<=10; i++) {
			if(i%2 == 0) {
				even++;
			}
		}
		
		System.out.println("¦�� ����: " + even);
		
		int tot2 = 0;
		for(int i=1; i<=20; i++) {
			tot2 += i;
			
			if(tot2 > 60) break;
		}
		
		System.out.println("60�� �Ѿ����ϴ�. >> i�� ������: " + tot2);
	}
}

