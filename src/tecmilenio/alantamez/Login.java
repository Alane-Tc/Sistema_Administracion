package tecmilenio.alantamez;


import java.util.Scanner;

public class Login {
    private Menu menu = new Menu();
    private String user;
    private String password;

    private String askLogin(){
        Scanner ent = new Scanner(System.in);
        System.out.print("Digite su usuario: ");
        user=ent.nextLine();
        System.out.print("Digite la contraseña:");
        password=ent.nextLine();
        return "";
    }

    public void login() throws Exception {
        askLogin();
        if (user.equals("Admin") && password.equals("Admin123")){
            menu.Option_Message();
        }else{
            System.out.println("Contraseña o usuario incorrecto");
            askLogin();
            if (user.equals("Admin")&& password.equals("Admin123")){
                menu.Option_Message();
            }
        }
    }
}
