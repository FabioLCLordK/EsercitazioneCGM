package esercizioJournal;

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
    
    public static Article[] removeFromArray(int index, Article[] articles){
           Article[] arTemp= new Article[articles.length-1];
            int x=0;
            for (int i=0; i<articles.length; i++){
                if(i!=index){
                    arTemp[x]=articles[i];
                x++;
                }
            }

        return arTemp;
    }
}
