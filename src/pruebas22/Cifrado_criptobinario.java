package pruebas22;

import javax.swing.JOptionPane;

public class Cifrado_criptobinario {
    public Cifrado_criptobinario (String nueva_palabra){
    for (int i = 0; i<nueva_palabra.length();i++){
            char letra = nueva_palabra.charAt(i);
            int asciiValue = (int)letra;
            String binario = Long.toBinaryString(asciiValue);  
            JOptionPane.showMessageDialog(null, binario);
            
                                                 }
}
   
   
    }
   




