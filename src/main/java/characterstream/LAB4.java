package characterstream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LAB4 {
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("lab3.txt");
            Scanner input = new Scanner(file);

            // Sol#1
            /*System.out.println(input.nextLine());
            System.out.println(input.nextInt());
            System.out.println(input.nextDouble());
            System.out.println(input.nextDouble());*/

            // Sol#2
            String name = input.nextLine();
            System.out.println(name);
            int age = input.nextInt();
            System.out.println(age);
            double weight = input.nextDouble();
            System.out.println(weight);
            double height = input.nextDouble();
            System.out.println(height);

        } catch (FileNotFoundException ex) {
            Logger.getLogger(LAB3.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
