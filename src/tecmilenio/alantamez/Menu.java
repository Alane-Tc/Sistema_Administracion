package tecmilenio.alantamez;

import java.util.Scanner;

public class Menu {
    private Scanner entrada = new Scanner(System.in);
    private Doctor doctor = new Doctor();
    boolean cicle = true;
   private Doctor doctorClass = new Doctor();
   private Patient patientClass = new Patient();
   private Date dateClass = new Date();
    private void ShowMenu(){
        System.out.println("\t Bienvenid@ al Sistema de Administración!" +
                "\n Selecciona una opción"+"\n 1- Sección Doctores"+
                "\n 2- Sección Pacientes"+ "\n 3- Sección Cita"+
                "\n 0- Salir del sistema");
    }

    private int ask() throws Exception{
        Scanner ent = new Scanner(System.in);
        System.out.print("Digite una opcion: ");
        var menu = ent.nextInt();
        return menu;
    }

    private void Show_Switch(int menu) throws Exception {
        int submenu=0;
        switch (menu){
            case 1:
                System.out.print("Selecciono Doctores");
                lineTwo();
                doctorClass.altaDoctor();
                break;

            case 2:
                System.out.println("Selecciono Pacientes");
                lineTwo();
                patientClass.altaPaciente();
                break;

            case 3:
                System.out.println("Selecciono Citas");
                lineTwo();
                dateClass.altaCita();
                break;
                
            case 0:
                System.out.println("Gracias Por Visitar el sistema");
                cicle = false;
                break;
        }
    }
    public void Option_Message() throws Exception {
        do{
            line();
            ShowMenu();
            try {
                var menu = ask();
                if (menu <0 || menu >3){
                    throw new Exception("Opción No Valida");
                }
                Show_Switch(menu);

            }catch (Exception exception){
                System.out.println(exception.getMessage());
            }
        }while (cicle);
    }
    private void line(){
        System.out.println("\n---------------------");
    }
    private void lineTwo(){
        System.out.print("\n---------------------");
    }


}
