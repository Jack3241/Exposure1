package Objects;

public class Ikea {

    public static void main(String args[]) {
        //dataType name = value;
        int example = 1;
        Table table1 = new Table();
        String myString = "My string here";

        System.out.println(table1.getweight());
        table1.setweight(9999.0);
        System.out.println(table1.getweight());
    }

}
