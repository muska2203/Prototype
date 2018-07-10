package dkovalenko.tests.prototype;

import dkovalenko.tests.prototype.cleaner.Cleaner;

public class App {
    public static void main(String[] args) {
        Robot cleaner = new Cleaner("1.2.100", "Kris");
        for (int i = 0; i < 10; i++) {
            cleaner.say();
        }
        Robot secondCleaner = cleaner.clone();
        System.out.println("cleaner == secondCleaner - " + (secondCleaner == cleaner));
        secondCleaner.say();
    }
}
