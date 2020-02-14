package ejerciciopoliedificios;

public class Main {
    
    public static void main(String[] args) {
        Edificio[] lista=new Edificio[3];
        
        lista[0]=new Polideportivo(10,10,"Poli");
        lista[1]=new PlazaToros(10,"Córdoba");
        lista[2]=new Polideportivo(2,2,"Vistaalegre");
        
        for(Edificio o:lista){
            System.out.println(o.getSuperficieEdificio());            
        }
    }
    
}
