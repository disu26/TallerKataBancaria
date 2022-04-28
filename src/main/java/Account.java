import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase Account que representa la cuenta que crea una persona.
 *
 * @version 1.0.0 2022-04-24
 * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
 * @since 1.0.0
 */
public class Account {
    private Balance balance;
    private final List<Statement> statements = new ArrayList<>();

    /**
     * Método para depositar dinero en la cuenta, al depositar el dinero se genera una nueva transacción.
     *
     * @param amount Cantidad de dinero a ser depositada
     * @param date fecha de la transacción
     *
     * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
     * @since 1.0.0
     */
    public void deposit(Double amount, LocalDate date) {
        Credit credit = new Credit(amount);
        if(balance == null){
            balance = new Balance(amount);
            statements.add(new CreditStatement(date, balance, credit));
            return;
        }
        updateBalance(amount);
        statements.add(new CreditStatement(date, balance, credit));
    }

    /**
     * Método para hacer un retiro de dinero, esto se verá reflejado en el balance de la cuenta y se registra
     * una nueva transacción.
     *
     * @param amount cantidad de dinero a retirar
     * @param date fecha del retiro
     *
     * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
     * @since 1.0.0
     */
    public void withdraw(Double amount, LocalDate date){
        Debit debit = new Debit(amount);
        if (balance == null){
            balance = new Balance(-amount);
            statements.add(new DebitStatement(date, balance, debit));
            return;
        }
        updateBalance(-amount);
        statements.add(new DebitStatement(date, balance, debit));
    }

    /**
     * Método para actualizar el balance después de realizar un balance.
     *
     * @param value cantidad a actualizar
     *
     * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
     * @since 1.0.0
     */
    private void updateBalance(Double value){
        balance = balance.updateBalance(value);
    }

    /**
     * Método para mostrar todas las transacciones que se han realizado.
     *
     * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
     * @since 1.0.0
     */
    public void printStatements() {
        System.out.println("date\t\t\t credit\t\t debit\t\t \tbalance");
        for (Statement statement : statements){
            System.out.println(statement);
        }
    }

}
