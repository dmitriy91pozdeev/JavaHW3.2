public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        int bmi = service.calkulate(98, 1.87);
        System.out.println(bmi);
    }
}