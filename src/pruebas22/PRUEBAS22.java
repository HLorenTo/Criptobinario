package pruebas22;
import java.math.BigInteger;
import java.util.Scanner;
public class PRUEBAS22 {
public static void main(String[] args) {
    Scanner opcion = new Scanner(System.in);
    Scanner sc = new Scanner(System.in);
    int  cod, numero=0;
    BigInteger codigo;
    int [] vector = new int [100];
    int cifra;
    while(true){
    System.out.println("\n CRIPTOBINARIO");
    System.out.println("Ingrese la opción que desea realizar \n 1. Para cifrar una palabra \n 2. Para descifrar un código \n 3. Para salir ");
    cifra = opcion.nextInt();
    String palabra; 
    if (cifra==1){
        System.out.println("Ingrese la palabra y/o mensaje que desea cifrar");
        palabra = sc.nextLine();
        String nueva_palabra = palabra.replace(" ", "");
        System.out.println("Su palabra y/o mensaje ha sido cifrado en: ");
        Cifrado_criptobinario  cifrado_criptobinario;
        cifrado_criptobinario = new Cifrado_criptobinario (nueva_palabra);
                 }
    else if (cifra==2){
            System.out.println("Ingrese el código que desea descifrar");
            codigo = sc.nextBigInteger();
            String binario2 = codigo.toString();
            int letrastotal = (binario2.length())/7;
            System.out.println("Total de letras que contiene el codigo que ingreso  "+letrastotal);
            System.out.print("Su código descifrado arroja el siguiente resultado------>   ");
            Descifrado_criptobinario  descifrado_criptobinario = null;
            descifrado_criptobinario.Descifrado_criptobinario(letrastotal, binario2);
            /*
            for (int i =1; i<letrastotal+1;i++){
                int inicio_substring =0;
                int fin_substring =7;
                fin_substring = 7*i;    
                inicio_substring = fin_substring-7;
                String sCadenax = binario2.substring(inicio_substring,fin_substring);
            for (int j=0; j<sCadenax.length();j++){
            if (sCadenax.charAt(j)=='1'){
                numero += Math.pow(2,(sCadenax.length()-1)-j);
            }
            }
            char c =(char)numero;
            numero = numero-numero;
            System.out.print(c);
            }
            System.out.print("\n");
            */          }
    else  {
                System.exit(0);
          }
    }
}}