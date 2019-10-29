package AbstractFactoryPattern.Model.Bank;

import AbstractFactoryPattern.Model.Bank.Interface.Bank;

public class SBI implements Bank{  
    private final String BNAME;  
    public SBI(){  
              BNAME="SBI BANK";  
      }  
     public String getBankName(){  
                return BNAME;  
     }  
}  
