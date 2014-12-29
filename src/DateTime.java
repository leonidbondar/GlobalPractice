    import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
     
    public class DateTime extends TestDrive {
            public static String getDateTime() {
                    DateFormat dateFormat = new SimpleDateFormat("yyyy_MM_dd_HH-mm-ss");
                    Date date = new Date();
                    return dateFormat.format(date);
            }
    }