

package com.mycompany.tareasconarchivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;

public class TareasConArchivos {

    public static void main(String[] args) throws IOException {
        File file = new File("./archivo.txt");
        
        if(!file.exists()){
            try {
            file.createNewFile();
            System.out.println("¡Archivo creado exitosamente!");
            } catch (IOException e){
                System.out.println("No se pudo crear el archivo");   
            } 
        } else {
            System.out.println("El archivo ya existe");
        }
        
        FileReader reader = new FileReader(file, Charset.forName("UTF8"));
        System.out.println(reader.getEncoding());
        
        //ACCEDER CARACTER A CARACTER
        
        /*
        char[] data = new char[50];
        reader.read(data);
        
        System.out.println(data);
        reader.close();
        //validar si es número, cada palabra empieza después de un espacio o salto de linea, convertir a mayúscula la primera letra
        */
        
        //ACCEDER LINEA A LINEA
        
        BufferedReader buffer = new BufferedReader (reader);
        
        String line;
        
        while((line = buffer.readLine()) != null) {
            System.out.println("Line: " + line);
        }
        reader.close();
    }
}
