/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendingmachine;

import java.util.Scanner;

/**
 *
 * @author Jason
 */
public class Main {
    
    public static void main(String[] args) {
        
        
        boolean quit = false;
        
        
VendingMachine v = new VendingMachine(3, 3);
Scanner s = new Scanner(System.in);
while(!quit){
    System.out.println("Quit? Y/N");
    String response = s.next();
    if(response.equalsIgnoreCase("y")){
        quit = true;
    }
    System.out.println(v);
    v.pickCandy();
}

        }
    
}
