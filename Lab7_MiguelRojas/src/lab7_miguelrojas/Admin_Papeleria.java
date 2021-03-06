package lab7_miguelrojas;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Admin_Papeleria {

    private ArrayList lista_papeleria = new ArrayList();
    private File archivo = null;

    public Admin_Papeleria(String path) {
        archivo = new File(path);
    }

    public ArrayList getLsita_papeleria() {
        return lista_papeleria;
    }

    public void setLsita_papeleria(ArrayList lsita_papeleria) {
        this.lista_papeleria = lsita_papeleria;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "Admin_Papeleria{" + "lsita_papeleria=" + lista_papeleria + ", archivo=" + archivo + '}';
    }

    public void escribirArchivo() {

        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Object c : lista_papeleria) {
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
            lista_papeleria = new ArrayList();
            Object temp;
            if (archivo.exists()) {
                FileInputStream entrada
                        = new FileInputStream(archivo);
                ObjectInputStream objeto
                        = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Object) objeto.readObject()) != null) {
                        lista_papeleria.add(temp);

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
