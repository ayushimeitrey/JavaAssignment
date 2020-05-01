package com.training.imp;

import java.util.ArrayList;
import java.util.Arrays;

public class Q5SortList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*ArrayList<Integer> ar=new ArrayList<>();
		ar.addAll(Arrays.asList(2,3,4,1,5,6,1));*/
		
		int[] arr=new int[]{2,3,4,1,5,6,1};
		//Arrays.sort(arr);
		mergeSort(arr);
		
		for(int a:arr)
		System.out.print(a);
	}

	private static void mergeSort(int[] arr) {
		// TODO Auto-generated method stub
		int n=arr.length;
		if(n<2) return;
		
		int mid=n/2;
		int [] l=new int[mid];
		int [] r=new int[n-mid];
		
		for(int i=0;i<mid;i++) {
			l[i]=arr[i];
		}
		for(int j=mid;j<n;j++) {
			r[j-mid]=arr[j];
		}
		
		mergeSort(l);
		mergeSort(r);
		
		merge(l,r,arr);
	}

	private static void merge(int[] l, int[] r, int[] arr) {
		// TODO Auto-generated method stub
		int i=0,j=0,k=0;
		
		int nL=l.length;
		int nR=r.length;
		int nArr=arr.length;
		
		while(i<nL && j<nR) {
			if(l[i]<r[j]) {
				arr[k]=l[i]; k++;i++;
			}
			else {
				arr[k]=r[j]; k++;j++;
			}
		}
		while(i<nL) {
			arr[k]=l[i]; k++;i++;
		}
		while(j<nR) {
			arr[k]=r[j]; k++;j++;
		}
		
	}

}
