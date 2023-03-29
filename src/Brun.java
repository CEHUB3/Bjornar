import java.util.List;

public class Brun extends Björn{

    public Brun(int vikt){
        super(vikt);
    }

    public boolean gillar(Mat mat){
        return mat.gillasAv(this);
    }

}
