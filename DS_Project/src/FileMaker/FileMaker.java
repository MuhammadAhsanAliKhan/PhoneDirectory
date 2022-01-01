package FileMaker;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class FileMaker {
    public static void main(String[] args) 
    {
        try 
        {
            FileWriter myWriter = new FileWriter("ContactList.txt");
            File ObjReader = new File("names.txt");
            Scanner myReader = new Scanner(ObjReader);
            int i;
            while (myReader.hasNextLine()) 
            {
                String data = myReader.nextLine();
                String code= RandomCountryCode.getCode();
                switch(code)
                {
                    case "+33":
                        i=9;
                        break;
                    case "+34":
                        i=9;
                        break;
                    case "+55":
                        i=11;
                        break;
                    default:
                        i=10;
                        break;
                }
                myWriter.write(data + "  " + code + " " + RandomNumber.getAlphaNumericString(i) + "\n");
            }
            myReader.close();
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) 
        {
            System.out.println("An error occurred.");
        }
    }
}
