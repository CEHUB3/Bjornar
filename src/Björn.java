import java.util.List;

public abstract class Björn {

    private int vikt;

    public Björn(int vikt){
        this.vikt = vikt;
    }

    protected void setVikt(int nyVikt){
        this.vikt = nyVikt;
    }
    protected int getVikt(){
        return this.vikt;
    }

    public abstract boolean gillar(Mat maten);

    public void äter(List<Mat> maten){
        Mat tyngst = null;
        for (Mat mat : maten) {
            // Användes för att visa att detta kommer att leda till att
            // gillas av som tar argument av typen Djur väljs.
            // if (mat.gillasAv(this)) {
            if (this.gillar(mat)) {
                if (tyngst == null) {
                    tyngst = mat;
                } else if (mat.getVikt() > tyngst.getVikt()) {
                    tyngst = mat;
                }
            }
        }
        if (tyngst != null){
            this.setVikt(  this.getVikt() + tyngst.getNäring() * 3);
            maten.remove(tyngst);

        }

    }

}
