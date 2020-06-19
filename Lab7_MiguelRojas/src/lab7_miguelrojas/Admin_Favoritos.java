package lab7_miguelrojas;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Admin_Favoritos {

    private ArrayList lista_favoritos = new ArrayList();
    private File archivo = null;

    public Admin_Favoritos(String path) {
        archivo = new File(path);
    }

    public ArrayList getLista_favoritos() {
        return lista_favoritos;
    }

    public void setLista_favoritos(ArrayList lista_favoritos) {
        this.lista_favoritos = lista_favoritos;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "Admin_Favoritos{" + "lista_favoritos=" + lista_favoritos + ", archivo=" + archivo + '}';
    }

    public void escribirArchivos() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Object c : lista_favoritos) {
                bw.writeObject(c);
            }
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }

    public void cargarArchivo() {
        try {
            lista_favoritos = new ArrayList();
            Object temp;
            if (archivo.exists()) {
                FileInputStream entrada
                        = new FileInputStream(archivo);
                ObjectInputStream objeto
                        = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Archivo) objeto.readObject()) != null ) {
                        lista_favoritos.add(temp);
                        
                    } 
                } catch (EOFException e) {
                    //encontro el final del archivo
                }
                objeto.close();
                entrada.close();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
