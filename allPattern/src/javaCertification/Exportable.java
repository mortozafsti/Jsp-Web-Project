
package javaCertification;

public interface Exportable {
    
    void export();
    
}

class Tool implements Exportable {

   
    protected void export() {
        
        System.out.println("Tool: Export");
    }
    
}
class ReportTool extends Tool implements Exportable{
    
    public void export(){
        System.out.println("RTool: Export");
    }
    
    public static void main(String[] args) {
        
        Tool atool = new ReportTool();
        Tool btool = new Tool();
        
        callExport(atool);
        callExport(btool);
        
    }
    
    public static void callExport(Exportable e){
        e.export();
    }
}
