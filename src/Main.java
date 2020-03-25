import Data.Restaurant;
import Data.User;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import static javafx.application.Application.launch;
import static javax.xml.bind.JAXBContext.*;

public class Main {

    public static void main(String[] args) throws JAXBException {
        JAXBContext jaxbcontext= newInstance(Restaurant.class);
        Unmarshaller unmarshaller= jaxbcontext.createUnmarshaller();
        Restaurant restaurant= (Restaurant) unmarshaller.unmarshal(new File("input.xml"));
        for(User user: restaurant.getUsers().getUsers()){
            System.out.println(user.toString());}
        launch(args);
    }
}
