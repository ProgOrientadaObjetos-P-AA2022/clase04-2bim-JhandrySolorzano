
package paquete02;


public abstract class Automovil {
    
    protected String nombre;
    protected String placa;
    protected double valorCan;
    
    public void establecerNombre(String n){
        nombre=n;
    }
     public void establecerPlaca(String n){
        placa=n;
    }
     
     public abstract void calcularValorCan();
   
    public String obtenerNombre(){
        return nombre;
    }
    
    public String obtenerPlaca(){
        return placa;      
    }
    
    public double obtenerValorCan(){
        return valorCan;
    }
    
    @Override
        public String toString() {
            String cadena = String.format("Nombre del propietario: %s\n"
                        + "Placa del auto: %s\n",
                         nombre, placa);
                    return cadena;
            }
    }
