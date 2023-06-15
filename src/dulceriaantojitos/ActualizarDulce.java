package dulceriaantojitos;


import Controlador.controlador_Actualizar_Dulce;
import logica.Categoria;

public interface ActualizarDulce {
    public void iniciar(controlador_Actualizar_Dulce controlador);
    public String getNombre();
    public String getCodigo();
    public String getPrecio();
    public String getIndice();
    public Categoria getCategoria();
}