package example_exception;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MainException {

    private static final Logger logMainException = LogManager.getLogger(MainException.class);

    public static void main(String[] args) {
        try {
            procesarVenta("VentaVaciaException");

        } catch (VentaVaciaException e) {

            logMainException.error("Error al procesar una venta vacía: {}", e.getMessage());

        } catch (Exception e) {

            logMainException.fatal("Error fatal: {}", e.getMessage());

            // Además, podemos registrar el stack trace completo de la excepción
            logMainException.fatal(e);
        }
    }

    private static void procesarVenta(String level) throws VentaVaciaException {

        if("VentaVaciaException".contains(level)) {

            // Simulación de una venta vacía
            throw new VentaVaciaException("La venta está vacía. No se puede procesar.");
        }

        if("Other".contains(level)) {
            // (ArithmeticException)
            int resultado = 10 / 0;
        }
    }
}
