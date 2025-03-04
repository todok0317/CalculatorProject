package com.example.calculator.level3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ArithmeticCalculator<T extends Number>  {

    // 속성
    private List<Double> results; // 인스턴스 변수

    // 생성자
    public ArithmeticCalculator() {
        results = new ArrayList<>();
    }

    // 기능 (메서드)

    public double calculate (T x, T y, OperatorType operator) {
        double result = operator.operate(x.doubleValue(), y.doubleValue());
        results.add(result);
        return result;
    }

    public List<Double> getResult() {
        return results;
    }

    public List<Double> findResultsGreaterThan(double value) {
        return results.stream().filter(result -> result > value).collect(Collectors.toList());
    }

    void setResult(double resultPrice) {
        this.results = results;
    }
}
