package class11;

import javax.sound.midi.Soundbank;

public class E2D2Arrays {


    public static void main(String[] args) {
        String[][] names = {                 //names2DArray=
                {"Sarah", "Artem", "Lean", "Semir"},
                {"Farwa", "Hleima", "Alina", "Semir"}

        };
        for (int i = 0; i < names.length; i++) {                      // for(String[] name1DArr:names2dArray){
            for (int j = 0; j < names[i].length; j++) {             //for(String name :name1DArr){
                System.out.println(names[i][j]);                    // System.out.println(name);

            }

        }

    }
}