public class Customer {

    private int age;
    private double height;
    private double money;

    public Customer(int age, double height, double money) {
        this.age = age;
        this.height = height;
        this.money = money;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public double getMoney() {
        return money;
    }

    public void payMoney(double money) {
        this.money -= money;
    }
}
