package Controlador;

import dulceriaantojitos.EliminarDulces;
import dulceriaantojitos.Eliminar_Dulces;

import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

import java.awt.event.ActionEvent;
import modelo.Modelo_Dulceria;
public class Controlador_Eliminar_Dulces implements ActionListener {
    Modelo_Dulceria modeloDulceria;
    EliminarDulces vista;

    
    public Controlador_Eliminar_Dulces(Modelo_Dulceria modeloDulceria, Eliminar_Dulces vista) {
        this.modeloDulceria = modeloDulceria;
        this.vista = vista;
    }
    public void inicializacion(){
        vista.iniciar(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String indice = vista.getIndice();
        int indiceInt = Integer.parseInt(indice);
        indiceInt-=1;
        int indiceEliminar = indiceInt;
        // Verificar si el índice es válido
        int tamano = modeloDulceria.getTamano();
        if (indiceEliminar >= 0 && indiceEliminar < tamano) {
            // Eliminar el objeto del ArrayList en el índice indicado
            modeloDulceria.Eliminar_Dulces(indiceEliminar);
            JOptionPane.showMessageDialog(null, "Dulce eliminado correctamente");
        } else {
            //accion cuando el índice no es válido
            JOptionPane.showMessageDialog(null, "El índice no es válido");
        }
    }          
}
