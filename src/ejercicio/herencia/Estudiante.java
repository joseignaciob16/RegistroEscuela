package ejercicio.herencia;

/** @author Jose Ignacio */

public class Estudiante extends Persona {
    
    private String carrera;
    private String semestre;
    
    public Estudiante(){
    super();
    carrera="";
    semestre="";
    }
    
     public void setdatospersonas(int ced, String nom, String D, String T, String carr, String sem) {
        super.setdatospersonas(ced, nom, D, T);
        carrera = carr;
        semestre = sem;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }
    
}
