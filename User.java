public class User {
    private final String login;
    private final String password;
    private final Account account; // Включаем объект Account в User

    public User(String login, String password, double initialBalance) {
        this.login = login;
        this.password = password;
        this.account = new Account(initialBalance);
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public Account getAccount() {
        return account; // Метод для получения счета
    }

    public boolean authorize(String inputLogin, String inputPassword) {
        return this.login.equals(inputLogin) && this.password.equals(inputPassword);
    }
}
