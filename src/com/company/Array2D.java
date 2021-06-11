package com.company;

import java.util.Arrays;


public class Array2D {

	private int [][] arr1 = {{1,-2,3},{4,-5,6},{7,-8,9}};
	private int [][] arr2 = {{2,3,4},{-3,-2,-1},{1,1,1}};
	private int [][] arr3 = {{1,2,3,4}, {1,2,3}, {1,2}};
	private double [][] arr4;
	
	public Array2D() {
		// TODO Auto-generated constructor stub
		arr4 = new double[5][7];
		
	}

	public int [][] addArrays()
	{
		int [][] answer = new int[arr1.length][arr1[0].length];
		
		for (int r = 0; r < arr1.length; r++){
			for(int c = 0; c < arr1[0].length; c++){
				answer[r][c] = arr1[r][c] + arr2[r][c];
			}
		}
		//System.out.println(answer);
		
		return answer;
	}
	public void printRagged()
	{
		System.out.println(Arrays.deepToString(arr3));
	}
	public void printFirst()
	{
		
		
		for(int [] row: arr1)
		{
			for(int col: row)
			{
				System.out.print(col + " ");
			}
			System.out.println();
		}
		
	}
	public void editRagged(){
		int []x = {9,8,7,6,5,4,3,2,1};
		arr3[2]= x;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Array2D atd = new Array2D();
		
		int [][] x = atd.addArrays();
		for (int i = 0; i < x.length; i++)
			System.out.println(Arrays.toString(x[i]));
		
		System.out.println(Arrays.deepToString(x));
		atd.printFirst();
		atd.printRagged();

		atd.editRagged();
		atd.printRagged();

	}

}
