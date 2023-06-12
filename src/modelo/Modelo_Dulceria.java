package modelo;

import java.util.ArrayList;

import logica.Dulces;
import logica.Categoria;
import logica.ListaDulces;

public class Modelo_Dulceria {
    Categoria categorias;
    String nombre, codigo, precio;
    int indice;
    int indiceEliminar;
    private ArrayList<Dulces> listaDulces;


    public Modelo_Dulceria() {
        Dulces dulce = new Dulces(categorias, nombre, codigo, precio);
        ArrayList<Dulces> listaDulces = ListaDulces.getInstance().getListaDulces();
    }

    public void Nuevo_Dulce(Dulces nuevoDulce) {
        listaDulces.add(nuevoDulce);
    }

    public void Actualizar_Dulce(Dulces dulceActualizado, int indice) {
        Listar_Dulces();
        {
            Dulces dulce = listaDulces.get(indice);
                // Actualizar las propiedades del dulce existente con los valores de dulceActualizado
                dulce.setNombre(dulceActualizado.getNombre());
                dulce.setPrecio(dulceActualizado.getPrecio());
                dulce.setCodigo(dulceActualizado.getCodigo());
                dulce.setCategoria(dulceActualizado.getCategoria());
                
            
        }
    }

    public void Eliminar_Dulces(int indiceEliminar) {
        Listar_Dulces();
        listaDulces.remove(indiceEliminar);
    }

    public ArrayList<Dulces> Listar_Dulces() {   
            return listaDulces;
        }

    public Dulces Buscar_Dulce(String nombreDulce) {
        for (int i = 0; i < listaDulces.size(); i++) {
            Dulces dulce = listaDulces.get(i);
            if (dulce.getNombre().equalsIgnoreCase(nombreDulce)) {
                Dulces dulce_encontrado = dulce;
                return dulce_encontrado;
            }
        }    
        return null;
    }
}