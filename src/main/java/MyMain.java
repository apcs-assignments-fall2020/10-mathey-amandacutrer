import java.util.Scanner;

public class MyMain {

    public static int someMethod() {
        int x = Mathey.randomInteger(10, 20);
        int y = Mathey.randomInteger(10, 20);
        int z = Mathey.randomInteger(10, 20);
        return (x, y, z);
    }

    public static void main(String[] args) {
        System.out.println("The three random numbers are" + someMethod());
        System.out.println("The largest number is " + Mathey.max(x, y, z);
        System.out.println("The smallest number is " + Mathey.min(x, y , z);
    }

}


