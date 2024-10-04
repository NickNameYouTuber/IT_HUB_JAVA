package lesson3;

import java.util.*;

// 1. Класс "Человек"
class Person {
    private String name;
    private int age;
    private String gender;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age + ", Gender: " + gender);
    }

    public void increaseAge() {
        age++;
    }

    public void changeName(String newName) {
        this.name = newName;
    }
}

// 2. Наследование: Класс "Работник" и "Менеджер"
class Worker extends Person {
    private double salary;

    public Worker(String name, int age, String gender, double salary) {
        super(name, age, gender);
        this.salary = salary;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Worker {
    private List<Worker> subordinates;

    public Manager(String name, int age, String gender, double salary) {
        super(name, age, gender, salary);
        this.subordinates = new ArrayList<>();
    }

    public void addSubordinate(Worker worker) {
        subordinates.add(worker);
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Subordinates: " + subordinates.size());
    }
}

// 3. Полиморфизм: Животные
interface Animal {
    void makeSound();
}

class Dog implements Animal {
    public void makeSound() {
        System.out.println("Woof!");
    }
}

class Cat implements Animal {
    public void makeSound() {
        System.out.println("Meow!");
    }
}

class Cow implements Animal {
    public void makeSound() {
        System.out.println("Moo!");
    }
}

// 4. Абстрактный класс "Транспорт"
abstract class Transport {
    public abstract void move();
}

class Car extends Transport {
    public void move() {
        System.out.println("Car is driving.");
    }
}

class Bike extends Transport {
    public void move() {
        System.out.println("Bike is riding.");
    }
}

// 5. Класс "Книга" и "Библиотека"
class Book {
    private String title;
    private String author;
    private int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }
}

class Library {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public List<Book> findByAuthor(String author) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                result.add(book);
            }
        }
        return result;
    }

    public List<Book> findByYear(int year) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getYear() == year) {
                result.add(book);
            }
        }
        return result;
    }
}

// 6. Инкапсуляция: Банк
class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    public double getBalance() {
        return balance;
    }
}

// 7. Счетчик объектов
class Counter {
    private static int count = 0;

    public Counter() {
        count++;
    }

    public static int getCount() {
        return count;
    }
}

// 8. Площадь фигур
abstract class Shape {
    public abstract double getArea();
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }
}

// 9. Наследование: Животные и их движения
class Animal {
    public void move() {
        System.out.println("Animal is moving.");
    }
}

class Fish extends Animal {
    public void move() {
        System.out.println("Fish is swimming.");
    }
}

class Bird extends Animal {
    public void move() {
        System.out.println("Bird is flying.");
    }
}

class Dog extends Animal {
    public void move() {
        System.out.println("Dog is running.");
    }
}

// 10. Работа с коллекциями: Университет
class Student {
    private String name;
    private String group;
    private int grade;

    public Student(String name, String group, int grade) {
        this.name = name;
        this.group = group;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }
}

class University {
    private List<Student> students;

    public University() {
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public List<Student> sortByName() {
        List<Student> sorted = new ArrayList<>(students);
        sorted.sort(Comparator.comparing(Student::getName));
        return sorted;
    }

    public List<Student> filterByGrade(int grade) {
        List<Student> filtered = new ArrayList<>();
        for (Student student : students) {
            if (student.getGrade() == grade) {
                filtered.add(student);
            }
        }
        return filtered;
    }
}

// 11. Класс "Магазин"
class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }
}

class Store {
    private List<Product> products;

    public Store() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(String name) {
        products.removeIf(product -> product.getName().equals(name));
    }

    public Product findProduct(String name) {
        for (Product product : products) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        return null;
    }
}

// 12. Интерфейс "Платежная система"
interface PaymentSystem {
    void pay();
    void refund();
}

class CreditCard implements PaymentSystem {
    public void pay() {
        System.out.println("Paying with credit card.");
    }

    public void refund() {
        System.out.println("Refunding with credit card.");
    }
}

class PayPal implements PaymentSystem {
    public void pay() {
        System.out.println("Paying with PayPal.");
    }

    public void refund() {
        System.out.println("Refunding with PayPal.");
    }
}

// 13. Генерация уникальных идентификаторов
class UniqueID {
    private static int counter = 0;
    private int id;

    public UniqueID() {
        this.id = counter++;
    }

    public int getID() {
        return id;
    }
}

// 14. Класс "Точка" и "Прямоугольник"
class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}

class Rectangle {
    private Point topLeft;
    private Point bottomRight;

    public Rectangle(Point topLeft, Point bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    public int getArea() {
        int width = bottomRight.getX() - topLeft.getX();
        int height = topLeft.getY() - bottomRight.getY();
        return width * height;
    }
}

// 15. Комплексные числа
class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public ComplexNumber add(ComplexNumber other) {
        return new ComplexNumber(this.real + other.real, this.imaginary + other.imaginary);
    }

    public ComplexNumber subtract(ComplexNumber other) {
        return new ComplexNumber(this.real - other.real, this.imaginary - other.imaginary);
    }

    public ComplexNumber multiply(ComplexNumber other) {
        double newReal = this.real * other.real - this.imaginary * other.imaginary;
        double newImaginary = this.real * other.imaginary + this.imaginary * other.real;
        return new ComplexNumber(newReal, newImaginary);
    }

    public ComplexNumber divide(ComplexNumber other) {
        double denominator = other.real * other.real + other.imaginary * other.imaginary;
        double newReal = (this.real * other.real + this.imaginary * other.imaginary) / denominator;
        double newImaginary = (this.imaginary * other.real - this.real * other.imaginary) / denominator;
        return new ComplexNumber(newReal, newImaginary);
    }
}

// 16. Перегрузка операторов: Матрица
class Matrix {
    private int rows;
    private int cols;
    private double[][] data;

    public Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.data = new double[rows][cols];
    }

    public Matrix add(Matrix other) {
        if (this.rows != other.rows || this.cols != other.cols) {
            throw new IllegalArgumentException("Matrices must have the same dimensions.");
        }
        Matrix result = new Matrix(rows, cols);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result.data[i][j] = this.data[i][j] + other.data[i][j];
            }
        }
        return result;
    }

    public Matrix multiply(Matrix other) {
        if (this.cols != other.rows) {
            throw new IllegalArgumentException("Number of columns in the first matrix must be equal to the number of rows in the second matrix.");
        }
        Matrix result = new Matrix(this.rows, other.cols);
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < other.cols; j++) {
                for (int k = 0; k < this.cols; k++) {
                    result.data[i][j] += this.data[i][k] * other.data[k][j];
                }
            }
        }
        return result;
    }
}

// 17. Создание игры с использованием ООП
class Player {
    private String name;
    private int health;

    public Player(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public void attack(Enemy enemy) {
        enemy.takeDamage(10);
    }

    public void takeDamage(int damage) {
        health -= damage;
    }
}

class Enemy {
    private String name;
    private int health;

    public Enemy(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public void attack(Player player) {
        player.takeDamage(5);
    }

    public void takeDamage(int damage) {
        health -= damage;
    }
}

class Weapon {
    private String name;
    private int damage;

    public Weapon(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    public void use(Enemy enemy) {
        enemy.takeDamage(damage);
    }
}

// 18. Автоматизированная система заказов
class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}

class Customer {
    private String name;

    public Customer(String name) {
        this.name = name;
    }
}

class Order {
    private Customer customer;
    private List<Product> products;

    public Order(Customer customer) {
        this.customer = customer;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public double getTotalCost() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }
}

// 19. Наследование: Электроника
class Device {
    private String brand;

    public Device(String brand) {
        this.brand = brand;
    }

    public void turnOn() {
        System.out.println("Device is turning on.");
    }

    public void turnOff() {
        System.out.println("Device is turning off.");
    }
}

class Smartphone extends Device {
    public Smartphone(String brand) {
        super(brand);
    }

    public void takePhoto() {
        System.out.println("Taking a photo with smartphone.");
    }
}

class Laptop extends Device {
    public Laptop(String brand) {
        super(brand);
    }

    public void browseInternet() {
        System.out.println("Browsing the internet with laptop.");
    }
}

// 20. Игра "Крестики-нолики"
class Player {
    private String name;
    private char symbol;

    public Player(String name, char symbol) {
        this.name = name;
        this.symbol = symbol;
    }

    public char getSymbol() {
        return symbol;
    }
}

class Game {
    private char[][] board;
    private Player player1;
    private Player player2;
    private Player currentPlayer;

    public Game(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        this.board = new char[3][3];
        this.currentPlayer = player1;
    }

    public void makeMove(int x, int y) {
        if (board[x][y] == '\0') {
            board[x][y] = currentPlayer.getSymbol();
            switchPlayer();
        } else {
            System.out.println("Invalid move.");
        }
    }

    private void switchPlayer() {
        currentPlayer = (currentPlayer == player1) ? player2 : player1;
    }
}