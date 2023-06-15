package dulceriaantojitos;

import Controlador.controlador_Listar_Dulces;

public interface ListarDulces {
    public void iniciar(controlador_Listar_Dulces controaldor);
    public void mostrar_datos(int indice, String Nombre, String Codigo, String categoria, String precio);
}
