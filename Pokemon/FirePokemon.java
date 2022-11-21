package Pokemon;

class FirePokemon extends Pokemon {
    private String element;
    private String weakness;

    FirePokemon(String name){
        this.name = name;
        this.element = "fire";
        this.weakness = "water";
    }    
    void attack(){
        System.out.println(this.name + " uses fireblast");
    }
}
