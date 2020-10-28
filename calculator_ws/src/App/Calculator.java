package App;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class Calculator {
  
  @WebMethod
  public int add(int a, int b) {
    return a + b;
  }
  
  @WebMethod
  public int subtract(int a, int b) {
    return a - b;
  }
  
  @WebMethod
  public int multiply(int a, int b) {
    return a * b;
  }
  
  @WebMethod
  public int divide(int a , int b) {
    return b != 0 ? a / b : 0;
  }
  
  @WebMethod
  public double exponentation(int base, int exp) {
    return Math.pow(base, exp);
  }
  
  @WebMethod
  public int factorial(int a) {
    if(a == 0) return 1;
    return a * factorial(a - 1);
  }
  
  @WebMethod
  public float module(float a, float b) {
    return a % b;
  }
  
}
