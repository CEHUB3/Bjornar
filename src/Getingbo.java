public class Getingbo extends Mat {

    private boolean fullt;

    public Getingbo(int vikt, int sötma, boolean fullt) {

        super(vikt, sötma);
        this.fullt = fullt;
    }

    public int getNäring() {

        if (fullt) {
            return 2 * this.getVikt();
        } else {
            return this.getVikt();

        }

    }

}
