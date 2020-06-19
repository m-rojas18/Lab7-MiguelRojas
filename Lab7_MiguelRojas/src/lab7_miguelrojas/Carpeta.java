package lab7_miguelrojas;

import java.util.ArrayList;

public class Carpeta {

    private String nombre_carpeta;
    private String link_carpeta;
    ArrayList <Carpeta>lista_carpetas = new ArrayList();
    ArrayList<Archivo> lista_archivos = new ArrayList();
    private String nombre_padre;
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

    public ArrayList<Carpeta> getLista_carpetas() {
        return lista_carpetas;
    }

    public void setLista_carpetas(ArrayList<Carpeta> lista_carpetas) {
        this.lista_carpetas = lista_carpetas;
    }

    public ArrayList<Archivo> getLista_archivos() {
        return lista_archivos;
    }

    public void setLista_archivos(ArrayList<Archivo> lista_archivos) {
        this.lista_archivos = lista_archivos;
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
