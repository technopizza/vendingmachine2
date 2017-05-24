/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendingmachine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Jason
 */
public class VendingMachine {

    /**
     * @param args the command line arguments
     */
    Candy[][] vendingMachineStock;

    public VendingMachine(int row, int col){
       
      vendingMachineStock = new Candy[row][col];
        
            vendingMachineStock[0][0] = new Candy("Snickers", TypeOfCandy.CHOCOLATE, 215, .98f, ((int)((Math.random() * 20) + 1)));  
        
        
            vendingMachineStock[0][1] = new Candy("Fruit Roll-up", TypeOfCandy.FRUITY, 50, .49f, ((int)((Math.random() * 20) + 1)));  
       
       
            vendingMachineStock[0][2] = new Candy("Generic Chocolate Candy", TypeOfCandy.CHOCOLATE, 50, 1.00f, ((int)((Math.random() * 20) + 1)));
            vendingMachineStock[1][0] = new Candy("Kit-Kat", TypeOfCandy.WAFER, 215, 1.00f, ((int)((Math.random() * 20) + 1)));  
        
            vendingMachineStock[1][1] = new Candy("M&M's", TypeOfCandy.CHOCOLATE, 50, 1.00f, ((int)((Math.random() * 20) + 1)));  
        
            vendingMachineStock[1][2] = new Candy("Generic Gummy Candy", TypeOfCandy.GUMMY, 50, 1.00f, ((int)((Math.random() * 20) + 1)));
        
            vendingMachineStock[2][0] = new Candy("Twix", TypeOfCandy.CHOCOLATE, 215, 1.00f, ((int)((Math.random() * 20) + 1)));  
        
            vendingMachineStock[2][1]= new Candy("Rasins", TypeOfCandy.FRUITY, 50, .69f, ((int)((Math.random() * 20) + 1)));  
            vendingMachineStock[2][2]=new Candy("Reese's Cups", TypeOfCandy.CHOCOLATE, 50, 1.00f, ((int)((Math.random() * 20) + 1)));
        }
        
        public void pickCandy(){
            Candy c = chooseCandy();
            
            if(c.getAmount() > 0){
                c.decrement();
                System.out.println(c);
                
            }
            else{
                System.out.println("There are no more " + c.getName() +"s left!\n Try something else.");
            }
        }
    
    
    
    public Candy chooseCandy(){
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> coordLetters = new HashMap<String, Integer>();
        coordLetters.put("A", 0);
        coordLetters.put("B", 1);
        coordLetters.put("C", 2);
        
        System.out.println("Row:");
        int inputInt = scanner.nextInt() - 1;
        System.out.println("Col:");
        String inputStr = scanner.next().toUpperCase();
        System.out.println("\n(" + (inputInt + 1)+ ", " + inputStr + ")");
        
        
               
        return vendingMachineStock[inputInt][coordLetters.get(inputStr)];
    }
    
    
    
    public String toString(){

        String output = "   A                     B                    C           \n";
            for (int i = 0; i < vendingMachineStock.length; i++) {
            output += (1 + i) + "  ";
            for (int j = 0; j < vendingMachineStock[i].length; j++) {
                
                    output += vendingMachineStock[i][j].getName();
                
                output += "     ";
            }
            output += "\n";
            
        }
        
        return output;
    }
    
}
