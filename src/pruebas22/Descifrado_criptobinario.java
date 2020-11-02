package pruebas22;
import java.math.BigInteger;
import java.util.Scanner;
public class Descifrado_criptobinario {
    public void Descifrado_criptobinario (int letrastotal, String binario2){
        int numero = 0;
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
    }
}
