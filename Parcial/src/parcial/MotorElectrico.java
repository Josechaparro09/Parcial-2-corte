
package parcial;

public class MotorElectrico extends Motor implements IReservable,IVendible{
    private float numKilovatios;
    public MotorElectrico(){
        
    }
    public MotorElectrico(int modelo , String marca , float numKilovatios){
        super(modelo , marca );
        this.numKilovatios=numKilovatios;
    }
     public float consumoHora(){
        return numKilovatios*60;
    }

    public String getInfo() {
        return super.getInfoMotor()+"\n"+
                "Consumo Kv X Minuto: " + this.numKilovatios;
    }

    @Override
    public String getInfoCatalogo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getValorReserva() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getValorVenta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
