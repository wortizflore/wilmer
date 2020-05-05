//package comidaHerencia;

public class Producto {
    String fechaCaducidad, numeroLote;
   
    public Producto(String pfechaCaducidad, String pnumeroLote){
        fechaCaducidad = pfechaCaducidad;
        numeroLote = pnumeroLote;
    }
   
    public void setFechaCaducidad(String fecha){
        fechaCaducidad = fecha;
    }
   
    public void setNumeroLote(String num){
        numeroLote = num;
    }
   
    public String getFechaCaducidad(){
        return fechaCaducidad;
    }
   
    public String getNumeroLote(){
        return numeroLote;
    }
   
    public void imprimirInfo1(){
        // System.out.println("wilmer: " );
        System.out.println("Fecha Caducidad: " + getFechaCaducidad() + "\nNumero de Lote: " + getNumeroLote());
    }
}