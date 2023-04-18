package review2;

public class AnotherNested {
    public static void main(String[] args) {

        /*
        if you have covi vaccine yrs or not
       if dose=1-> you need 2 to be fully vacimnated
       if dose=2 -> you are fully vacinated
       if dose =3 -> youi fully and have booster
         */
        boolean vaccine=true;
        int dose=1;
        if (vaccine) {
            if(dose==1) {
                System.out.println("you need second dose");
            }else if (dose==2) {
                System.out.println("you are fully vaccinated");
            }else if (dose==3) {
                System.out.println("you are fully vaccinated wih booster");
            }
        }
    }
}
