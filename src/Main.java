import Data.Restaurant;
import Data.User;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

import static javax.xml.bind.JAXBContext.*;

public class Main {
    public static void main(String[] args) throws JAXBException {
        JAXBContext jaxbcontext= newInstance(Restaurant.class);
        Unmarshaller unmarshaller= jaxbcontext.createUnmarshaller();
        Restaurant restaurant= (Restaurant) unmarshaller.unmarshal(new File("input.xml"));
        for(User user: restaurant.getUsers().getUsers()){
            System.out.println(user.getName()+" "+user.getRole()+" "+user.getUsername());
        }
    }
}
