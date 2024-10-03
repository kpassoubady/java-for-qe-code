package com.kavinschool.collections.maps;

class TestResult<T> {
    private T result;

    public void setResult(T result) {
        this.result = result;
    }

    public T getResult() {
        return result;
    }
}

public class CollectTestResult {
    public static void main(String[] args) {
        TestResult<String> testResult = new TestResult<>();
        testResult.setResult("Hello");
        System.out.println(testResult.getResult());

        TestResult<Boolean> uiTestResult = new TestResult<>();
        uiTestResult.setResult(true);  // Pass or Fail as a Boolean
        System.out.println(uiTestResult.getResult());

        TestResult<String> apiTestResult = new TestResult<>();
        apiTestResult.setResult("200 OK");  // HTTP response status
        System.out.println(apiTestResult.getResult());

        TestResult<Integer> performanceTestResult = new TestResult<>();
        performanceTestResult.setResult(500);  // Response time in milliseconds
        System.out.println(performanceTestResult.getResult());
    }
}
