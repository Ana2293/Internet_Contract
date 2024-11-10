package com.example.internet;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;

import java.net.URL;
import java.util.ResourceBundle;


public class DashboardController implements Initializable {
    @FXML
    private GridPane gridPane;

    @FXML
    private ToggleGroup speedGroup;

    @FXML
    private ToggleGroup trafficGroup;

    @FXML
    private ToggleGroup durationGroup;

    @FXML
    private Button addBtn;

    @FXML
    private TableColumn<Contracts, String> address;

    @FXML
    private TextField addressTf;

    @FXML
    private RadioButton c1;

    @FXML
    private RadioButton c2;

    @FXML
    private Button deleteBtn;

    @FXML
    private TableColumn<Contracts, String> duration;

    @FXML
    private Button editBtn;

    @FXML
    private Label errorLabel;

    @FXML
    private TableColumn<Contracts, String> name;

    @FXML
    private TextField nameTf;

    @FXML
    private TableColumn<Contracts, String> speed;

    @FXML
    private TableColumn<Contracts, String> surname;

    @FXML
    private TextField surnameTf;

    @FXML
    private RadioButton t1;

    @FXML
    private RadioButton t10;

    @FXML
    private RadioButton t100;

    @FXML
    private RadioButton t5;

    @FXML
    private RadioButton tFlat;

    @FXML
    private TableView<Contracts> tableView;

    @FXML
    private TableColumn<Contracts, String> traffic;

    @FXML
    private RadioButton v10;

    @FXML
    private RadioButton v100;

    @FXML
    private RadioButton v2;

    @FXML
    private RadioButton v20;

    @FXML
    private RadioButton v5;

    @FXML
    private RadioButton v50;

    @FXML
    void OnClickv20(MouseEvent event) {
        event.isConsumed();
        v20.setText("20");

    }
    @FXML
    void onClickc1(MouseEvent event) {
        event.isConsumed();
        c1.setText("1");
    }

    @FXML
    void onClickc2(MouseEvent event) {
        event.isConsumed();
        c2.setText("2");
    }

    @FXML
    void onClickt1(MouseEvent event) {
        event.isConsumed();
        t1.setText("1");
    }

    @FXML
    void onClickt10(MouseEvent event) {
        event.isConsumed();
        t10.setText("10");
    }

    @FXML
    void onClickt100(MouseEvent event) {
        event.isConsumed();
        t100.setText("100");
    }

    @FXML
    void onClickt5(MouseEvent event) {
        event.isConsumed();
        t5.setText("5");
    }

    @FXML
    void onClicktFlat(MouseEvent event) {
        event.isConsumed();
        tFlat.setText("Flat");
    }

    @FXML
    void onClickv10(MouseEvent event) {
        event.isConsumed();
        v10.setText("10");
    }

    @FXML
    void onClickv100(MouseEvent event) {
        event.isConsumed();
        v100.setText("100");
    }

    @FXML
    void onClickv2(MouseEvent event) {
        event.isConsumed();
        v2.setText("2");
    }

    @FXML
    void onClickv5(MouseEvent event) {
        event.isConsumed();
        v5.setText("5");
    }

    @FXML
    void onClickv50(MouseEvent event) {
        event.isConsumed();
        v50.setText("50");
    }

    @FXML
    void onClickAdd(ActionEvent event) {
        if (speedGroup == null || trafficGroup == null || durationGroup == null || nameTf.getText().isEmpty() || surnameTf.getText().isEmpty()
                || addressTf.getText().isEmpty()) {
            errorLabel.setVisible(true);
            errorLabel.setText("Toate campurile sunt obligatorii!");
        } else {
            Contracts contracts = new Contracts(nameTf.getText(),surnameTf.getText(),addressTf.getText(),
                    ((RadioButton)speedGroup.getSelectedToggle()).getText(), ((RadioButton)trafficGroup.getSelectedToggle()).getText(),
                    ((RadioButton)durationGroup.getSelectedToggle()).getText());
            tableView.getItems().add(contracts);
        }
    }

    @FXML
    void onClickDelete(ActionEvent event) {
        tableView.getItems().remove(tableView.getSelectionModel().getSelectedIndex());
    }

    @FXML
    void onClickEdit(ActionEvent event) {
        nameTf.clear();
        surnameTf.clear();
        addressTf.clear();

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        name.setCellValueFactory(new PropertyValueFactory<Contracts,String>("name"));
        surname.setCellValueFactory(new PropertyValueFactory<Contracts,String>("surname"));
        address.setCellValueFactory(new PropertyValueFactory<Contracts,String>("address"));
        speed.setCellValueFactory(new PropertyValueFactory<Contracts,String>("speed"));
        traffic.setCellValueFactory(new PropertyValueFactory<Contracts,String>("traffic"));
        duration.setCellValueFactory(new PropertyValueFactory<Contracts,String>("duration"));

    }
}

