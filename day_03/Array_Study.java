package day_03;

public class Array_Study {

	public static void main(String[] args) {
	
		// �迭�� ������ ������ �����ϱ� ����� ���� �ѹ��� �����ϰ��� ��� 
		// EX). int a = 5; int b = 10; int c = 15; ... (100�� ����) >> �̷� �� �迭 ���
		
		int[] array = {5, 10, 15};
		int[] array2 = new int[100];
		
//		for(int i=0; i<100; i++) {
//			array2[i] = i+1;
//			System.out.println("array2�� ��: " + array2[i]);
//		}
		
		System.out.println("�迭�� ��: " + array[1] + " / �迭�� ����: "+ array.length);
		
		int item = array[0];  //0��° ���Ҹ� item�� ����!
		System.out.println(item);
		
		if(array[0] == 100) {
			System.out.println("0��° ���Ҵ� 100!!\n");
		}
		
		array[array.length - 1] = 50;   // �迭�� ���̸� ���� ������ ���ҿ� ���� ����
		if(array[array.length - 1] == 50) {
			System.out.println("������ ������ ��: " + array[array.length - 1] + "\n");
		}
		
		for(int i=0; i<array.length; i++) {
			System.out.println("�迭�� ������ ��: " + array[i]);
		}
		
		System.out.println();
		
		int arr[] = {10,20,30,40,50};
		int tot = 0;
		for(int i=0; i<arr.length; i++) {
			tot += arr[i];
		}
		
		int arr_1[] = {1,30,40};
		arr_1[0] = 50; arr_1[2] = 50;
		
		for(int i=0; i<arr_1.length; i++) {
			System.out.println(arr_1[i]);
		}
		
		for(int i : arr_1) {
			System.out.println("���2: " + i);
		}
		
		System.out.println();
		
		System.out.println("arr�迭�� ������ ����: " + tot);
		
		int arr_2[] = {30,100,5,20};
		int max = 0;
		int min = 100;
		
		for(int i=0; i<arr_2.length; i++) {
			if(max < arr_2[i]) {
				max = arr_2[i];
			}
			if(min > arr_2[i]) {
				min = arr_2[i];
			}
		}
		
		System.out.println("arr_2�迭�� �ִ�: " + max + " / " + "arr_2�迭�� �ּҰ�: " + min + "\n");
		
		int arr_3[] = {3,7,19,50,3,1};
		
		for(int i=0; i<arr_3.length; i++) {
			System.out.println(arr_3[i]);
			
			if(arr_3[i] == 50) {
				System.out.println("\n50�� �Ǿ� for���� �����.\n"); break;
			}
		}
		
		int arr_4[] = {4,1,9};
		
		arr_4[arr_4.length - 1] *= 2;
		System.out.println("������ ���ҿ� 2�� ���� ��: " + arr_4[arr_4.length - 1] + "\n");
		
		int arr_5[] = {3,5,8};
		int temp = 0;
		temp = arr_5[0];
		arr_5[0] = arr_5[2];
		arr_5[2] = temp;
		
		for(int i=0; i<arr_5.length; i++) {
			System.out.print("�迭�� ���Ҹ� ������ ��: " + arr_5[i] + "  ");
		}
	}
}

