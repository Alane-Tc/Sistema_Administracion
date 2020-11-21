package tecmilenio.alantamez;
//This is the doctor class

import java.io.*;

import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;


public class Doctor {
    private HashMap<String,String> listDoctors = new HashMap<>();
    private String file = "C:\\Users\\alant\\OneDrive\\Documentos\\Proyectos-Universidad\\Sistema_Administracion\\src\\tecmilenio\\alantamez\\Doctors.csv";

    public void createFile() throws IOException{
        String separator = FileSystems.getDefault().getSeparator();
        String fileName = String.format("src%stecmilenio%salantamez%sDoctors.csv",separator,separator,separator,separator);
        Path path = Paths.get(fileName);

        ArrayList<String> lines = new ArrayList<>();

        if(!Files.exists(path)){
            File file = new File(String.valueOf(path));
            file.createNewFile();
        }
        lines = (ArrayList<String>) Files.readAllLines(path);
        for (var users : lines){
            var infoContact = users.split(",");
            listDoctors.put(infoContact[0].trim(),infoContact[1].trim());
        }

    }

    public void save() throws IOException {
        String separator = FileSystems.getDefault().getSeparator();
        String fileName = String.format("src%stecmilenio%salantamez%sDoctors.csv",separator,separator,separator,separator);
        Path path = Paths.get(fileName);
        ArrayList<String> saveContacts = new ArrayList<>();
        for (var users : listDoctors.entrySet()){
            saveContacts.add(users.getKey()+", "+ users.getValue());
        }
        Files.write(path,saveContacts);
    }

    public void addDoctor(String id, String nameDoctor, String lastName, String identicacion) throws IOException {
        if (listDoctors.containsKey(id)){
            System.out.println("El Id del doctor ya existe");
        }else {
            listDoctors.put(id.trim(),nameDoctor.trim()+" , "+ lastName+ ", " + identicacion);
            save();
            createFile();
            System.out.println("Doctor registrado Correctamente");
        }
    }
    
    public void showDoctor(String lastname, String Identification){
        try{
            createFile();
            FileReader showUsers = new FileReader(file);
            BufferedReader buffer = new BufferedReader(showUsers);
            if (listDoctors.isEmpty()){
                System.out.println("Aun no ha registrado doctores");
            }else{
                for(var user : listDoctors.entrySet()){
                    System.out.println(String.format("Id: %s, Nombre: %s"+ " , "
                                    + " Apellido: "+" , "+ " Cedula: ",
                            user.getKey(),user.getValue()));
                }
            }
            buffer.close();
        } catch (FileNotFoundException e){
            System.out.println("Archivo no encontrado");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error");
        }
    }

    public void deleteDoctor(String id) throws IOException {
        if (listDoctors.containsKey(id)){
            System.out.println("No existe registro de este doctor");
        }else{
            var p = listDoctors.remove(id);
            save();
            createFile();
            System.out.println("Doctor Eliminado");
        }
    }

}
