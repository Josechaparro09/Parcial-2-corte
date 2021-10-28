
package parcial;

public class Test {
    public static void main(String[] args) {
        Catalogo catalogo = new Catalogo();
        
        Motor motorA=new MotorElectrico(112233 , "Skill" , 12);
        catalogo.registrarMotor(motorA);
        
        Motor motorE = new MotorMecanico (222222 , "DeWalt", 1.8 , "Gasolina");
        catalogo.registrarMotor(motorF);
        
        Motor motorF = new MotorHibrido(553311 , "Akita" , 5 , 2.5 , "Gas");
        catalogo.registrarMotor(motorF);
    }
}
