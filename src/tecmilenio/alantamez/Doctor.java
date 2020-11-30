package tecmilenio.alantamez;
//This is the doctor class

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Doctor {
    private Scanner ent = new Scanner(System.in);
    private Files filedoctor = new Files();
    private int ndoctores;
    private int idDoctor = 0;
    private String nombreDoctor;
    private String Apellido;
    private String Especialidad;
    private int submenu = 0;
    private boolean continie = true;

    private void NumDoctores() {
        System.out.print("¿Cuantos doctores desea registrar?: ");
        ndoctores = ent.nextInt();

    }

    private void datosDoctores() {

        System.out.print("¿Cuál es el id?: ");
        idDoctor = ent.nextInt();
        System.out.print("¿Cuál es el nombre del Doctor?: ");
        nombreDoctor = ent.next();
        System.out.print("¿Cuál es el apellido del Doctor?: ");
        Apellido = ent.next();
        System.out.print("¿Cuál es el Especialidad?: ");
        Especialidad = ent.next();

    }

    private void opcionDoctor() {
        System.out.println(
                "\n Selecciona una opción" + "\n 1- Alta Doctores" + "\n 2- Mostrar Doctores"+ "\n 3- Baja Doctores");
    }

    public void altaDoctor() throws Exception {
        do {
            opcionDoctor();
            System.out.print("Digite que opción quieres de Doctores: ");
            submenu = ent.nextInt();
            if (submenu == 1) {
                NumDoctores();
                filedoctor.FileManager();
                Object[][] listDoctor = new Object[ndoctores][1];
                for (int i = 0; i < ndoctores; i++) {
                    datosDoctores();
                    lineaDiv();
                    for (int j = 0; j < listDoctor[i].length; j++) {
                        listDoctor[i][j] = idDoctor + "," + nombreDoctor + "," + Apellido + "," + Especialidad;
                    }
                    filedoctor.escribirDatosDoctor(idDoctor, nombreDoctor, Apellido, Especialidad);
                }
                System.out.println("Datos Registrados");
                for (int a = 0; a < ndoctores; a++) {
                    for (int j = 0; j < listDoctor[a].length; j++) {
                        System.out.print(listDoctor[a][j] + " ");
                    }
                    System.out.println("\n");
                }
            } else if (submenu ==2){
                filedoctor.mostrarDoctores();
            }else if (submenu ==3){
                filedoctor.eliminarDoctores();
            }else if (submenu >3 || submenu <=0) {
                System.out.println("Opcion No Valida");
                continie = false;
            }

        } while (continie);

    }

    private void lineaDiv() {
        System.out.println("---------------------------------------------------");
    }

}
