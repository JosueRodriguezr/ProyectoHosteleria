package edu.espol.proyecto2parcial;

import edu.espol.modelos.HDoble;
import edu.espol.modelos.HMatrimonial;
import edu.espol.modelos.Habitacion;
import edu.espol.modelos.Hotel;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * JavaFX App
 */
public class App extends Application {
    //public static List<String> clases = Arrays.asList(new String[]{"1","2","3"});
    public static ArrayList<Hotel> hoteles = new ArrayList<>();
    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("EscogerHotel"), 1080, 720);
        stage.setScene(scene);
        stage.setTitle("Creacion Hotel");
        
        stage.show();
        
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        //Habitacion ha = new HDoble("dadada", "dadada", "dadada","dada");
        //System.out.println(ha.getPrecio());
        //Hotel.habitaciones.add(ha);
        
        launch();
    }

}