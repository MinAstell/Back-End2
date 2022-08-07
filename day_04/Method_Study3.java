package day_04;

public class Method_Study3 {
	
	public static int getIndex(int[] array) {
		
		System.out.println("0번째 원소 값: " + array[0]);
		
		int tot = 0;
		for(int i=0; i<array.length; i++) {
			tot += array[i];
		}
		
		int avg = tot / array.length;
		
		return avg;
	}
	
	public static int getArray()[] {
		int array[] = {3,5};
		return array;
	}
	
	public static int getSort(int[] array)[] {
		
		int len = array.length;
		
		for(int i=len; i>0; i--) {
			boolean isChange = false;
			
			for(int j=0; j<(i-1); j++) {
				
				if(array[j] > array[j+1]) {
					
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
					isChange = true;
				}
			}
			
			if(!isChange) break;
		}
		
		return array;
	}
	
	public static int getCount() {
		
		int array[] = {2,3,8,10};
		int count = 0;
		
		for(int i=0; i<array.length; i++) {
			if(array[i] % 2 == 0) {
				 count++;
			}
		}
		
		return count;
	}

	public static void main(String[] args) {
	
		int array[] = {8,10,20,30};
		getIndex(array);
		
		int avg = getIndex(array);
		System.out.println("원소들의 평균값: " + avg);
		
		int array_1[] = getArray();   // getArray() return이 배열이여서 가능
		System.out.println("0번째: " + array_1[0]);
		
		int a[] = {5,1,2,10};
		int array_2[] = getSort(a);
		System.out.println("-----------------------------");
		for(int i=0; i<a.length; i++) {
			System.out.print(array_2[i] + " / " + "\n");
		}
		
		System.out.println("-----------------------------");
		int even = getCount();
		System.out.println("짝수 개수: " + even);
	}
}

