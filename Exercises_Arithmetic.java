import java.util.Scanner;

public class Exercises_Arithmetic extends Exercises_Trigonometry {
	public static Scanner input = new Scanner(System.in);

	public static void Arithmetic() {
	    System.out.println("Level: " + Topics.Arithmetic + "\n" + "\n");

	    //ToDo write all the integers as inputs
			
	System.out.println("Enter values of a and b to perform the equations below");
		
	System.out.println("b = 2 ");
	System.out.println("Result of a + b is 12");
	System.out.println("Result of a - b is 8");
	System.out.println("Result of a / b is 5");
	System.out.println("Result of a * b is 20"); 
			
			
		System.out.println("Enter first number : " );
		Double numri1 = input.nextDouble();
			
		System.out.println("Enter second number : ");
		Double numri2 = input.nextDouble();
		
		System.out.println("\n");

		
		double addition = numri1 + numri2;
		double substraction = numri1 - numri2;
		double division = numri1 / numri2;
		double multiplication = numri1 * numri2;
		double remainder = numri1 % numri2;
		
		
		System.out.println("Result of a + b is " + addition);
		System.out.println("Result of a - b is " + substraction);
		System.out.println("Result of a / b is " + division);
		System.out.println("Result of a * b is " + multiplication); 
		System.out.println("Remainder of a / b is " + remainder + "\n");


		String multiplicationNumbers = "1 2 3 4 5 6 7 8 9 10";
		
		System.out.println("Enter the number u want from multiplication "
				+ "table" + " it will be multiplied with the numbers below :) ");
		
		System.out.println(multiplicationNumbers);
		
		
		int Number = input.nextInt();
		
		
		for(int i = 0 ;i <10; i++) {
			System.out.println(Number + " x " + (i+1) + " = " + (Number * (i+1)));
		}
			
			
		System.out.println();
		String first = "(1^4 / 1^3)*3";
		System.out.println("Simplify: " + first );
		StringBuilder printer = new StringBuilder();
		System.out.println("Do u want to eneter new digits instead of inital(Yes/No) ?");
		System.out.println();
		
		
		Scanner input = new Scanner(System.in);
		String questionMode = input.nextLine().toUpperCase();
		
		if("YES".equals(questionMode)) {
			simplifying();
		}
		else if("NO".equals(questionMode)) {
			System.out.println("The expression simplifies to (1 / 1) * 3, which is equal to 3");
			
		}
		
		System.out.println();
        System.out.println("How to solve the inequality: -3x + 4 < -8");
		
		printer.append("Do you want to enter new numbers instead of inital(Yes/No) ? ");		
		System.out.println(printer);
		String questionMode2 = input.nextLine().toUpperCase();
		 if("YES".equals(questionMode2)) {
		InequalitySolver();	 
			
		}
		 else if("NO".equals(questionMode2)) {
			 System.out.println("Add 8 to both sides of the inequality to cancel out the constant -8 on the right side:"
					 + "-3x + 4 + 8 < -8 + 8");
			 System.out.println("Simplify: " + "-3x + 12 < 0");
			 System.out.println("Subtract 12 from both sides of the"
					 + " inequality to cancel out the constant 12 on"
					 + " the right side: " + " -3x + 12 - 12 < 0 - 12");
			 System.out.println("Simplify: " + "-3x < -12");
			 System.out.println("Final Answer: " + "x > 4");
		 }			
		}	

		public static void InequalitySolver() {
		        Scanner input = new Scanner(System.in);

		       System.out.println("Enter the value of first Digit(-3): ");
		        double three = input.nextDouble();

		        System.out.print("Enter the value of second Digit(4): ");
		        double four = input.nextDouble();

		        System.out.print("Enter the value of third Digit(-8): ");
		        double eight = input.nextDouble();

		        double x = (four - eight) / (-3 * three);
		        System.out.println("The solution to the inequality is x < " + x);
		    }


		
	
		private static void simplifying() {
			
			System.out.println("Please enter value of first Digit(1): ");
			Double firstDigit = input.nextDouble();
			
			System.out.println("Please enter value of second Digit(4): ");
			Double secondDigit = input.nextDouble();
			
			System.out.println("Please enter value of third Digit(3): ");
			Double thirdDigit = input.nextDouble();
			
			System.out.println("Please enter value of last Digit(3): ");
			Double fourthDigit = input.nextDouble();
			
			
			System.out.println("Please enter value of third digit(4): ");
			System.out.println(firstDigit + "^4 /" + firstDigit + "^3)*3");
			Double firstPart = Math.pow(firstDigit, secondDigit);
			Double secondPart = Math.pow(firstDigit, thirdDigit);
			Double thirdPart = firstPart / secondPart;
			Double fourthPart = thirdPart * fourthDigit;
			System.out.println(firstPart / secondPart);
			System.out.println(Math.pow(firstDigit , secondDigit) / Math.pow(firstDigit,thirdDigit));
			System.out.println("Answers is: "); // firstPart + secondPart + thirdPart + fourthPart);
			System.out.println(firstDigit + "^" + 4 + " = " + (firstPart));
			System.out.println(firstDigit + "^" + 3 + " = " + secondPart);
			System.out.println((firstPart) + " / " + (secondPart) + " = " + thirdPart);
			System.out.println(thirdPart + " * " + 3 + " = " + fourthPart);
			System.out.println(fourthPart);
		
		
	}

}
/**
 * \b (backspace)
\t (tab)
\n (newline)
\f (form feed)
\r (carriage return)
\" (double quote)
\' (single quote)
\\ (backslash)
Alt + shift maje edhe tdel tabela
;
 */

