/**
 * Clase principal desde la cual se podrá inicializar la aplicación, en esta se crea una nueva cuenta,
 * se realizan algunas transacciones y luego se imprimen las transacciones realizadas.
 *
 * @version 1.0.0 2022-04-24
 * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
 * @since 1.0.0
 */
public final class StartApp {
    public static void main(String[] args) {
        Account account = new Account();

        account.deposit(1000.00, FormatterDate.localDateOf("10/01/2021"));
        account.deposit(2000.00, FormatterDate.localDateOf("13/01/2021"));
        account.withdraw(500.00, FormatterDate.localDateOf("14/01/2021"));

        account.printStatements();
    }
}
