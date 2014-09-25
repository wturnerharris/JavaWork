package mainprojects;

import java.util.Scanner;

public class AddVars {

	public static void main(String[] args) {
		int num1, num2, num3;

		if ( args.length > 0 ) {
                    Scanner sc = new Scanner(System.in);
                    num1 = sc.nextInt();
                    num2 = sc.nextInt();
                    
                    switch (args[0]){
                        case "add": 
                            num3 = num1+num2;
                            System.out.println("The sum of "+num1+" and "+num2+" equals "+num3);
                            break;
                        case "subtract": 
                            num3 = num1-num2;
                            System.out.println("The difference of "+num1+" minus "+num2+" equals "+num3);
                            break;
                        case "multiply":
                            num3 = num1*num2;
                            System.out.println("The product of "+num1+" times "+num2+" equals "+num3);
                            break;
                        case "divide":
                            float num4 = (float)num1/num2;
                            System.out.println("The dividend of "+num1+" over "+num2+" equals "+num4);
                            break;
                        default:
                            System.out.println("We don't have a case for "+args[0]+". Please try again.");
                            System.exit(0);
                    } 
		} else {
                    System.out.println("Oops! You forgot to specify an operation.");
                    System.exit(0);
                }

        }

}