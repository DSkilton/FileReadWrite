/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textfile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
/**
 *
 * @author MC03353
 */
public class TextFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        System.out.println(System.getProperty("user.dir"));
//    checkForText();    
    }
    
    public static void checkForTextFile() {
        String sFile = "test.txt";
        
        String line = null;
        try {
           
            FileReader contracts = new FileReader(sFile);
            BufferedReader bReader = new BufferedReader(contracts);
            while((line = bReader.readLine()) != null) {
            }
            // Always close files.
            bReader.close();
        }
        catch(FileNotFoundException e) {
            System.out.println(
                "Unable to open file '" +
                sFile + "'");
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '"
                + sFile + "'");
        }
    }    
    
    public static void checkTempFile() {
    File test;
        try {
            test = File.createTempFile("myTempFile", ".txt");       
          
            boolean exists = test.exists();
          
            System.out.println("Temp file exists : " + exists);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
