package class10HW;

public class Task6 {
    public static void main(String[] args) {
        // Create 2D array of countries: north america countries, south america countries, europe countries,
        // asian countries, african countries. Then print all values from that array using 2 different loops
        // and calculate how many total countries been stored

        String [][] countries={
                {"NY", "Virginia","Florida","California"},
                {"Argentina","Mexico", "Brasil", "Peru"},
                {"Italy","Montenegro", "Serbia", "Greece"},
                {"Indonesia","Singapore", "Thailand", "Vietnam"},
                {"Egypt","Mali", "Nigeria", "Maroco"}

        };

        for (int i = 0; i < countries.length; i++) {
            for (int j = 0; j < countries[i].length; j++) {
                System.out.print(countries[i][j]+" ");

            }
            System.out.println();
        }
        System.out.println();
        for (String[] state:countries) {
            for (String state1 : state) {
                System.out.print(state1 + " ");
            }
            System.out.println();
        }


    }
}
