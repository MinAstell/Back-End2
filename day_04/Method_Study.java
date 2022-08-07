package day_04;

public class Method_Study {
	
	public static void eat() {
		
	}
	
	//메소드 이름: eat
	//리턴 타입: void
	//파라미터 타입: String
	
	public int getFood(String food, int money) {
		return 0;
	}
	
	//메소드 이름: getFood
	//리턴 타입: int
	//파라미터 타입: String, int
	
	public static int getSum(int x, int y) {
		
		System.out.println("x의 값: " + x);
		System.out.println("y의 값: " + y);
		
		int add = x + y;
		return add;
	}
	
	public static int getNum(int x) {
		if(x == 100) return x * 2;   // x가 100이면 x * 2를 리턴
		return 0;   // x가 100이 아니면 0을 리턴
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
		
		//int array[] = {3 (0번째 원소 or 인덱스), 6 (1번째 원소 or 인덱스)};
		// 스태틱 메소드에는 스태틱 메소드만 올 수 있다.
		
		eat();
//		getSum(10, 20);
		int sum = getSum(50, 30);
		System.out.println("sum: " + sum);
		int num = getNum(100);
		System.out.println(num);
		
		int max = getMax();
		System.out.println("최댓값: " + max);
		
		int value = getNum2(20, 15);
		System.out.println("리턴 값: " + value);
	}
}

