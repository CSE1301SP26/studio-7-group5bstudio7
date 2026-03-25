public class Complex {
    private double real;
    private double imaginary;
    public Complex(double real, double imaginary){
        this.real=real;
        this.imaginary=imaginary;
    }
    public Complex addition(Complex num){
        double newReal = this.real + num.real;
        double newImaginary = this.imaginary + num.imaginary;
        return new Complex(newReal,newImaginary);
    }
    public Complex multiplication(Complex num){
        double newReal = (this.real * num.real)-(this.imaginary * num.imaginary);
        double newImaginary = (this.real * num.imaginary)+(this.imaginary * num.real);
        return new Complex(newReal,newImaginary);
    }
}
