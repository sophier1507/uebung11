package h3;

import java.util.Arrays;

public class H3_main {

	public static void main(String[] args) {
		/*int[] a = {1, 5, 6, 8, 2, 0, 10, 10, -5, 69, 70, 3};
		int [] b = mergeSort(a);
		System.out.println(Arrays.toString(b));*/

	}
	public static int[] mergeSort(int[] array) {
		if (array.length == 1 ) {
			return array;
		}
		int[] array1 = Arrays.copyOfRange(array, 0, array.length / 2);
		int[] array2 = Arrays.copyOfRange(array,  array.length / 2 , array.length);
		
		array1 = mergeSort(array1);
		array2 = mergeSort(array2);
		
		int first = 0;
		int second = 0;
		
		for (int i = 0; i < array.length; i++) {
			if (first >= array1.length) {
				array[i] = array2[second++];
			} else if (second >= array2.length) {
				array[i] = array1[first++];
			} else if (array1[first] < array2[second]) {
				array[i] = array1[first++];
			} else {
				array[i] = array2[second++];
			}
		}
		return array;
		
	}

}
