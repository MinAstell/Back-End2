package day_05;

public class Method_Study4 {
	
	public static int[] getArray() {
		int array[] = {10,50};
		return array;
	}
	
	public static String[] getArray2() {
		String array2[] = {"다당","쿠켄","실비김치","카라멜"};
		return array2;
	}
	
	public static String printFood() {
	
		return "사과 냠냠~"; 
	}
	
	public static int getSum(int x, int y) {
		
		return x + y;
	}
	
	public static String getStr(String food) {
		
		return food;
	}
	
	public static String getStr(String[] food) {
		
		return food[food.length - 1];
	}

	public static void main(String[] args) {
	
		int array_1[] = getArray();
		
		String array_2[] = getArray2();
		for(String i : array_2) {
			System.out.println(i);
		}
		
		printFood();   // 대입 불가능, 리턴타입이 보이드라 리턴하는게 없기 때문
		
		String name = printFood();
		System.out.println("\n" + name + "\n");
		
		int num = getSum(10,20);
		System.out.println(num + "\n");
		
		String food = getStr("치킨");
		System.out.println(food + "\n");
		
		String food1[] = {"치킨","돈까스","백반","찌개"};
		String food_1 = getStr(food1);
		System.out.println(food_1);
	}
}

