package edu.ho.java.wk11.classwork;

public class MergeSort {

	void mergeSort(int[] a) {
		int[] copyBuffer = new int[a.length -1];
		mergeSortHelper(a,copyBuffer,0, a.length-1);
	}

	private void mergeSortHelper(int[] a, int[] copyBuffer, int i, int j) {
		// TODO Auto-generated method stub
		
	}
}
