package tecmilenio.alantamez;
//This is the doctor class

import java.io.*;
import java.util.Scanner;


public class Doctor {
    private String file = "C:\\Users\\alant\\OneDrive\\Documentos\\Proyectos-Universidad\\Sistema_Administracion\\src\\tecmilenio\\alantamez\\Doctors.csv";
    private Scanner ent = new Scanner(System.in);
    private Files filedoctor = new Files();
    private int ndoctores;
    private int idDoctor = 0;
   private String nombreDoctor;
    private String Apellido;
    private int cedula = 0;
    private int submenu =0;
    private boolean continie = true;

  private void NumDoctores(){
      System.out.print("¿Cuantos doctores desea registrar?: ");
      ndoctores= ent.nextInt();
  }

  private void datosDoctores(){

          System.out.print("¿Cuál es el id?: ");
          idDoctor = ent.nextInt();
          System.out.print("¿Cuál es el nombre del doctor: ");
          nombreDoctor = ent.next();
          System.out.print("¿Cuál es el apellido del doctor: ");
          Apellido = ent.next();
          System.out.print("¿Cuál es el cedula: ");
          cedula = ent.nextInt();

  }

  private void opcionDoctor(){
      System.out.println(
              "\n Selecciona una opción"+"\n 1- Alta Doctores"+
              "\n 2- Mostrar Doctores"+ "\n 3- Baja Doctores");
  }

    public void altaDoctor(){
      do{
          opcionDoctor();
          System.out.print("Digite que opción quieres de doctores: ");
          submenu = ent.nextInt();
          if (submenu ==1){
              NumDoctores();
              filedoctor.createFileDoctor();
              Object [][] listDoctor = new Object[ndoctores][1];
              for (int i=0; i< ndoctores; i++){
                  datosDoctores();
                  lineaDiv();
                  for (int j=0; j< listDoctor[i].length; j++){
                      listDoctor[i][j]= idDoctor +","+nombreDoctor +","+Apellido +","+cedula;
                  }
                  try{
                      FileWriter writeDoctor = new FileWriter(file, true);
                      writeDoctor.write("Id: "+idDoctor+" , "+"Nombre: "+ nombreDoctor+" , "+"Apellido: "+ Apellido+ " , "+"Cedula: "+ cedula);
                      writeDoctor.write("\r\n");
                      writeDoctor.close();
                  }catch (Exception e){
                      System.out.println("Error al escribir ");
                  }
              }
              System.out.println("Datos Registrados");
              for (int a=0; a< ndoctores; a++){
                  for (int j=0; j< listDoctor[a].length; j++){
                      System.out.print(listDoctor[a][j]+ " ");
                  }
                  System.out.println("\n");
              }
          }else if(submenu == 2){
            filedoctor.showDoctor(file);
          }else if(submenu ==3){
            filedoctor.deteleDoctor();
          }else if(submenu >3){
              System.out.println("Opcion no disponible");
              continie = false;
          }
          
      }while (continie);

    }
    private void lineaDiv(){
        System.out.println("---------------------------------------------------");
    }

}
