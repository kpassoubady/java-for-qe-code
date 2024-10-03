package com.kavinschool.generics;


import java.util.Arrays;
import java.util.List;

// Base class for all types of insurance policies
class InsurancePolicy {
    private final String policyId;

    public InsurancePolicy(String policyId) {
        this.policyId = policyId;
    }

    public String getPolicyId() {
        return policyId;
    }
}

// Health insurance policy
class HealthPolicy extends InsurancePolicy {
    public HealthPolicy(String policyId) {
        super(policyId);
    }
}

// Vehicle insurance policy
class VehiclePolicy extends InsurancePolicy {
    public VehiclePolicy(String policyId) {
        super(policyId);
    }
}

// InsurancePolicyManager with wildcards
class InsurancePolicyManager {
    public void printPolicyDetails(List<? extends InsurancePolicy> policies) {
        for (InsurancePolicy policy : policies) {
            System.out.println("Policy ID: " + policy.getPolicyId());
        }
    }
}

public class InsurancePolicySystem {
    public static void main(String[] args) {
        List<HealthPolicy> healthPolicies = Arrays.asList(new HealthPolicy("HP123"), new HealthPolicy("HP456"));
        List<VehiclePolicy> vehiclePolicies = Arrays.asList(new VehiclePolicy("VP123"), new VehiclePolicy("VP456"));

        InsurancePolicyManager policyManager = new InsurancePolicyManager();
        policyManager.printPolicyDetails(healthPolicies);
        policyManager.printPolicyDetails(vehiclePolicies);
    }
}
