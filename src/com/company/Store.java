package com.company;

import java.util.Scanner;

public class Store {

    Scanner scanner = new Scanner(System.in);
    private int countOfWorkers = 0;
    private String name = "";
    private String phoneNumber = "Phone number is missing ";
    private int productNumber = 0;

    private int getCountOfWorkers() {
        return countOfWorkers;
    }

    private void setCountOfWorkers(int countOfWorkers) {
        while (countOfWorkers < 2 || countOfWorkers > 50) {
            System.out.println("Enter new count of workers, it must be in range 2 - 50");
            countOfWorkers = scanner.nextInt();
        }
        this.countOfWorkers = countOfWorkers;
    }

    private String getName() {
        return name;
    }

    private void setName(String name) {
        while (name.length() < 3) {
            System.out.println("Enter new name, it must have at least 3 characters");
            name = scanner.nextLine();
        }
        this.name = name;
    }

    private String getPhoneNumber() {
        return phoneNumber;
    }

    private void setPhoneNumber(String phoneNumber) {
        while (phoneNumber.length() != 8) {
            System.out.println("Enter new phone number, it must have 8 digits");
            phoneNumber = scanner.nextLine();
        }
        this.phoneNumber = phoneNumber;
    }

    private int getProductNumber() {
        return productNumber;
    }

    private void setProductNumber(int productNumber) {
        while (productNumber < 0) {
            System.out.println("Enter right quantity of product, it cannot be negative ");
            productNumber = scanner.nextInt();
        }
        this.productNumber = productNumber;
    }

    public void sellProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the count of product you want bay");
        int sellCount = scanner.nextInt();
        while (sellCount > productNumber) {
            System.out.println("We do not have enough product to sell, please select a another quantity");
            sellCount = scanner.nextInt();
        }
        productNumber = productNumber - sellCount;
    }

    public void storeStatus(Store store) {
        System.out.println("Store name: " + getName());
        System.out.println("Store phone: " + getPhoneNumber());
        System.out.println("Store workers: " + getCountOfWorkers());
        System.out.println("Count of product: " + getProductNumber());
    }

    public Store() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the store name");
        setName(scanner.nextLine());
        System.out.println("Enter phone number");
        setPhoneNumber(scanner.nextLine());
        System.out.println("Enter count of workers");
        setCountOfWorkers(scanner.nextInt());
        System.out.println("Enter count of product");
        setProductNumber(scanner.nextInt());
    }

    public Store(String name, String phoneNumber, int countOfWorkers, int productNumber) {
        setName(name);
        setPhoneNumber(phoneNumber);
        setCountOfWorkers(countOfWorkers);
        setProductNumber(productNumber);
    }

}
