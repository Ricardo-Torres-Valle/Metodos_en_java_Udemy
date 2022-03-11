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
        return this.a + this.b;
    }
    public int sumarConArgumentos(int arg1, int arg2){
        this.a= arg1;
        this.b= arg2;
        return this.sumarConRetorno();
    }
}
