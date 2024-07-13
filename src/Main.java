public class Main {
    public static void main(String[] args) {

        Employee andres = new Employee("Andres","Martinez");
        andres.setId(12345);
        andres.setHourlypay(50);
        andres.getRaise();
        System.out.println("the payment this month is "+ andres.PayDay(50));
        System.out.println(andres.toString());
    }
}