/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test_tma;

/**
 *
 * @author 3121m
 */
public class Solution1 {
    public String solution(String[] A, String[] B, String P) {
        quickSort(A,B,0,A.length-1);
        String result;
        for (int i = 0; i < B.length; i++) {
            if (B[i].contains(P)) {
                return A[i];
            }
        }
        return "NO CONTACT";
    }
    private void quickSort(String[] A, String[] B, int low, int high)
    {
	int i = low;
	int j = high;
	String pivot = A[(i + j) / 2];
	String temp;

	while (i <= j)
	{
		while ((A[i].compareTo(pivot))<0)
			i++;
		while ((A[j].compareTo(pivot))>0)
			j--;
		if (i <= j)
		{
			temp = A[i];
			A[i] = A[j];
			A[j] = temp;
                        temp = B[i];
                        B[i]=B[j];
                        B[j]=temp;
			i++;
			j--;
		}
	}
	if (j > low)
		quickSort(A, B, low, j);
	if (i < high)
		quickSort(A, B, i, high);
    }
}
