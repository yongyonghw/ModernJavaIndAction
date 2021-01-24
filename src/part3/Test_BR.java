package part3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Test_BR {

    interface BR {
        String reader(BufferedReader r) throws IOException;
    }


    public static String proccessFile(BR r) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader("/Users/a1101432/workspace/ModrenJavaInAction/src/data.txt"))) {
            return r.reader(br);
        }

    }

    public static void main(String[] args) throws IOException {

        System.out.println(proccessFile((BufferedReader r ) -> r.readLine() + r.readLine()));
    }
}
