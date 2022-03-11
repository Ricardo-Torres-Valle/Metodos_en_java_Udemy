
package operaciones;


public class PruebaAritmetica {
    public static void main(String[] args) {
        Aritmetica aritmetica1 = new Aritmetica();
        aritmetica1.a= 5;
        aritmetica1.b= 2;
        //System.out.println("LLego aquí");
        aritmetica1.sumar();//Help!
        
        int resultado = aritmetica1.sumarConRetorno();
        System.out.println("Resultado desde la clase de prueba: "+resultado);
        resultado= aritmetica1.sumarConArgumentos(5, 8);
        System.out.println("Resultado dde suma argumentos: "+resultado);
    }
}
