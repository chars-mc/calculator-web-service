/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

import Models.mCalculator;
import Views.vCalculator;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author chars_mc
 */
public class App {
  public static void main(String[] args) {
    mCalculator mCalc = new mCalculator();
    vCalculator vCalc = new vCalculator();
    vCalc.setVisible(true);
    
    vCalc.getCalcBtn().addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        Boolean n1 = vCalc.getA().getText().equals("Number 1");
        Boolean n2 = vCalc.getB().getText().equals("Number 2");
        int a = n1 ? 0 : Integer.parseInt(vCalc.getA().getText());
        int b = n2 ? 0 : Integer.parseInt(vCalc.getB().getText());
        String operation = vCalc.getOperation().getSelectedItem().toString();
        Double result = 0.0;
        
        switch(operation) {
          case "Add": result = new Double(mCalc.add(a, b));
            break;
          case "Subtract": result = new Double(mCalc.subtract(a, b));
            break;
          case "Multiply": result = new Double(mCalc.multiply(a, b));
            break;
          case "Divide": result = new Double(mCalc.divide(a, b));
            break;
          case "Exponentation": result = new Double(mCalc.exponentiation(a, b));
            break;
          case "Factorial": result = new Double(mCalc.factorial(a));
            break;
          case "Module": result = new Double(mCalc.module(a, b));
            break;
        }
        
        vCalc.getResult().setText("Result: " + result);
      }
    });
  }
}
