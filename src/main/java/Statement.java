import java.time.LocalDate;
import java.util.Objects;

/**
 * Clase Abstracta Statement, esta clase es heredada por las clases DebitStatement y CreditStatement
 *
 * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
 * @since 1.0.0
 */
public abstract class Statement {
    private final LocalDate date;
    private final Balance balance;

    /**
     * Constructor de la clase, esta tiene la fecha y el balance de la transacción.
     *
     * @param date Fecha en la que se realiza la transacción.
     * @param balance De la cuenta después de la transaccion.
     *
     * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
     * @since 1.0.0
     */
    protected Statement(LocalDate date, Balance balance){
        this.date = Objects.requireNonNull(date);
        this.balance = Objects.requireNonNull(balance);
    }

    /**
     * Método para retornar la fecha en la que se realiza la transacción.
     *
     * @return Una variable de tipo LocalDate con la fecha de la transacción.
     *
     * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
     * @since 1.0.0
     */
    public LocalDate date() {
        return date;
    }

    /**
     * Método para retornar el balance de la transacción.
     *
     * @return Objeto de tipo balance que muestra el balance de la transacción.
     *
     * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
     * @since 1.0.0
     */
    public Balance balance() {
        return balance;
    }
}
