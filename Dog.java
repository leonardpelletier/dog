class Dog {
    
    //There are three components to every OOP class
    //#1: Instance Variables: this represents the data that each instance
    //                        keeps track of.
    private String name;
    private String noise;
    private int age;
    
    //#2: Constructor(s): this is a special method that initializes the
    //                    the instance variables. Naming Rules: must match
    //                    the name of the class, it must be public, and
    //                    there is no return type specified.
    public Dog() {  //Default constructor - no parameters
        name = "Dawg";
        noise = "Woof!";
        age = 0;
    }
    
    //We can make more than one constructor, and this is called "Overloading"
    public Dog(String title, String sound, int years) {
        name = title;
        noise = sound;
        age = years;
    }
    
    
    //#3 Behaviour Method(s): methods that define what an instance of this
    //                        class can do. Usually the name is a verb.
    public void bark() {
        System.out.println(noise);
    }
    
}