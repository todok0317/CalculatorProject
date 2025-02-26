package com.example.calculator.level2;

public class Calculator {

    // 속성 (변수선언)
    int positiveInteger1;
    int positiveInteger2;
    String operator;
    int result;

    // 생성자

    public Calculator() {

    }


    // 기능 (메소드)
    public void calculator(int positiveInteger1, int positiveInteger2, String operator) {
        this.positiveInteger1 = positiveInteger1;
        this.positiveInteger2 = positiveInteger2;
        this.operator = operator;
    }

    public int calculate() {
        int result = 0;
        if ("+".equals(operator)) {
            result = positiveInteger1 + positiveInteger2;
        } else if ("-".equals(operator)) {
            result = positiveInteger1 - positiveInteger2;
        } else if ("*".equals(operator)) {
            result = positiveInteger1 * positiveInteger2;
        } else if ("/".equals(operator)) {
            if (positiveInteger2 == 0) {
                System.out.println("나눗셈 연산에서 분모(두 번재 정수)에 0이 입력될 수 없습니다.");
            } result = positiveInteger1 / positiveInteger2;
        }
        return result;
    }

    String get;





}
