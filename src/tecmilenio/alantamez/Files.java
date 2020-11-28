package tecmilenio.alantamez;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Files {
    private static final String HOME_PATH = System.getProperty("user.home");
    private static final String FILENAMEDOCTOR = "Doctors.csv";

    List<ShowDoctors> Doctores = new ArrayList<ShowDoctors>();

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
            writeDoctor.write("Id: "+idDoctor+" , "+"Nombre: "+ nombreDoctor+" , "+"Apellido: "+ Apellido+ " , "+"Cedula: "+ Especialidad);
            writeDoctor.write("\r\n");
            writeDoctor.close();
        }catch (Exception e){
            System.out.println("Error al escribir "+ e);
        }
    }

   /* public void createFileDoctor(){
        String separator = FileSystems.getDefault().getSeparator();
        String fileName = String.format("src%stecmilenio%salantamez%sDoctors.csv",separator,separator,separator,separator);
        Path path = Paths.get(fileName);

        ArrayList<String> lines = new ArrayList<>();

        if(!java.nio.file.Files.exists(path)){
            File file = new File(String.valueOf(path));
            try {
                file.createNewFile();
            } catch (IOException e) {
                System.out.println("Error"+ e);
            }
        }
    }*/



    public void deteleDoctor(){

    }
}
