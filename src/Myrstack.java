public class Myrstack extends Mat{

    private int antalMyror;

    public Myrstack(int vikt, int antalMyror){

        super(vikt, 0 );
        this.antalMyror = antalMyror;

    }

    public int getNäring (){
        return this.getVikt() + this.antalMyror;
    }

}


