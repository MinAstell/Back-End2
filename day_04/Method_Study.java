package day_04;

public class Method_Study {
	
	public static void eat() {
		
	}
	
	//�޼ҵ� �̸�: eat
	//���� Ÿ��: void
	//�Ķ���� Ÿ��: String
	
	public int getFood(String food, int money) {
		return 0;
	}
	
	//�޼ҵ� �̸�: getFood
	//���� Ÿ��: int
	//�Ķ���� Ÿ��: String, int
	
	public static int getSum(int x, int y) {
		
		System.out.println("x�� ��: " + x);
		System.out.println("y�� ��: " + y);
		
		int add = x + y;
		return add;
	}
	
	public static int getNum(int x) {
		if(x == 100) return x * 2;   // x�� 100�̸� x * 2�� ����
		return 0;   // x�� 100�� �ƴϸ� 0�� ����
	}
	
	public static int getMax() {
		
		int array[] = {10,20,100,5};
		int max = 0;
		for(int i=0; i<array.length; i++)
		{
			if(max < array[i]) max = array[i];
		}
		return max;
	}
	
	public static int getNum2(int x, int y) {
		
		if(x > y) return x;
		if(!(x > y)) return y;
		return 0;
	}

	public static void main(String[] args) {
		
		//int array[] = {3 (0��° ���� or �ε���), 6 (1��° ���� or �ε���)};
		// ����ƽ �޼ҵ忡�� ����ƽ �޼ҵ常 �� �� �ִ�.
		
		eat();
//		getSum(10, 20);
		int sum = getSum(50, 30);
		System.out.println("sum: " + sum);
		int num = getNum(100);
		System.out.println(num);
		
		int max = getMax();
		System.out.println("�ִ�: " + max);
		
		int value = getNum2(20, 15);
		System.out.println("���� ��: " + value);
	}
}

