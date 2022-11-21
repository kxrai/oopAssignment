package Pokemon;

class GrassPokemon extends Pokemon {
    private String element;
    private String weakness;

    GrassPokemon(String name){
        this.name = name;
        this.element = "grass";
        this.weakness = "fire";
    }    
    void attack(){
        System.out.println(this.name + " uses solarbeam");
    }
    void attack(String atk){
        System.out.println(this.name + " uses " + atk);
    }
    void attack(int num){
        System.out.println(this.name + " uses attackList[num]");
    }
}
