package tecmilenio.alantamez;
//This is the doctor class

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class Doctor {
    private File file;

    public void createFile(){
        file = new File("Doctors.csv");

        try {
            if(file.createNewFile()){
                System.out.println("El archivo se ha creado");
            }

        }catch (IOException ex){
            System.out.println("No se puedo crear el archivo");
        }
    }

    public void addDoctor(int id, String nameDoctor, String lastName, int identicacion){
        try{
            createFile();
            FileWriter writeDoctor = new FileWriter(file, true);
            writeDoctor.write("Id: "+id+" , "+"Nombre: "+ nameDoctor+" , "+"Apellido: "+ lastName+ " , "+"Identicicaion: "+ identicacion);
            writeDoctor.write("\r\n");
            writeDoctor.close();
        }catch (Exception e){
            System.out.println("Error al escribir ");
        }
    }

}
