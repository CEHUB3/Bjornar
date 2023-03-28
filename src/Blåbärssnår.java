public class Blåbärssnår extends Mat{


    private int yta;

    public Blåbärssnår(int vikt, int sötma, int yta){

        super(vikt, sötma);
        this.yta = yta;
    }

    public int getNäring (){
        return this.getVikt() + this.yta;
    }

}
