
package parcial;

public class MotorMecanico extends Motor implements IReservable,IVendible{
    private float tamanio;
    private String tipoCombustible;
    public MotorMecanico(){
        
    }
    public MotorMecanico(int modelo , String marca , float tamanio , String tipoCombustible){
        super(modelo,marca);
        this.tamanio=tamanio;
        this.tipoCombustible=tipoCombustible;
    }

    public String getInfo() {
        return super.getInfoMotor()+"\n"+
                "Tamaño: " + this.tamanio+"\n"+
                "Tipo Combustible: " + this.tipoCombustible;
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

        return 0;

    }
    
}
