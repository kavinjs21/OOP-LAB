import java.net.InetAddress;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Package3 {
    public static void main(String[] args) {
        double power = Math.pow(2, 5);
        double sqrt = Math.sqrt(64);
        System.out.println("2^5 = " + power);
        System.out.println("Square root of 64 = " + sqrt);

        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        Date now = new Date();
        System.out.println("Formatted Date: " + formatter.format(now));

        try {
            InetAddress ip = InetAddress.getLocalHost();
            System.out.println("Your System's IP Address: " + ip.getHostAddress());
        } catch (Exception e) {
            System.out.println("Unable to get IP Address.");
        }
    }
}
