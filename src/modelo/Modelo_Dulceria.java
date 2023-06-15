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
    static public ArrayList<Dulces> listaDulces = new ArrayList<Dulces>();



    public static ArrayList<Dulces> Listar_Dulces() {
        return listaDulces;
    }

    public static void setListaDulces(ArrayList<Dulces> listaDulces) {
        Modelo_Dulceria.listaDulces = listaDulces;
    }

    public void Nuevo_Dulce(Dulces nuevoDulce) {
        listaDulces.add(nuevoDulce);
    }

    public int getTamano(){
        return listaDulces.size();
    }

    public void Actualizar_Dulce(Dulces dulceActualizado, int indice) {
        
        Dulces dulce = listaDulces.get(indice);
        // Actualizar las propiedades del dulce existente con los valores de dulceActualizado
        dulce.setNombre(dulceActualizado.getNombre());
        dulce.setPrecio(dulceActualizado.getPrecio());
        dulce.setCodigo(dulceActualizado.getCodigo());
        dulce.setCategoria(dulceActualizado.getCategoria());
            
            
        
    }

    public void Eliminar_Dulces(int indiceEliminar) {
        listaDulces.remove(indiceEliminar);
    }

    /*public ArrayList<Dulces> Listar_Dulces() {
            ArrayList<Dulces> listaDulces = ListaDulces.getInstance().getListaDulces();
        return listaDulces;
    }*/
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