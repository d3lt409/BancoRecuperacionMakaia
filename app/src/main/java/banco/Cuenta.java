package banco;

public class Cuenta {
    
    private double saldoDeCuenta;
    private Persona titular;
    private long numeroDeCuenta;


    public Cuenta(double saldoDeCuenta, Persona titular) {
        this.saldoDeCuenta = saldoDeCuenta;
        this.titular = titular;
        this.numeroDeCuenta = 0;
    }

    public void setIngreso(double ingreso) {
        this.saldoDeCuenta += ingreso;
    }

    public void setRetiro(double retiro) {
        this.saldoDeCuenta -= retiro;
    }

    public double getSaldoDeCuenta() {
        return this.saldoDeCuenta;
    }


    public String getDatosCuenta() {
        return this.titular.getIdentificacion() + " Numero de cuenta: " + this.numeroDeCuenta;
    }



}
