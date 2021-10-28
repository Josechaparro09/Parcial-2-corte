
package parcial;

public class MotorHibrido extends  Motor implements IReservable,IVendible{
    
    public MotorHibrido(){
        
    }
    public MotorHibrido(int modelo , String marca , double numKilovatios , String tipoCombustible){
        
        
        
    }

    @Override
    public double getValorReserva() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getValorVenta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getInfoCatalogo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
