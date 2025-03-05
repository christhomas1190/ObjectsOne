package object1;

import org.w3c.dom.ls.LSOutput;

import java.util.logging.Logger;


public class Main {

    public static void main(String... args) {
        Logger logger=Logger.getLogger(Main.class.getName());
        logger.info("This is a module-using Hello World!");

        Person person = new Person("Christian" , 34, 149);
        System.out.println(person.getAge());
}

};
