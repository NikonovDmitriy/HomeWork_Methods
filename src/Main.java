import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        TASk1();
        TASk2();
        TASk3();
    }

    //Задание 1
    public static void understandAndPrintYear(int year){
        System.out.println("Задание 1");
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year +" год является високосным");
        }else {
            System.out.println(year +" год не является високосным");
        }

    }

    public static void TASk1(){
        int YEAR = 2021;
        understandAndPrintYear(YEAR);
    }

    //Задание 2
    public static void understandOs(int clientDeviceYear, int client) {
        System.out.println();
        System.out.println("Задание 2");
        int currentYear = LocalDate.now().getYear();
        if (clientDeviceYear<currentYear){
            System.out.print("Установите облегченную версию приложения для ");
        } else {
            System.out.print("Установите вресию приложения для ");
        }
        if (client==1){
                System.out.println("Android по ссылке");
            } else {
                System.out.println("iOS по ссылке");
            }
        }


    public static void TASk2(){
        int clientDeviceYear = 2021;
        int client = 4;
        understandOs(clientDeviceYear, client);
    }

    //Задание 3
    public static int deliveryDays(int rasstoynie) {
        System.out.println();
        System.out.println("Задание 3");
        int days = 0;
        int interval = 40;
        int interval1 = 20;
        if (rasstoynie <= interval1) {
            days = 1;
        }else{
            days = days+(int) Math.ceil((rasstoynie-interval1)/(double)interval);
        }
        return days;
    }

    public static void TASk3(){
        int deliveryDistance = 95;
        System.out.println("Потребуется дней: "+deliveryDays(deliveryDistance));
    }
}