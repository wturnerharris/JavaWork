/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mainprojects;

/**
 *
 * @author Class
 */
public class HelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        if ( args.length < 1 ) {
            System.out.println("You must specify a name, dummy!");
            System.exit(0);
        }
        System.out.println("Wassup, " + args[0] );
    }
}
