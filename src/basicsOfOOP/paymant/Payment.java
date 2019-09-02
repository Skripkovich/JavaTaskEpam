package basicsOfOOP.paymant;

/**
 * Создать класс Payment с внутренним классом, с помощью объектов которого можно сформировать покупку из
 * нескольких товаров.
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Payment {

    public static void main (String [] args) throws IOException {

        PaymentClass payment1 = new PaymentClass("Первая оплата:");
        payment1.setPaymentClass();
        payment1.printCheque();


    }

    static class PaymentClass {

        private String name;
        private Product[] products;
        private int cost;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public class Product {

            private String nameProduct;
            private int costProduct;

            public String getNameProduct() {
                return nameProduct;
            }

            public void setNameProduct(String nameProduct) {
                this.nameProduct = nameProduct;
            }

            public int getCostProduct() {
                return costProduct;
            }

            public void setCostProduct(int costProduct) {
                costProduct = costProduct;
            }

            public Product (String nameProduct, int costProduct){

                this.nameProduct = nameProduct;
                this.costProduct = costProduct;
            }

        }
        public PaymentClass (String name){

            this.name = name;
        }

        public void setPaymentClass () throws IOException {

            this.cost = 0;
            System.out.println("Введите количество продуктов, которые вы хотите купить: ");

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            try {
                int count = Integer.parseInt(reader.readLine());
                products = new Product[count];
                for (int i = 0; i < count; i++) {
                    System.out.println("Товар " + (i + 1) + ": ");
                    System.out.print("Имя товара: ");
                    String name = reader.readLine();
                    System.out.print("Сумма: ");
                    int cost = Integer.parseInt(reader.readLine());
                    products[i] = new Product(name, cost);
                    this.cost += products[i].costProduct;
                }
            }catch (NumberFormatException e) {
                System.out.println("Некорректный формат");
            } catch (NegativeArraySizeException e) {
                System.out.println("Размерность массива не может быть < 0");
            } catch (NullPointerException e) {
                System.out.println("Массив не корректен");
            }
        }

        public void printCheque() {
            try {
                System.out.println(this.name + ":");
                for (int i = 0; i < this.products.length; i++) {
                    System.out.println(i + 1 + " " + this.products[i].nameProduct + " " + this.products[i].costProduct);
                }
                System.out.print("Стоимость: " + this.cost);
            } catch (NullPointerException e) {
                System.out.println("Массив не корректен");
            }
        }
    }

}

