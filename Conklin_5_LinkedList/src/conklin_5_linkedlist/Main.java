/*******************************************************************************
* Filename: Main.java
* 
* Author: Conklin, Jason Date: December 16, 2016
* 
* Description: Main class used for interactive user interface loop
*           
* Input: Node, LinkedList
* 
* Output: Console
*******************************************************************************/
package conklin_5_linkedlist;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //initial 5 nodes
        Node head = new Node("Darth_Vader", "Human", "The Force", "2");
        Node node1 = new Node("Smaug", "Dragon", "Breathes Fire", "4");
        Node node2 = new Node("Spiderman", "Human", "Shoots Webs", "3");
        Node node3 = new Node("Kaa", "Snake", "Hypnotic Gaze", "1");
        Node node4 = new Node("Galactus", "Cosmic Entity", "Consumes Planets ", "5");
        Node tail = null;

        head.setPointer(node1);
        node1.setPointer(node2);
        node2.setPointer(node3);
        node3.setPointer(node4);
        node4.setPointer(tail);

        Scanner scanner = new Scanner(System.in);
        LinkedList linkedList = new LinkedList(head);
        String userChoice, tmpName, tmpSpecies, tmpAbility, tmpStrengthRating;
        boolean exit = false;
        do {
            
            linkedList.printContents();

            System.out.println("\n1. Add a hero to the front of the Linked List");
            System.out.println("2. Remove a hero from the front of the Linked List");
            System.out.println("3. Remove a hero from the back of the Linked List");
            System.out.println("4. Exit\n");
            
            userChoice = scanner.next().trim().toLowerCase();
            
            //menu
            
            if (userChoice.equals("1")) {
                System.out.println("\nPlease enter a name:");
                tmpName = scanner.next();
                System.out.println("\nPlease enter a species:");
                tmpSpecies = scanner.next();
                System.out.println("\nPlease enter an ability:");
                tmpAbility = scanner.next();
                System.out.println("\nPlease enter a strength rating:");
                tmpStrengthRating = scanner.next();
                linkedList.addNodeFront(new Node(tmpName, tmpSpecies, tmpAbility, tmpStrengthRating));
            }
            else if (userChoice.equals("2")){
                linkedList.removeNodeFront();
            }
            else if (userChoice.equals("3")){
                linkedList.removeNodeBack();
            }
            else if (userChoice.equals("4")){
                exit = true;
            }
            else{
                System.out.println("Bad Input.");
            }

            for (int i = 0; i < 100; i++) {
                System.out.println("");
            }
            
        } while (!exit);

    }

}
