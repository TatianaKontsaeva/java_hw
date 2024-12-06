package task1;

/**
 * Класс Product представляет товар с его характеристиками.
 * Он содержит информацию о количестве товаров, цене и скидке.
 */
class Product {
    // Количество товаров
    private int quantity;
    
    // Цена товара
    private double price;
    
    // Скидка на товар (в процентах)
    private double discount;

    /**
     * Конструктор класса Product.
     *
     * @param quantity Количество товаров
     * @param price Цена товара
     * @param discount Скидка на товар (в процентах)
     */
    public Product(int quantity, double price, double discount) {
        this.quantity = quantity;
        this.price = price;
        this.discount = discount;
    }

    /**
     * Метод для подсчета общей суммы покупки.
     * 
     * @return Массив с общей суммой без скидки и со скидкой
     */
    public double[] calculateTotal() {
        double totalWithoutDiscount = quantity * price; // Общая сумма без скидки
        double totalWithDiscount = totalWithoutDiscount * (1 - discount / 100); // Общая сумма со скидкой
        
        return new double[]{totalWithoutDiscount, totalWithDiscount}; // Возвращаем обе суммы
    }
}

public class Main {
    public static void main(String[] args) {
        // Создаем объекты Product с различными параметрами
        Product product1 = new Product(10, 100.0, 0.75); // 10 товаров по 100.0 с 0.75% скидкой
        Product product2 = new Product(5, 200.0, 42.575); // 5 товаров по 200.0 с 42.575% скидкой
        Product product3 = new Product(3, 150.0, 59.1); // 3 товара по 150.0 с 59.1% скидкой

        // Вызываем метод calculateTotal и выводим результаты
        printTotal(product1);
        printTotal(product2);
        printTotal(product3);
    }

    /**
     * Метод для вывода итоговой суммы покупки.
     *
     * @param product Объект товара
     */
    private static void printTotal(Product product) {
        double[] totals = product.calculateTotal();
        double totalWithoutDiscount = totals[0];
        double totalWithDiscount = totals[1];

        // Округляем суммы до 2 знаков после запятой и выводим на экран
        System.out.printf("Общая сумма без скидки: %.2f, Общая сумма со скидкой: %.2f%n", totalWithoutDiscount, totalWithDiscount);
    }
}
