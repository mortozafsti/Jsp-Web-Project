/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VendorPractise;

/**
 *
 * @author Cf-37
 */
public abstract class Book implements Readable1{
    public void readBook(){
        System.out.println("Read Book");
    }
}
class EBook3 extends Book{

    @Override
    public void readbook() {
        System.out.println("");
    }

    @Override
    public void download() {
        
    }
    
}