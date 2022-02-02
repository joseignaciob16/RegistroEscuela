package ejercicio.herencia;

/**@author Jose Ignacio */

public class Persona {
    private int cedula;
    private String nombre;
    private String dir;
    private String tel;

    public Persona() {
        cedula = 0;
        nombre = "";
        dir = "";
        tel = "";
    }
    
    public void setdatospersonas(int ced, String nom, String D, String T) {

        cedula = ced;
        nombre = nom;
        dir = D;
        tel = T;

    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDir() {
        return dir;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
    
}
