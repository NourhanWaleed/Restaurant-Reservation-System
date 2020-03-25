package pack;
import java.util.*;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

import static javax.xml.bind.JAXBContext.*;

public class Main {
    public static void main(String[] args) throws JAXBException {
        JAXBContext jaxbcontext= newInstance(Restaurant.class);
        Unmarshaller unmarshaller= jaxbcontext.createUnmarshaller();
        Restaurant restaurant= (Restaurant) unmarshaller.unmarshal(new File("C:\\Users\\user\\IdeaProjects\\progproject2\\src\\pack/input.xml"));
        for(User user: restaurant.getUsers().getUsers()){
            System.out.println(user.toString());}
    }
}
