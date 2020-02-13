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
import java.util.Scanner;
/**
 *
 * @author MC03353
 */
public class TextFile {
    private static Scanner SC = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        System.out.println(System.getProperty("user.dir")); //This will show you the directory your file will save in
        //it should be the most top level folder of your project
        
        lineCountArchive();
//    checkForTextFile();    
//        checkTempFile();
    }
    
    public static void checkForTextFile() {
        String sFile = "Archive.txt";
        
        String line = null;
        try {
           
            FileReader contracts = new FileReader(sFile);
            BufferedReader bReader = new BufferedReader(contracts);
            while((line = bReader.readLine()) != null) {
            }
            // Always close files.
            bReader.close();
        } catch(FileNotFoundException e) {
            System.out.println(
                "Unable to open file '" +
                sFile + "'");
        } catch(IOException ex) {
            System.out.println(
                "Error reading file '"
                + sFile + "'");
        }
    }    
    
    public static void checkForFile() {
        File test;
        try {
            test = File.createTempFile("myTempFile", ".txt");       
          
            boolean exists = test.exists();
          
            System.out.println("Temp file exists : " + exists);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static int checkFileArchive() {
        // check directory java is using
        // System.out.println(System.getProperty("user.dir"));
        // The name of the file to open.
        String sFile = "Archive.txt";

        // This will read one line at a time
        String line = null;

        try {
            // FileReader reads text files in the default encoding.
            FileReader contracts = new FileReader(sFile);

            // Always wrap FileReader in BufferedReader.
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
        return 0;
    }
 
    public static int lineCountArchive() throws FileNotFoundException, IOException{
        String sCurrentLine;
        int iTotalLines = 0;
        
        BufferedReader br = new BufferedReader(new FileReader("Archive.txt"));
            
            while((sCurrentLine = br.readLine()) != null){
                iTotalLines++;   
            }
        System.out.println("Total Lines: " + iTotalLines);
        return iTotalLines;
    }
}
