package Pokemon;

class Pokemon {
    // Classes are a blueprint used
    // to build objects

    // Attributes
    String name;
    String type;
    double gen;
    String cry;
    // Constructor
    /*
     * Constructors are methods
     * that are named the same
     * as the class.
     * 
     * They are used to initialize/instantiate
     * the object 
     */
    public Pokemon(){
        // When we create this pokemon
        // we will give it default values
        // for its attributes using
        // the keywoard "this"

        /*
         * Class example
         * this.name = "charmander;
         * this.type = "fire";
         * this.gen = 1.0;
         * this.cry = "rawr";
         */

        this.name = "lucario";
        this.type = "fighting";
        this.gen = 4.0;
        this.cry = "#beaggresive";
    }
    // Methods
    void talk() {
        System.out.println(this.name + " says get shit on sucker " + this.cry);
    }
    void setSound(String cry) {
        this.cry = cry;
    } 
}
