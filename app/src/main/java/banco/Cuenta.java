package banco;

public class Cuenta {
    
    private double saldoDeCuenta;
    private Persona titular;
    private long numeroDeCuenta;


    public Cuenta(double saldoDeCuenta, Persona titular) {
        this.saldoDeCuenta = saldoDeCuenta;
        this.titular = titular;
        this.numeroDeCuenta = generateNumCuenta();
    }

    private long generateNumCuenta(){
        long numCuenta = (long) ((Math.random() * (9000000000L- 100000000)) + 100000000);
        return numCuenta;
    }

    public Persona getTitular(){
        return this.titular;
    }

    public void setIngreso(double ingreso) {
        this.saldoDeCuenta += ingreso;
    }

    public Boolean setRetiro(double retiro) {
        if (this.getSaldoDeCuenta() >= retiro) {
            this.saldoDeCuenta -= retiro;
            return true;
        }else{
            return false;
        }
        
    }

    public double getSaldoDeCuenta() {
        return this.saldoDeCuenta;
    }


    public String getDatosCuenta() {
        return "Identificación: " + this.titular.getIdentificacion() + ", Numero de cuenta: " + this.numeroDeCuenta;
    }



}
