package day_01;

public class If_Else_Study {
	public static void main(String[] args) {
		int x = 7, temp = 0;
		
		if(x % 2 == 0) {
			System.out.println("x�� ¦���Դϴ�!!"); x++;
			int y = x;
		}
		else {
			System.out.println("x�� Ȧ���Դϴ�!!"); x++;
			int b = 10; temp = b;
		}
		// y�� ��������? ��������� ����ϸ� ������.. if���� ������ �� �� ����.
		
		System.out.println(temp);
		
	}
}

