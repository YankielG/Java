package Lab15.pl.edu.wszib.jwe;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileDataPrevider implements DataProvaider {


    @Override
    public String getData() {
        try {
            return  new String(Files.readAllBytes(Paths.get("scr/pl.edu.wszib.jwe/data.txt")));
        } catch (IOException e) {
            System.out.println("blad");
//            e.printStackTrace();
        }
        return "błedne dane";
    }



}

