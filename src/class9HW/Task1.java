package class9HW;

public class Task1 {
    public static void main(String[] args) {
        // Create an array of chars and store grades into it: A,B,C,D.
        // Then print a grade B (use 2 different ways of creating an array).
        String [] names= {"Alina","Bob","Ceca","Dalton","Boris"};
        System.out.println(names[4]);

        System.out.println();
        String[] names2=new String[5];
        names[0] = "Alina";
        names[1] = "Bob";
        names[2] = "Ceca";
        names[3] = "Dalton";
        names[4]="Boris";

        System.out.println(names[4]);

        }
    }

