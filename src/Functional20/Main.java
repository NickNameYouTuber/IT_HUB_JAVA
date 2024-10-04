package Functional20;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.List;

class WeakPasswordException extends Exception {
    public WeakPasswordException(String message) {
        super(message);
    }
}

public class Main {

    // 1. Функция для нахождения максимума
    public static int findMax(int a, int b) throws Exception {
        if (a == b) {
            throw new Exception("Числа равны");
        }
        return Math.max(a, b);
    }

    // 2. Калькулятор деления
    public static double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Деление на ноль недопустимо");
        }
        return a / b;
    }

    // 3. Конвертер строк в числа
    public static int convert(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Строка не может быть конвертирована в число");
        }
    }

    // 4. Проверка возраста
    public static void checkAge(int age) {
        if (age < 0 || age > 150) {
            throw new IllegalArgumentException("Недопустимый возраст");
        }
    }

    // 5. Нахождение корня
    public static double findSquareRoot(double number) {
        if (number < 0) {
            throw new IllegalArgumentException("Число не может быть отрицательным");
        }
        return Math.sqrt(number);
    }

    // 6. Факториал
    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Число не может быть отрицательным");
        }
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // 7. Проверка массива на нули
    public static void checkForZeros(int[] array) {
        for (int num : array) {
            if (num == 0) {
                throw new RuntimeException("Массив содержит нули");
            }
        }
    }

    // 8. Калькулятор возведения в степень
    public static double power(double base, int exponent) {
        if (exponent < 0) {
            throw new IllegalArgumentException("Степень не может быть отрицательной");
        }
        return Math.pow(base, exponent);
    }

    // 9. Обрезка строки
    public static String trimString(String str, int length) {
        if (length > str.length()) {
            throw new IllegalArgumentException("Число символов больше длины строки");
        }
        return str.substring(0, length);
    }

    // 10. Поиск элемента в массиве
    public static int findElement(int[] array, int element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                return i;
            }
        }
        throw new RuntimeException("Элемент не найден");
    }

    // 11. Конвертация в двоичную систему
    public static String toBinary(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Число не может быть отрицательным");
        }
        return Integer.toBinaryString(number);
    }

    // 12. Проверка делимости
    public static boolean isDivisible(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Деление на ноль недопустимо");
        }
        return a % b == 0;
    }

    // 13. Чтение элемента списка
    public static <T> T getElement(List<T> list, int index) {
        if (index < 0 || index >= list.size()) {
            throw new IndexOutOfBoundsException("Индекс выходит за пределы списка");
        }
        return list.get(index);
    }

    // 14. Парольная проверка
    public static void checkPassword(String password) throws WeakPasswordException {
        if (password.length() < 8) {
            throw new WeakPasswordException("Пароль слишком слабый");
        }
    }

    // 15. Проверка даты
    public static void validateDate(String date) {
        try {
            LocalDate.parse(date, DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        } catch (DateTimeParseException e) {
            throw new DateTimeParseException("Неверный формат даты", date, e.getErrorIndex());
        }
    }

    // 16. Конкатенация строк
    public static String concatenate(String str1, String str2) {
        if (str1 == null || str2 == null) {
            throw new NullPointerException("Одна из строк равна null");
        }
        return str1 + str2;
    }

    // 17. Остаток от деления
    public static int remainder(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Деление на ноль недопустимо");
        }
        return a % b;
    }

    // 18. Квадратный корень
    public static double squareRoot(double number) {
        if (number < 0) {
            throw new IllegalArgumentException("Число не может быть отрицательным");
        }
        return Math.sqrt(number);
    }

    // 19. Конвертер температуры
    public static double celsiusToFahrenheit(double celsius) {
        if (celsius < -273.15) {
            throw new IllegalArgumentException("Температура меньше абсолютного нуля");
        }
        return celsius * 9 / 5 + 32;
    }

    // 20. Проверка строки на пустоту
    public static void checkString(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Строка пустая или равна null");
        }
    }
}