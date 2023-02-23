package journal;
public class Main {
    public static void main(String[] args) {
        Blog blog1= new Blog("volare", "www.google.it");
        
        Article art1=new Article("ciao", 3, 120);
        Article art2=new Article("c434o", 1, 100);
        Article art3=new Article("ciAAAAo", 4, 320);
        Article art4=new Article("ciaR!!!", 2, 220);
        Article art5=new Article("ci!!RA$!", 6, 520);
        
        blog1.addArticle(art1);
        blog1.addArticle(art2);
        blog1.addArticle(art1);
        blog1.addArticle(art2);
        blog1.addArticle(art4);
        blog1.addArticle(art5);
        blog1.addArticle(art5);
        blog1.addArticle(art1);
        
        
        blog1.printArticles();
    }
}
