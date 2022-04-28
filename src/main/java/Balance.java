import java.util.Objects;

/**
 * Clase Balance que registra el balance de una cuenta
 *
 * @version 1.0.0 2022-04-24
 * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
 * @since 1.0.0
 */
public final class Balance{
    private final Double value;

    /**
     * Constructor para el Balance
     *
     * @param value del balance.
     *
     * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
     * @since 1.0.0
     */
    public Balance(Double value){
        this.value = Objects.requireNonNull(value);
    }

    /**
     * Método que retorna el valor del balance
     *
     * @return Double con el valor del balance
     *
     * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
     * @since 1.0.0
     */
    public Double value(){
        return value;
    }

    /**
     * Método para actualizar el balance.
     *
     * @param value valor que se va a sumar al balance que ya se tiene
     * @return nuevo objeto de tipo Balance con el nuevo valor
     *
     * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
     * @since 1.0.0
     */
    public Balance updateBalance(Double value){
        return new Balance(this.value + value);
    }
}
