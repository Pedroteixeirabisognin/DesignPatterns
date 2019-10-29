package SingletonPattern;

import java.io.Serializable;


/*
 * EXAMPLE OF SERIALIZED SINGLETON EARLY INSTANCIATION
 * 
 * */
public class A implements Serializable {  
	
	private static final long serialVersionUID = 1L;
	private static A obj = new A();// Early, instance will be created at load time

	private A() {
	}

	public static A getA() {
		return obj;
	}

	public void doSomething() {
		// write your code
	}
		
	//Need do this in serialized singletons
    protected Object readResolve() {  
        return getA();  
    }  

} 