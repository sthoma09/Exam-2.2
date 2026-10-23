package problem2;

public class Problem2 {

	public static void main(String[] args) {
		int[] array1 = {1,1,1,1,1};
		int[] array2 = {2,2,2,2,2};
		int[] result;
		
		result = interleave(array1,array2);
		showArray(result);
		

	}
	public static void showArray(int[] array) {
		
		System.out.printf("[");
		for(i=0;i<array.length;i++) {
			System.out.print(array[i]);
			if(i<array.length - 1) {
				System.out.printf(",");
			}
		}
		System.out.printf("]\n");
	}
	
	public static int[] interleave(int[] array1, int[] array2) {
		int index;
		int[] result = {};
		
		for(index = 0; index < array1.length; index++) {
			result[index++] = array1[index];
			result[index++] = array2[index];
		}
		
		return result;
		
		
	}

}
