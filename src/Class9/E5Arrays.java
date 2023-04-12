package Class9;

public class E5Arrays {
    public static void main(String[] args) {


        String []names = {"Ban", "John"," Bob", "Mike", "Zee"};
        System.out.println(names.length);
        for (int j = 0; j <names.length; j++) {
            System.out.print(names[j]+ " ");
        }
        System.out.println();
        int counter=0;
        while (counter<names.length){
            System.out.print(names[counter]+" ");
            counter++;
        }

    }
}