import edu.duke.*;

public class Part4 {
    public void printURLS(String url) {
        URLResource myurl = new URLResource(url);
        for(String word : myurl.words()) {
            if(word.toLowerCase().indexOf("youtube.com") != -1) {
                int quoteIndex = word.indexOf("\"");
                int lastQouteIndex = word.indexOf("\"", quoteIndex+1);
                System.out.println(word.substring(quoteIndex+1, lastQouteIndex));
                
            }
        }
    }
    
    public void testUrl() {
        printURLS("http://www.dukelearntoprogram.com/course2/data/manylinks.html");
    }
    
    public static void main() {
        Part4 url = new Part4();
        url.testUrl();
    }

}
