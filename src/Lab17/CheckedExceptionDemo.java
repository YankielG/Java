package Lab17;

import java.net.MalformedURLException;
import java.net.URL;

public class CheckedExceptionDemo {

    public static void main(String[] args) throws MalformedURLException {
        CheckedExceptionDemo cet = new CheckedExceptionDemo();
        cet.urlTesterByTryCatch("http://wszib.edu.pl");
        cet.urlTesterByThrows("ahttp://wszib.edu.pl");
    }

    public void urlTesterByTryCatch(String urlStr) {
        try {
            URL url = new URL(urlStr);
            System.out.println("Protocol: " + url.getProtocol());
            System.out.println("Host: " + url.getHost());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    public void urlTesterByThrows(String urlStr) throws MalformedURLException {
        URL url = new URL(urlStr);
        System.out.println("Protocol: " + url.getProtocol());
        System.out.println("Host: " + url.getHost());
    }
}
