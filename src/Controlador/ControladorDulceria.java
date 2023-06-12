package Controlador;

import dulceriaantojitos.Actualizar_Dulce;
import dulceriaantojitos.Buscar_Dulce;
import dulceriaantojitos.Eliminar_Dulces;
import dulceriaantojitos.Listar_Dulces;
import dulceriaantojitos.Ventana_Nuevo_Dulce;
import logica.Categoria;
import logica.Dulces;
import logica.ListaDulces;
import dulceriaantojitos.GUIAntojitos;

import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import java.awt.event.ActionEvent;
import modelo.Modelo_Dulceria;
public class ControladorDulceria implements ActionListener {
    private Modelo_Dulceria modeloDulceria;
    private Ventana_Nuevo_Dulce ventanaNuevoDulce;
    private Actualizar_Dulce actualizardulce;
    
    public ControladorDulceria(Modelo_Dulceria modeloDulceria) {
        this.modeloDulceria = modeloDulceria;
        ventanaNuevoDulce = new Ventana_Nuevo_Dulce();
        ventanaNuevoDulce.getBoton().addActionListener(this);
        actualizardulce = new Actualizar_Dulce();
        actualizardulce.getButton2().addActionListener(this);
        actualizardulce.getButton3().addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        ArrayList<Dulces> lista_Dulces = ListaDulces.getInstance().getListaDulces();
        if (e.getSource() == ventanaNuevoDulce.getBoton()) {
            String categori = ventanaNuevoDulce.getComboBox().getSelectedItem().toString();
            Categoria categorias = null;
            if ("Acido".equals(categori)){
                categorias = Categoria.acido;
            }
            if ("Dulce".equals(categori)){
                categorias = Categoria.dulce;
            }
            if ("Sin Azucar".equals(categori)){
                categorias = Categoria.sin_azucar;
            } 

            String nombre = ventanaNuevoDulce.getTextFieldNombre().getText();
            String codigo = ventanaNuevoDulce.getTextFieldCodigo().getText();
            String precio = ventanaNuevoDulce.getTextFieldPrecio().getText();

            Dulces nuevoDulce = new Dulces(categorias, nombre, codigo, precio);

            modeloDulceria.Nuevo_Dulce(nuevoDulce);

            JOptionPane.showMessageDialog(null, "Has guardado el dulce correctamente");
            
        }
    if (e.getSource() == actualizardulce.getButton2()) {    
        
    String indice = actualizardulce.getTextField1().toString();
    int indiceInt = Integer.parseInt(indice);
    indiceInt-=1;
    String categori = actualizardulce.getComboBox().getSelectedItem().toString();
    Categoria categorias = null;
            if ("Acido".equals(categori)){
                categorias = Categoria.acido;

            }
            if ("Dulce".equals(categori)){
                categorias = Categoria.dulce;
                
            }
            if ("Sin Azucar".equals(categori)){
                categorias = Categoria.acido;

            } 
        String nombre = actualizardulce.getTextField3().toString();
        String codigo = actualizardulce.getTextField4().toString();
        String precio = actualizardulce.getTextField5().toString();
        Dulces dulce = new Dulces(categorias, nombre, codigo, precio);
        
        if (indiceInt >= 0 && indiceInt < lista_Dulces.size()) {
            modeloDulceria.Actualizar_Dulce(dulce, indiceInt);
            JOptionPane.showMessageDialog(null, "dulce actualizado correctamente");
        } else {
            // accion cuando el índice no es válido
            JOptionPane.showMessageDialog(null,"El índice no es válido");
        }
    }
   }     
}