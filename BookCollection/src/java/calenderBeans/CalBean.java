
package calenderBeans;

import java.util.Calendar;
import java.util.Date;

public class CalBean {
    
    private Calendar  calender;

    public CalBean() {
        calender = calender.getInstance();
    }
    public Date getTime(){ 
        return calender.getTime();
    }
    public int getHour(){ 
        return calender.get(calender.HOUR_OF_DAY);
    }
    public int getMinute(){ 
        return calender.get(calender.MINUTE);
    }
    
    
}
