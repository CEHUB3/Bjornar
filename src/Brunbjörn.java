import java.util.List;

public class Brunbjörn extends Björn{

    public Brunbjörn(int vikt){
        super(vikt);
    }



    public boolean gillar(Mat mat){
        return mat instanceof Myrstack;
    }


}
