package com.example.calculator.level2;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

    // 속성
    int x;
    int y;
    String operator;
    private List<Integer> result; // 인스턴스 변수

    // 생성자
    public Calculator() {
        result = new ArrayList<Integer>();
    }

    // 기능 (메서드)

    public int calculate (int x, int y, String operator) {
        int calculateResult = 0;
        switch (operator) {
            case "+":
                calculateResult = x + y;
                break;

            case "-":
                calculateResult = x - y;
                break;

            case "*":
                calculateResult = x * y;
                break;

            case "/":
                if (x == 0) {
                    System.out.println("나눗셈 연산에서 분모(두 번재 정수)에 0이 입력될 수 없습니다.");
                }
                calculateResult = x / y;
                break;

        }
        result.add(calculateResult);
        return calculateResult;
    }

    public List<Integer> getResult() {
        return result;
    }

    void setResult(int resultPrice) {
        this.result = result;
    }
}
