package day_05;

public class Method_Study4 {
	
	public static int[] getArray() {
		int array[] = {10,50};
		return array;
	}
	
	public static String[] getArray2() {
		String array2[] = {"�ٴ�","����","�Ǻ��ġ","ī���"};
		return array2;
	}
	
	public static String printFood() {
	
		return "��� �ȳ�~"; 
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
		
		printFood();   // ���� �Ұ���, ����Ÿ���� ���̵�� �����ϴ°� ���� ����
		
		String name = printFood();
		System.out.println("\n" + name + "\n");
		
		int num = getSum(10,20);
		System.out.println(num + "\n");
		
		String food = getStr("ġŲ");
		System.out.println(food + "\n");
		
		String food1[] = {"ġŲ","���","���","�"};
		String food_1 = getStr(food1);
		System.out.println(food_1);
	}
}

