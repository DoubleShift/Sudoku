package org.univoulu.tol.sqatlab.sudoku;

import static org.junit.Assert.assertEquals;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SudokuVerifier sudo = new SudokuVerifier();
		//correct
		System.out.println(sudo.verify("417369825632158947958724316825437169791586432346912758289643571573291684164875293"));
		
		//incorrect Rules 1: positive digits
		System.out.println(sudo.verify("-12345112345678891234567789123456678912345567891234456789123345678912234567891"));
		
		//incorrect Rules 2: repeat in a gird
		System.out.println(sudo.verify("12345112345678891234567789123456678912345567891234456789123345678912234567891"));
		
		//incorrect Rules 3: repeat in a row
		System.out.println(sudo.verify("271985436564213789893674512915428673642739851738156924326597148487361295159842361"));

		//incorrect Rules 4: repeat in a jcoumns
		System.out.println(sudo.verify("417369825632158947958724316825437169791586432346912758289643571573291684164875293"));		
		
	}

}
