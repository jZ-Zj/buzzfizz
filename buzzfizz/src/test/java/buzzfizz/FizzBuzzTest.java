package buzzfizz;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

public class FizzBuzzTest {

	@Test
	public void testMain() {
		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();  
		System.setOut(new PrintStream(outContent));
		FizzBuzz.main(new String[]{});		
		StringBuffer actual = new StringBuffer();
		actual.append("12Fizz4BuzzFizz78FizzBuzz11Fizz1314FizzBuzz1617Fizz19BuzzFizz2223FizzBuzz26Fizz2829FizzBuzz3132Fizz34BuzzFizz3738FizzBuzz41Fizz4344FizzBuzz4647Fizz49");
		actual.append("BuzzFizz5253FizzBuzz56Fizz5859FizzBuzz6162Fizz64BuzzFizz6768FizzBuzz71Fizz7374FizzBuzz7677Fizz79BuzzFizz8283FizzBuzz86Fizz8889FizzBuzz9192Fizz94BuzzFizz9798FizzBuzz");
		assertEquals(actual.toString(), outContent.toString());
	}

}
