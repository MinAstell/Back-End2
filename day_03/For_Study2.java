package day_03;

public class For_Study2 {

	public static void main(String[] args) {
		
		// boolean isLogin = true;
		// if(isLogin == true) (X)  /  if(isLogin) (O) !! �߿�
		
		int tot = 0;
		for(int i=1; i<=10; i++) {
			tot += i;
		}
		
		System.out.println("1���� 10������ ��: " + tot);
		
		int count = 0;
		for(int i=1; i<=10; i++) {
			if(i%2 == 0) count++;
		}
		
		System.out.println("1���� 10������ ���� �� ¦���� ��: " + count);
	
	}
}

