package bank;

import java.util.HashMap;
import java.util.Map;

public class BankManager {
    private Map<String, Account> accounts;

    public BankManager() {
        accounts = new HashMap<>();
    }

    // Add a new account
    public void addAccount(String accountNumber, String holderName, double initialBalance) {
        if (!accounts.containsKey(accountNumber)) {
            Account newAccount = new Account(accountNumber, holderName, initialBalance);
            accounts.put(accountNumber, newAccount);
            System.out.println("Account added: " + newAccount);
        } else {
            System.out.println("Account with this number already exists.");
        }
    }

    // Get account details
    public Account getAccount(String accountNumber) {
        return accounts.get(accountNumber);
    }

    // Remove an account
    public void removeAccount(String accountNumber) {
        Account removedAccount = accounts.remove(accountNumber);
        if (removedAccount != null) {
            System.out.println("Removed account: " + removedAccount);
        } else {
            System.out.println("Account not found.");
        }
    }

    // Display all accounts
    public void displayAllAccounts() {
        if (accounts.isEmpty()) {
            System.out.println("No accounts found.");
        } else {
            for (Account account : accounts.values()) {
                System.out.println(account);
            }
        }
    }
}

