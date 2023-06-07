/*
 *  EJERCICIO 13
    Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros de equipo y
    define su tipo de dato de tal manera que te permita alojar sus nombres más adelante.
 */
package javaintro;

/**
 *
 * @author vaiop
 */
public class GuiaJava13vectorEquipo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Elizabeth,Pablo,Juana,Brian,Julieta,Jhuly,Alejandro,Erick
        
        String [] vectorEquipo = new String[8];
        
        vectorEquipo[0] = "Elizabeth";
        vectorEquipo[1] = "Pablo";
        vectorEquipo[2] = "Juana";
        vectorEquipo[3] = "Brian";
        vectorEquipo[4] = "Julieta";
        vectorEquipo[5] = "Jhuly";
        vectorEquipo[6] = "Alejandro";
        vectorEquipo[7] = "Erick";
        
        System.out.println(vectorEquipo[1]);
        System.out.println("----------");
        
        
        for(int i=0; i <= 7; i++){
            System.out.print("[" + vectorEquipo[i] +"]");
        }
    }
    
}
