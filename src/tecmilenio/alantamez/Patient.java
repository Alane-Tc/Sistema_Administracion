package tecmilenio.alantamez;

import java.util.Scanner;

public class Patient {
    private Scanner ent = new Scanner(System.in);
    private int id_Patient;
    private String patient_Name;
    private String lastName;
    private int age;
    private int nPacientes;
    private int submenu = 0;
    private boolean continie = true;
    private Files filePaciente = new Files();

    //Metodos
    private void NumPacientes() {
        System.out.print("¿Cuantos pacientes desea registrar?: ");
        nPacientes = ent.nextInt();
    }

    private void datosPacientes() {

        System.out.print("¿Cuál es el id?: ");
        id_Patient = ent.nextInt();
        System.out.print("¿Cuál es el nombre del Paciente: ");
        patient_Name = ent.next();
        System.out.print("¿Cuál es el apellido del Paciente ");
        lastName = ent.next();
        System.out.print("¿Cuál es la edad del paciente: ");
        age = ent.nextInt();

    }

    private void opcionPacientes() {
        System.out.println(
                "\n Selecciona una opción" + "\n 1- Alta Pacientes" +
                        "\n 2- Baja Pacientes");
    }

    public void altaDoctor() throws Exception {
        do {
            opcionPacientes();
            System.out.print("Digite que opción quieres de doctores: ");
            submenu = ent.nextInt();
            if (submenu == 1) {
                NumPacientes();
               filePaciente.FileManagerPacientes();
                Object[][] listPatient = new Object[nPacientes][1];
                for (int i = 0; i < nPacientes; i++) {
                    datosPacientes();
                    lineaDiv();
                    for (int j = 0; j < listPatient[i].length; j++) {
                        listPatient[i][j] = id_Patient + "," + patient_Name + "," + lastName + "," + age;
                    }
                    filePaciente.escribirDatosPaciente(id_Patient, patient_Name, lastName, age);
                }
                System.out.println("Datos Registrados");
                for (int a = 0; a < nPacientes; a++) {
                    for (int j = 0; j < listPatient[a].length; j++) {
                        System.out.print(listPatient[a][j] + " ");
                    }
                    System.out.println("\n");
                }
            }  else if (submenu == 2) {
                filePaciente.eliminarDoctores();
            } else if (submenu > 2) {
                System.out.println("Opcion no disponible");
                continie = false;
            }

        } while (continie);

    }

    private void lineaDiv() {
        System.out.println("---------------------------------------------------");
    }

}
