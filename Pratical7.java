 class Pratical7 {

    String[] getS(int size) {
        int max_size = 2 * size - 1;
        String[] letter = new String[max_size];

        for (int i = 0; i < max_size; i++) {
            String line = "";
            if (i == 0 || i == max_size / 2 || i == max_size - 1) {
                for (int j = 0; j < size; j++)
                 {
                    line += "*";
                 }
             } 
              else if (i <= max_size / 2) {
                 line = "*";
                 for (int j = 1; j < size; j++) 
                  {
                    line += " ";
                  }
             } 
            else {
                for (int j = 1; j < size; j++)
                 {
                    line += " ";
                 }
                line += "*"; 
            }
            letter[i] = line;
        }
        return letter;
    }

   
    String[] getH(int size) {
        int max_size = 2 * size - 1;
        String[] letter = new String[max_size];

        for (int i = 0; i < max_size; i++) {
            String line = "*"; 
            for (int j = 1; j < size - 1; j++) {
                if (i == max_size / 2) 
                 {
                    line += "*"; 
                 }
                else line += " ";
            }
            line += "*"; 
            letter[i] = line;
        }
        return letter;
    }

  
    String[] getA(int size) {
        int max_size = 2 * size - 1;
        String[] letter = new String[max_size];

        for (int i = 0; i < max_size; i++) {
            String line = "";
            if (i == 0) {
                line += " ";
                for (int j = 1; j < size-1; j++) 
               {
                line += "*"; 
               }
            } 
            else if (i == max_size / 2) {
                for (int j = 0; j < size; j++) 
                 {
                    line += "*"; 
                 }
            }
             else {
                line += "*"; 
                for (int j = 1; j < size - 1; j++) 
                 {
                    line += " ";
                 }
                line += "*"; 
            }
            letter[i] = line;
        }
        return letter;
    }

    String[] getR(int size)
    {
        int max_size = 2*size-1;
        String[] letter = new String[max_size];

        for(int i=0; i<max_size; i++)
        {
            String line = "";
            if(i==0 || i==max_size/2)
             {
                if(i==0) { line+=" ";}    
                for(int pattern=0; pattern<size-1; pattern++)
                 {
                    line += "*";
                 }
                 for(int space=0; space<1; space++)
                  {
                    line += " ";
                  }
             }
             else{
                line += "*";
                for(int space=1; space < size-1; space++)
                 {
                    line += " ";
                 }
                 line += "*";
             }
             letter[i] = line;
        }
        return letter;
    }

    String[] getD(int size)
    {
        int max_size = 2*size-1;
        String[] letter = new String[max_size];

        for(int i=0; i<max_size; i++)
         {
            String line = "";
            if(i==0 || i==max_size-1)
             {
                for(int pattern=0; pattern < size-1; pattern++)
                 {
                    line += "*";
                 }
             }
             else{
                line += "*";
                for(int space = 1; space < size-1; space++)
                 {
                    line += " ";
                 }
                 line += "*";
             }
             letter[i] = line;
         }
         return letter;
    }


    String[] getU(int size)
    {
        int max_size = 2*size-1;
        String[] letter = new String[max_size];

        for(int i=0; i<max_size; i++)
         {
            String line = "";
            if(i==0 || i == max_size-1) {line += " ";}
            if(i == (max_size-1))
             {
               line += " ";
               for(int pattern=0; pattern<size-1; pattern++)
                {
                    line += "*";
                }
                line += " ";
             }
             else{
                line += "*";
                for(int space=0; space < size-1; space++)
                 {
                    line += " ";
                 }
                 line += "*";
             }
             letter[i] = line;
         }
         return letter;
    }

    String[] getL(int size)
    {
        int max_size = 2*size-1;
        String[] letter = new String[max_size];

        for(int i=0; i<max_size; i++)
         {
           String line = "";
           line += "*";
           if(i == max_size-1)
           {
              for(int pattern=0; pattern < size-1; pattern++)
               {
                  line += "*";
               }
           }
           for(int space = 0; space < size-1; space++)
            {
                line += " ";
            }
             letter[i] = line;
         }
         return letter;
    }

    public static void main(String[] args) {
        Pratical7 p = new Pratical7();
        int size = 7;

       
        String[] S = p.getS(size);
        String[] H = p.getH(size);
        String[] A = p.getA(size);
        String[] R = p.getR(size);
        String[] D = p.getD(size);
        String[] U = p.getU(size);
        String[] L = p.getL(size);

        
        for (int i = 0; i < S.length; i++) {
            System.out.println(S[i] + "   " + H[i] + "   " + A[i] + "   " + R[i] + "   " + D[i] + "   " + U[i] + "   " + L[i]);
        }
    }
}
