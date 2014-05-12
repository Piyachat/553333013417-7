package binaryheap;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		BinaryHeap bh = new BinaryHeap();
		bh.enQueue(11);
		bh.enQueue(20);
		bh.enQueue(9);
		bh.enQueue(50);
		bh.enQueue(1);
		System.out.println(bh);
		Object arr[] = {11,34,67,5};
		BinaryHeap.heapSort(arr);
		System.out.println(Arrays.toString(arr));
		
		
	}
	
	

}
