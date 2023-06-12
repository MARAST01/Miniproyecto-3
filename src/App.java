import modelo.Modelo_Dulceria;
import dulceriaantojitos.Actualizar_Dulce;
import dulceriaantojitos.Buscar_Dulce;
import dulceriaantojitos.Eliminar_Dulces;
import dulceriaantojitos.Listar_Dulces;
import dulceriaantojitos.Ventana_Nuevo_Dulce;
import logica.Categoria;
import logica.Dulces;
import logica.ListaDulces;
import dulceriaantojitos.GUIAntojitos;
import Controlador.ControladorDulceria;


public class App {
     public static void main(String[] args) throws Exception {
         Modelo_Dulceria modelo = new Modelo_Dulceria();
        GUIAntojitos vista = new GUIAntojitos();
        ControladorDulceria control = new ControladorDulceria(modelo, vista);
        control.inicializacion(); 
}
