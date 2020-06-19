package lab7_miguelrojas;

public class Archivo {
    
    private String nombre_archivo;
    private String link_archivo;
    private String extension;
    private int tamano;
    private String nombre_padre;
    
    public Archivo(){
        
    }

    public Archivo(String nombre_archivo, String link_archivo, String extension, int tamano, String nombre_padre) {
        this.nombre_archivo = nombre_archivo;
        this.link_archivo = link_archivo;
        this.extension = extension;
        this.tamano = tamano;
        this.nombre_padre = nombre_padre;
    }

    

    public String getNombre_archivo() {
        return nombre_archivo;
    }

    public void setNombre_archivo(String nombre_archivo) {
        this.nombre_archivo = nombre_archivo;
    }

    public String getLink_archivo() {
        return link_archivo;
    }

    public void setLink_archivo(String link_archivo) {
        this.link_archivo = link_archivo;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public String getNombre_padre() {
        return nombre_padre;
    }

    public void setNombre_padre(String nombre_padre) {
        this.nombre_padre = nombre_padre;
    }

    
    @Override
    public String toString() {
        return nombre_archivo + "." + extension;
    }
  
}
