package day_01;

public class First_Java {
	public static void main(String[] args) {
		int x = 10, y = 20;
		
		x = x + y;
		
		System.out.println(x);
		
		int money = 130000, oman = 50000, man = 10000, result, result2, temp;
		result = money / oman;
		temp = money % oman;
		result2 = temp / man;
		
		System.out.println("5만원을 " + result + "장 받을 수 있습니다.");
		System.out.println("1만원을 " + result2 + "장 받을 수 있습니다.");
		
		int z = 100, a;
		z *= 2;
		a = z;
		
		System.out.println(a);
		
		int result_1 = 100, temp_1 = 0;
		temp_1 = result_1;
		temp_1 = 500;
		result_1 = result_1 * 2;
		temp_1 = result_1;
		
		System.out.println(temp_1);
		// 100 >> 500 >> 200순으로 값이 바뀜
	}
}

