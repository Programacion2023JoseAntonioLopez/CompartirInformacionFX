package com.example.compartirinformacionventanas;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class PrincipalController  {

    @FXML
    private Button btIniciaSecundaria;

    @FXML
    private Label lbNombre;

    @FXML
    void onClickIniciaSecundaria(ActionEvent event)  {
        try{
            //cargamos la escena desde el recurso
            FXMLLoader loader=new FXMLLoader(InicioApplication.class.getResource("secundaria-view.fxml"));

            Parent root=loader.load();
            SecundariaController secundariaController=loader.getController();
            //Asignamos la acción a realizar desde la ventana secundaria mediante la interface
            secundariaController.setOnGetNombre(nombre ->lbNombre.setText(nombre) );

            Scene scene=new Scene(root);
            //iniciamos nuevo stage en forma modal con la scene
            Stage stage=new Stage();
            stage.setTitle("Ventana Secundaria");
            stage.setResizable(false);
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(scene);
            stage.showAndWait();
        }catch (IOException e){
            System.err.println(e.getMessage());
        }

    }


}