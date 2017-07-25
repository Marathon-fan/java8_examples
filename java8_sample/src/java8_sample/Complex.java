package java8_sample;

public  class Complex{
    int real;
    int imaginary;
    Complex(String input){
        String[] tmp = input.split("\\+");
        real = Integer.parseInt(tmp[0]);
        tmp[1] = tmp[1].substring(0, tmp[1].length() - 1);
        imaginary = Integer.parseInt(tmp[1]);
    }
    Complex(int a, int b){
        this.real = a;
        this.imaginary = b;
    }
    
    // how to Override toString
    @Override
    public String toString(){
        return String.valueOf(real) + "+" + String.valueOf(imaginary) + "i";
    }
    
    // how to Override equals
    @Override
    public boolean equals(Object that){
    	if (!(that instanceof Complex)){
    		return false;
    	}
    	Complex t = (Complex) that;
    	if (t.real == this.real && t.imaginary == this.imaginary){
    		return true;
    	}        	
    	return false;
    }
    
    // how to implement hashCode() ; why when we override equals, we also need to override hashCode, otherwise, the hash function will
    // has a lot of conflicts and the theory is also violated
    @Override 
    public int hashCode(){
    	return real + imaginary;
    }
    
    public Complex multiply(Complex that){
        int re = this.real * that.real - this.imaginary * that.imaginary;
        int im = this.real * that.imaginary + this.imaginary * that.real;
        return new Complex(re, im);
    }
    
    public  static void static_run(){
    	Complex c1 = new Complex("1+1i");
    	Complex c2 = new Complex("1+1i");
    	Complex c3 = new Complex("2+1i");
    	System.out.println(c1.equals(c3));
    	System.out.println(c1.equals(c2));
    	System.out.println(c1.hashCode());
    	System.out.println(c2.hashCode());
    	System.out.println(c3.hashCode());

    	System.out.println(new Complex("1+1i"));   	

    }
    
}