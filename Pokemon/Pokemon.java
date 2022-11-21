package Pokemon;

import java.util.Scanner;

class Pokemon {
    // Classes are blueprint for objects

    // Properties or Attributes

    String name;
    protected int HP;


    // Constructor: A method that has the same name as the class

    // Since HP is a private variable, we need methods within the
    // class to access and update the variable

    /* 
    public Pokemon2(String name, String element){
        this.name = "bulbasaur";
        this.HP = 10;               // All pokemon will havea default of 10 hp

    }
    */

    // Methods
    void talk(){
        System.out.println(this.name + " says " + this.name);
    }
    // Any change up in the tree will flow down the branches

    String getName(){
        return this.name;
    }

    void setName(String name){
        this.name = name;
    }

    int getHP(){
        return this.HP;
    }
    void setHP(int HP){
        this.HP = HP;
    }
}