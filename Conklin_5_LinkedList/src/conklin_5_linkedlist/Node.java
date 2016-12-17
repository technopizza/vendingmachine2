/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conklin_5_linkedlist;

/**
 *
 * @author Jason
 */
public class Node {
    private String name;
    private String species;
    private String ability;
    private String strengthRating;
    private Node pointer;

    public Node(String name, String species, String ability, String strengthRating) {
        this.name = name;
        this.species = species;
        this.ability = ability;
        this.strengthRating = strengthRating;
    }

    public Node getPointer() {
        return pointer;
    }

    public void setPointer(Node pointer) {
        this.pointer = pointer;
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public String getAbility() {
        return ability;
    }

    public String getStrengthRating() {
        return strengthRating;
    }
    
    
}
