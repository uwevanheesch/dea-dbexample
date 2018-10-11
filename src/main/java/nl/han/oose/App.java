package nl.han.oose;

import nl.han.oose.entity.Account;
import nl.han.oose.persistence.AccountDAO;

public class App {
    public static void main(String[] args) {

        AccountDAO accountDAO = new AccountDAO();

//        Account newAccount = new Account("piet", "pietpass");
//        accountDAO.persistAccount(newAccount);

        for (Account account : accountDAO.getAllAccounts()) {
            System.out.println(account);
        }

    }
}
