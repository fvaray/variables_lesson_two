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
    }
}