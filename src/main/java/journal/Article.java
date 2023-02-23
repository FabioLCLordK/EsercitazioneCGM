package journal;
public class Article {
    private String name;
    private int pageNumber;
    private int charNumber;

    public Article(String name, int pageNumber, int charNumber) {
        this.name = name;
        this.pageNumber = pageNumber;
        this.charNumber = charNumber;
    }

    
    
    public Article(){
    }


    public void printArticle() {
        System.out.println( "Article{" + "name=" + name + ", pageNumber=" + pageNumber + ", charNumber=" + charNumber + '}');
    }
    
    
}
