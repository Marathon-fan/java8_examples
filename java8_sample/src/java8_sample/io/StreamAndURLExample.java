package java8_sample.io;

import java.io.*;
import java.net.URL;

public class StreamAndURLExample {

    public static void static_run() throws IOException {
        File f1 = new File("//home//vagrant//Desktop");
        f1.mkdirs();
        File f2 = new File(f1, "max.jpg");
        if (!f2.exists()) {
            f2.createNewFile();
        }
        FileOutputStream fos = new FileOutputStream(f2);
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        URL url = new URL("https://mohammadrasoolshaik.files.wordpress.com/2015/06/steams.jpg");
        InputStream openStream = url.openStream();
        BufferedInputStream bis = new BufferedInputStream(openStream);

        int n = 0;
        while ((n = bis.read()) != -1) {
            bos.write(n);
            bos.flush();
        }
        bis.close();
        openStream.close();
        bos.close();
        fos.close();
    }


}
