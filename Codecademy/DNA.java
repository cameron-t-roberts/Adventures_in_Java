public class DNA {
  
    /* This programs checks DNA sequences to see if they are Protiens or not. 
     A protein has the following qualities:
    
        - It begins with a “start codon”: ATG.
        - It ends with a “stop codon”: TGA.
        - In between, each additional codon is a sequence of three nucleotides.
    */
    
      public static void main(String[] args) {
                 
        //  -. .-.   .-. .-.   .
        //    \   \ /   \   \ / 
        //   / \   \   / \   \  
        //  ~   `-~ `-`   `-~ `-
        
        // Test DNA strands
        String dna1 = "ATGCGATACGCTTGA";
        String dna2 = "ATGCGATACGTGA";
        String dna3 = "ATTAATATGTACTGA";
    
        // String placeholder for calculations
        String dna = dna3; 
    
        // Find the length:
        int length = dna.length();
        System.out.println("Length: " + length);
    
        // Find start codon:
        int start = dna.indexOf("ATG");
        System.out.println("Start: " + start);
        // If ATG present an index will print, else -1
    
        // Find stop codon:
        int stop = dna.indexOf("TGA");
        System.out.println("Stop: " + stop);
        // If TGA prsent an index will print, else -1
    
        /* Condition 1 & 2 checks for protien. Iteration 1
        if (start != -1 && stop != -1) {
          System.out.println("Condition 1 and 2 are satisified");
        }
        */
    
        /* Checks for condition 1 & 2, and adds mult. of 3 reqirement. Iteration 2
    
        if (start != -1 && stop != -1 && (stop - start) % 3 ==0) {
          System.out.println("Condition 1 and 2 and 3 are satisfied.");
        }
        */ 
        
        // Prints protein from DNA Strand. Final Loop. 
        if (start != -1 && stop != -1 && (stop - start) % 3 ==0) {
          String protein = dna.substring(start, stop+3);
          System.out.println("Protein: " + protein);
        } else {
          System.out.println("No Protein.");
        }
    
    
    
      }
      
    }
    