package example_person;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Person {
    private static final Logger loggerPerson = LogManager.getLogger(Person.class);

    public static void getLogs() {

        loggerPerson.info("Logger desde Persona");

        loggerPerson.error("Logger desde Persona");

        loggerPerson.fatal("Logger desde Persona");
    }
}
