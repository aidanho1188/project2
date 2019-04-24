package edu.ho.java.wk11.classwork;

public class QuickSort {

	int quickSort(int[] a, int low, int high)
	{
	    if (low < high)
	    {
	        /* pi is partitioning index, arr[pi] is now
	           at right place */
	        pi = quickSort(a, low, high);

	        quickSort(a, low, pi - 1);  // Before pi
	        quickSort(a, pi + 1, high); // After pi
	    }
	}
}
