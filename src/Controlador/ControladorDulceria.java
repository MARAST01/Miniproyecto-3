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
    Modelo_Dulceria modeloDulceria;
    Ventana_Nuevo_Dulce ventanaNuevoDulce;
    Actualizar_Dulce ActualizarDulce;
    Buscar_Dulce BuscarDulce;
    Eliminar_Dulces EliminarDulce;
    GUIAntojitos vista;
    Listar_Dulces ListarDulces;
    
    public ControladorDulceria(Modelo_Dulceria modeloDulceria, GUIAntojitos vista) {
        this.modeloDulceria = modeloDulceria;
        this.vista = vista;
        ventanaNuevoDulce = new Ventana_Nuevo_Dulce();
        ventanaNuevoDulce.getBoton().addActionListener(this);
        ActualizarDulce = new Actualizar_Dulce();
        ActualizarDulce.getButton2().addActionListener(this);
        ActualizarDulce.getButton3().addActionListener(this);
        BuscarDulce = new Buscar_Dulce();
        BuscarDulce.getButton().addActionListener(this);
        EliminarDulce = new Eliminar_Dulces();
        EliminarDulce.getButton3().addActionListener(this);
        EliminarDulce.getButton2().addActionListener(this);
        ListarDulces = new Listar_Dulces();
        ListarDulces.getBoton().addActionListener(this);

    }
    public void iniciar(){
        //vista
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
        if (e.getSource() == ActualizarDulce.getButton2()) {    
        
        String indice = ActualizarDulce.getTextField1().getText().toString();
        int indiceInt = Integer.parseInt(indice);
        indiceInt-=1;
        String categori = ActualizarDulce.getComboBox().getSelectedItem().toString();
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
            String nombre = ActualizarDulce.getTextField3().getText().toString();
            String codigo = ActualizarDulce.getTextField4().getText().toString();
            String precio = ActualizarDulce.getTextField5().getText().toString();
            Dulces dulce = new Dulces(categorias, nombre, codigo, precio);
            
            if (indiceInt >= 0 && indiceInt < lista_Dulces.size()) {
                modeloDulceria.Actualizar_Dulce(dulce, indiceInt);
                JOptionPane.showMessageDialog(null, "dulce actualizado correctamente");
            } else {
                // accion cuando el índice no es válido
                JOptionPane.showMessageDialog(null,"El índice no es válido");
            }
        }
        if (e.getSource() == ActualizarDulce.getButton3()) {    
            ActualizarDulce.getTextArea1().setText("");

            // Recorrer el ArrayList y agregar los atributos de cada objeto al JTextArea
            for (int i = 0; i < lista_Dulces.size(); i++) {
                Dulces dulce = lista_Dulces.get(i);
                ActualizarDulce.getTextArea1().append( 1+i +":");
                ActualizarDulce.getTextArea1().append("Nombre: " + dulce.getNombre() + ", " );
                ActualizarDulce.getTextArea1().append("Código: " + dulce.getCodigo() + ", ");
                ActualizarDulce.getTextArea1().append("Precio: " + dulce.getPrecio() + ", ");
                ActualizarDulce.getTextArea1().append("Categoría: " + dulce.getCategoria() + ". \n ");
                ActualizarDulce.getTextArea1().append("------------------\n");
    }    
        }
        if (e.getSource() == BuscarDulce.getButton()) {
            String nombreBuscar = BuscarDulce.getTextField().getText().toString();
            boolean encontrado = false;
            Dulces dulceencontrado = modeloDulceria.Buscar_Dulce(nombreBuscar);
            if (dulceencontrado != null) {                BuscarDulce.getTextArea().append("Nombre: " + dulceencontrado.getNombre() + ", " );
                BuscarDulce.getTextArea().append("Código: " + dulceencontrado.getCodigo() + ", ");
                BuscarDulce.getTextArea().append("Precio: " + dulceencontrado.getPrecio() + ", ");
                BuscarDulce.getTextArea().append("Categoría: " + dulceencontrado.getCategoria() + ". \n ");
                BuscarDulce.getTextArea().append("------------------\n");
                JOptionPane.showMessageDialog(null, "Dulce encontrado");
                encontrado = true;
            }   
            if (!encontrado) {
                JOptionPane.showMessageDialog(null, "no hay dulce con ese nombre.");
            }          
        }
        if (e.getSource() == EliminarDulce.getButton3()) {
            ActualizarDulce.getTextArea1().setText("");

            // Recorrer el ArrayList y agregar los atributos de cada objeto al JTextArea
            for (int i = 0; i < lista_Dulces.size(); i++) {
                Dulces dulce = lista_Dulces.get(i);
                EliminarDulce.getTextArea().append( 1+i +":");
                EliminarDulce.getTextArea().append("Nombre: " + dulce.getNombre() + ", " );
                EliminarDulce.getTextArea().append("Código: " + dulce.getCodigo() + ", ");
                EliminarDulce.getTextArea().append("Precio: " + dulce.getPrecio() + ", ");
                EliminarDulce.getTextArea().append("Categoría: " + dulce.getCategoria() + ". \n ");
                EliminarDulce.getTextArea().append("------------------\n");
            }
        }
        if (e.getSource() == EliminarDulce.getButton2()) {
            String indice = EliminarDulce.getTextField().getText();
            int indiceInt = Integer.parseInt(indice);
            indiceInt-=1;
            int indiceEliminar = indiceInt;
            // Verificar si el índice es válido
            if (indiceEliminar >= 0 && indiceEliminar < lista_Dulces.size()) {
                // Eliminar el objeto del ArrayList en el índice indicado
                modeloDulceria.Eliminar_Dulces(indiceEliminar);
                JOptionPane.showMessageDialog(null, "Dulce eliminado correctamente");
            } else {
                //accion cuando el índice no es válido
                JOptionPane.showMessageDialog(null, "El índice no es válido");
            }
        }
        if (e.getSource() == ListarDulces.getBoton()) {
            ArrayList<Dulces> listaDulces = modeloDulceria.Listar_Dulces();
            ListarDulces.getTextArea().setText("");

            for (int i = 0; i < listaDulces.size(); i++) {
                Dulces dulce = listaDulces.get(i);
                ListarDulces.getTextArea().append(1 + i + ":");
                ListarDulces.getTextArea().append("Nombre: " + dulce.getNombre() + ", ");
                ListarDulces.getTextArea().append("Código: " + dulce.getCodigo() + ", ");
                ListarDulces.getTextArea().append("Precio: " + dulce.getPrecio() + ", ");
                ListarDulces.getTextArea().append("Categoría: " + dulce.getCategoria() + ". \n");
                ListarDulces.getTextArea().append("------------------\n");
            }

        }
    }     
}