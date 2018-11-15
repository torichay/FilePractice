package filepractice;

import java.util.ArrayList;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FilePractice {

    public static void main(String[] args) {

        ArrayList<String> filenames = new ArrayList<String>();

        File direct = new File("F:\\ТГУ\\Netcracker\\Java\\JavaProjects\\FilePractice\\files");
        //File direct = new File(System.getProperty("user.dir"));

        File[] files = direct.listFiles();
        for (File tmp : files) {
            if (tmp.isFile()) {
                filenames.add(tmp.getName());
            }
        }

        try {
            FileWriter wrt = new FileWriter("filenames.txt");
            for (int i = 0; i < filenames.size(); i++) {
                wrt.write(filenames.get(i));
                wrt.append("\r\n");
                wrt.flush();
            }
            wrt.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
