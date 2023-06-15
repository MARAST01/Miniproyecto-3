package Controlador;

import dulceriaantojitos.Buscar_Dulce;
import logica.Dulces;
import dulceriaantojitos.BuscarDulce;


import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

import java.awt.event.ActionEvent;
import modelo.Modelo_Dulceria;
public class controlador_Buscar_Dulce implements ActionListener {
    Modelo_Dulceria modeloDulceria;
    BuscarDulce vista;
    
    public controlador_Buscar_Dulce(Modelo_Dulceria modeloDulceria, Buscar_Dulce vista) {
        this.modeloDulceria = modeloDulceria;
        this.vista = vista;
    }
    public void inicializacion(){
        vista.iniciar(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String nombreBuscar = vista.getNombre();
        boolean encontrado = false;
        Dulces dulceencontrado = modeloDulceria.Buscar_Dulce(nombreBuscar);
        if (dulceencontrado != null) { 
            vista.mostrar_datos(dulceencontrado.getNombre(), dulceencontrado.getCodigo(), dulceencontrado.getPrecio(), dulceencontrado.getCategoria().toString().toLowerCase());
            JOptionPane.showMessageDialog(null, "Dulce encontrado");
            encontrado = true;
        }   
        if (!encontrado) {
            JOptionPane.showMessageDialog(null, "no hay dulce con ese nombre.");
        }
    }          
}