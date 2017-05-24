/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendingmachine;

/**
 *
 * @author Jason
 */
public class Candy {
    private String name;
    private TypeOfCandy typeOfCandy;
    private int caloriesPerServing;
    private float price;
    private int amount;

    public Candy(String name, TypeOfCandy typeOfCandy, int caloriesPerServing, float price, int amount) {
        this.name = name;
        this.typeOfCandy = typeOfCandy;
        this.caloriesPerServing = caloriesPerServing;
        this.price = price;
        this.amount = amount;
    }

    
    
    
    public String getName() {
        return name;
    }

    public TypeOfCandy getTypeOfCandy() {
        return typeOfCandy;
    }

    public int getCaloriesPerServing() {
        return caloriesPerServing;
    }

    public float getPrice() {
        return price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void decrement() {
        amount--;
    }
    
    @Override
    public String toString() {
        return "______________" + "\nName: " + name + "\nType: " + typeOfCandy + "\nCalories per serving: " + caloriesPerServing + "\nPrice: $" + price + "\nAmount Left: " + amount;
    }
    
    
    
}
