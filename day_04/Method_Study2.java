package day_04;

public class Method_Study2 {
	
	public static boolean isUserId(String userId) {
		
		String myId = "apple";
		
		if(userId.equals(myId)) return true;
		if(!(userId.equals(myId))) return false;
		
		return false;
	}
	
	public static int getSum(int x, int y) {
		
		if(x + y > 100) return 0;
		
		return 1;
	}
	
	public static String getName(String name) {
		
		if(name.equals("ȫ�浿")) return name;
		
		return null;
	}

	public static void main(String[] args) {
		
		boolean Id = isUserId("apple");
		
		System.out.println("���̵� ��ġ����: " + Id);
		
		int result = getSum(50, 51);
		System.out.println(result);
		
		String name = getName("ȫ�浿");
		System.out.println(name);
	}
}

