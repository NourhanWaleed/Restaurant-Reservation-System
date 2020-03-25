package gui;

import javafx.fxml.Initializable;
import pack.Restaurant;

import java.net.URL;
import java.util.ResourceBundle;

public class controller implements Initializable {
    Restaurant restaurant;
    void setRestaurant(Restaurant res){
        this.restaurant=res;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
