public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double index = service.calculate(80, 1.87);
        System.out.printf("Индекс массы Вашего тела составляет:" + " " + "%.2f",index);

    }

}
