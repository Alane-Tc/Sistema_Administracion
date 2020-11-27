package tecmilenio.alantamez;

import java.io.*;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Files {
    private String fileDoctor = "C:\\Users\\alant\\OneDrive\\Documentos\\Proyectos-Universidad\\Sistema_Administracion\\src\\tecmilenio\\alantamez\\Doctors.csv";
    private static final String HOME_PATH = System.getProperty("user.home");
    private static final String FILENAME = "contacts.csv";

    public void FileManager() throws Exception {
        var separator = FileSystems.getDefault().getSeparator();
        var filepath = String.format("%s%s%s", HOME_PATH, separator, FILENAME);
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

    public void showDoctor(String file) throws Exception {
        try{
            String cadena;
            FileManager();
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

    public void deteleDoctor(){
         File fichero = new File(fileDoctor);
            if(!fichero.exists()){
                System.out.println("El archivo no existe");
            }else{
                fichero.delete();
                System.out.println("El archivo fue eliminado");
            }
    }


}
