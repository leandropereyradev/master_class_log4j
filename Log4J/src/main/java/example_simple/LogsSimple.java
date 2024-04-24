package example_simple;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LogsSimple {

    private static final Logger logSimple = LogManager.getLogger(LogsSimple.class);

    public static void main(String[] args) {

        System.out.println("soy sys");

        logSimple.info("Esto es un info");
        logSimple.fatal("Esto es un info");

    }
}
