class DogDriver {
    public static void main(String[] args) {
        //Making Dog variables (non-primitives)
        Dog d1;
        Dog d2;
        
        //Create dogs! Behold, instantation!
        d1 = new Dog(); //using the constructor
        d2 = new Dog("LuckyRufus", "Rawr", 10);
        
        d1.bark();
        d2.bark();
    }
}