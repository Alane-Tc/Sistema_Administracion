package tecmilenio.alantamez;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) throws Exception {
	 /*CLASE MASTER */
        String file = "C:\\Users\\alant\\OneDrive\\Documentos\\Proyectos-Universidad\\Sistema_Administracion\\Doctors.csv";
       Doctor d = new Doctor();
       d.addDoctor(82, "Alan", "Tamez", 4815158);
       d.showDoctor(file);
        /*Lamar funciones*/
        
    }
}
