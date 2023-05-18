package characterstream;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CharacterStream {
    public static void main(String[] args) {
        try {
            FileWriter file = new FileWriter("data.txt");
            BufferedWriter output = new BufferedWriter(file);
            output.write("Hello World!");
            output.write("Welcome Welcome!");
            output.close();
        } catch (IOException ex) {
            Logger.getLogger(CharacterStream.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            FileReader file = new FileReader("data.txt");
            BufferedReader input = new BufferedReader(file);
            String s;
            while ((s = input.readLine()) != null ) {
                System.out.println(s);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CharacterStream.class.getName()).log(Level.SEVERE, null, ex);
        }catch (IOException ex) {
            Logger.getLogger(CharacterStream.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
