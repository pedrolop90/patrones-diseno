package com.patrones.util;

public final class FileCustomUtil {

    private FileCustomUtil(){

    }


    public static void escribirArchivo(String fileName, String texto){
        System.out.println(
                String.format("%s - %s - %s - %s", "Se ha escrito en el archivo", fileName, "el texto", texto)
        );
    }

}
