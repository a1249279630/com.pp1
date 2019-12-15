package day05;

import javax.print.DocFlavor;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class Pabaidu {
    public static void main(String[] args) throws IOException {
        URL url=new URL("https://www.jd.com/");
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(url.openStream()));
        boolean string;
        while(string=bufferedReader.readLine()!=null){
            System.out.println(string);
        }
        bufferedReader.close();
    }
}
