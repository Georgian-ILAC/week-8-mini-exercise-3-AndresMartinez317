public class Employee extends Person {

    private int id;
    private double hourlypay;

    public Employee(String firstName, String lastName) {

        super(firstName, lastName, 1.80);
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public double getHourlypay() {

        return hourlypay;
    }

    public void setHourlypay(double hourlypay) {

        this.hourlypay = hourlypay;
    }

    void getRaise(){
        this.hourlypay = (hourlypay*1.15);
    }

    double PayDay(int hours){
        boolean overtime = false;
        double pay =0;
        if(hours <40){
            pay = hourlypay * hours;
        }
        else if (hours > 40)
        {
            double NormHours = hourlypay*40;
            double OvertimeHours = (hourlypay*1.5) * (hours- 40);
            pay = NormHours + OvertimeHours;
        }
        return pay;
    }

    @Override
    public String toString() {
        return super.toString() + " they make "+ hourlypay+ "\n"+"they have the employe id " + id;

    }
}
