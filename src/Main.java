//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("ДЗ - Переменные 2");
        System.out.println(" ");

        System.out.println("Задача 1");
        int intVar = -2_000_000;
        byte byteVar = 127;
        short shortVar = -32_767;
        long longVar = 9_000_000;
        float floatVar = 3.14159f;
        double doubleVar = 3.0000001;
        System.out.printf("Значение переменной intVar с типом int равно %d \n",intVar);
        System.out.printf("Значение переменной byteVar с типом byte равно %d \n",byteVar);
        System.out.printf("Значение переменной shortVar с типом short равно %d \n",shortVar);
        System.out.printf("Значение переменной longVar с типом long равно %d \n",longVar);
        System.out.printf("Значение переменной floatVar с типом float равно %f \n",floatVar);
        System.out.printf("Значение переменной doubleVar с типом double равно %f \n",doubleVar);
        System.out.println(" ");

        System.out.println("Задача 2");
        float floatVarTwo = 27.12f;
        double doubleVarTwo = 987_678_965_549.0f;
        float floatVarThree = 2.786f;
        short shortVarTwo = 569;
        short shortVarThree = -159;
        short shortVarFour = 27897;
        byte byteVarTwo = 67;
        System.out.printf("Значение переменной floatVarTwo %.2f \n", floatVarTwo);
        System.out.printf("Значение переменной doubleVarTwo %.0f \n", doubleVarTwo);
        System.out.printf("Значение переменной floatVarThree %.3f \n", floatVarThree);
        System.out.printf("Значение переменной shortVarTwo %d \n", shortVarTwo);
        System.out.printf("Значение переменной shortVarThree %d \n", shortVarThree);
        System.out.printf("Значение переменной shortVarFour %d \n", shortVarFour);
        System.out.printf("Значение переменной byteVarTwo %d \n", byteVarTwo);
        System.out.println(" ");

        System.out.println("Задача 3");
        int teacherLudPavCntStudents = 23;
        int teacherAnSerCntStudents = 27;
        int teacherEkAndCntStudents = 30;
        int cntPapers = 480;
        int cntStudents = teacherLudPavCntStudents + teacherAnSerCntStudents + teacherEkAndCntStudents;
        int cntPapersOneStudent = cntPapers/cntStudents;
        System.out.printf("У Людмилы Павловны —  %d ученика \n", teacherLudPavCntStudents);
        System.out.printf("у Анны Сергеевны —  %d учеников \n", teacherAnSerCntStudents);
        System.out.printf("у Екатерины Андреевны —  %d учеников \n", teacherEkAndCntStudents);
        System.out.printf("Три учительницы закупили все вместе %d листов бумаги на все три класса \n", cntPapers);
        System.out.printf("Всего учеников %d \n", cntStudents);
        System.out.printf("На каждого ученика рассчитано %d листов бумаги \n", cntPapersOneStudent);
        System.out.println(" ");

        System.out.println("Задача 4");
        int performanceBottlesMfgPerTwoMin = 16;
        int twoMin = 2;
        int performanceBottlesMfgPerMin = performanceBottlesMfgPerTwoMin/twoMin;
        int performanceBottlesMfgPerTwentyMin = performanceBottlesMfgPerMin*20;
        int minInHour = 60;
        int minInDay = minInHour * 24;
        int performanceBottlesMfgPerDay = performanceBottlesMfgPerMin*minInDay;
        int performanceBottlesMfgPerThreeDays = performanceBottlesMfgPerMin*minInDay*3;
        int performanceBottlesMfgPerThreeMonth = performanceBottlesMfgPerMin*minInDay*30;
        System.out.printf("За 2 минуты машина произвела %d штук бутылок \n", performanceBottlesMfgPerTwoMin);
        System.out.printf("За 1 минуту машина производит %d штук бутылок \n", performanceBottlesMfgPerMin);
        System.out.printf("За 20 минут машина производит %d штук бутылок \n", performanceBottlesMfgPerTwentyMin);
        System.out.printf("В сутки машина произведет %d штук бутылок \n", performanceBottlesMfgPerDay);
        System.out.printf("За 3 дня машина произведет %d штук бутылок \n", performanceBottlesMfgPerThreeDays);
        System.out.printf("За месяц машина произведет %d штук бутылок \n", performanceBottlesMfgPerThreeMonth);
    }
}