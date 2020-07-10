public class Part2 {

    public String findSimpleGene(String dna, String startCodon, String stopCodon) {
        //start codon ATG
        //end codon TAA
        int startIndex = dna.indexOf(startCodon);
        int stopIndex = dna.indexOf(stopCodon, startIndex)+3;

        if( Character.isUpperCase(dna.charAt(0)) ) { //charAt() method returns the character at the specified index in the string
            startCodon = startCodon.toLowerCase();
            stopCodon = stopCodon.toLowerCase();
        } else {
            startCodon = startCodon.toUpperCase();
            stopCodon = stopCodon.toUpperCase();
        }

        if (startIndex == -1) { //no ATG
            return "";
        }

        if (stopIndex == -1) { //no TAA
            return "";
        }

        if((stopIndex-startIndex) % 3 == 0) {
            return dna.substring(startIndex,stopIndex);
        }
        else {
            return "";
        }
    }

    public void testSimpleGene(){
        String dna1,dna2,dna3,dna4,dna5;
        dna1 = "AATAGATTGATTAA"; //no ATG
        dna2 = "CGATGGTTTG"; //no TAA
        dna3 = "TAGTCGGTTCGAATTG"; //no ATG or TAA
        dna4 = "ATCATGCGGTGCGCATAAGGT"; //ATG , TAA and the substring between them is a multiple of 3 (a gene)
        dna5 = "cgatgcgtatgcgtaa"; //ATG, TAA and the substring between them is not a multiple of

        //display all the dna strings declared
        System.out.println("1: DNA Strand is " +dna1);
        System.out.println("2: DNA Strand is " +dna2);
        System.out.println("3: DNA Strand is " +dna3);
        System.out.println("4: DNA Strand is " +dna4);
        System.out.println("5: DNA Strand is " +dna5);

        String gene1,gene2,gene3,gene4,gene5;
        //display the genes if they exist
        gene1=findSimpleGene(dna1,"ATG", "TAA");
        System.out.println("The gene number 1 is "+gene1);
        gene2=findSimpleGene(dna2, "ATG", "TAA");
        System.out.println("The gene number 2 is "+gene2);
        gene3=findSimpleGene(dna3, "ATG", "TAA");
        System.out.println("The gene number 3 is "+gene3);
        gene4=findSimpleGene(dna4, "ATG", "TAA");
        System.out.println("The gene number 4 is "+gene4);
        gene5=findSimpleGene(dna5, "ATG", "TAA");
        System.out.println("The gene number 5 is "+gene5);
    }

    public static void main (String[] args) {
        Part2 dna = new Part2();
        dna.testSimpleGene();
    }
}
