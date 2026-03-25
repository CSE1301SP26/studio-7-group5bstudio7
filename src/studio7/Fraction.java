public class Fraction {
    private double numerator;
    private double denominator;
    public Fraction(double numerator, double denominator){
        this.numerator=numerator;
        this.denominator=denominator;
    }
    public Fraction addition(Fraction f){
        double newNumerator = (this.numerator*f.denominator)+ (this.numerator*f.numerator);
        double newDenominator = (this.denominator*f.denominator);
        return new Fraction(newNumerator,newDenominator);
    }
    public Fraction multiplication(Fraction f){
        double newNumerator = (this.numerator*f.numerator);
        double newDenominator = (this.denominator*f.denominator);
        return new Fraction(newNumerator,newDenominator);
    }
    public Fraction reciprocal(){
        double newNumerator = this.denominator;
        double newDenominator = this.numerator;
        return new Fraction(newNumerator,newDenominator);
    }
}
