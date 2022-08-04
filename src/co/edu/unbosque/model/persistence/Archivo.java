package co.edu.unbosque.model.persistence;

import java.io.*;

/**
 * Clase encargada de manejar la persistencia del programa.
 * @author Oscar Moreno
 * @author Jose Salcedo
 * @author Daniel Pedreros
 */
public class Archivo {
    /**
     * Objeto de la clase File, permite crear el respectivo archivo de historial.
     */
    private final File file;

    /**
     * Objeto de la clase String, permite almacenar el texto que se va a ingresar en el archivo.
     */
    private String texto = "";

    /**
     * Metodo constructor de la clase.
     */
    public Archivo() {
        file = new File("files/log.txt");
    }

    /**
     * Metodo encargado de leer el archivo de historial (log.txt)
     * @return Retorna posibles errores a la hora de leer el archivo.
     */
    public String leerArchivo() {
        FileInputStream fileInputStream;
        InputStreamReader inputStreamReader;
        BufferedReader linea;
        try {
            fileInputStream = new FileInputStream(file);
            inputStreamReader = new InputStreamReader(fileInputStream);
            linea = new BufferedReader(inputStreamReader);

            if (file.exists()) {
                String linea_arch = linea.readLine();
                String archivo_total = linea_arch;
                while (linea_arch != null) {
                    linea_arch = linea.readLine();
                    if (linea_arch != null) {
                        archivo_total = archivo_total + "\n" + linea_arch;
                    }
                }
                linea.close();
                return archivo_total;
            } else {
                return "El archivo no existe.";
            }
        } catch (IOException e) {
            return "No se pudo leer el archivo.";
        }
    }

    /**
     * Metodo encargado de escribir nuevas lineas en el archivo de historial (log.txt)
     * @param message Indica el mensaje que se va a guardar.
     * @return Retorna posibles errores a la hora de escribir en el archivo o que se completo la accion.
     */
    public String escribirArchivo(String message) {
        texto = leerArchivo();
        try {
            FileWriter fileWriter = new FileWriter(file);

            if (texto != null) {
                fileWriter.write(texto + "\r\n" + message + "\r\n");
            } else {
                fileWriter.write(message + "\r\n");
            }

            fileWriter.close();
            return "Línea ingresada con éxito.";
        } catch (IOException e) {
            return "Hubo un error al intentar escribir en el archivo.";
        }
    }
}
