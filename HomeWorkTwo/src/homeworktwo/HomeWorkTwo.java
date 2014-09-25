/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homeworktwo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Wesley Turner-Harris
 */
public class HomeWorkTwo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String retStr;
        String oddNum = "";
        int tmpInt, sum, min, max;
        float avg;
        ArrayList retInt = new ArrayList();
        
        System.out.println("What is your name?");
        retStr = kb.nextLine();
        System.out.printf("Your name in uppercase: %s%n"
            + "Your name in lowercase: %s%n"
            + "That was fun! Your name has %d characters, "
            + "not including spaces.%n", 
            retStr.toUpperCase(), 
            retStr.toLowerCase(), 
            retStr.replace(" ", "").length() 
        );
        System.out.println("Now, let's do some number stuff.\n"
                + "Give five numbers, and press enter after each one.");
        for( int i = 0; i < 5; i++ ){
            // store tmp num
            tmpInt = kb.nextInt();
            
            // add even numbers to the list
            if ( tmpInt % 2 == 0 ) 
                retInt.add(tmpInt);

            // show all odd numbers horizontally with a '\' in between
            else 
                oddNum += (oddNum.length()>0&&i>0?"\\":"") + tmpInt;
        }
        
        if (oddNum.length() > 0)
            System.out.printf("Here are your odd numbers: %n%s%n", oddNum);
        
        // init ints
        sum = 0;

        // sort arraylist
        Collections.sort(retInt);
        
        // get sum of even numbers
        for (Object num : retInt) {
            sum += (int) num;
        }

        // find min, max, avg of even numbers
        avg = (float)sum / retInt.size();
        min = (int)retInt.get(0);
        max = (int)retInt.get(retInt.size() - 1);
        System.out.printf("So let's see. For all the even numbers, %n"
                + "the min is %d, the max is %d, the average is %.2f,%n"
                + "and the sum is %d.%n", min, max, avg, sum);
    }
    
}
