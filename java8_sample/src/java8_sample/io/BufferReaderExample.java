package java8_sample.io;

import java.io.*;
import java.util.Scanner;

public class BufferReaderExample {

    public static void static_run() throws IOException {
        File f1 = new File("//home//vagrant//Desktop");
        f1.mkdirs();
        File f2 = new File(f1, "Mike.txt");
        if (!f2.exists()) {
            f2.createNewFile();
        }
        FileReader fr = new FileReader(f2);
        BufferedReader br = new BufferedReader(fr);

        String sentence = null;

        while ( (sentence = br.readLine()) != null  ) {
            System.out.println(sentence);

        }

        br.close();
        fr.close();
    }

}
