
package opbilangan;
public class OpPerkalian extends OpBilanganCetak{
    protected double a = 9.25;
    protected double b = 1.25;
    protected double c;
    
    protected void set_A(double a){
    this.a = a;
    }
    
    protected void set_B(double b){
    this.b = b;
    } 
    
    protected void set_C(double c){
    this.c = c;
    }
    
    protected double get_A(){
    return a;
    }
    
    protected double get_B(){
    return b;
    }
    
    protected double get_C(){
    c = get_A() * get_B();
    return c;
    }
    
    protected void tampil(){
        System.out.println("================================");
        System.out.println("      Operasi Perkalian       ");
        System.out.println("Bilangan A = " + get_A());
        System.out.println("Bilangan B = " + get_B());
        System.out.println("Hasil Perkalian A x B = " + get_C());
        System.out.println("================================");
        
    }
    
}
