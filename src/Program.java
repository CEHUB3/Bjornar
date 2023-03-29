import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Program {

    private static Random random = new Random();

    public static void main(String[] args){

        List<Björn> björnar = new ArrayList<Björn>(5);

        for (int i = 0; i < 5; i++){
            int r = random.nextInt(3);
            if (r == 0) {
                björnar.add(new Brunbjörn((i + 1) * 2));
            } else if (r == 1) {
                björnar.add(new Grizzlybjörn((i + 1) * 2));
            } else {
                björnar.add(new Panda((i + 1) * 2));
            }
        }

        List<Mat> maten = new ArrayList<Mat>();

        for (int i = 0; i < 5; i++){
            int r = random.nextInt(3);
            if (r == 0) {
                maten.add(new Getingbo(1 + i, 15, random.nextBoolean()));
            } else if (r == 1) {
                maten.add(new Blåbärssnår((i + 1) * 2, i, 1 + i * 10));
            } else {
                maten.add(new Myrstack((i + 1) * 2, (i + 1) * 50));
            }
        }

        System.out.println(maten);
        for (Björn b: björnar) {
            b.äter(maten);
            System.out.println("Jag är en " + b.getClass());
            System.out.println(maten);
        }
    }
}
