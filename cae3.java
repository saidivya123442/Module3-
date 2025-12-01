class Car3 {
    String model;
    int year;

    // Parameterized Constructor
    Car3(String m, int y) {
        model = m;
        year = y;
    }

    void display() {
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }

    public static void main(String[] args) {
        Car3 c1 = new Car3("BMW", 2024);
        Car3 c2 = new Car3("Audi", 2023);

        c1.display();
        c2.display();
    }
}
