
package parcial;


public abstract class Motor {
    
    private int noSerial;
    private String marca;
    
    public Motor(){
        
    }

    public Motor(int noSerial, String marca) {
        this.noSerial = noSerial;
        this.marca = marca;
    }
    
    public String getInfoMotor(){
        return "No Serial: " + this.noSerial+","+
                "Marca: " + this.marca +","+ this.getClass().getSimpleName();
    }
    public abstract String getInfoCatalogo();
    
}
