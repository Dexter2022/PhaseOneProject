package com.ankit.sync;



import java.util.*;
import java.io.*;
import java.util.Collections;

public class FileHandlingProgram{
       //for creating file and directory for method 
      public static void create_file_name(String default_path) throws Exception
         {
         
            Scanner sc=new Scanner(System.in);   
            System.out.println("WANT CHANGE PATH Press C OR NOT FOR N");
            char ch=sc.next().charAt(0);

              if(ch=='c'){
                System.out.println("ENTER THE PATH LOCATION");
                default_path=sc.next();
              } 

            System.out.println("ENTER NEW FILE NAME");
            String new_filename=sc.next();

            File file = new File(default_path + "/" + new_filename);  

              if (file.createNewFile()) {  
                System.out.println("New File is created!");}  
              else {  
                System.out.println("File already exists."); }
           
         
         
        }


        //FOR SEARCHING DIRECTORY AND FILE
        public static void serch_File(String default_path)  throws Exception
        {
            Scanner sc=new Scanner(System.in);   
            System.out.println("WANT CHANGE PATH Press C OR NOT FOR N");
            char ch=sc.next().charAt(0);
            if(ch=='c'){
                System.out.println("ENTER THE PATH LOCATION");
                default_path=sc.next();
                }

             File file = new File(default_path); 
             String[] f_list = file.list();
             List<String> arrayList = Arrays.asList(f_list);
            
             System.out.println("ENTER FILE NAME WHICH YOU WANT TO SEARCH");
             String file_name=sc.next();

             boolean ans = arrayList.contains(file_name);
  
             if (ans)
              System.out.println("FILE_NAME FOUND="+file_name);
             else
               System.out.println("FILE_NAME FOUND ="+file_name);
            }
        

        //FOR SORTING IN ACCENDING ORDER
        public static void sorting_accending_order(String default_path) throws Exception
        {
            
            Scanner sc=new Scanner(System.in);   
            System.out.println("WANT CHANGE PATH Press C OR NOT FOR N");
            char ch=sc.next().charAt(0);
            if(ch=='c'){
                System.out.println("ENTER THE PATH LOCATION");
                default_path=sc.next();
            }

            File file = new File(default_path); 
             String[] flist = file.list();
        
             List<String> wordList = Arrays.asList(flist);
             Collections.sort(wordList);      
             wordList.forEach((n) -> System.out.println(n));
              

        }

        //FOR DELETING FILE
        public static void delete_file(String default_path) throws Exception
        {
            
            Scanner sc=new Scanner(System.in);   
            System.out.println("WANT CHANGE PATH Press C OR NOT FOR N");
            char ch=sc.next().charAt(0);
            if(ch=='c'){
                System.out.println("ENTER THE PATH LOCATION");
                default_path=sc.next();
            }
            System.out.println("ENTER THE NAME WHICH FILE YOU WANT TO DELETE");
            String file_name=sc.next();

            File file = new File(default_path + "/" + file_name); 
 
            if (file.delete()) {
              System.out.println("File deleted successfully");
            }
            else {
              System.out.println("Failed to delete the file");
               }
        
        }

        //ALL FUNCTION CLOSE HERE
        public static void running(String default_path)
        {
        try{
            Scanner sc=new Scanner(System.in);
            System.out.println("\n>>>>>  PRESS THE KEY C FOR CREATING FILE");
            System.out.println(">>>>>  PRESS THE KEY S FOR SEARCHING FILE");
            System.out.println(">>>>>  PRESS THE KEY A FOR ASSENDING ORDER FILE");
            System.out.println(">>>>>  PRESS THE KEY D FOR DELETING FILE");
            System.out.println(">>>>>  PRESS THE KEY E FOR EXITING THE APPLICATION");
            String st=null;
            char ch;
            ch=sc.next().charAt(0);
            switch(ch)
            {

                case 'c':
                            create_file_name(default_path);
                            running(default_path);
                            break;

                case 's':
                            serch_File(default_path);
                            running(default_path);
                            break;   

                case 'a':
                            sorting_accending_order(default_path);
                            running(default_path);
                            break;          

                case 'd':
                            delete_file(default_path);
                            running(default_path);
                            break;

                case 'e':
                                System.out.println("THANKS FOR VISITING THE APPLICATION");
                                break;

                default:
                            System.out.println("WRONG CHOICE");
                            running(default_path);
            }
           }  catch(Exception e)
              {
                e.printStackTrace();
              }

        }
        public static void main(String args[])
       {
        	System.out.println("\t\t\t************************************************************");
            System.out.println("\t\t\t\t\t>>>>>  Welcome to LockedMe.com  <<<<<");
          
            System.out.println("\t\t\t************************************************************");
            System.out.println("\t\t\t\t\t    Developer Name:: Ankit Yadav");
            System.out.println("\t\t\t\t\t    Designation:: Java Developer");
            System.out.println("\t\t\t\t\t    Date : 10/05/2022");
            System.out.println("\t\t\t************************************************************");
             //calling function for all function
            try{   
            String default_path="/Users/ankityadav/Dropbox/Mac/Desktop/java eclipse codes";//you have to give your pc folder location here
            running(default_path);
            }catch(Exception e)
            {e.printStackTrace();}

       }     
}        