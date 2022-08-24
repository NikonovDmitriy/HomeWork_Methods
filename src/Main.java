public class Main {
    public static void main(String[] args) {
        TASk1();
        TASk2();
    }

    //Задание 1
    public static void understandAndPrintYear(int year){
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
        if (client==1 && clientDeviceYear<2015){
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }else if (client==1 && clientDeviceYear>=2015){
            System.out.println("Установите версию приложения для Android по ссылке");
        }else if (client==0 && clientDeviceYear<2015){
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }else if (client==0 && clientDeviceYear>=2015){
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
    }

    public static void TASk2(){
        int clientDeviceYear = 2021;
        int client = 1;
        understandOs(clientDeviceYear, client);
    }

    //Задание 3

}