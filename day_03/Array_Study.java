package day_03;

public class Array_Study {

	public static void main(String[] args) {
	
		// 배열은 변수를 여러번 선언하기 곤란할 때에 한번에 선언하고자 사용 
		// EX). int a = 5; int b = 10; int c = 15; ... (100번 선언) >> 이럴 때 배열 사용
		
		int[] array = {5, 10, 15};
		int[] array2 = new int[100];
		
//		for(int i=0; i<100; i++) {
//			array2[i] = i+1;
//			System.out.println("array2의 값: " + array2[i]);
//		}
		
		System.out.println("배열의 값: " + array[1] + " / 배열의 길이: "+ array.length);
		
		int item = array[0];  //0번째 원소를 item에 대입!
		System.out.println(item);
		
		if(array[0] == 100) {
			System.out.println("0번째 원소는 100!!\n");
		}
		
		array[array.length - 1] = 50;   // 배열의 길이를 몰라도 마지막 원소에 접근 가능
		if(array[array.length - 1] == 50) {
			System.out.println("마지막 원소의 값: " + array[array.length - 1] + "\n");
		}
		
		for(int i=0; i<array.length; i++) {
			System.out.println("배열의 원소의 값: " + array[i]);
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
			System.out.println("방법2: " + i);
		}
		
		System.out.println();
		
		System.out.println("arr배열의 원소의 총합: " + tot);
		
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
		
		System.out.println("arr_2배열의 최댓값: " + max + " / " + "arr_2배열의 최소값: " + min + "\n");
		
		int arr_3[] = {3,7,19,50,3,1};
		
		for(int i=0; i<arr_3.length; i++) {
			System.out.println(arr_3[i]);
			
			if(arr_3[i] == 50) {
				System.out.println("\n50이 되어 for문이 종료됨.\n"); break;
			}
		}
		
		int arr_4[] = {4,1,9};
		
		arr_4[arr_4.length - 1] *= 2;
		System.out.println("마지막 원소에 2를 곱한 값: " + arr_4[arr_4.length - 1] + "\n");
		
		int arr_5[] = {3,5,8};
		int temp = 0;
		temp = arr_5[0];
		arr_5[0] = arr_5[2];
		arr_5[2] = temp;
		
		for(int i=0; i<arr_5.length; i++) {
			System.out.print("배열의 원소를 스왑한 후: " + arr_5[i] + "  ");
		}
	}
}

