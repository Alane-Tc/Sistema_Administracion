package tecmilenio.alantamez;

public class ShowDoctors {

    private int idDoctor = 0;
    private String nombreDoctor;
    private String Apellido;
    private String Especialidad;

    public ShowDoctors(int idDoctor, String nombreDoctor, String apellido, String especialidad) {
        this.idDoctor = idDoctor;
        this.nombreDoctor = nombreDoctor;
        Apellido = apellido;
        Especialidad = especialidad;
    }

    public void setIdDoctor(int idDoctor) {
        this.idDoctor = idDoctor;
    }

    public void setNombreDoctor(String nombreDoctor) {
        this.nombreDoctor = nombreDoctor;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public void setEspecialidad(String especialidad) {
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
