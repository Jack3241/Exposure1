package Lab03;

public class Lab03 {
    public static void main(String[] args) {
        System.out.println("Lab03, 100 Point Version\n");

        int milliseconds = 76000000;
        int seconds = milliseconds/ 1000;
        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;

        System.out.println("Starting milliseconds: \t" + milliseconds);
        System.out.println("Hours: \t\t\t\t" + hours);
        System.out.println("Minutes: \t\t\t\t" + minutes);
        System.out.println("Seconds: \t\t\t\t" + seconds % 60);
        System.out.println("Milliseconds: \t" + milliseconds % 60);


    }
}
