
/**
 * Write a description of class Complex here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Complex
{
    public double a, b;
    
    public Complex(){
        a = 0;
        b = 0;
    }
    public Complex(double a){
        this.a = a;
        b = 0;
    }
    public Complex(double a, double b){
        this.a = a;
        this.b = b;
    }
    
    public double getRealPart(){
        return a;
    }
    public double getImaginaryPart(){
        return b;
    }
    
    public String add(Complex c){
        double retA = this.a + c.getRealPart();
        double retB = this.b + c.getImaginaryPart();
        
        Complex retC = new Complex(retA, retB);
        return retC.toString();
    }
    public String subtract(Complex c){
        double retA = this.a - c.getRealPart();
        double retB = this.b - c.getImaginaryPart();
        
        Complex retC = new Complex(retA, retB);
        return retC.toString();
    }
    public String multiply(Complex c){
        return "";
    }
    public String divide(Complex c){
        return "";
    }
    
    public String toString(){
        return a + (b < 0 ? "-":"+") + (b != 0 ? b + "i": "");
    }
}
