
package juego1;

import java.util.Scanner;

/**
 *
 * @author rzarzafernandez
 */
public class Juego1 {
 

    public static void main(String[] args) {
      String nombre;
        System.out.print("Introduzca su nombre:");
        Scanner nombre_in = new Scanner(System.in);
        nombre = nombre_in.nextLine();
        System.out.println("Bienvenido "+ nombre);
        
        //eleccion manual de la pregunta
        /*int pregunta;    
        System.out.print("Introduzca el numero de la pregunta: (1-5)");
        Scanner pregunta_in = new Scanner(System.in);
        pregunta = pregunta_in.nextInt();
       */
        
        //elige aleatoriamente una pregunta
        int pregunta = (int) (Math.random()*5+1); 
        
        
        System.out.println("Pregunta numero "+ pregunta);
        
        String enunciado = null;
        char respuesta = 0; 
       
        switch(pregunta){
            
            case 1: 
                enunciado = "¿Cuántas patas tiene un gato? A=dos, B=tres, C=cuatro, D=cinco";
                respuesta = 'C';
                break;
            case 2: 
                enunciado = "¿Cómo se llama Amparo? A=Amparo, B=Amparo, C=Amparo, D=Amparo";
                respuesta = 'D';
                break;
            case 3: 
                enunciado = "¿De qué color es el caballo blando de Santiago? A=negro, B=verde, C=blanco, D=azul";
                respuesta = 'C';
                break;
            case 4: 
                enunciado = "¿Cuánto es 1+1? A=1, B=2, C=3, D=7";
                respuesta = 'B';
                break;
            case 5: 
                enunciado = "¿Qué nota vas a sacar en el próximo examen? A=0, B=2, C=5, D=10";
                respuesta = 'A';
                break;    
            default:
                System.out.println("No existe tal pregunta");
                System.exit(0);
        }
         
         
        System.out.println(enunciado);
        Scanner respuesta_in = new Scanner(System.in);
       
        String respuestaUsuario = respuesta_in.nextLine();   //recogemos la respuesta como string
        String respuestaUsuarioMayus = respuestaUsuario.toUpperCase();  //pasamos la respuesta a mayuscula
        char respuestaUsuarioChar = respuestaUsuarioMayus.charAt(0);   //pasamos la respuesta a char
       
        if (respuestaUsuarioChar == respuesta){
            System.out.println("Correcto!");
        }else{
            System.out.println("Incorrecto!");
        }
        
    }
    
    
}
