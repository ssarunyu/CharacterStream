package characterstream;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LAB5 {
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("lab3.txt");
            BufferedReader input = new BufferedReader(file);
            String name = input.readLine();
            System.out.println(name);
            //int age = (int) input.readLine();
            //System.out.println(age);
            //double weight = input.readLine();
            //System.out.println(weight);

        } catch (FileNotFoundException ex) {
            Logger.getLogger(LAB3.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(LAB3.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}