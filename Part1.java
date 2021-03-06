public class Part1 {

    public String findSimpleGene(String dna) {
        //start codon ATG
        //end codon TAA
        int startIndex = dna.indexOf("ATG");
        int stopIndex = dna.indexOf("TAA", startIndex + 3);

        if (startIndex == -1) { //no ATG
            return "";
        }

        if (stopIndex == -1) { //no TAA
            return "";
        }

        String x = dna.substring(startIndex,stopIndex);
        int size = x.length();
        if(size % 3 == 0) {
            return x;
        }
        else
        {
            return "";
        }
    }

    public void testSimpleGene(){
        String dna1,dna2,dna3,dna4,dna5;
        dna1 = "AATAGATTGATTAA"; //no ATG
        dna2 = "CGATGGTTTG"; //no TAA
        dna3 = "TAGTCGGTTCGAATTG"; //no ATG or TAA
        dna4 = "ATCATGCGGTGCGCATAAGGT"; //ATG , TAA and the substring between them is a multiple of 3 (a gene)
        dna5 = "CGATGCGTATGCGTAA"; //ATG, TAA and the substring between them is not a multiple of

        //display all the dna strings declared
        System.out.println("1: DNA Strand is " +dna1);
        System.out.println("2: DNA Strand is " +dna2);
        System.out.println("3: DNA Strand is " +dna3);
        System.out.println("4: DNA Strand is " +dna4);
        System.out.println("5: DNA Strand is " +dna5);

        String gene1,gene2,gene3,gene4,gene5;
        //display the genes if they exist
        gene1=findSimpleGene(dna1);
        System.out.println("The gene number 1 is "+gene1);
        gene2=findSimpleGene(dna2);
        System.out.println("The gene number 2 is "+gene2);
        gene3=findSimpleGene(dna3);
        System.out.println("The gene number 3 is "+gene3);
        gene4=findSimpleGene(dna4);
        System.out.println("The gene number 4 is "+gene4);
        gene5=findSimpleGene(dna5);
        System.out.println("The gene number 5 is "+gene5);
    }

    public static void main (String[] args) {
        Part1 dna = new Part1();
        dna.testSimpleGene();
    }

}
