package Controlador;

import dulceriaantojitos.ListarDulces;
import dulceriaantojitos.Listar_Dulces;
import logica.Dulces;

import java.awt.event.ActionListener;
import java.util.ArrayList;


import java.awt.event.ActionEvent;
import modelo.Modelo_Dulceria;
public class controlador_Listar_Dulces implements ActionListener {
    Modelo_Dulceria modeloDulceria;
    ListarDulces vista;

    
    public controlador_Listar_Dulces(Modelo_Dulceria modeloDulceria, Listar_Dulces vista) {
        this.modeloDulceria = modeloDulceria;
        this.vista = vista;
    }
    public void inicializacion(){
        vista.iniciar(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        ArrayList<Dulces> listaDulces = Modelo_Dulceria.Listar_Dulces();


        for (int i = 0; i < listaDulces.size(); i++) {
                Dulces dulce = listaDulces.get(i);
                vista.mostrar_datos(i, dulce.getNombre(), dulce.getCodigo(), dulce.getPrecio(), dulce.getCategoria().toString().toLowerCase());
                
            }     
    }
} 