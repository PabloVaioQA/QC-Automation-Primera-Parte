
package poo07;

import Entidades.Persona;

/**
 *
 * @author vaiop
 */
public class POO07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Persona p1 = new Persona();
        Persona p2 = new Persona();
        Persona p3 = new Persona();
        Persona p4 = new Persona();
        
        int IMCp1, IMCp2, IMCp3, IMCp4;
        boolean mayorEdadp1, mayorEdadp2, mayorEdadp3, mayorEdadp4;
        int bajopeso=0;
        int ideal=0;
        int sobrepeso=0;
        int mayor =0;
        int menor=0;
        
        p1.crearPersona();
        p2.crearPersona();
        p3.crearPersona();
        p4.crearPersona();
        
        IMCp1 = p1.calcularIMC();
        IMCp2 = p2.calcularIMC();
        IMCp3 = p3.calcularIMC();
        IMCp4 = p4.calcularIMC();
        
        mayorEdadp1 = p1.esMayorDeEdad();
        mayorEdadp2 = p2.esMayorDeEdad();
        mayorEdadp3 = p3.esMayorDeEdad();
        mayorEdadp4 = p4.esMayorDeEdad();
        
        int[] vector = {IMCp1,IMCp2,IMCp3};
        boolean[] vector2 = {mayorEdadp1,mayorEdadp2,mayorEdadp3,mayorEdadp4};
        
        for (int i = 0; i < 3; i++) {
            
            if(vector[i] == -1){
                bajopeso++;}
            if(vector[i] == 0){
                ideal++;}
            if(vector[i] == 1){
                sobrepeso++;}
        }
        for (int i = 0; i < 3; i++) {
            if(vector2[i]==true){
                mayor++;
            }else{
                menor++;
            }
        }
        
        System.out.println("El persentaje de personas en BajoPeso es: "+ bajopeso*100/4 + "%" );
        System.out.println("El persentaje de personas en Peso Ideal es: "+ ideal*100/4 + "%" );
        System.out.println("El persentaje de personas en Sobrepeso es: "+ sobrepeso*100/4 + "%" );
        
        System.out.println("Hay" + mayor + " personas Mayores de edad, seria el "+ mayor*100/4 + " %" );
        System.out.println("Hay" + menor + " personas Menores de edad, seria el "+ menor*100/4 + " %" );
    }
    
}
