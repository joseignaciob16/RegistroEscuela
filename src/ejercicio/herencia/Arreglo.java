package ejercicio.herencia;

/** @author Jose Ignacio  */

public class Arreglo {
        
    private Persona ListaPersonas[];
    private int tam;
    
    public Arreglo(){
        tam=100;
        ListaPersonas = new Persona[tam];
    }
    
    public void setTam(int tam) {
        this.tam = tam;
    }
    public int getTam() {
        return tam;
    }
    
    public void setListaPersona(int pos, Persona dato) {
        this.ListaPersonas[pos] = dato;
    }
    
    public Persona getListaPersona(int pos) {
        return this.ListaPersonas[pos];
    }

    public int buscarEstudiante(int cod, int numest){
        int i=0;
        int res=-1;
        while (i<numest){
            if(cod==ListaPersonas[i].getCedula()){
                res=i;
                break;
            }else{
                i++;
            }
        } 
        return res;  
    }
    
    public boolean validarEstudiante(int cod, int numest){
        int i=0;
        boolean encontrado=false;
        if(numest>0){
            for(i=0;i<numest;i++)
              if (ListaPersonas[i].getCedula()==cod )
              {  encontrado =true; }
                   }
        return encontrado;
        
    }
   
}


