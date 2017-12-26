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
        System.out.println("---");
        System.out.println("*");
        System.out.println(args +" Hello, World");
        System.out.println("*");
        System.out.println("---");
        String wt = WhatsTime();
        System.out.println(wt);

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
