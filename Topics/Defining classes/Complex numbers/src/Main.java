// write the class Complex here
class Complex {
    double real;
    double imaginary;

    public Complex(double real, double image) {
        this.real = real;
        this.imaginary = image;
    }

    public Complex() {
        this(0, 0);
    }

    public double getReal() {
        return real;
    }

    public double getImage() {
        return imaginary;
    }
}