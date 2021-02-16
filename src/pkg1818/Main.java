/*
 * Project: Java 2 Programming exercise 18.18
 * Name: Lauren Smith
 * Date: 2/15/21
 * Description: Calculates and displays number of moves to move specified number 
 * of disks from tower a to b in the Hanoi Tower using a recursive method
 */
package pkg1818;

import java.util.Scanner;


public class Main {
    //makes static variable to count number of moves. inits to 0 
    static int moves=0; 
   
    public static void main(String[] args) {
        //makes a scanner object to read in number of disks 
        Scanner input=new Scanner(System.in); 
        //asks the user to input the number of disks 
        System.out.println("Enter number of disks: ");
        //saves discs to var num 
        int num=input.nextInt(); 
        //runs recursive moveDisks method with the inputted number of disks 
        moveDisks(num);
        //prints out the number of moves needed to move number of disks from tower a 
        //to tower b 
        System.out.println("Number of moves needed to move "+num+" disks from "
                + "tower A to tower B is: "+moves);
    }
    
    //recursive method that moves disks from tower a to tower b 
    public static void moveDisks(int n) 
    {
        //every time method is called it's a new move so increment move variable
        moves++; 
        //if n==1, base case means all are moved so just return 
        if(n==1) 
        {
            return; 
        } 
        //else not all disks are moved 
        else 
        {
            //move the disks and decrement n since that one disks moved to other tower
            moveDisks(n-1); 
            //repeat to do other needed movement to move disks from one tower to the next
            moveDisks(n-1); 
        }
    }
    
}
