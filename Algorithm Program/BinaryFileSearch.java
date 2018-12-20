package all.algo.program;


import java.util.Scanner;


import all.program.utility.Utility1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BinaryFileSearch{
    public static void main(String[] args) throws IOException {
         Utility1 u=new Utility1();
            File file =new File("/home/admin1/data/myfile");
            String values[] = null;
            Scanner sc =new Scanner(System.in);
              String line = null;
             BufferedReader br = new BufferedReader(new FileReader(file));
             while ((line = br.readLine()) != null) {
                   values = line.split(" ");
           }
                br.close();
               
        System.out.println("Entre key for search:");
        String key=sc.nextLine();
        int res=u.binarySearchString(values, key);
        if(res==-1)
       {
           System.out.println("Not Exist...");
       }
       else
       {
           System.out.println("Found at position: "+res);
       }
      
      }
   
}

