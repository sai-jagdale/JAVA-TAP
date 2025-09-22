class Animal{
    private int legs;
    String habitat;
    String type;

    public Animal(){
        legs = 4;
        habitat = "Land";
        type="Carnivorous";
    }

    public Animal(int legs , String habitat , String type){
        this.legs=legs;
        this.habitat=habitat;
        this.type=type;
    }

    public void setlegs(int legs){
        this.legs=legs;
    }
    public int getlegs(){
        return legs;
    }

    @Override
    public String toString(){
        return ("Legs : "+legs+" "+"Habitat : "+habitat+" "+"Type : "+type);
    }

    public void walk(){
        System.out.println("Animals walk on 4 legs.");
    }
}

class Dog extends Animal{

    public void DogWalk(){
        System.out.println("Dog also walk on 4 legs");
    }

    public void AnimalWalk(){
        super.walk();
    }

    public void DogAnimalWalk(){
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
