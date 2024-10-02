# QE Focus: Java Collections and Generics for Quality Engineering

1. Ensuring Type Safety with Generics in Collections
Objective: Explain how Generics provide compile-time type safety, reducing runtime errors, especially in collections used across large-scale applications.

## Key Concepts

Benefits of Generics in maintaining type safety.
How to avoid ClassCastException in collections.

### Code Example

Banking Domain: Storing transaction details in a type-safe collection

```java
// A generic class to represent a transaction in a bank
public class Transaction<T> {
    private T transactionDetails;

    public Transaction(T transactionDetails) {
        this.transactionDetails = transactionDetails;
    }

    public T getTransactionDetails() {
        return transactionDetails;
    }
}

// Using Generics to ensure type safety
public class BankingApp {
    public static void main(String[] args) {
        Transaction<String> transaction = new Transaction<>("Deposit: $1000");
        System.out.println(transaction.getTransactionDetails());  // Output: Deposit: $1000

        // Compile-time type safety: The following will not compile
        // Transaction<Integer> transactionError = new Transaction<>("Invalid Transaction");
    }
}

```

2. Best Practices for Testing Collections
Objective: Discuss best practices for testing collections to ensure reliability and robustness, covering both functional and non-functional aspects.

## Key Concepts

Verifying collection sizes.
Asserting contents.
Testing for ordering (e.g., in sorted collections like TreeSet or TreeMap).

### JUnit Code Example

Insurance Domain: Testing insurance policies stored in a collection.

```java
import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class InsuranceTest {
    @Test
    public void testInsurancePolicies() {
        List<String> policies = Arrays.asList("Health", "Auto", "Home");

        assertEquals(3, policies.size());
        assertTrue(policies.contains("Health"));
        assertFalse(policies.contains("Life"));

        // Test for order
        List<String> sortedPolicies = new ArrayList<>(policies);
        Collections.sort(sortedPolicies);
        assertEquals(Arrays.asList("Auto", "Health", "Home"), sortedPolicies);
    }
}

```

### TestNG Code Example

Insurance Domain: Testing insurance policies stored in a collection.

```java
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.*;

public class InsuranceTest {
    
    @Test
    public void testInsurancePolicies() {
        List<String> policies = Arrays.asList("Health", "Auto", "Home");

        // Verify the size of the collection
        Assert.assertEquals(policies.size(), 3, "Collection size should be 3");
        
        // Verify the contents of the collection
        Assert.assertTrue(policies.contains("Health"), "'Health' policy should be in the collection");
        Assert.assertFalse(policies.contains("Life"), "'Life' policy should not be in the collection");

        // Test for ordering by sorting the list
        List<String> sortedPolicies = new ArrayList<>(policies);
        Collections.sort(sortedPolicies);
        Assert.assertEquals(sortedPolicies, Arrays.asList("Auto", "Health", "Home"), "Policies should be sorted alphabetically");
    }
}

```



3. Handling Edge Cases in Collection Manipulations
Objective: Demonstrate how to handle edge cases such as null values, empty collections, and concurrent modifications.

## Key Concepts

Avoiding NullPointerException.
Testing empty collections.
Handling concurrency issues.

### Code Example

Finance Domain: Handling empty and null values in a stock portfolio.

```java
import java.util.*;

public class StockPortfolio {
    private List<String> stocks;

    public StockPortfolio(List<String> stocks) {
        this.stocks = stocks != null ? stocks : new ArrayList<>();
    }

    public int getNumberOfStocks() {
        return stocks.size();
    }

    public static void main(String[] args) {
        StockPortfolio portfolio = new StockPortfolio(null);
        System.out.println("Number of stocks: " + portfolio.getNumberOfStocks());  // Output: 0
    }
}

```

4. Utilizing Collections for Efficient Test Data Management
Objective: Show how collections can help manage test data efficiently in automated testing environments.

## Key Concepts

Using collections to store and retrieve test data.
Managing test data efficiently using maps and sets.

### Code Example

Technology Domain: Managing user credentials for testing.

```java
import java.util.*;

public class UserCredentialManager {
    private Map<String, String> credentials = new HashMap<>();

    public void addCredential(String username, String password) {
        credentials.put(username, password);
    }

    public String getPassword(String username) {
        return credentials.get(username);
    }

    public static void main(String[] args) {
        UserCredentialManager manager = new UserCredentialManager();
        manager.addCredential("user1", "pass123");
        System.out.println("Password for user1: " + manager.getPassword("user1"));  // Output: pass123
    }
}

```

5. Leveraging Immutable Collections for Robust Code
Objective: Highlight the importance of immutable collections in ensuring robustness, particularly in preventing accidental modifications.

## Key Concepts

Creating immutable collections.
Benefits of immutability in multi-threaded environments.

### Code Example

Finance Domain: Storing immutable interest rates for different types of accounts.

```java
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class InterestRates {
    private static final Map<String, Double> rates;

    static {
        Map<String, Double> tempMap = new HashMap<>();
        tempMap.put("Savings", 0.05);
        tempMap.put("Checking", 0.01);
        rates = Collections.unmodifiableMap(tempMap);
    }

    public static Map<String, Double> getRates() {
        return rates;
    }

    public static void main(String[] args) {
        Map<String, Double> currentRates = InterestRates.getRates();
        System.out.println(currentRates.get("Savings"));  // Output: 0.05

        // Attempt to modify rates will throw an exception
        // currentRates.put("Savings", 0.06);  // UnsupportedOperationException
    }
}

```

6. Performance Testing with Collections
Objective: Discuss how to measure and improve performance when working with large collections, such as in trading applications.

## Key Concepts

Measuring performance using collections.
Optimizing collection usage in large-scale applications.

### Code Example

Stocks Domain: Managing a large list of stock trades and testing performance.

```java
import java.util.*;

public class StockTradeManager {
    public static void main(String[] args) {
        List<String> trades = new ArrayList<>();

        // Simulating a large number of trades
        for (int i = 0; i < 1_000_000; i++) {
            trades.add("Trade" + i);
        }

        // Measure retrieval time
        long startTime = System.nanoTime();
        trades.contains("Trade500000");
        long endTime = System.nanoTime();

        System.out.println("Time taken to search: " + (endTime - startTime) + " ns");
    }
}

```

7. Using Collections and Streams for Functional Testing
Objective: Introduce the use of streams for functional testing, such as filtering, mapping, and reducing test data.

## Key Concepts

Filtering and transforming collections using streams.
Testing collection behaviors with streams.

### Code Example

Banking Domain: Testing customer transactions using streams.

```java
import java.util.*;
import java.util.stream.Collectors;

public class BankTransactionTest {
    public static void main(String[] args) {
        List<String> transactions = Arrays.asList("Deposit:1000", "Withdraw:500", "Deposit:300");

        // Filter deposits and collect them into a list
        List<String> deposits = transactions.stream()
                .filter(t -> t.startsWith("Deposit"))
                .collect(Collectors.toList());

        System.out.println(deposits);  // Output: [Deposit:1000, Deposit:300]
    }
}

```
