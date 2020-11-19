package tecmilenio.alantamez;
//This is the doctor class

import java.io.*;


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
    
    public void showDoctor(String file){
        try{
        String cadena;
            createFile();
            FileReader showDoctor = new FileReader(file);
            BufferedReader buffer = new BufferedReader(showDoctor);
            while((cadena = buffer.readLine())!=null) {
                System.out.println(cadena);
            }
            buffer.close();
        } catch (FileNotFoundException e){
            System.out.println("Archivo no encontrado");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error");
        }
    }

}
