package day_02;

public class IfElse_study2 {

	public static void main(String[] args) {
		
		String name = "����";       
		
		//String�� Ŭ���� Ÿ���̴�. (���� ���ڰ� �빮���̸� Ŭ������)
		
		// name == "ȫ�浿" ������ ���ڸ� ���ϴ� ���� �ƴ�.
		// String�� Ŭ�����̹Ƿ� equals �޼ҵ带 ����ؼ� ���ϴ� ���� ����.
		// �޼ҵ� ��õ �޴� ��������� ctrl + spacebar (����Ű).
		// if/else �������� else�� �ִ��� ���� �ʴ� ���� �� �� ����� �ڵ���. (�ݹ������� ���� �� ����)
		
		if(name.equals("ȫ�浿")) {
			System.out.println("�α��� �Ϸ�!");
		}    
		if(!name.equals("ȫ�浿")) {
			System.out.println("�α��� ����!");
		}
		
		boolean isLogin = true;    
		
		// boolean�� �� �� ���� ���̳� �ڿ� is or has�� �ٿ��� �������� ����! (������ ���� ��Ģ)
		// boolean�� flag ���̶�� �θ��⵵ ��!
		
		if(isLogin) {
			System.out.println("�α��� �Ϸ�!");
		}
		if(!isLogin) {
			System.out.println("�α��� ����!");
		}
	}
}

