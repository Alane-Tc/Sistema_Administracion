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
    private static final String FILENAMEDATE = "Citas.csv";

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

    public void mostrarDoctores(){
        var separator = FileSystems.getDefault().getSeparator();
        var filepath = String.format("%s%s%s", HOME_PATH, separator, FILENAMEDOCTOR);
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;

        try {
            archivo = new File (filepath);
            fr = new FileReader (archivo);
            br = new BufferedReader(fr);

            String linea;
            while((linea=br.readLine())!=null)
                System.out.println(linea);
        }
        catch(FileNotFoundException e){
            System.out.println("Error al visualizar el archivo doctores");
        }catch (IOException ex){
            System.out.println("Error con la configuracion del archivo");
        }
        finally{

            try{
                if( null != fr ){
                    fr.close();
                }
            }catch (Exception e2){
                e2.printStackTrace();
            }
        }
    }

    /******************************PACIENTES***************************************************************/
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

    public void escribirDatosPaciente(int idPaciente, String nombrePaciente, String Apellido, int Edad){
        var separator = FileSystems.getDefault().getSeparator();
        var filepath = String.format("%s%s%s", HOME_PATH, separator, FILENAMEPATIENT);
        Path fileLocation = Paths.get(filepath);
        try{
            FileWriter writePaciente = new FileWriter(filepath, true);
            writePaciente.write("Id: "+idPaciente+" , "+"Nombre: "+ nombrePaciente+" , "+"Apellido: "+ Apellido+ " , "+"Edad: "+ Edad);
            writePaciente.write("\r\n");
            writePaciente.close();
        }catch (Exception e){
            System.out.println("Error al escribir "+ e);
        }
    }

    public void eliminarPacientes(){
        var separator = FileSystems.getDefault().getSeparator();
        var filepath = String.format("%s%s%s", HOME_PATH, separator, FILENAMEPATIENT);
        File fichero = new File(filepath);
        if (!fichero.exists()) {
            System.out.println("El archivo data no existe.");
        } else {
            fichero.delete();
            System.out.println("El archivo data fue eliminado.");
        }
    }

    public void mostrarPacientes(){
        var separator = FileSystems.getDefault().getSeparator();
        var filepath = String.format("%s%s%s", HOME_PATH, separator, FILENAMEPATIENT);
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        try {
            archivo = new File (filepath);
            fr = new FileReader (archivo);
            br = new BufferedReader(fr);
            String linea;
            while((linea=br.readLine())!=null)
                System.out.println(linea);
        }catch (FileNotFoundException e){
            System.out.println("Error al visualizar el archivo pacientes");
        }
        catch(Exception e){
            e.printStackTrace();
        }finally{

            try{
                if( null != fr ){
                    fr.close();
                }
            }catch (Exception e2){
                e2.printStackTrace();
            }
        }
    }

    /******************************CITAS***************************************************************/

    public void FileManagerCitas() throws Exception {
        var separator = FileSystems.getDefault().getSeparator();
        var filepath = String.format("%s%s%s", HOME_PATH, separator, FILENAMEDATE);
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

    public void escribirDatosCitas(int idDoctor, String Fecha, String Hora, String Motivo){
        var separator = FileSystems.getDefault().getSeparator();
        var filepath = String.format("%s%s%s", HOME_PATH, separator, FILENAMEDATE);
        Path fileLocation = Paths.get(filepath);
        try{
            FileWriter writeDoctor = new FileWriter(filepath, true);
            writeDoctor.write("Id: "+idDoctor+" , "+"Fecha: "+ Fecha+" , "+"Hora: "+ Hora+ " , "+"Motivo: "+ Motivo);
            writeDoctor.write("\r\n");
            writeDoctor.close();
        }catch (Exception e){
            System.out.println("Error al escribir "+ e);
        }
    }

    public void eliminarCitas(){
        var separator = FileSystems.getDefault().getSeparator();
        var filepath = String.format("%s%s%s", HOME_PATH, separator, FILENAMEDATE);
        File fichero = new File(filepath);
        if (!fichero.exists()) {
            System.out.println("El archivo data no existe.");
        } else {
            fichero.delete();
            System.out.println("El archivo data fue eliminado.");
        }
    }

    public void verArchivoCitas(){
        var separator = FileSystems.getDefault().getSeparator();
        var filepath = String.format("%s%s%s", HOME_PATH, separator, FILENAMEDATE);
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;

        try {
            archivo = new File (filepath);
            fr = new FileReader (archivo);
            br = new BufferedReader(fr);
            String linea;
            while((linea=br.readLine())!=null)
                System.out.println(linea);
        }catch (FileNotFoundException e){
            System.out.println("Error al visualizar el archivo Cita");
        }
        catch(Exception e){
            e.printStackTrace();
        }finally{

            try{
                if( null != fr ){
                    fr.close();
                }
            }catch (Exception e2){
                e2.printStackTrace();
            }
        }
    }

}
