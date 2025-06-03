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

    public Table(double height, double width, double weight, double price, double length){
        this.height = height;
        this.width = width;
        this.weight = weight;
        this.price = price;
        this.length = length;
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

    //Setters/Mutators
    public void setheight(double height){
        this.height = height;
    }
    public void setwidth(double width){
        this.width = width;
    }
    public void setweight(double weight){
        this.weight = weight;
    }
    public void setprice(double price){
        this.price = price;
    }
    public void setlength(double length){
        this.length = length;
    }

}
