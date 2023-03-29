public class Myrstack extends Mat {

    private int antalMyror;

    public Myrstack(int vikt, int antalMyror){
        super(vikt, 0);
        this.antalMyror = antalMyror;
    }

    public int getAntalMyror() {
        return antalMyror;
    }

    public int getNäring(){
        return this.getVikt() + this.antalMyror;
    }

    public boolean gillasAv(Panda panda) {
        return super.gillasAv(panda) || getAntalMyror() > 100;
    }

    public boolean gillasAv(Brun brun) {
        return true;
    }

    public String toString(){
        return "Myrstack: vikt=" + this.getVikt() + ", sötma=" + this.getSötma() + ", antal myror=" + this.antalMyror;
    }
}
