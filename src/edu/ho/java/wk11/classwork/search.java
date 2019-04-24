package edu.ho.java.wk11.classwork;

public class search {

	int search(int[] a, int target) {
		int left = 0;
		int right = a.length - 1;
		while (left <= right) {
			int midPoint = (left + right) / 2;
			if (a[midPoint] == target) {
				return midPoint;
			} else if (a[midPoint] < target) {
				left = midPoint + 1;
			} else {
				right = midPoint - 1;
			}
		}
		return -1;

	}

	int search(int[] a, int target, int left, int right) {
		if (left > right) {
			return -1;
		} else {
			int midPoint = (left + right) / 2;
			if (a[midPoint] == target) {
				return midPoint;
			} else if (a[midPoint] < target) {
				return search(a, target, midPoint + 1, right);
			} else {
				return search(a, target, left, midPoint + 1);
			}
		}
	}
}
