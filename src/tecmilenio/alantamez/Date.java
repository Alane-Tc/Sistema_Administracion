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
        System.out.print("¿Cuantos citas desea registrar?: ");
        ncitas = ent.nextInt();
    }

    public void datosCitas () {
        System.out.print("¿Cuál es el id de la cita?: ");
        id_date = ent.nextInt();
        System.out.print("¿Cuál es la fecha de la cita?: ");
        Date = ent.next();
        System.out.print("¿A que hora es la cita?: ");
        Time = ent.next();
        System.out.print("¿Cuál es el motivo de la cita?: ");
        Reason_date = ent.next();
    }

    public void opcionCitas () {
        System.out.println(
                "\n Selecciona una opción" + "\n 1- Alta Cita" +
                        "\n 2-MostrarCitas"+ "\n 3- Baja Cita");
    }

    public void altaCita(){

    }

}
