package Pokemon;

class Main{
    public static void main(String[] args) {
        GrassPokemon myPokemon = new GrassPokemon("bulbasaur");
        System.out.println(myPokemon.name);
        System.out.println(myPokemon.HP);
        myPokemon.talk();
        myPokemon.attack();
        myPokemon.attack("tackle");

        /* 
        Pokemon2 starterPokemon = new Pokemon2("bulbasaur");
        starterPokemon.talk();
        starterPokemon.setHP(50);
        System.out.println(starterPokemon.getHP());

        //starterPokemon.populateAttackList();
        */
    }  
}
