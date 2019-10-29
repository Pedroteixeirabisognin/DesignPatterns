package AbstractFactoryPattern.Model.Bank;

import AbstractFactoryPattern.Model.Bank.Interface.Bank;

public class HDFC implements Bank{  
    private final String BNAME;  
    public HDFC(){  
           BNAME="HDFC BANK";  
   }  
   public String getBankName() {  
             return BNAME;  
   }  
} 
