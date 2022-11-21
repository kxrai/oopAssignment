class javaReviewPart4 {

    // public static returnType methodName(parameterList)

    /*
     * Java Docstring
     * Adds three to any integer value
     * @param x any integer value
     * @return a number three greater than the input
     */
    public static int addThree(int x){
        x = x + 3;
        System.out.println(x);
        return x + 3;
    }

    public static void doubleNum(int x){
        // Since this method has NO return, it's returnType is void
        System.out.println(x * 2);
    }

    public static int printNum(int x){
        for (int i = 0; i < x; i++) {
            System.out.println(i);
            if (i == 3){
                return -1;
            }
        }
        return 0; 
    }
    public static void main(String[] args){

        // create a method that adds three to any number
        // System.out.println("Hello World!");
        // System.out.println(addThree(5));
        // doubleNum(10);
        // System.out.println(printNum(2));
        
        int x = 5;
        System.out.println(x);
        addThree(x);
        System.out.println(x);



    }
}
