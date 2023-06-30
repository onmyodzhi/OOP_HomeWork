// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Animal fish = new swimingAnimal(false,false);

        fish.toGO();
        fish.fly();
        fish.swim();

        Animal fish1 = new swimingAnimal(true,true);

        fish1.toGO();
        fish1.fly();
        fish1.swim();

        FlyingAnimal golub = new FlyingAnimal(false,false);
        golub.fly();
        golub.toGO();
        golub.swim();

        FlyingAnimal raven = new FlyingAnimal(true, true);
        raven.swim();
        raven.toGO();
        raven.fly();
    }
}