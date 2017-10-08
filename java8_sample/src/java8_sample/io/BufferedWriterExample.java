package java8_sample.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BufferedWriterExample {

    public static void static_run() throws IOException {
        File f1 = new File("//home//vagrant//Desktop");
        f1.mkdirs();
        File f2 = new File(f1, "Mike.txt");
        if (!f2.exists()) {
            f2.createNewFile();
        }
        FileWriter fw = new FileWriter(f2);
        BufferedWriter bw = new BufferedWriter(fw);

        Scanner sc = new Scanner(System.in);
        String sentence = "";

        while ( !(sentence = sc.nextLine()).equals("bye")  ) {
            bw.write(sentence);
            bw.newLine();
        }

//        while ( !(sentence = sc.next()).equals("bye")  ) {
//            bw.write(sentence);
//            bw.newLine();
//        }
        bw.close();
        fw.close();
    }

}
