package nl.han.oose.persistence;

import nl.han.oose.entity.Account;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AccountDAOIntegrationTest {

    private AccountDAO sut;

    @Before
    public void setUp() {
        sut = new AccountDAO();
    }

    @Test
    public void testPersist() {
        Account accountToPersist = new Account("persist1", "persistPass");
        sut.persistAccount(accountToPersist);
    }

    @Test
    public void testGetAllAccounts() {
        List<Account> allAccounts = sut.getAllAccounts();
        assertEquals(3, allAccounts.size());

        Account account1 = new Account("user1", "password1");
        Account account2 = new Account("user2", "password2");
        Account account3 = new Account("user3", "password3");

        assertTrue(allAccounts.contains(account1));
        assertTrue(allAccounts.contains(account2));
        assertTrue(allAccounts.contains(account3));
    }


}