package buzzfizz;

public class FizzBuzz {

	public static void main(String[] arg){
		
		Integer i = 1;
		while(i <= 100){
			if(printFizzBuzz(i)){
				System.out.print("FizzBuzz");
			}else if(printFizz(i)){
				System.out.print("Fizz");
			}else if(printBuzz(i)){
				System.out.print("Buzz");
			}else
				System.out.print(i);
			i++;
		}
	}
	
	private static boolean printFizz(int i){
		return ((i%3) == 0);
	}
	
	private static boolean printBuzz(int i){
		return ((i%5) == 0);
	}
	
	private static boolean printFizzBuzz(int i){
		return (printFizz(i) && printBuzz(i));
	}
}
