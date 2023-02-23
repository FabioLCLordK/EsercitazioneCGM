package journal;
public class ArrayFactory {
    
    public static Article[] arrayGen(int artNumber,Article[] articles){
         Article[] arTemp= new Article[artNumber+10];
            for (int i=0; i<articles.length; i++){
                arTemp[i]=articles[i];
            }
            articles=new Article[artNumber+10];
            articles=arTemp;
        return articles;
    }
    
}
