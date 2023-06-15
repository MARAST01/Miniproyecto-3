package dulceriaantojitos;

import Controlador.controlador_Buscar_Dulce;

public interface BuscarDulce {
    public void iniciar(controlador_Buscar_Dulce controlador);
    public String getNombre();
    public void mostrar_datos(String Nombre, String Codigo, String categoria, String precio);

}
