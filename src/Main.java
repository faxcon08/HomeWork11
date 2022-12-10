


public class Main {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    static int TASK_NUMBER=1;
    static void printTaskNumber(String number){
        System.out.println(ANSI_RED + "1."+(TASK_NUMBER++)+" "+number+" Task" + ANSI_RESET);
    } // printTasKMumber

    static void checkLeapYear(int year) {
        if (year < 0) {
            throw new RuntimeException("Отрицательный год");
        }
        if((year%4==0 || year%100==0) && year%400!=0) {
            System.out.println(year + " - високосный год");
            return;
        }
        System.out.println(year + " - не високосный год");

    }// checkLeapYer
    static void printMessageForVersion (int iOS, int clientDeviceYear) {
        if((iOS!=0 && iOS!=1) || clientDeviceYear<1990)
            throw new RuntimeException("Некорректный год или версия OS");

        String iOSVersion = (iOS == 0) ? "Android" : "iOS";
        if (clientDeviceYear<2015) {
            System.out.println("Установите облегченную версию приложения для "+iOSVersion+" по ссылке");
        } else
            System.out.println("Установите  приложения для "+iOSVersion+" по ссылке");

    }// printMessageForVersion

    static int calculateDeliveryDays(int distance) {
        if(distance <0 || distance>1000)
            throw new RuntimeException("Отрицательная дистанция");
        return  (distance+19)/40+1;
    }

    public static void main(String[] args) {
        printTaskNumber("First"); ///////////////// Fist /////////////////
        int year = java.time.LocalDate.now().getYear();
        checkLeapYear(year);

        printTaskNumber("Second"); ////////////// Second ////////////////
        int iOS = 1;
        int clientDeviceYear = 2013;
        printMessageForVersion(iOS,clientDeviceYear);

        printTaskNumber("Third"); ///////////// Third /////////////////
        int distance = 141;
        System.out.println("Потребуется дней:" + calculateDeliveryDays(distance));

    }// main


}// Main