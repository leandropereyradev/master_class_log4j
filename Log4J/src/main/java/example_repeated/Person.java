package example_repeated;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Person {
    private static final Logger loggerPersonRoot = LogManager.getLogger(Person.class);

    public static void getLogs() {

        loggerPersonRoot.info("Logger desde Persona Root");

        loggerPersonRoot.error("Logger desde Persona Root");

        loggerPersonRoot.fatal("Logger desde Persona Root");

        System.out.println("Hello!!");
    }
}

