package com.example.calculator.level3;

import java.util.Arrays;
import java.util.function.BiFunction;

public enum OperatorType {
    // 속성
    // 람다식 표현
    Plus("+", (x, y) -> x + y),
    Minus("-", (x, y) -> x - y),
    Multiple("*", (x, y) -> x * y),
    Divide("/", (x, y) -> x / y);

    private String symbol;
    private BiFunction<Double, Double, Double> operation;

    // 생성자 선언
    OperatorType(String symbol, BiFunction<Double, Double, Double> operation) {
        this.symbol = symbol;
        this.operation = operation;
    }

    // 기능
    public String getSymbol() {
        return symbol;
    }

    // 스트림 계산 방식
    public static OperatorType findValidatedSymbol(String operator) {
        return Arrays.stream(values())
                .filter(op -> op.getSymbol().equals(operator))
                .findFirst()
                .orElseThrow(()-> new IllegalArgumentException(String.format("잘못된 연산자 입니다.")));
    }

    public double operate (double x, double y) {
       return operation.apply(x,y);
    }






}
