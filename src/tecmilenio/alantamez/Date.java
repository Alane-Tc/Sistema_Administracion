package tecmilenio.alantamez;

//This class Date

import java.util.Scanner;

public class Date {
    private Scanner ent = new Scanner(System.in);
    private int id_date;
    private  int Doctor_id;
    private int Patient_id;
    private String Date;
    private String Time;
    private String Reason_date;
    private int ncitas;
    private int submenu = 0;
    private boolean continie = true;
    Files fileDate = new Files();

    public void NumCitas () {
        System.out.print("¿Cuantos Citas desea registrar?: ");
        ncitas = ent.nextInt();
    }

    public void datosCitas () {
        System.out.print("¿Cuál es el id de la Cita?: ");
        id_date = ent.nextInt();
        System.out.print("¿Cuál es la fecha de la Cita?: ");
        Date = ent.next();
        System.out.print("¿A que hora es la Cita?: ");
        Time = ent.next();
        System.out.print("¿Cuál es el motivo de la Cita?: ");
        Reason_date = ent.next();
    }

    public void opcionCitas () {
        System.out.println(
                "\n Selecciona una opción" + "\n 1- Alta Cita" +
                        "\n 2-MostrarCitas"+ "\n 3- Baja Cita");
    }

    public void altaCita() throws Exception {
        do {
            opcionCitas();
            System.out.print("Digite que opción quieres de citas: ");
            submenu = ent.nextInt();
            if (submenu == 1) {
                NumCitas();
                fileDate.FileManagerCitas();
                Object[][] listDoctor = new Object[ncitas][1];
                for (int i = 0; i < ncitas; i++) {
                    datosCitas();
                    lineaDiv();
                    for (int j = 0; j < listDoctor[i].length; j++) {
                        listDoctor[i][j] = id_date + "," + Date + "," + Time + "," + Reason_date;
                    }
                    fileDate.escribirDatosCitas(id_date,Date, Time, Reason_date);
                }
                System.out.println("Datos Registrados");
                for (int a = 0; a < ncitas; a++) {
                    for (int j = 0; j < listDoctor[a].length; j++) {
                        System.out.print(listDoctor[a][j] + " ");
                    }
                    System.out.println("\n");
                }
            }  else if (submenu == 2) {
                fileDate.verArchivoCitas();
            }else if(submenu ==3){
                fileDate.eliminarCitas();
            } else if (submenu > 3) {
                System.out.println("Opcion no disponible");
                continie = false;
            }
        } while (continie);
    }
    private void lineaDiv() {
        System.out.println("---------------------------------------------------");
    }
}

