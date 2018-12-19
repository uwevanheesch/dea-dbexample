package nl.han.oose;

import nl.han.oose.persistence.AccountDAO;

public class App {
    public static void main(String[] args) {

        AccountDAO accountDAO = new AccountDAO();

//        Account newAccount = new Account("harras", "hansen");
//        accountDAO.persistAccount(newAccount);

        accountDAO.getAllAccounts().forEach(System.out::println);

    }
}
