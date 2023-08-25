package bookProblems;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Prob {

	public static void main(String[] args) {
		Prob prob = new Prob();
		prob.menu();

	}
	public void menu() {
	    boolean tryChoice = true;
	    
	    do {
	        try {
	            int choice = 0;
	            Scanner scan = new Scanner(System.in);
	            System.out.println("********************************************************************");
	            System.out.println("                              Main Menu                             ");
	            System.out.println("1. Adding three numbers");
	            System.out.println("2. Area of Circle");
	            System.out.println("3. Area of Triangle");
	            System.out.println("4. Average of 5 quizzes");
	            System.out.println("5. Arithmetic Operations");
	            System.out.println("6. Armstrong Number");
	            System.out.println("7. Currency Counter");
	            System.out.println("8. Decimal to Binary");
	            System.out.println("9. Factorial Number");
	            System.out.println("10. Fahrenheit to Celcius");
	            System.out.println("11. Inch to Centimeter Calculator");
	            System.out.println("12. LCM Calculator");
	            System.out.println("13. Miles to Kilomters Calculator");
	            System.out.print("Enter your choice: ");
	            choice = scan.nextInt();

	            switch (choice) {
	                case 1:
	                    addThreeNum();
	                    break;
	                case 2:
	                    areaOfCircle();
	                    break;
	                case 3:
	                    areaofTriangle();
	                    break;
	                case 4:
	                    avgQuiz();
	                    break;
	                case 5:
	                    arithmeticOperation();
	                    break;
	                case 6:
	                    armStrong();
	                    break;
	                case 7:
	                	 moneyBill();
	                	 break;
	                case 8:
	                	decimalToBinary();
	                	break;
	                case 9:
	                	factorialNumber();
	                	break;
	                case 10: 
	                	fahToCel();
	                	break;
	                case 11:
	                	inchToCentims();
	                	break;
	                case 12:
	                	LCM();
	                	break;
	                default:
	                    System.out.println("Invalid choice");
	            }

	            tryChoice = tryAgain();
	        } catch (InputMismatchException Iex) {
	            System.out.println("Input mismatch. Please enter a valid choice.");
	            tryChoice = tryAgain();
	        }
	    } while (tryChoice);
	}

	
	public boolean tryAgain() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Do you want to try again?[Y/N]");
		String choice = scan.nextLine();
		
		if(choice.equalsIgnoreCase("Y")) {
				return true;
		}else {
				return false;
		}
	}
	
	public void addThreeNum() {
		/*
		 Problem no 1.
		 Write a program in java that will ask the user to input three numbers and then the program will find the total sum of 
		 three numbers given by the user.
		 */
		//Declaration(Local Variable) 
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		int [] arrNum = new int[3];
		
		//Input
		System.out.println("Enter three numbers: ");
		for(int i = 0; i<3; i++) {
			arrNum[i] = scan.nextInt();
		}
		//Process
		for(int i = 0; i<3; i++) {
			sum += arrNum[i];
		}
		System.out.println("The sum of the three numbers is: " + " " + String.valueOf(sum));
	}
	public void areaOfCircle() {
		/*
		 Problem No 2
			Write a program in java that will compute the area of the circle. 
			Use the formula: Area = ? r2 where Pi(?) is approximately to 3.1416.
		 */
		Scanner scan = new Scanner(System.in);
		int radius = 0;
		final double pi = 3.1416;
		double area = 0.0;
		
		System.out.print("Enter radius: ");
		radius = scan.nextInt();
		area = pi * radius * radius;
		System.out.println("The Area of the circle with a given radius of " + " " + String.valueOf(radius) + 
				" is " + String.valueOf(area));
	}
	public void areaofTriangle(){
		/* Problem No. 3
			Write a program in Java that will find the area of the triangle. 
			Using this formula area = (base * height) / 2
		 */
		Scanner scan = new Scanner(System.in);
		int base = 0, height = 0,area = 0;
		try {
			System.out.print("Enter the base: ");
			base = scan.nextInt();
			System.out.print("Enter the height: ");
			height = scan.nextInt();
			area = (base * height) / 2;
			System.out.println("Given: ");
			System.out.println("Base: " + String.valueOf(base));
			System.out.println("Height: " + String.valueOf(height));
			System.out.println("The area of triangle is : " + String.valueOf(area));
		} catch(InputMismatchException e) {
			System.out.println("Input should be a number");
		  }
		  catch(ArithmeticException e) {
			System.out.println("Cannot divide by 0");
		  }
	}
	public void avgQuiz() {
		Scanner scan = new Scanner(System.in);
		int arrQuiz[] = new int[5];
		int sum = 0; 
		double avg = 0.0;
		
		for(int i = 0; i < 5; i++) {
			System.out.print("Enter your Quiz#" + (i + 1) + ": ");
			arrQuiz[i] = scan.nextInt();
		}
		
		for(int i = 0; i < 5; i++) {
			sum += arrQuiz[i];
		}
		
		avg =(double)sum / (double)5;
		
		System.out.println("*******************");
		System.out.println("       Scores      ");
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Quiz #" + (i+1) + ": " + String.valueOf(arrQuiz[i]));
		}
		System.out.println("Your average score is: " + String.valueOf(avg));
		System.out.println("*******************");
		
	}
	public void arithmeticOperation() {
		/*
		  Problem No. 5
		  Write a program in Java that computes the sum, difference, 
		  product, and quotient of two given numbers by the user.
		 */
		Scanner scan = new Scanner(System.in);
		int firstNum = 0, secondNum = 0, sum = 0, product = 0, difference = 0;
		double quotient = 0.0;
		
		System.out.print("Enter first number: ");
		firstNum = scan.nextInt();
		System.out.print("Enter second number");
		secondNum = scan.nextInt();
		sum = firstNum + secondNum;
		difference = firstNum - secondNum;
		product = firstNum * secondNum;
		quotient = (double)firstNum / (double)secondNum;
		
		System.out.println("***************");
		System.out.println("First Number: " + " " + String.valueOf(firstNum));
		System.out.println("Second Number: " + " " + String.valueOf(secondNum));
		System.out.println("Sum: " + " " + String.valueOf(sum));
		System.out.println("Difference: " + " " + String.valueOf(difference));
		System.out.println("Product: " + " " + String.valueOf(product));
		System.out.println("Quotient: " + " " + String.valueOf(quotient));
		System.out.println("***************");
	}
	public void armStrong() {
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();
	        
	        
	        if (isArmstrongNumber(number)) {
	            System.out.println(number + " is an Armstrong number.");
	        } else {
	            System.out.println(number + " is not an Armstrong number.");
	        }
	}
	public boolean isArmstrongNumber(int number) {
        int originalNumber = number;
        int sum = 0;
        int digits = countDigits(number);
        
        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, digits);
            number /= 10;
        }
        
        return sum == originalNumber;
    }
    
    public int countDigits(int number) {
        int count = 0;
        while (number > 0) {
            count++;
            number /= 10;
        }
        return count;
    }
    public void moneyBill() {
    	/*
    	 Problem No. 7
			Write a program in Java that counts the number of currency bills in a given amount from the user. 
			Let's say, how many 1000 bills in Php 10,000 equals to 1000 bills, 500 we have 20 500 bills in 10,000 bills,
			200 bills we have 50 200 bills in 10,000 pesos and lastly 100 we have 100 bills of php 100 is 10000.
    	 */
    	Scanner input = new Scanner(System.in);
    	int money = 0,outputOneKBill = 0,outputfiveHundredBill = 0,outputtwoHundredBill = 0,outputOneHundredBill = 0;
    	final int oneHundredBill = 100, twoHundredBill = 200, fiveHundredBill = 500, oneKBill = 1000;
    	
    	System.out.print("Enter the amount of money: ");
    	money = input.nextInt();
    	
    	outputOneKBill = money / oneKBill;
    	outputfiveHundredBill = money / fiveHundredBill;
    	outputtwoHundredBill = money / twoHundredBill; 
    	outputOneHundredBill = money / oneHundredBill;
    	
    	System.out.println("******************************");
    	System.out.println("Amount: " + String.valueOf(money));
    	System.out.println("1000 bill: " + String.valueOf(outputOneKBill));
    	System.out.println("500 bill: " + String.valueOf(outputfiveHundredBill));
    	System.out.println("200 bill: " + String.valueOf(outputtwoHundredBill));
    	System.out.println("100 bill: " + String.valueOf(outputOneHundredBill));
    }
    public void decimalToBinary() {
    	/*
    	 Problem No. 8
		 Write a program in Java that will convert decimal number into its binary number equivalent.
    	 */
    	Scanner input = new Scanner(System.in);
    	int decNum = 0, remainder = 0;
    	StringBuilder binaryRepresentation = new StringBuilder();
    	
    	System.out.print("Enter a decimal number: ");
    	decNum = input.nextInt();
    	while(decNum > 0) {
    		remainder = decNum % 2;
    		binaryRepresentation.append(remainder);
    		decNum /= 2;
    	}
    	binaryRepresentation.reverse();
    	System.out.println("In its binary value: " + String.valueOf(binaryRepresentation));
    }
    public void factorialNumber() {
    	/*
 	Problem No. 9 Write a program in Java that will compute the factorial value of a given number.
  	For example, the factorial of 4 is 4! = 1 * 2 * 3 * 4 = 24
    	 */
    	Scanner input = new Scanner(System.in);
    	
    	System.out.println("Factorial Number");
    	System.out.println("Enter a number:");
    	int factorialNum = input.nextInt(), result = 1;
    	
    	for(int i = factorialNum; i > 0; i--) {
    		result = result * i;
    	}
    	System.out.println("Answer: " + String.valueOf(result));
    }
    public void fahToCel() {
    	/*
    	 Problem No. 10 
			Write a program in Java that converts the input Fahrenheit into its equivalent Celcius temperature degrees. 
			Use the following formula: C=(F-32) * 5/9
    	 */
    	Scanner input = new Scanner(System.in);
    	double fah = 0.0;
    	
    	System.out.print("Enter fahrenheit: ");
    	fah = input.nextDouble();
    	
    	double cel =(fah-32) * 5/9;
    	
    	System.out.println("Celcius: " + String.valueOf(cel));
    }
    public void inchToCentims() {
    	/*
    	 Problem No. 11
		 Write a program in Java that converts the input value given by the user in inches to its centimeters. 
		 One inch is equivalent to 2.54 cms
    	 */
    	Scanner input = new Scanner(System.in);
    	double inch = 0.0;
    	final double cm = 2.54;
    	System.out.println("Inch to Centimeters converter");
    	System.out.println("Enter a value in inch");
    	inch = input.nextDouble();
    	
    	double centimeter = inch * cm;
    	System.out.println("Centimeters: " + String.valueOf(centimeter));
    }
    
    public void LCM() {
    	/* Problem No. 12
		   Write a program in Java to find the least common multiple(LCM) of a number.
    	*/
    	 Scanner scanner = new Scanner(System.in);

         System.out.print("Enter the first number: ");
         int num1 = scanner.nextInt();

         System.out.print("Enter the second number: ");
         int num2 = scanner.nextInt();

         int result = lcm(num1, num2);
         System.out.println("LCM of " + num1 + " and " + num2 + " is: " + result);
    }
    
    public  int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
    
    public int gcd(int a, int b) {
    	 if (b == 0) {
             return a;
         }
         return gcd(b, a % b);
    }
    
    public void milestoKm() {
    	Scanner input = new Scanner(System.in);
    	
    }

}//END OF CLASS



