
package archivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class Archivos {
    public static void main(String[] args) throws IOException {
        File file = new File("./archivo2.txt");
        file.createNewFile(); //crear un método para crear archivos y manejar la excepción
        
        FileWriter writer = new FileWriter(file);
        PrintWriter pw = new PrintWriter(writer);
        
        for (int i = 0; i < 10; i++) {
            pw.print("Linea " + i);
        }
        writer.close();
    }
}
