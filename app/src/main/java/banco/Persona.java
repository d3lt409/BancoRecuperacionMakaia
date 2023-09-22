package banco;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.text.DateFormat;

public class Persona {
    

    private String nombre;
    private LocalDate nacimiento;
    private long identificacion;

    public Persona(){
        this.nombre = "unnamed";
    }

    public Persona(String nombre, String nacimiento, long identificacion){
        this.nombre = nombre;
        try {
            this.nacimiento = LocalDate.parse(nacimiento);
        } catch (DateTimeParseException e) {
            // TODO: handle exception
            String[] ageStrings = nacimiento.split("-");
            if (ageStrings.length < 3){
                ageStrings = nacimiento.split("/");
                this.nacimiento = LocalDate.of(Integer.parseInt(ageStrings[2]) ,Integer.parseInt(ageStrings[1]) , Integer.parseInt(ageStrings[0]));
            }else{
                this.nacimiento = LocalDate.of(Integer.parseInt(ageStrings[2]) ,Integer.parseInt(ageStrings[1]) , Integer.parseInt(ageStrings[0]));
            }
        }
        this.identificacion = identificacion;
    }


    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return Period.between(nacimiento, LocalDate.now()).getYears();
    }

    public long getIdentificacion() {
        return this.identificacion;
    }

    public String mostrar(){
        return "Identificacion: " + this.getIdentificacion() + ", Nombre: " + this.getNombre() + ", Edad: " + this.getEdad();
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
        return "Identificacion: " + this.getIdentificacion() + ", Nombre: " + this.getNombre() + ", Edad: " + this.getEdad();
    }

}
