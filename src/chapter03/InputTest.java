package chapter03;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.InputStream;

public class InputTest {

    public static void main(String[] args) throws Exception{
        int c;

        try {
            InputStream in = new LowerCaseInputStream(
                    new BufferedInputStream(
                            new FileInputStream("text.txt")));

            while((c = in.read()) >= 0) {
                System.out.print((char) c);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
