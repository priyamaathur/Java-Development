interface Animal {
    int eyes = 2; // by default public, static and final
    public void walk(); // by default public and abstract
    
}
//multiple inheritance bhi kr skte hai interfaces ke through
interface Herbivore {
    void eatPlants();
}

class Horse implements Animal, Herbivore {
    public void walk() { //yaha pe public likhna hi padega 
        System.out.println("Walks on 4 legs");
    }
    public void eatPlants() {
        System.out.println("Eats plants");
    }
}


public class Interface {
   public static void main(String[] args) {
       Horse horse = new Horse();
       horse.walk();
         horse.eatPlants();
   } 
}
