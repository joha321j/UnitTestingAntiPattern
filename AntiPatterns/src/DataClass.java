public class DataClass {

    private String title;
    private String name;
    private String email;
    private String address;
    private int age;
    private double networth;

    public DataClass(String title, String name, String email, String address, int age, double networth){
        this.title = title;
        this.name = name;
        this.email = email;
        this.address = address;
        this.age = age;
        this.networth = networth;
    }

    public double calculateNetWorthAtSixtyYearsOld(){
        double newNetworth;

        double interestRate = 1.15;

        if (age < 18){
            throw new ArithmeticException();
        }
        else{
            if (age >= 60){
                newNetworth = networth;
            }
            else{
                newNetworth = networth * (60 - age) * interestRate;
            }
            return newNetworth;
        }
    }
}
