
package JavaClasses;

import java.util.HashMap;
import java.util.Iterator;
import org.apache.tomcat.util.http.fileupload.FileItemStream;

public class Cart {
    
    private HashMap items = new HashMap();

    public Cart() {
    }
    public Iterator getItems(){ 
        return items.values().iterator();
    }
    public void addItem(Products products){ 
        Integer id = new Integer(products.getId());
        if (this.items.containsKey(id)) {
            //throw new ();
        }
        this.items.put(id, products);
    }
}
