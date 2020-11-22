package tecmilenio.alantamez;

import java.util.Scanner;

public class Menu {
    private Scanner entrada = new Scanner(System.in);
    private Doctor doctor = new Doctor();
    private String idDoctor;
    private String nameDoctor;
    private String lastnameDoctor;
    private String identificationDoctor;
    boolean cicle = true;
    private void ShowMenu(){
        System.out.println("\t Bienvenid@ al sistema de administración!" +
                "\n Selecciona una opción"+"\n 1- Sección Doctores"+
                "\n 2- Sección pacientes"+ "\n 3- Sección cita"+
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
                System.out.print("Selecciono doctores");
                line();
                showDoctors();
                System.out.print("Digite que opción quieres de doctores: ");
                 submenu = entrada.nextInt();
                if (submenu ==1){
                    askInformationDoctor();
                   doctor.addDoctor(idDoctor,nameDoctor,lastnameDoctor,identificationDoctor);
                }else if(submenu == 2){
                    doctor.showDoctor(lastnameDoctor, identificationDoctor);
                }else if(submenu ==3){
                    System.out.print("¿Cuál es id del doctor: ");
                    var idDoctorr = entrada.next();
                    doctor.deleteDoctor(idDoctorr);
                }else if(submenu >3){
                    System.out.println("Opcion no disponible");
                }
                break;

            case 2:
                System.out.println("Opcion 2");
                /*1- Alta pacientes
                 * 2- Mostrar resultados
                 * 3- Eliminar pacientes
                 * 4- Actualizar paciente*/
                break;

            case 3:
                System.out.println("Opcion 3");
                /*1- Alta cita
                 * 2- Mostrar resultados
                 * 3- Eliminar cita
                 */
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

    private void showDoctors(){
        System.out.print(
                "\n Selecciona una opción: "+"\n 1- Dar De Alta Doctores"+
                "\n 2- Mostrar Doctores"+ "\n 3- Eliminar Doctores"+
                "\n 0- Salir del sistema");
    }

    private void askInformationDoctor(){
        System.out.print("¿Cuál es id del doctor: ");
        idDoctor = entrada.next();
        System.out.print("¿Cuál es nombre del doctor: ");
        nameDoctor = entrada.next();
        System.out.print("¿Cuál es apellido del doctor: ");
        lastnameDoctor = entrada.next();
        System.out.print("¿Cuál es la celula del doctor: ");
        identificationDoctor = entrada.next();
    }


}
