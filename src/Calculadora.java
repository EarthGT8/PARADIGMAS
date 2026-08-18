public class Calculadora {
    public int aumR(int a, int b){
        return a + b;
    }

    public int sumar(int a, int b,int c){
        return a + b + c;
    }

    public double sumar (double a, double b){
        return a+b;
    }

    public static void main(String[] args) throws Exception {
        Calculadora calculadora = new Calculadora();

       System.out.println("Suma de enteros: "+ calculadora.sumar(5,10));
       System.out.println("Suma de tres eneteros: "+calculadora.sumar(5,10,15));
       System.out.println("Suma de números de punto flotante: "+calculadora.sumar(5.5, 10.5));
    }

    }

