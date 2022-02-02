package ejercicio.herencia;

/** @author Jose Ignacio  */

public class Profesor extends Persona{
    
    private String carrera;
    private String cargo;
    private float valorhora;
    private int numerodehoras;
    
    public Profesor(){
    super();
    carrera="";
    cargo="";
    valorhora=0;
    numerodehoras=0;
    }
    
    public void setdatospersonas(int ced, String nom, String D, String T, String carr, String car, 
                                 float vh, int nh) {
        super.setdatospersonas(ced, nom, D, T);
        carrera = carr;
        cargo = car;
        valorhora = vh;
        numerodehoras = nh;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public float getValorhora() {
        return valorhora;
    }

    public void setValorhora(float valorhora) {
        this.valorhora = valorhora;
    }

    public int getNumerodehoras() {
        return numerodehoras;
    }

    public void setNumerodehoras(int numerodehoras) {
        this.numerodehoras = numerodehoras;
    }
    
}
