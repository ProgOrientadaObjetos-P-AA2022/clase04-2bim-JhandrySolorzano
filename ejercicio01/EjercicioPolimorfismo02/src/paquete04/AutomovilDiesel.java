
package paquete04;

import paquete02.Automovil;

        
public  class AutomovilDiesel extends Automovil {
    
    double numLit;
    double costoLit;
    double descuento;
    
    public void estabablecerNumLit(Double n){
        numLit=n;
    }
    
     public void estabablecerCostoLit(Double n){
        costoLit=n;
    }
     public void establerDescuento(double des){
         descuento= des / 100;
     }
  
      
      public void calcularDescuento(){
          descuento=(numLit*costoLit)*0.10;
      }
      
  
   @Override
    public void calcularValorCan() {

        descuento = descuento * numLit;
        numLit = numLit - descuento;
        valorCan = (costoLit * numLit);
    }
      
      public double obtenerNumGal(){
          return numLit;
      }
      
       public double obtenerCostoGal(){
          return costoLit;
      }
      
        public double obtenerDescuento(){
          return descuento;
      }
        
      @Override
            public String toString() {
                    String cadena = String.format(super.toString());
                    cadena = String.format("Automovil a Diesel\n"
                                        + "%s\n"
                                        + "Numero de Litros:%.2f\n"
                                        + "Costo por Litro:%.2f\n"
                                        + "Descuento: %.2f %\n"
                                        + "Valor a Cancelar: %.2f\n", cadena,
                                        numLit, costoLit, descuento, valorCan);
                                    return cadena;
    }

    
}
