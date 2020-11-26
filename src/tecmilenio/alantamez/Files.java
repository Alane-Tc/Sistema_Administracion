package tecmilenio.alantamez;

import java.io.*;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Files {
    private String fileDoctor = "C:\\Users\\alant\\OneDrive\\Documentos\\Proyectos-Universidad\\Sistema_Administracion\\src\\tecmilenio\\alantamez\\Doctors.csv";

    public void createFileDoctor(){
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
    }

    public void showDoctor(String file){
        try{
            String cadena;
            createFileDoctor();
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
