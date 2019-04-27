
package dump;

public interface Readable {
    
    public void readBook();
    public void setBookMark();
}

abstract class Book implements Readable{
    public void readBook(){
        
    }
    
}
 abstract class EBook extends Book{

    @Override
    public void readBook() {
        
    }

   

  

}
