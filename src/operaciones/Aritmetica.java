package operaciones;

public class Aritmetica {
//Primero se ponen los atributos y despues los métodos    
//Atributos de la clase
    int a;
    int b;
    //metodo
    public void sumar(){
        int resultado = a + b;
        System.out.println("Resultado: "+resultado);
    }
    public int sumarConRetorno(){
        return a + b;
    }
    public int sumarConArgumentos(int arg1, int arg2){
        a= arg1;
        b= arg2;
        return a + b;
    }
}
