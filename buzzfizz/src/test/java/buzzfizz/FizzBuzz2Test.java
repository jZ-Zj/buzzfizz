package buzzfizz;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

public class FizzBuzz2Test {

	@Test
	public void testMain() {
		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();  
		System.setOut(new PrintStream(outContent));
		FizzBuzz2.main(new String[]{});		
		StringBuffer actual = new StringBuffer();
		actual.append("12Fizz4BuzzFizz78FizzBuzz11FizzFizz14FizzBuzz1617Fizz19BuzzFizz22FizzFizzBuzz26Fizz2829FizzBuzzFizzFizzFizzFizzFizzBuzzFizzFizzFizzFizzBuzz41FizzFizz44FizzBuzz4647Fizz49");
		actual.append("BuzzFizzBuzzBuzzFizzBuzzFizzBuzzBuzzBuzzFizzBuzzBuzzBuzzFizzBuzz6162Fizz64BuzzFizz6768FizzBuzz71FizzFizz74FizzBuzz7677Fizz79BuzzFizz82FizzFizzBuzz86Fizz8889FizzBuzz9192Fizz94BuzzFizz9798FizzBuzz");
		assertEquals(actual.toString(), outContent.toString());
	}

}
