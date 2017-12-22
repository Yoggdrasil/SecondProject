package prompt;

// import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        // нужно прочитать файл input.txt  и вывести на экран

        FileInputStream input = new FileInputStream("input.txt");
        byte [] data = new byte[input.available()];
        input.read(data);

        String text = new String(data);

        System.out.println(text);

        FileOutputStream output = new FileOutputStream("output.txt", true);
        String newtext = "Hatsune Miku is the best!\n";

        byte [] newTextRytes = newtext.getBytes();
        output.write(newTextRytes);
        output.close();


        // la-la-la













        /*
        File dir = new File("."); // "." - обозначение для текущего каталога

        String [] names = dir.list();
        for (int i = 0; i< names.length; i++){
            System.out.println(names[i]);
        }

        File file = new File("input.txt");
        System.out.println(file.length());
        */

    }
}