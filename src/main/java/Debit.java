import java.util.Objects;

/**
 * Clase Balance que registra el débito de una cuenta
 *
 * @version 1.0.0 2022-04-24
 * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
 * @since 1.0.0
 */
public final class Debit {
    private final Double value;

    /**
     * Constructor que recibe como parámetro el valor del débito que se realiza.
     *
     * @param value valor del débito
     *
     * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
     * @since 1.0.0
     */
    public Debit(Double value){
        this.value = Objects.requireNonNull(value);
    }

    /**
     * Método que retorna el valor del débito
     *
     * @return Double que contiene el valor del débito.
     *
     * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
     * @since 1.0.0
     */
    public Double value(){
        return value;
    }
}
