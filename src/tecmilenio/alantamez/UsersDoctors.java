package tecmilenio.alantamez;

public class UsersDoctors {

    private int idDoctor = 0;
    private String nombreDoctor;
    private String Apellido;
    private String Especialidad;

    public UsersDoctors(int idDoctor, String nombreDoctor, String apellido, String especialidad) {
        this.idDoctor = idDoctor;
        this.nombreDoctor = nombreDoctor;
        Apellido = apellido;
        Especialidad = especialidad;
    }

    public int getIdDoctor() {
        return idDoctor;
    }

    public String getNombreDoctor() {
        return nombreDoctor;
    }

    public String getApellido() {
        return Apellido;
    }

    public String getEspecialidad() {
        return Especialidad;
    }

}
