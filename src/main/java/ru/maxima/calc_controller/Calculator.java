package ru.maxima.calc_controller;

class Calculator {
    public Double calculate(String a, String b, String action) {
        System.out.println(Double.parseDouble(a));

        Double result = switch (action) {
            case "add" -> Double.parseDouble(a) + Double.parseDouble(b);
            case "subtract" -> Double.parseDouble(a) - Double.parseDouble(b);
            case "multiply" -> Double.parseDouble(a) * Double.parseDouble(b);
            case "divide" -> Double.parseDouble(a) / Double.parseDouble(b);
            default -> throw new IllegalArgumentException("Unsupported operation: " + action);
        };

        return result;
    }
}
