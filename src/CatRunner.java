public class CatRunner {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Pebble", 4, 56);
        cat1.introduce();
        cat1.printCatInfo();
        System.out.println();

        Cat cat2 = new Cat("Maple", 10, 60);
        cat2.introduce();
        cat2.printCatInfo();
    }
}
