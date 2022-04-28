import java.util.Objects;

/**
 * Clase Balance que registra el crédito de una cuenta
 *
 * @version 1.0.0 2022-04-24
 * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
 * @since 1.0.0
 */
public final class Credit {
    private final Double value;

    /**
     * Constructor que recibe como parámetro el valor del crédito que se realiza.
     *
     * @param value valor del crédito
     *
     * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
     * @since 1.0.0
     */
    public Credit(Double value){
        this.value = Objects.requireNonNull(value);
    }

    /**
     * Método que retorna el valor del crédito
     *
     * @return Double que contiene el valor del crédito.
     *
     * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
     * @since 1.0.0
     */
    public Double value(){
        return value;
    }
}
