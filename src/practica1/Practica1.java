package practica1;

import practica1.constantes.Mensajes;
import practica1.main.Funciones;

/**
 * Clase principal, desde aquí se inicia la aplicación
 * @author Raúl, Alejandro
 */
public class Practica1 {
    
    public static void main(String[] args) throws InterruptedException {
        // Se instancia la clase Funciones
        Funciones fc = new Funciones();
        
        int lado1, lado2, lado3, lado4;
        int opcion;
        
        fc.mostrarMensaje(Mensajes.ENCABEZADO + Mensajes.SALTO_DE_LINEA);
        
        //El ciclo solo se rompe cuando el usuario elige la opción salir (3)
        do{
            fc.mostrarMensaje(Mensajes.OPCIONES_MENU + Mensajes.SALTO_DE_LINEA + Mensajes.SALTO_DE_LINEA);
            opcion = fc.leerOpcion();

            switch (opcion) {
                case 1: //3 lados
                    fc.mostrarMensaje(Mensajes.SALTO_DE_LINEA + Mensajes.PARA_TRIANGULOS + Mensajes.SALTO_DE_LINEA);

                    lado1 = fc.leerLado(Mensajes.LADO_1);
                    lado2 = fc.leerLado(Mensajes.LADO_2);
                    lado3 = fc.leerLado(Mensajes.LADO_3);

                    //Teniendo los 3 lados del triángulo, se define que tipo es
                    if(fc.esEquilatero(lado1, lado2, lado3)){
                        fc.mostrarMensaje(Mensajes.SALTO_DE_LINEA + fc.mensajeTriangulos(lado1, lado2, lado3) + Mensajes.EQUILATERO + Mensajes.SALTO_DE_LINEA);
                    }else if(fc.esIsosceles(lado1, lado2, lado3)){
                        fc.mostrarMensaje(Mensajes.SALTO_DE_LINEA + fc.mensajeTriangulos(lado1, lado2, lado3) + Mensajes.ISOSCELES + Mensajes.SALTO_DE_LINEA);
                    }else if(fc.esEscaleno(lado1, lado2, lado3)){
                        fc.mostrarMensaje(Mensajes.SALTO_DE_LINEA + fc.mensajeTriangulos(lado1, lado2, lado3) + Mensajes.ESCALENO + Mensajes.SALTO_DE_LINEA);
                    }else{
                        fc.mostrarMensaje(Mensajes.NO_TRIANGULO + Mensajes.SALTO_DE_LINEA);
                    }   Thread.sleep(2000); //Pausa de 2 segundos
                    break;
                    
                case 2: //4 lados
                    fc.mostrarMensaje(Mensajes.SALTO_DE_LINEA + Mensajes.PARA_CUADRILATEROS + Mensajes.SALTO_DE_LINEA);
                    
                    lado1 = fc.leerLado(Mensajes.LADO_1);
                    lado2 = fc.leerLado(Mensajes.LADO_2);
                    lado3 = fc.leerLado(Mensajes.LADO_3);
                    lado4 = fc.leerLado(Mensajes.LADO_4);
                    
                    if(fc.esCuadrado(lado1, lado2, lado3, lado4)){
                        fc.mostrarMensaje(Mensajes.SALTO_DE_LINEA + fc.mensajeCuadrilatero(lado1, lado2, lado3, lado4) + Mensajes.CUADRADO + Mensajes.SALTO_DE_LINEA);
                    }else if(fc.esRectangulo(lado1, lado2, lado3, lado4)){
                        fc.mostrarMensaje(Mensajes.SALTO_DE_LINEA + fc.mensajeCuadrilatero(lado1, lado2, lado3, lado4) + Mensajes.RECTANGULO + Mensajes.SALTO_DE_LINEA);
                    }else if(fc.esTrapecio(lado1, lado2, lado3, lado4)){
                        fc.mostrarMensaje(Mensajes.SALTO_DE_LINEA + fc.mensajeCuadrilatero(lado1, lado2, lado3, lado4) + Mensajes.TRAPECIO + Mensajes.SALTO_DE_LINEA);
                    }else{
                        fc.mostrarMensaje(Mensajes.SALTO_DE_LINEA + fc.mensajeCuadrilatero(lado1, lado2, lado3, lado4) + Mensajes.NO_CUADRILATERO + Mensajes.SALTO_DE_LINEA);
                    }   Thread.sleep(2000); //Pausa de 2 segundos
                    break;
                
                default: //Opcion Salir
                    fc.mostrarMensaje(Mensajes.SALIENDO + Mensajes.SALTO_DE_LINEA);
                    Thread.sleep(5000); //Pausa de 5 segundos
                    break;
            }             
        }while(opcion!=3);
    }
}
