public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        simplify();
    }
    public Fraction(){
        numerator =1;
        denominator =1;
    }
    private void simplify() {
        int gcd = 1;
        int smaller = Math.min(numerator, denominator);
        for(int i = 2; i <=smaller; i++){
            if(numerator % i == 0 && denominator % i == 0){
                gcd = i;
            }        
        }
        numerator = numerator/gcd;
        denominator = denominator/gcd;

    }
    public void setNumerator(int num){
        this.numerator = num;
        simplify();
    }
    public int getNumerator(){
        return numerator;
    }
    public void setDenominator(int num){
        if(num == 0){
            return;
        }
        this.denominator = num;
        simplify();
    }
    public int getDenominator(){
        return denominator;
    }
    public void print(){
        System.out.println(numerator + "/" + denominator);
    }
    public void increment() {
        numerator = numerator + denominator;
        simplify();
    }
    public Fraction add(Fraction f1, Fraction f2) {
        numerator = (f1.numerator* f2.denominator) + (f2.numerator * f1.denominator);
        denominator = f1.denominator * f2.denominator;
        simplify();
        return (new Fraction(numerator, denominator));
    }
}
