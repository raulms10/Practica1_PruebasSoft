package practica1.main;

import java.util.Scanner;
import practica1.constantes.Mensajes;

/**
 * Aquí se encuentran todas las validaciones y funciones en general
 * @author Raúl, Alejandro
 */
public class Funciones {
   
    Scanner sc; //Para leer la entrada del teclado

    /**
     * Constructor
     */
    public Funciones() {
        sc = new Scanner(System.in);
    }
     
    /**
     * Imprime el mensaje en la pantalla
     * @param mensaje 
     */
    public void mostrarMensaje(String mensaje){
        System.out.print(mensaje);
    }
    
    /**
     * Devuelve el String que se va a mostrar al usuario
     * @param l1
     * @param l2
     * @param l3
     * @return String (ej: Los lados 1, 2, 3)
     */
    public String mensajeTriangulos(int l1, int l2, int l3){
        return Mensajes.LOS_LADOS + 
                String.valueOf(l1) + Mensajes.COMA +
                String.valueOf(l2) + Mensajes.Y +
                String.valueOf(l3) + Mensajes.ESPACIO;
    }
    
    public String mensajeCuadrilatero(int l1, int l2, int l3, int l4){
        return Mensajes.LOS_LADOS + 
                String.valueOf(l1) + Mensajes.COMA +
                String.valueOf(l2) + Mensajes.COMA +
                String.valueOf(l3) + Mensajes.Y +
                String.valueOf(l4) + Mensajes.ESPACIO;
    }
    
    /**
     * Toma lo que digite con el teclado hasta que se ingrese un entero positivo
     * @return entero positivo
     */
    public int leerOpcion(){
        String opcion;
        mostrarMensaje(Mensajes.DIGITE_OPCION);
        opcion = sc.nextLine();             
        while(!esValida(opcion)){   
            mostrarMensaje(Mensajes.DIGITE_NUEVAMENTE_OPCION);
            opcion = sc.nextLine();
        }                
        return Integer.parseInt(opcion);
    }
    
    /**
     * Toma lo que se digite con el teclado hasta que se ingrese un entero postivo
     * @param numeroLado 
     * @return entero positivo de dos digitos
     */
    public int leerLado(String numeroLado){
        String lado;
        mostrarMensaje(Mensajes.DIGITE_LADO + numeroLado + Mensajes.DOS_PUNTOS);
        lado=sc.nextLine();
        while(!esLadoValido(lado)){
            mostrarMensaje(Mensajes.DIGITE_NUEVAMENTE_LADO + numeroLado + Mensajes.DOS_PUNTOS);
            lado = sc.nextLine();
        }
        return Integer.parseInt(lado);
    }
    
    /**
     * Valida que la opción ingresada sea un entero positvo y que sea 1, 2 ó 3 
     * @param opcion
     * @return true o false
     */
    public boolean esValida(String opcion){   
        int opc;
        try{
            opc = Integer.parseInt(opcion); 
        }catch(NumberFormatException e){
            mostrarMensaje(Mensajes.OPCION_NO_DISPONIBLE + Mensajes.NO_ES_NUMERO + Mensajes.SALTO_DE_LINEA);
            return false;
        }
        
        if( (opc == 1) || (opc == 2) || (opc == 3) ){
            return true;
        }
        
        mostrarMensaje(Mensajes.OPCION_NO_DISPONIBLE + Mensajes.NO_ES_OPCION_MENU + Mensajes.SALTO_DE_LINEA);
        return false;
    }
    
    /**
     * Valida que el lado ingresado sea un entero positivo
     * @param l
     * @return entero positivo de dos digitos
     */
    public boolean esLadoValido(String l){
        int lado;
        if (l == null || l.length() > 2){
            mostrarMensaje(Mensajes.VALOR_NO_VALIDO + Mensajes.MAXIMA_LONGITUD + Mensajes.SALTO_DE_LINEA);
            return false;
        }
        try{
            lado = Integer.parseInt(l); 
        }catch(NumberFormatException e){
            mostrarMensaje(Mensajes.VALOR_NO_VALIDO + Mensajes.NO_ES_NUMERO + Mensajes.SALTO_DE_LINEA);
            return false;
        }      
        
        if(lado <= 0){
            mostrarMensaje(Mensajes.VALOR_NO_VALIDO + Mensajes.NO_ES_NUMERO_POSITIVO + Mensajes.SALTO_DE_LINEA);
            return false;
        }
        return true;
    }
    
    /**
     * Comprueba que los tres lados ingresados sean iguales
     * @param la
     * @param lb
     * @param lc
     * @return true o false
     */
    public boolean esEquilatero(int la, int lb, int lc){
        return (la == lb) && (la == lc);
    }
    
    /**
     * Comprueba que de los tres lados ingresados dos sean iguales 
     * @param la
     * @param lb
     * @param lc
     * @return true o false
     */
    public boolean esIsosceles(int la, int lb, int lc){
        //Esto sería para hacer las pruebas unitarias
        return (la == lb && la != lc) || 
               (la == lc && la != lb) || 
               (lb == lc && lb != la);
        //Este también funciona debido al orden en que se hace la validación en el main
        //return (la==lb) || (la==lc) || (lb==lc);
    }    
    
    /**
     * Comprueba que los tres lados ingresados sean todos diferentes
     * @param la
     * @param lb
     * @param lc
     * @return true o false
     */
    public boolean esEscaleno(int la, int lb, int lc){
        return (la != lb) && (la != lc) && (lb != lc);
    }     
    
    /**
     * Comprueba que los cuatro lados ingresados sean todos iguales
     * @param l1
     * @param l2
     * @param l3
     * @param l4
     * @return true o false
     */
    public boolean esCuadrado(int l1, int l2, int l3, int l4){
        return (l1 == l2) && (l2 == l3) && (l3 == l4);
    }
    
    public boolean esRectangulo(int l1, int l2, int l3, int l4){
        return ((l1 == l2) && (l3 == l4) && (l1 != l3)) || 
               ((l1 == l3) && (l2 == l4) && (l1 != l2)) ||
               ((l1 == l4) && (l2 == l3) && (l1 != l2));
    }
    
    public boolean esTrapecio(int l1, int l2, int l3, int l4){
        return ((l1 == l2) && (l3 != l4)) ||
               ((l1 == l3) && (l2 != l4)) ||
               ((l1 == l4) && (l2 != l3)) ||
               ((l2 == l3) && (l1 != l4)) ||
               ((l2 == l4) && (l1 != l3)) ||
               ((l3 == l4) && (l1 != l2));
    }
}
