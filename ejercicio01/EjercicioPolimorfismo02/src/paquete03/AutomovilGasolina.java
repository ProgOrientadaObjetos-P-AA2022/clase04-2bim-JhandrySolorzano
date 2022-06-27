
package paquete03;

import paquete02.Automovil;

public class AutomovilGasolina extends Automovil{
    
    double numGal;
    double costoGal;
    double IVA;
    
    public void estabablecerNumGal(Double n){
        numGal=n;
    }
    
     public void estabablecerCostoGal(Double n){
        costoGal=n;
    }
     
  
      
      public void calcularIVA(){
          IVA=(numGal*costoGal)*0.10;
      }
      
      @Override     
      public void calcularValorCan(){
          valorCan=(numGal*costoGal*IVA);
      }
      
      public double obtenerNumGal(){
          return numGal;
      }
      
       public double obtenerCostoGal(){
          return costoGal;
      }
      
        public double obtenerIVA(){
          return IVA;
      }
      
        @Override
            public String toString() {
                    String cadena = String.format(super.toString());
                    cadena = String.format("Automovil a Gasolina\n"
                                            + "%s\n"
                                            + "Numero de Galones:%.2f\n"
                                            + "Costo por Galon:%.2f\n"
                                            + "IVA: %.2f\n"
                                            + "Valor a Cancelar: %.2f\n", cadena,
                                            numGal, costoGal, IVA, valorCan);
                                               return cadena;
                }
}
