public class AnotherClass {

    String address;
    int houseNumber;
    int rooms;

    public AnotherClass(String address, int houseNumber, int rooms){
        if (address != "CorrectAddress"){
            throw new ExceptionInInitializerError();
        }
        else{
            this.address = address;
            this.houseNumber = 54;
            this.rooms = houseNumber;
        }
    }
}
