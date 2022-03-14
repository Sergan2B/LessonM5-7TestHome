package kg.geektech.lessonm5_7test;

public class CustomMath {
    public String add(Integer a, Integer b) {
        if (b == null && a != null) return "Второе значение пустое";
        if (a == null && b != null) return "Первое значение пустое";
        if (a == null && b == null) return "Оба значение пустые";
        return String.valueOf(a + b);
    }

    public String sub(Integer a, Integer b) {
        if (b == null && a != null) return "Второе значение пустое";
        if (a == null && b != null) return "Первое значение пустое";
        if (a == null && b == null) return "Оба значение пустые";
        return String.valueOf(a - b);
    }

    public String multi(Integer a, Integer b) {
        if (b == null && a != null) return "Второе значение пустое";
        if (a == null && b != null) return "Первое значение пустое";
        if (a == null && b == null) return "Оба значение пустые";
        return String.valueOf(a * b);
    }

    public String div(Integer a, Integer b) {
        if (b == null && a != null) return "Второе значение пустое";
        if (a == null && b != null) return "Первое значение пустое";
        if (a == null && b == null) return "Оба значение пустые";
        if (b == 0) return "Нельзя делить на ноль";
        return String.valueOf(a / b);
    }
}
