package javaapplication1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
public class JavaApplication1 {

    
    public static void main(String[] args) throws IOException {
        ArrayList<String> newFile = new ArrayList<String>(); // Create an ArrayList object
        InputStreamReader r = new InputStreamReader (System.in);
        BufferedReader br = new BufferedReader(r);
        String file = "";
        
        while(!file.equals("stop")){
        System.out.print("Enter data: ");
        file = br.readLine();
        newFile.add(file);
        System.out.println("Data is: "+ file);
        }
        try (FileWriter writer = new FileWriter("output.txt")) {
            for(String str: newFile) {
                writer.write(str + System.lineSeparator());
            }
        }
        System.out.println(newFile);        
    }
    
}
