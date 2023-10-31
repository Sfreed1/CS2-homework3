/**
 * AlbumListDB.java
 * A program for creating an inventory of albums that have either been read through textfile or inputed by user
 * Part of Homework 4, Part 2&3
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ArrayListDB{

    static AlbumArrayList inventory = new AlbumArrayList();

    public static void readFile(String[] args){
        String fileName = args[0];
        int tracker = 0;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));   //opens a file
            String line = reader.readLine();    //reads file
            while (line != null) { 
                tracker++; 
                String[] newArr = line.split(":");
                if (newArr.length == 2){
                    String albCheck = newArr[1];
                    if (albCheck.indexOf('-') != -1){
                        Album temp = new Album(newArr[1]);
                        if(newArr[0].equalsIgnoreCase("add")){
                            inventory.add(temp);
                        } else if(newArr[0].equalsIgnoreCase("remove")){
                            inventory.remove(temp);
                        }
                    }
                }
            line = reader.readLine(); 
            } if(inventory.size() == 0) {
                System.out.println("0 albums");
            }
            reader.close();
        } catch (IOException e){   //catches any exceptions
                System.err.println("Error reading file: " + e.getMessage());
            }
        System.out.println("Finished processing " + tracker + " transactions.");
    }

    private static String isValid(String command, Scanner scan){
        boolean valid = false;
        while(!valid){
            System.out.print(":");
            command = scan.nextLine();
            //System.out.println(command);
            if (command.equals("ADD") || command.equals("REMOVE") || command.equals("LIST") || command.equals("QUIT")){
                valid = true;
                return command;
            }
        }
        return command;
    }

    public static void userInput(){
        Scanner scan = new Scanner(System.in);

        boolean isQuit = false;
        while(!isQuit) {
            String command = "";
            command = isValid(command, scan);
        if (command.equals("LIST")){
            System.out.println("--" + inventory.numItems + " albums--");
            for (int i = 0; i < inventory.size(); i++){
                System.out.println(i+1 + ". " + inventory.get(i));
            } 
        } if (command.equals("ADD")){
            System.out.println("Artist - Album:");
            String scanAlbum = scan.nextLine();
            String albCheck1 = scanAlbum;           
            if (albCheck1.indexOf('-') != -1){
                Album temp = new Album(scanAlbum);
                inventory.add(temp);
                }
        } if (command.equals("REMOVE")){
            System.out.println("Number:");
            String scanIndex = scan.nextLine();
            Integer idx = 0;
            boolean isNumeric = false;
            if(scanIndex != null && scanIndex.matches("[0-9.]+")){
                idx = Integer.parseInt(scanIndex) - 1;
                System.out.println("idx= " + idx);
                isNumeric = true;
            }
            if (idx >= 0 && idx < inventory.numItems && isNumeric){
                System.out.println("idx: " + (idx));
                inventory.remove(idx);
            }
        } if (command.equals("QUIT")){
            System.out.println("Bye bye!");
            isQuit = true;
        }
        
        }
    }
    
    public static void main(String[] args){
    
        readFile(args);
        System.out.println("Please provide instructions: ADD, REMOVE, LIST, QUIT");
        userInput();       
    }
}

