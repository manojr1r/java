package OOPS.OOP.OOP1Challenges.ComplexNumber;

public class ComplexNumber {
//    ComplexNumber.
//    The class needs two fields (instance variables) with name real and imaginary of type double
     private double real , imaginary;
    public ComplexNumber(double real , double imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }
    public double getReal(){
        return real;
    }

    public double getImaginary(){
        return imaginary;
    }
    public void add(double real, double imaginary ){
//        real = this.real+ real;
//        imaginary = this.imaginary + imaginary;
        this.real += real;
        this.imaginary += imaginary;
    }

    public void add( ComplexNumber complex ){
        add(complex.real, complex.imaginary);
    }

    public void subtract(double real, double imaginary ){
        this.real -= real;
        this.imaginary -= imaginary;
    }

    public void subtract (  ComplexNumber complex ){
        subtract(complex.real, complex.imaginary);
    }
}
