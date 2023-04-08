package animal_and_edible;

public class Chicken extends Animal implements Edible{
    @Override
    public String makeSound() {
        return "meow meow (chicken said)";
    }

    @Override
    public String howToEat() {
        return "plz dont eat me T.T";
    }
}
