public abstract class Mat {

    private int vikt;
    private int sötma;

    protected Mat(int vikt, int sötma) {
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

    // Denna metod användes bara för att visa att vi behöver låta
    // anropet komma från den specifika klassen. Vi känner ju
    // inte till något generellt som alla björnar gillar

    //public boolean gillasAv(Björn b){
    //    System.out.println("Jag är en " + b.getClass());
    //    return false;
    //}

    public boolean gillasAv(Brun brun){
        return false;
    }
    public boolean gillasAv(Grizzly grizzly){
        return true;
    }
    public boolean gillasAv(Panda panda){
        return getSötma() > 6;
    }
}
