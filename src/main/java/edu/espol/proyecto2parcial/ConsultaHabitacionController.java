/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.espol.proyecto2parcial;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;

/**
 * FXML Controller class
 *
 * @author josue
 */
public class ConsultaHabitacionController implements Initializable {

    @FXML
    private Button btnBuscar;
    @FXML
    private TextField txtNumHabitacion;
    @FXML
    private FlowPane panelFlow;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        llenarLista();
    }    
    
    public void llenarLista(){
        for(int t = 0; t<10; t++){
            HBox hbtc = new HBox();
            Label nombreHtc = new Label("Habitacion Numero:"+ t);
            Label disponibilidad = new Label("Disponible");
            Button editar = new Button("Editar");
            hbtc.getChildren().addAll(nombreHtc,disponibilidad, editar);
            panelFlow.getChildren().add(hbtc);
            
        }
    }
    
    @FXML
    private void CreacionHabitacion() throws IOException {
        App.setRoot("CreacionHabitacion");
    }
    
    @FXML
    private void cambioVentana2() throws IOException {
        App.setRoot("EscogerHotel");
        print("hola mundo")
    }
}
