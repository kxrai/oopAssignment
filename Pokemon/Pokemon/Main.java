package Pokemon;

class Main {
    public static void main(String[] args) {
        Pokemon myPokemon = new Pokemon();
        print(myPokemon.name);
        myPokemon.talk();
        
        Pokemon otherPokemon = new Pokemon();
        otherPokemon.setSound("growl");
        print(otherPokemon.name);
        otherPokemon.talk();
    }
    public static void print(String x) {
        System.out.println(x);
    }
}