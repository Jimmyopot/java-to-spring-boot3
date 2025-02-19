package Udemy.Inheritance;

// SciCalc is subclass of AdvCalc, AdvCalc is subclass of Calc, Calc is superclass of AdvCalc
// Multilevel Inheritance
public class SciCalc extends AdvCalc {
    public double power(int n1, int n2) {
        return Math.pow(n1, n2);
    }
}
