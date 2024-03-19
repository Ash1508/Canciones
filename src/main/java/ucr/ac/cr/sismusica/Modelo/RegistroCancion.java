/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.sismusica.Modelo;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class RegistroCancion {

    private static RegistroCancion instancia = null;
    private ArrayList<Cancion> listaCanciones;
    private String mensaje;

    public static RegistroCancion getInstancia() {
        if (instancia == null) {
            return instancia;
        }
        return instancia;
    }//fin constructor 
//    --------------------------------------------------------------------------

    public RegistroCancion() {
        this.listaCanciones = new ArrayList();
        this.mensaje = "";
    }
//    --------------------------------------------------------------------------

    public String agregarCancion(Cancion cancion) {
        if (cancion != null) {
            if (getCancion(cancion.getId()) == null) {
                listaCanciones.add(cancion);
                mensaje = "Cancion agregada correctamente";

            } else {
                mensaje = "Ya existe una cancion con este id";
            }
        } else {
            mensaje = "Error al registrar cancion";
        }
        return mensaje;
    }// fin metodo agregar cancion
//    --------------------------------------------------------------------------

    public Cancion getCancion(int id) {
        for (Cancion c : listaCanciones) {
            if (c.getId() == id) {
                return c;
            }
        }
        return null;
    }//fin metodo buscar cancion
//    --------------------------------------------------------------------------

    public String eliminarCancion(int id) {
        if (getCancion(id) != null) {
            this.listaCanciones.remove(getCancion(id));
            mensaje = "Cancion eliminada correctamente";
        } else {
            mensaje = "No se encuentra una cancion con este id";
        }
        return mensaje;
    } // fin metodo eliminar cancion
//    -------------------------------------------------------------------------- 

    public String editarCancion(Cancion cancion) {
        if (getCancion(cancion.getId()) != null) {
            eliminarCancion(cancion.getId());
            agregarCancion(cancion);
            mensaje = "Cancio editada correctamente";
        } else {
            mensaje = "No existe una cancion con este id";
        }
        return mensaje;
    }//fin metodo editar cancion
//   ---------------------------------------------------------------------------

    public String[] getComboTitulo() {
        String[] titulos = new String[this.listaCanciones.size()];
        for (int i = 0; i < this.listaCanciones.size(); i++) {
            titulos[i] = listaCanciones.get(i).getNombre();
        }
        return titulos;
   } //fin metodo combobox
//    -------------------------------------------------------------------------- 
}
