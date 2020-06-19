package lab7_miguelrojas;

import java.io.Serializable;
import java.util.ArrayList;

public class Carpeta implements Serializable{

    private String nombre_carpeta;
    private String link_carpeta;
    ArrayList lista_carpetas_archivos = new ArrayList();
    private String nombre_padre;
    
    private static final long SerialVersionUID = 555l;
    public Carpeta(){
        
    }

    public Carpeta(String nombre_carpeta, String link_carpeta, String nombre_padre) {
        this.nombre_carpeta = nombre_carpeta;
        this.link_carpeta = link_carpeta;
        this.nombre_padre = nombre_padre;
    }

    

    public String getNombre_carpeta() {
        return nombre_carpeta;
    }

    public void setNombre_carpeta(String nombre_carpeta) {
        this.nombre_carpeta = nombre_carpeta;
    }

    public String getLink_carpeta() {
        return link_carpeta;
    }

    public void setLink_carpeta(String link_carpeta) {
        this.link_carpeta = link_carpeta;
    }

    public ArrayList getLista_carpetas_archivos() {
        return lista_carpetas_archivos;
    }

    public void setLista_carpetas_archivos(ArrayList lista_carpetas_archivos) {
        this.lista_carpetas_archivos = lista_carpetas_archivos;
    }

    

    

    public String getNombre_padre() {
        return nombre_padre;
    }

    public void setNombre_padre(String nombre_padre) {
        this.nombre_padre = nombre_padre;
    }
    
    

    @Override
    public String toString() {
        return nombre_carpeta;
    } 
}
