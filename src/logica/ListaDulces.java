
package logica;

import java.util.ArrayList;

public class ListaDulces {
    private static ListaDulces instancia;
    private ArrayList<Dulces> lista_dulces;
    
    private ListaDulces() {
        lista_dulces = new ArrayList<>();
    }
    
    public static ListaDulces getInstance() {
        if (instancia == null) {
            instancia = new ListaDulces();
        }
        return instancia;
    }
    
    public ArrayList<Dulces> getListaDulces() {
        return lista_dulces;
    }
}