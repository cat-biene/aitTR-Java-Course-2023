package practice.io_stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteOutputAppl {

    public static void main(String[] args) {

        try (FileOutputStream fout = new FileOutputStream("./dest/data.txt")) {
            fout.write(65); // это буква А
            fout.write(66); // это буква B
            fout.write(27); // пишем в файл
            fout.write(257);
            fout.write(1);
            fout.write(67);
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
