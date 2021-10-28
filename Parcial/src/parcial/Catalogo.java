
package parcial;

import java.util.ArrayList;

public class Catalogo extends Motor{

    private  ArrayList <Motor> Coleccion = new ArrayList(); 

    public Catalogo() {
    }

    public ArrayList<Motor> getColeccion() {
        return Coleccion;
    }

    public void setColeccion(ArrayList<Motor> Coleccion) {
        this.Coleccion = Coleccion;
    }


    public String getInfo() {
        return super.getInfoMotor();
    }
    

    public ArrayList <Motor> getCatalogo(){
        return Coleccion;
    }
    public boolean registrarMotor(Motor m){
        Coleccion.add(m);
        return true;
    }

    @Override
    public String getInfoCatalogo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
