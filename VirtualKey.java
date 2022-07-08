package simpleLearn.Phase2Project;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class VirtualKey {
    public static void main(String[] args) throws IOException {
    	
    	// Display Welcome Screen By given problem statement (Lockedme.com).
    	
    	// Given Developer Details also mention Here.
    	
        System.out.println("**************** Welcome to Lockedme.com ***********************\n" +
                "Application Name: Virtual Key Repository\n" +
                "***************Developer Details***************\n" +
                "Name: KORIVI EDUKONDALU \n" +
                "Designation: JAVA Developer\n" +
                "Date: 01-07-2022");

        //  we create Some Multiple choices for user convenience
        
        while (true) {
        	
            System.out.println("Enter 1 : Get file names in ascending order\n" +
                    "Enter 2:  For Business Level Operation\n" +
                    "Enter 3: Close the Application");
            System.out.println("Please Select any one given above options :");
            
            
         // we take input dynamically from user end here.
            
            Scanner s = new Scanner(System.in);
            int option = s.nextInt();

         // The Existing and add new files are arranged in Sorting order by Using list and Arrays concepts in Collections
            
          
            if (option == 1) {
            	// To create Directory/Folder in Local System
            	File f3 = new File("LockedMe Digital Files");
            	f3.mkdir();
            	
            	File file1 = new File("D:\\ESIC\\DEV\\Phase 2 Projects\\SimpliLearn\\FirstClass\\LockedMe Digital Files");
            	if(file1.isDirectory())
            	{
            	if(file1.list().length>0)
            	{
            		
            		System.out.println("..................................................");
            		System.out.println("The All files are in Assending order ");
            		File file = new File("D:\\ESIC\\DEV\\Phase 2 Projects\\SimpliLearn\\FirstClass\\LockedMe Digital Files" );
	                String[] children = file.list();
	                Arrays.sort(children);
	                for (int i = 0; i< children.length; i++) {
	                    String filename = children[i];
	                    System.out.println(filename);

                     
            		}    
	                System.out.println("..................................................");
            	}
            	else
            	{
            		System.out.println("..................................................");
            		System.out.println("Sorry the Directory/Folder is Empty");
            		System.out.println("..................................................");
            		
            			
            		}
            	}
         	
            }	
        // We are Doing Business Operations Here ..........    
            else if (option == 2) {
                System.out.println("Enter 1 : add a new file\n" +
                        "enter 2:  Delete Existing file\n" +
                        "enter 3:  Search file in Directory\n" +
                        "enter 4:  Go back Main Menu");
                System.out.println("Please Select any one given above options :");
                int input = s.nextInt();
                switch (input) {
                
           // we are doing Create a new file functionality    
                    case 1:
                    	System.out.println("..................................................");
                    	System.out.print("Enter How many files you want to create ?\n");
                		int n=s.nextInt();
                		for(int i=0;i<n;i++) {
                    	
                        System.out.println("Enter your file name");
                        Scanner scanner1 = new Scanner(System.in);
                        String name = scanner1.nextLine();
                        File file6 = new File("D:\\ESIC\\DEV\\Phase 2 Projects\\SimpliLearn\\FirstClass\\LockedMe Digital Files\\"+ name);
                        if (file6.createNewFile()) {
                            System.out.println("File is created sucessfully");
                            System.out.println("After Create a new file, The Total files in Existing Directory ");
                            File file = new File("D:\\ESIC\\DEV\\Phase 2 Projects\\SimpliLearn\\FirstClass\\LockedMe Digital Files" );
        	                String[] children = file.list();
        	                Arrays.sort(children);
        	                for (int j = 0; j< children.length; j++) {
        	                    String filen = children[j];
        	                    
        	                    System.out.println(filen);
        	                }
                        } else {
                            System.out.println("File is already exist");
                        }
                        System.out.println("..................................................");
                		}
                        break;
                        
                        // we are doing delete existing file in directory.            
                        
                    case 2:
                    	System.out.println("..................................................");
                    	
                        System.out.println("Enter file name for delete");
                        Scanner scanner2 = new Scanner(System.in);
                        String name1 = scanner2.nextLine();
                        File file2 = new File("D:\\ESIC\\DEV\\Phase 2 Projects\\SimpliLearn\\FirstClass\\LockedMe Digital Files\\"+ name1);
                        if(file2.delete())
                        {
                            System.out.println("File is Successfully deleted");
                            System.out.println("After Delete file, The Remaining files in Existing Directory ");
                            File file = new File("D:\\ESIC\\DEV\\Phase 2 Projects\\SimpliLearn\\FirstClass\\LockedMe Digital Files" );
        	                String[] children = file.list();
        	                Arrays.sort(children);
        	                for (int i = 0; i< children.length; i++) {
        	                    String filen = children[i];
        	                    
        	                    System.out.println(filen);
        	                 }
                        }
                        else
                        {
                            System.out.println("File is not deleted or file is not found");
                        
                        }
                        System.out.println("..................................................");
                        break;
                    
                        // we are doing search a file in Directory
                    
                    case 3:
                    	
                    	System.out.println("..................................................");
                        System.out.println("Enter your file name to search");
                        Scanner scanner3 = new Scanner(System.in);
                        String fileName3 = scanner3.nextLine();
                        File file3 = new File("D:\\ESIC\\DEV\\Phase 2 Projects\\SimpliLearn\\FirstClass\\LockedMe Digital Files\\"+ fileName3);
                        
                      
                        if(file3.isFile())
                        {
                            System.out.println("File is available in this Directory ");
                        }
                        else {
                            System.out.println("File is not available In this Directory");
                        }
                        System.out.println("..................................................");
                  break;
                  
                // Otherwise we will goto Main Menu    
                    
                    case 4:
                        System.out.println("GoBack to Main Menu");
                        break;
                    default:
                        System.out.println("Please choose valid option ");
                }
            }
            if (option == 3){
            	 System.out.println("you have Exited successfully");
                 System.out.println("................Thank you.....................");
                System.exit(option);
               
            }
          
   
        }
 
    }

}


