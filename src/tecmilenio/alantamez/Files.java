package tecmilenio.alantamez;

import java.io.*;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Files {
    private static final String HOME_PATH = System.getProperty("user.home");
    private static final String FILENAMEDOCTOR = "Doctors.csv";
    private static final String FILENAMEPATIENT = "Pacientes.csv";

    public void FileManager() throws Exception {
        var separator = FileSystems.getDefault().getSeparator();
        var filepath = String.format("%s%s%s", HOME_PATH, separator, FILENAMEDOCTOR);
       Path fileLocation = Paths.get(filepath);

        if(!java.nio.file.Files.exists(fileLocation)){
            File file = new File(String.valueOf(fileLocation));
            try {
                file.createNewFile();
            } catch (IOException e) {
                System.out.println("Error"+ e);
            }
        }

    }

    public void escribirDatosDoctor(int idDoctor, String nombreDoctor, String Apellido, String Especialidad){
        var separator = FileSystems.getDefault().getSeparator();
        var filepath = String.format("%s%s%s", HOME_PATH, separator, FILENAMEDOCTOR);
        Path fileLocation = Paths.get(filepath);
        try{
            FileWriter writeDoctor = new FileWriter(filepath, true);
            writeDoctor.write("Id: "+idDoctor+" , "+"Nombre: "+ nombreDoctor+" , "+"Apellido: "+ Apellido+ " , "+"Especialidad: "+ Especialidad);
            writeDoctor.write("\r\n");
            writeDoctor.close();
        }catch (Exception e){
            System.out.println("Error al escribir "+ e);
        }
    }

    public void eliminarDoctores(){
        var separator = FileSystems.getDefault().getSeparator();
        var filepath = String.format("%s%s%s", HOME_PATH, separator, FILENAMEDOCTOR);
        File fichero = new File(filepath);
        if (!fichero.exists()) {
            System.out.println("El archivo data no existe.");
        } else {
            fichero.delete();
            System.out.println("El archivo data fue eliminado.");
        }
    }

    public void FileManagerPacientes() throws Exception {
        var separator = FileSystems.getDefault().getSeparator();
        var filepath = String.format("%s%s%s", HOME_PATH, separator, FILENAMEPATIENT);
        Path fileLocation = Paths.get(filepath);
        if(!java.nio.file.Files.exists(fileLocation)){
            File file = new File(String.valueOf(fileLocation));
            try {
                file.createNewFile();
            } catch (IOException e) {
                System.out.println("Error"+ e);
            }
        }

    }

    


}
