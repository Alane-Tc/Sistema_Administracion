package tecmilenio.alantamez;

import java.util.Scanner;

public class Menu {

    int alta_doctor =0;
    int alta_paciente=0;


    boolean cicle = true;
    public void ShowMenu(){
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

    public void Show_Switch(int menu) throws Exception {

        switch (menu){
            case 1:
                System.out.println("Opcion 1");
                /*1- Alta doctor
                * 2- Mostrar resultados
                * 3- Eliminar doctor
                */
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
    void line(){
        System.out.println("\n---------------------");
    }

}
