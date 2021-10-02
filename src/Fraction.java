public class Fraction {
    int x;
    int y;
    Fraction(int x,int y){
        this.x=x;
        this.y=y;
    }
    @Override
    public String toString(){
        return ("Fraction de " + this.x + "sur" + this.y);
    }

}
