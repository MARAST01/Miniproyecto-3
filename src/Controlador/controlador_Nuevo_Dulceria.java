package Controlador;

import dulceriaantojitos.Nuevo_Dulce;
import dulceriaantojitos.Ventana_Nuevo_Dulce;
import logica.Categoria;
import logica.Dulces;


import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

import java.awt.event.ActionEvent;
import modelo.Modelo_Dulceria;
public class controlador_Nuevo_Dulceria implements ActionListener {
    Modelo_Dulceria modeloDulceria;
    Nuevo_Dulce vista;

    
    public controlador_Nuevo_Dulceria(Modelo_Dulceria modeloDulceria, Ventana_Nuevo_Dulce vista) {
        this.modeloDulceria = modeloDulceria;
        this.vista = vista;
    }
    public void inicializacion(){
        vista.iniciar(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String nombre = vista.getNombre();
        String precio = vista.getPrecio();
        Categoria Categoria = vista.getCategoria();
        String codigo = vista.getCodigo();
        Dulces nuevoDulce = new Dulces(Categoria, nombre, codigo, precio);

        modeloDulceria.Nuevo_Dulce(nuevoDulce);

        JOptionPane.showMessageDialog(null, "Has guardado el dulce correctamente");
    }
} 