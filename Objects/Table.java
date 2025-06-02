package Objects;


/*
*
*
 */
public class Table {
    // Attributes - variable
    double height;
    double width;
    double weight;
    double price;
    double length;

    //default constructor - special method
    // name of the method = name of the class
    public Table(){
        height =23;
        width =48;
        weight =52;
        price =50;
        length =936;





    }

    //getters/accessors
    public double getheight(){
        return height;
    }
    public double getwidth(){
        return width;
    }
    public double getweight(){
        return weight;
    }
    public double getprice(){
        return price;
    }
    public double getlength(){
        return length;
    }
}
