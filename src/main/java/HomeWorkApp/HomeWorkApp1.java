package HomeWorkApp;

public class HomeWorkApp1 {

    public static void main(String[] args) {

        printThreeWords();

        checkSumSign();

        printColor();

        compareNumbers();

    }


    static void printThreeWords() {
        System.out.println("Orange\nBanana\nApple");

    }

    private static void checkSumSign() {
        int a = 33;
        int b = 177;

        if (a + b >= 0) {
            System.out.println("Сумма положительная");

        } else if (a + b <= 0) {
            System.out.println("Сумма отрицательная");
        }
    }

    private static void printColor(){
        int value =101 ;

        if (value <=0 ) {
            System.out.println("Крассный");

        } else if (value >=1 && value <=100) {
            System.out.println("Желтый");
        } else if (value >=101 )
        // или else if (appraisal >= 1 && appraisal <= 3)
        {
            System.out.println("Зелёный");
        }

    }

    private static void  compareNumbers(){
        int a =22;
        int b =90;

        if (a >= b ) {
            System.out.println("a >= b");

        } else {
            System.out.println("a < b");
        }


    }



}