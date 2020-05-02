package assignment;

import java.util.Scanner;

public class calculatorPgm  {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        boolean i=true;
        while(i) {
        	System.out.print("Enter two numbers: ");
        	// nextDouble() reads the next double from the keyboard
        	double first = reader.nextDouble();
        	double second = reader.nextDouble();

        	System.out.print("Enter an operator (+, -, *, /): ");
        	char operator = reader.next().charAt(0);
        	double result;
        	switch(operator)
        	{
            	case '+':result=add(first,operator,second);
            			 break;

            	case '-':result=sub(first,operator,second);
            			 break;

            	case '*':result=mul(first,operator,second);
            			 break;

            	case '/':result=div(first,operator,second);
            			 break;

            // operator doesn't match any case constant (+, -, *, /)
            	default:
            		System.out.printf("Error! operator is not correct");
            		return;
        	}
        	System.out.printf("%.1f %c %.1f = %.1f", first, operator, second, result);
        	System.out.println(" ");
        	System.out.println("enter f to end:");
        	char s=reader.next().charAt(0);
        	if(s=='f' || s=='F')
        		i=false;
        }
        
    }
    public static double add(double first,char operator,double second) {
    	double result=(first+second);
    	return result;
    }
    public static double sub(double first,char operator,double second) {
    	double result=(first-second);
    	return result;
    }
    public static double mul(double first,char operator,double second) {
    	double result=(first*second);
    	return result;
    }
    public static double div(double first,char operator,double second) {
    	double result=(first/second);
    	return result;
    }
	
}
