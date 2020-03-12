package demostream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {


    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("Barney.dat",false);
            BufferedWriter bw= new BufferedWriter(fw);
            bw.write("hello \n");
            bw.flush();
            bw.write("barney");
            bw.flush();
            
            bw.newLine();
            bw.write("hello Again");
            bw.close();
            fw.close();

            FileReader fr = new FileReader("Barney.dat");
            BufferedReader br= new BufferedReader(fr);
            String line = br.readLine();
            System.out.println(line);
            
            while(line != null){
                System.out.println(line);
                line = br.readLine();
            }
            br.close();
            fr.close();
            
            
//            if(line.equals("hello barney")){
//                System.out.println("\"hello braney\" has been sent");
//            }
            
        } catch (IOException e) {
            System.out.println("e is " + e);

        }

    }
}
