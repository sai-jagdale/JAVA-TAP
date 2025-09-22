class Animal{    // class animal created it is not main class
    int legs;
    String habitat;
    String type;

    public Animal(){      // consrtuctor for animal
        legs = 4;
        habitat = "Land";
        type="Carnivorous";
    }

    public Animal(int legs , String habitat , String type){     // constructor for animal
        this.legs=legs;
        this.habitat=habitat;
        this.type=type;
    }

    public void setlegs(int legs){        // getter setter since we need to get the legs in another class using super keyword
        this.legs=legs;
    }
    public int getlegs(){
        return legs;
    }

    @Override
    public String toString(){
        return ("Legs : "+legs+" "+"Habitat : "+habitat+" "+"Type : "+type);
    }

    public void walk(){     // walk function in animal class
        System.out.println("Animals walk on 4 legs.");  
    }
}

class Dog extends Animal{

    public void DogWalk(){   // dogwalk function in animal class
        System.out.println("Dog also walk on 4 legs");
    }

    public void AnimalWalk(){  // animalwalk function , using super keyword animal class function walk is called
        super.walk();
    }

    public void DogAnimalWalk(){    // to get the no. legs from animal class used super keyword and getter to get the value
        int getlegs = super.getlegs();
        System.out.println("Legs of dog : "+getlegs);
    }
}

public class Super {
    public static void main(String[] args) {
        Animal a3 = new Animal();
        System.out.println("-------------- called from animal class by animal object-------------");
        a3.walk();

        Animal a1 = new Animal(2, "water", "herbivorous");
        System.out.println("Animal 1 ; " +a1);

        Animal a2 = new Animal();
        System.out.println("Animal 2 : "+a2);

        Dog d1 = new Dog();
        System.out.println("-----------called from dog class by dog object-------------");
        d1.DogWalk();
        System.out.println("-----------called from dog class by dog object , using super keyword walk function called in class dog-------------");
        d1.AnimalWalk();
        System.out.println("-----------called from dog class by dog object , by using super keyword , using getlegs got the legs number from animal class-----");
        d1.DogAnimalWalk();
    }
}
