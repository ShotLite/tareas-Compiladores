
package compi;
import java.util.Stack;
public class Compi {
public void convercion(String frase){
        String valor = "";
        
        for(int i = 0; i<frase.length(); i++){
            switch(frase.charAt(i)){
                case 'i':
                    valor+="w";
                    break;
                case 'e':
                    valor+="w";
                    break;
            }
            valor+=frase.charAt(i);
        }
        valor+=" owo";
        System.out.println(valor);
   }
    public void Count(String palabra){
        int contador = 0;
        palabra = palabra.toLowerCase();
        for(int i = 0;i<palabra.length();i++){
            if((palabra.charAt(i)=='a')|| (palabra.charAt(i)== 'e')|| (palabra.charAt(i)== 'i')|| (palabra.charAt(i)== 'o')|| 
                    (palabra.charAt(i)== 'u')){
                contador++;
            }
        }
        System.out.println("La palabra "+ palabra + " contiene: "+ contador+ " vocales");
    }
    public void dobles(String palabra){
        boolean letra = false;
        Stack pila = new Stack();
         for(int i = 0; i<palabra.length(); i++){
            pila.add(palabra.charAt(i));
            if(pila.contains(palabra.charAt(i)))
                letra = true;
        }
         System.out.println("¿La palabra: "+ "'" + palabra + "'" + " tiene letras dobles?");
         System.out.println(letra);
    }
    public void NoVocales(String palabra){
        String NV ="";
        palabra = palabra.toLowerCase();
        for(int i = 0; i<palabra.length(); i++){
            if(palabra.charAt(i) == 'a' || palabra.charAt(i) == 'e' || palabra.charAt(i) == 'i' || palabra.charAt(i) == 'o' || palabra.charAt(i) == 'u'){
                
            }else{
             NV += palabra.charAt(i);   
            }
            
        }
        System.out.println("Esta frase no tiene vocales: "+ NV);
    }
    public static void main(String[] args) {
        Compi obj = new Compi();
        obj.convercion("mi primo pepe");
        obj.Count("motocicleta");
        obj.dobles("poox");
        obj.NoVocales("buenos dias maestro");
    }
}
