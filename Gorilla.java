public class Gorilla extends Mammal {
    public void throwSomething() {
        energyLevel -= 5;
        System.out.println("El Gorila lanzo algo, ahora tiene: " + energyLevel + " Puntos");
    }

    public void eatBananas() {
        energyLevel += 10;
        System.out.println("El Gorila comio una banana, ahora tiene: " + energyLevel  + " Puntos");
    }
    public void climb() {
        energyLevel -= 10;
        System.out.println("El Gorila escalo un arbol, ahora tiene: " + energyLevel  + " Puntos");

    }
}
