public abstract class Mat {

    private int vikt;
    private int sötma;

    protected Mat(int vikt, int sötma){

        this.vikt = vikt;
        this.sötma = sötma;

    }

    public int getVikt(){
        return this.vikt;
    }

    public int getSötma(){
        return this.sötma;
    }

    public abstract int getNäring();
}
