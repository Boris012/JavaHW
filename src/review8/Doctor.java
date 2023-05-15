package review8;

public class Doctor {

    public String firstName,  lastName;
    protected String speciality;
    int yearOfExperiance;
    private double salary;
    public static boolean degree;

    Doctor(String firstName, String lastName){
       this.firstName=firstName;
       this.lastName=lastName;

    }
    // to have more than one constractor we need to change number of the parameters or type of the parameters
     public Doctor(String firstName, String lastName, String speciality) {
        this(firstName, lastName);   // this() => calling a current class constractor
        this.speciality = speciality; // this.  reffering to current class instance
    }
    public void printInfo(){
        System.out.println("Doctors name is"+firstName+ " "+ lastName+ " "+ speciality);
    }


    protected void treat(){
        System.out.println("Doctors treat patiences");
    }

    void prescribeMedicine(String medicine){
        System.out.println("Doctor prescribed" + medicine);

    }
    private double getSalary(){
        return salary;

    }
}
