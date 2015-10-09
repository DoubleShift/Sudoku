package org.univoulu.tol.sqatlab.sudoku;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSudokuVerifier {

	@Test
	public void testValid() {
		SudokuVerifier sudo = new SudokuVerifier();
		//correct
		assertEquals(0,sudo.verify("417369825632158947958724316825437169791586432346912758289643571573291684164875293"));
			
	}
	@Test
	public void testRule1() {
		SudokuVerifier sudo = new SudokuVerifier();
		
		//incorrect Rules 1: positive digits
		assertEquals(-1,sudo.verify("-12345112345678891234567789123456678912345567891234456789123345678912234567891"));
		
	}	
	
	@Test
	public void testRule2() {
		SudokuVerifier sudo = new SudokuVerifier();
				//incorrect Rules 2: repeat in a gird
		assertEquals(-2,sudo.verify("12345112345678891234567789123456678912345567891234456789123345678912234567891"));
		
		
	}	
	
	@Test
	public void testRule3() {
		SudokuVerifier sudo = new SudokuVerifier();
			
		//incorrect Rules 3: repeat in a row
		assertEquals(-3,sudo.verify("271985436564213789893674512915428673642739851738156924326597148487361295159842361"));

				
	}	
	
	@Test
	public void testRule4() {
		SudokuVerifier sudo = new SudokuVerifier();
	
		//incorrect Rules 4: repeat in a columns
		// I can't find any testcase for this Rules
		assertEquals(0,sudo.verify("417369825632158947958724316825437169791586432346912758289643571573291684164875293"));		
	}
}
