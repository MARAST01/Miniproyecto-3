package dulceriaantojitos;

import Controlador.controlador_Nuevo_Dulceria;
import logica.Categoria;

public interface Nuevo_Dulce {
    public void iniciar(controlador_Nuevo_Dulceria controlador);
    public String getNombre();
    public String getCodigo();
    public String getPrecio();
    public Categoria getCategoria();
}