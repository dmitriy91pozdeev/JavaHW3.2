public class BmiService {
    public int calkulate(double weight, double height) {

        double bmi = weight / height / height;

        return (int) bmi;

    }

}
