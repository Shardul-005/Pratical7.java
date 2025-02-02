public class Pratical7_0 {
     
     void printL(int size)
     {
         int max_size = (2*size-1);
         for(int line=1; line <= max_size; line++)
          {
             if(line == max_size)
              {
                for(int pattern=1; pattern<=size; pattern++)
                {
                 System.out.print("*");
                }
              }
              else{
               System.out.println("*");
              }
          } 
     }

     void printU(int size){
         int max_size = (2*size-1);
         for(int line=1; line <=max_size; line++){
             if(line == max_size){
                 System.out.print(" ");
                 for(int pattern=1; pattern<size-1; pattern++){
                     System.out.print("*");
                 }
             }
             else{
            System.out.print("*");
            for(int space=1; space<size-1; space++){
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
         }
           
         }
     }

     void printA(int size)
     {
         int max_size = (2*size-1);
         for(int line=1; line<=max_size; line++)
          {
              if(line==1)
              {
                  System.out.print(" ");
                  for(int pattern=1; pattern<size-1; pattern++){
                      System.out.print("*");
                  }
                  System.out.println();
              }
             
              else if(line==(max_size/2)+1){
                     System.out.print("*");
                      for(int pattern=1; pattern<size; pattern++)
                       {
                         System.out.print("*");
                       }
                       System.out.println();
                    } 
                    
              else{   
                 System.out.print("*");
                  for(int space=1; space<size-1; space++){
                      System.out.print(" ");
                  }
                  System.out.print("*");
                  System.out.println();
                 }
         }
     }

     void printD(int size)
     {
         int max_size = (2*size-1);
         for(int line=1; line<=max_size; line++)
          {
            if(line==1 || line==max_size)
            {
             for(int pattern=1; pattern<size; pattern++)
              {
                 System.out.print("*");
              }
              System.out.println();
            }
            else{
             System.out.print("*");
             for(int space=1; space<size-1; space++)
              {
                System.out.print(" ");
              }
              System.out.print("*");
              System.out.println();
            }
            
          } 
     }

     void printR(int size)
      {
         int max_size = (2*size-1);
         for(int line=1; line<=max_size; line++)
          {
             if(line==1 || line==(max_size/2)+1)
              {
                 for(int pattern=1; pattern<size; pattern++)
                  {
                     System.out.print("*");
                  }
                  System.out.println();
              }
              else if(line > 1 && line < (max_size/2)+1){
                 System.out.print("*");
                 for(int space=1; space<size-1; space++)
                  {
                     System.out.print(" ");  
                  }
                   System.out.println("*");
              }
              else{
                   System.out.print("*");
                   for(int space = 1; space < line - (max_size/2) -1; space++)
                    {
                        System.out.print(" ");
                    }
                    System.out.print("*");
                    System.out.println();
              }
            }
        }
      

     void printH(int size)
     {
         int max_size=(2*size-1);
          for(int line=1; line<=max_size; line++)
           {
             System.out.print("*");
             for(int space=1; space<size-1; space++)
              {
                 if(line == (max_size/2)+1)
                  {
                     System.out.print("*");
                  }
                  else{
                     System.out.print(" ");
                  }
              }
              System.out.print("*");
              System.out.println();
           }
     }


     void printS(int size)
     {
         int max_size=(2*size-1);
          for(int line=1; line<=max_size; line++)
           {
             if(line==1 || line==(max_size/2)+1 || line==max_size)
              {
                 for(int pattern=0; pattern<size; pattern++)
                  {
                     System.out.print("*");
                  }
              }
              else if(line>1 && line<(max_size/2)+1){
                 for(int pattern=0; pattern<1; pattern++){
                     System.out.print("*");
                 }
              }
              else{
                 for(int space=1; space<size; space++){
                     System.out.print(" ");
                 }
                 System.out.print("*");
               }
             System.out.println();
             } 
     }
     public static void main(String[] args) {
         Pratical7_0 p = new Pratical7_0();
      
          System.out.println();
          p.printS(7);
          System.out.println();
          p.printH(7);
          System.out.println();
          p.printA(7);
          System.out.println();
          p.printR(7);
          System.out.println();
          p.printD(7);
          System.out.println();
          p.printU(7);
          System.out.println();
          System.out.println();
          p.printL(7);    
     }
 }
