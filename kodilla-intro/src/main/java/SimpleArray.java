public class SimpleArray {
    public static void main(String[] args) {
        String[] animals = new String[] {"dog", "cat", "elephant", "parrot", "pig"};
        String animal = animals[3];
        System.out.println(animal);
        int numberOfElements = animals.length;
        System.out.println("Moja tablica zawiera " + numberOfElements + " elementów");
    }
}