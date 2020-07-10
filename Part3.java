public class Part3 {

    public boolean twoOccurrences(String stringa, String stringb) {
        int indexa = stringb.indexOf(stringa);
        if (indexa != -1) {
            int indexb = stringb.indexOf(stringa, indexa + 1);
            if (indexb != -1) {
                return true;
            }
        } else {
            return false;
        }
        return false;
    }

    public void testing() {
        System.out.println(twoOccurrences("by", "A story by Abby Long"));
        System.out.println(twoOccurrences("a", "banana"));
        System.out.println(twoOccurrences("atg", "ctgtatgta"));

        System.out.println("The part of the string after 'an' in 'banana' is " + lastPart("an", "banana"));
        System.out.println("he part of the string after 'zoo' in 'forest' is " + lastPart("zoo", "forest"));
    }

    public String lastPart(String stringa, String stringb) {
        int indexa = stringb.indexOf(stringa);
        if (indexa != -1) {
            return stringb.substring(indexa+stringa.length(), stringb.length());
        } else {
            return stringb;
        }
    }

    public static void main (String[] args) {
       Part3 x = new Part3();
        x.testing();
    }
}
