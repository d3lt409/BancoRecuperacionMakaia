package banco;

public class Persona {
    

    private String nombre;
    private int edad;
    private int identificacion;

    public Persona(){
        this.nombre = "unnamed";
        this.edad = 0;
    }

    public Persona(String nombre, int edad, int identificacion){
        this.nombre = nombre;
        this.edad = edad;
        this.identificacion = identificacion;
    }


    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getIdentificacion() {
        return this.identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public String mostrar(){
        return "identificacion: " + this.getIdentificacion() + ", Nombre: " + this.getNombre() + ", edad: " + this.edad;
    }

    public boolean esMayorDeEdad(){
        if (this.getEdad() > 17) {
            return true;
        }else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Identificacion: " + this.getIdentificacion() + ", Nombre: " + this.getNombre() + ", edad: " + this.getEdad();
    }

}
