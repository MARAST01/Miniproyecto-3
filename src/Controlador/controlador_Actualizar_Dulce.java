package Controlador;

import dulceriaantojitos.ActualizarDulce;
import dulceriaantojitos.Actualizar_Dulce;
import logica.Categoria;
import logica.Dulces;
import javax.swing.JOptionPane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.Modelo_Dulceria;
public class controlador_Actualizar_Dulce implements ActionListener {
    Modelo_Dulceria modeloDulceria;
    ActualizarDulce vista;

    
    public controlador_Actualizar_Dulce(Modelo_Dulceria modeloDulceria, Actualizar_Dulce vista) {
        this.modeloDulceria = modeloDulceria;
        this.vista = vista;
    }
    public void inicializacion(){
        vista.iniciar(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String indice = vista.getIndice().toString();
        int indiceInt = Integer.parseInt(indice);
        indiceInt-=1;
        Categoria categori = vista.getCategoria();
        String nombre = vista.getNombre();
        String codigo = vista.getCodigo();
        String precio = vista.getPrecio();
        Dulces dulce = new Dulces(categori, nombre, codigo, precio);
        int tamano = modeloDulceria.getTamano();
        if (indiceInt >= 0 && indiceInt < tamano) {
            modeloDulceria.Actualizar_Dulce(dulce, indiceInt);
            JOptionPane.showMessageDialog(null, "dulce actualizado correctamente");
        } else {
            // accion cuando el índice no es válido
            JOptionPane.showMessageDialog(null,"El índice no es válido");
        }
    }
}