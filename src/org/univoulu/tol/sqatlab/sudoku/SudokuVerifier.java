  package org.univoulu.tol.sqatlab.sudoku;

import java.util.Arrays;

import javafx.util.converter.NumberStringConverter;

public class SudokuVerifier {

	public int verify(String candidateSolution) {
		if (!verify_numberic(candidateSolution)){
			return -1;
		}else if(!get_gird_result(candidateSolution)){
			return -2;
		}else if(!get_row_result(candidateSolution)){
			return -3;
		}else if(!get_column_result(candidateSolution)){
			return -4;
		}else{
			return 0;
		}
		
	}
	
	public boolean verify_numberic(String candidateSolution){
		for(int i = 0;i<candidateSolution.length();i++){
			if(!isNumeric(Character.toString(candidateSolution.charAt(i)))){
				return false;
			}
		}
		return true;
	}
	
	public boolean isNumeric(String str)  
	{  
	  try  
	  {  
	    int d = Integer.parseInt(str);  
	  }catch(NumberFormatException nfe){  
	    return false;  
	  }  
	  return true;  
	}
	
	/**
	 *  1-9 only appear only once in the string
	 * @param nums
	 * @return boolean 
	 */
	public boolean verify_unique(int[] nums){
		int num[] = {0,0,0,0,0,0,0,0,0};
		
		if(nums.length != 9){
			return false;
		}
		
		for(int i = 0;i<9;i++){

			// how to convert char to int?
			int x = nums[i] - 1 - 48;

			if(num[x] == 1){
				return false;
			}else{
				num[x] =1;
			}
		}
		return true;
	}
	
	
	public boolean get_column_result(String nums){
		int[] line_nums = new int[9];
		
		for(int i=0;i<9;i++){
			for(int j=0;j<9;j++){
				line_nums[j] = nums.charAt(i*9+j);
				
			}
			if(!verify_unique(line_nums)){
				return false;
			}
		}
		
		return true;
	}
	
	
	public boolean get_row_result(String nums){
		int[] line_nums = new int[9];

		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				line_nums[j] = nums.charAt(j * 9 + i);
			}
			if (!verify_unique(line_nums)) {
				return false;
			}
		}

		return true;
	}
	
	public boolean get_gird_result(String nums){
		int[] line_nums = new int[9];


		for (int i=0;i<3;i++){
			for (int m = 0; m < 3; m++) {
				for(int n =0;n<3;n++){
					line_nums[3 * m + n] = nums.charAt(9 * m + n + 3 * i);
				}
			}

			if (!verify_unique(line_nums)) {
				return false;
			}
		}
		
		String newNums = nums.substring(26);
		if(get_gird_result(newNums)){
			return false;
		}

		

		return true;
	}
	
 
}
