# Java Exceptions - Banking System

## Problem Statement
>
> [!IMPORTANT]
>
> You are tasked with creating a simple banking system that handles account transactions. The system should support the following functionalities:
>
> 1. Depositing money into an account.
> 2. Withdrawing money from an account.
> 3. Checking the balance of an account.
>
> You must write code to handle exceptions that may occur during these transactions. Specifically, handle the following cases:
>
> 1. **Insufficient Funds**: Throw a custom exception when an attempt is made to > withdraw more money than is available in the account.
> 2. **Negative Deposit**: Throw a custom exception if a deposit amount is negative.
> 3. **Application Exceptions**: Handle common exceptions, such as `NullPointerException`, that could occur in the banking system.

## Specific Requirements
>
> [!TIP]
>
>1. Create a `BankAccount` class with methods for `deposit()`, `withdraw()`, and `getBalance()`.
>2. Define two custom exceptions:
>    - `InsufficientFundsException` (for withdrawals larger than the current balance).
>    - `NegativeDepositException` (for negative deposit amounts).
>3. Write code to handle exceptions that may arise during transactions:
>    - Throw the custom exceptions for the specified conditions.
>    - Catch any `NullPointerException` that might occur.
>4. Implement proper exception handling and provide meaningful error messages when exceptions are caught.
>5. Demonstrate the use of `try-catch` blocks to handle these exceptions.

## Instructions
>
> [!CAUTION]
>
>
> 1. **Create the `BankAccount` class**:
>    - The class should contain a `balance` field and methods for depositing, withdrawing, and checking the balance.
> 2. **Create Custom Exceptions**:
>    - Define `InsufficientFundsException` and `NegativeDepositException` as custom exceptions that extend `Exception`.
> 3. **Write Exception Handling Logic**:
>    - In the `withdraw()` method, throw an `InsufficientFundsException` if the withdrawal amount exceeds the balance.
>    - In the `deposit()` method, throw a `NegativeDepositException` if the deposit amount is negative.
> 4. **Use Try-Catch Blocks**:
>    - Surround the deposit and withdrawal operations with `try-catch` blocks to catch and handle exceptions.
>    - Print meaningful error messages when exceptions are caught.
> 5. **Demonstrate the Banking Operations**:
>    - Write a main method that creates a `BankAccount` instance, performs several deposits and withdrawals, and handles any exceptions that occur.

## Example Output

```text
Attempting to deposit $500...
Deposit successful. Current balance: $500.0

Attempting to withdraw $600...
Error: Insufficient funds. Current balance: $500.0

Attempting to deposit -$100...
Error: Deposit amount cannot be negative.

Final balance: $500.0

```

## Starting Code Snippet
>
> [!WARNING]
> May not compile or work, modify the code as needed.
>

```java
// Custom exception for insufficient funds
// Thrown when a withdrawal exceeds the current balance.
class InsufficientFundsException extends Exception {

}

// Custom exception for negative deposit
//  Thrown when a deposit is negative
class NegativeDepositException extends Exception {

}

// BankAccount class with deposit, withdraw, and balance-checking functionality
class BankAccount {
    private double balance;

    public BankAccount() {
        this.balance = 0.0;
    }

    // Method to deposit money
    public void deposit(double amount) throws NegativeDepositException {
        //The deposit() method throws NegativeDepositException if the deposit amount is negative

        System.out.println("Deposit successful. Current balance: $" + balance);
    }

    // Method to withdraw money
    public void withdraw(double amount) throws InsufficientFundsException {
        // The withdraw() method throws InsufficientFundsException if the withdrawal exceeds the available balanc

        System.out.println("Withdrawal successful. Current balance: $" + balance);
    }

    // Method to get the current balance
    public double getBalance() {
        return balance;
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        // Create a BankAccount object
        BankAccount account = new BankAccount();


        // Attempt to deposit money
        System.out.println("Attempting to deposit $500...");


        // Attempt to withdraw more money than available
        System.out.println("\nAttempting to withdraw $600...");


        // Attempt to deposit a negative amount
        System.out.println("\nAttempting to deposit -$100...");


        System.out.println("Error: " + e.getMessage());
   
        // Final balance
        System.out.println("\nFinal balance: $" + account.getBalance());
    }
}

```
