package Models;

import App.Calculator;
import App.CalculatorPortType;

/**
 *
 * @author chars_mc
 */
public class mCalculator {
  private Calculator calculator = new Calculator();
  private CalculatorPortType connector = calculator.getCalculatorSOAP11PortHttp();
  
  public int add(int a, int b) {
    return connector.add(a, b);
  }
  
  public int subtract(int a, int b) {
    return connector.subtract(a, b);
  }
  
  public int multiply(int a, int b) {
    return connector.multiply(a, b);
  }
  
  public int divide(int a, int b) {
    return connector.divide(a, b);
  }
  
  public double exponentiation(int base, int exp) {
    return connector.exponentation(base, exp);
  }
  
  public double factorial(int a) {
    return connector.factorial(a);
  }
  
  public float module(float a, float b) {
    return connector.module(a, b);
  }
}
