/**
 *
 */
package Hello_World;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * @author okuda
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
        String wt = WhatsTime();
        System.out.println("---");
        System.out.println(wt);
        System.out.println("---");
        System.out.println(args);
        System.out.println("---");
        System.out.println(" Hello, World");

	}

	/**
     * @return returnString
     */
    public static String WhatsTime() {
        String returnString;
        Calendar returnDate = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss:SSS");
        returnString =sdf.format(returnDate.getTime());
        return returnString;
    }

}
