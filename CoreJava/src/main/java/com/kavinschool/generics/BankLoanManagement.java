package com.kavinschool.generics;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// Loan interface
interface Loan {
    double interestRate();
    String loanId();
}

// Insurable interface for insurance purposes
interface Insurable {
    double insuranceAmount();
}

// HomeLoan implementing Loan and Insurable
record HomeLoan(String loanId, double interestRate, double insuranceAmount) implements Loan, Insurable {
}

// PersonalLoan only implements Loan
record PersonalLoan(String loanId, double interestRate) implements Loan, Insurable {

    @Override
    public double insuranceAmount() {
        return 0;
    }

    @Override
    public String toString() {
        return "PersonalLoan{" + "loanId='" + loanId + '\'' +
                ", interestRate=" + interestRate +
                '}';
    }
}

// LoanManager with multiple bounds
class LoanManager<T extends Loan & Insurable> {
    private final List<T> insuredLoans = new ArrayList<>();

    public void addLoan(T loan) {
        insuredLoans.add(loan);
    }

    public double calculateTotalInsurance() {
        return insuredLoans.stream().mapToDouble(Insurable::insuranceAmount).sum();
    }

    public List<String> getLoanIds() {
        return insuredLoans.stream().map(Loan::loanId).collect(Collectors.toList());
    }

    @Override
    public String toString() {
        return "LoanManager{" + "insuredLoans=" + insuredLoans +
                '}';
    }
}

public class BankLoanManagement {
    public static void main(String[] args) {
        LoanManager<HomeLoan> homeLoanManager = new LoanManager<>();
        homeLoanManager.addLoan(new HomeLoan("HL123", 3.5, 200000.0));

        System.out.println("Total Insurance: " + homeLoanManager.calculateTotalInsurance());
        System.out.println("Loan IDs: " + homeLoanManager.getLoanIds());

        LoanManager<PersonalLoan> personalLoanManager = new LoanManager<>();
        personalLoanManager.addLoan(new PersonalLoan("PL123", 5.0));
        personalLoanManager.addLoan(new PersonalLoan("PL124", 4.5));
        personalLoanManager.addLoan(new PersonalLoan("PL125", 4.0));
        System.out.println("personalLoanManager = " + personalLoanManager);
    }
}
