package paquete01;

import java.util.ArrayList;
import java.util.Scanner;
import paquete02.*;
import paquete03.AutomovilGasolina;
import paquete04.AutomovilDiesel;

    public class Ejecutor {
        public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int opc;
    String nom;
    String plac;
    String c = "S";
    ArrayList<Automovil> automoviles = new ArrayList<>();

        System.out.println("Tipos de Automovil a Ingresar");
        System.out.println("Automovil Gasolina [1]");
        System.out.println("Automovil Diesel [2]\n");
        opc = sc.nextInt();
        sc.nextLine();

        if(opc == 1 || opc == 2){
        System.out.println("Ingrese el nombre del propietario: ");
        nom = sc.nextLine();
        System.out.println("Ingrese la placa del automovil: ");
        plac = sc.nextLine();

        switch(opc){
        case 1:
                AutomovilGasolina autoGa = new AutomovilGasolina();
                System.out.println("Ingresar el numero de gasolinas maximo "+
                        "del tanque: ");
                double numGal=sc.nextDouble();
                System.out.println("Ingrese el costo de cada galon: ");
                double costoGal=sc.nextDouble();
                
                autoGa.establecerNombre(nom);
                autoGa.establecerPlaca(plac);
                autoGa.estabablecerCostoGal(numGal);
                
                automoviles.add(autoGa);
               
                break;
        case 2:
                AutomovilDiesel autoDe = new AutomovilDiesel();
                System.out.println("Ingresar el numero de litros maximo "+
                        "del tanque: ");
                double numLit=sc.nextDouble();
                System.out.println("Ingrese el costo de cada litro: ");
                double costoLit=sc.nextDouble();
                System.out.println("Ingrese el descuento por litro: ");
                double descuento=sc.nextDouble();
                
                autoDe.establecerNombre(nom);
                autoDe.establecerPlaca(plac);
                autoDe.estabablecerCostoLit(costoLit);
                autoDe.estabablecerNumLit(numLit);
                autoDe.establerDescuento(descuento);
                
                automoviles.add(autoDe);
                break;
        }
        
        sc.nextLine();
                System.out.println("Para agregar otro automovil ingrese S, "
                            + "para salir ingrese N: ");
                    c = sc.nextLine();
                    }while(c == "S");
                    for (int i = 0; i < automoviles.size(); i++) {
                    // 1.
                    automoviles.get(i).calcularValorCan();
                    System.out.printf("Datos de Automoviles\n\n"
                    + "%s\n",
                            automoviles.get(i));

}
}
}