package animal_and_edible;

public class Test {
    public static void main(String[] args) {
        Animal[] animal = new Animal[] {new Tiger(), new Chicken()};
        for(Animal animal1 : animal){
            System.out.println(animal1.makeSound());
            if (animal1 instanceof Chicken){
                Edible edible = (Chicken)animal1;
                System.out.println(edible.howToEat());
            }
        }
        Edible[] edibles = new Edible[]{new Apple(), new Orange(), new Chicken()};
        for (Edible edible :
                edibles) {
            if (edible instanceof Animal){
                System.out.println(((Animal) edible).makeSound());
            }
            System.out.println(edible.howToEat());
        }
    }
}
