package journal;
public class Blog { 
    private String Name;
    private String Url;
    private int artNumber=0;
    private Article[] articles= new Article[1];

    public Blog(String Name, String Url) {
        this.Name = Name;
        this.Url = Url;
    }
    
    
    
    public void addArticle(Article art){
        if (artNumber>= articles.length){
            this.articles=ArrayFactory.arrayGen(this.artNumber, this.articles);
        } 
        this.articles[artNumber]=art;
        
        this.artNumber++;
    }
    public void removeArticle(int index){
        this.articles=ArrayFactory.removeFromArray(index-1, articles);
        this.artNumber-=1;
    }
    
    public void printArticles(){
        for(int x=0; x<artNumber;x++){
            this.articles[x].printArticle();
        }
    }
}
