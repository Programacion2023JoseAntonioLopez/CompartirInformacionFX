package com.example.compartirinformacionventanas;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class SecundariaController {


    @FXML
    private Button btAceptar;

    @FXML
    private TextField tfNombre;

    @FXML
    void onClickAceptar(ActionEvent event) {
        //cuando el usuario acepte, llamamos a la acción definida en la ventana
        //principal y salimos
        if (onGetNombre != null) {
            onGetNombre.obtenNombre(tfNombre.getText());
        }
        //cerramos la ventana
        Stage stage = (Stage) tfNombre.getScene().getWindow();
        stage.close();

    }

    //esta interface nos permite asignar la acción cuando
    //volvamos de llamar a la ventana secundaria
    public interface OnGetNombre {
        void obtenNombre(String nombre);

    }

    //la instancia  a la que llamaremos cuando el usuario
    //pulse a aceptar
    private OnGetNombre onGetNombre;

    //nos permitirá asignar la lambda en la principal con la acción que realizaremos
    public void setOnGetNombre(OnGetNombre onGetNombre) {
        this.onGetNombre = onGetNombre;
    }
}

