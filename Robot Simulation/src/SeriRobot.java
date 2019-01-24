/**
 *
 * @author YasarCan
 */
public class SeriRobot implements ManipulatorRobot{
    
    int tasimahizi;
    int kapasite;
    int koluzunlugu;
    int motorsayisi;
    int yukmiktari;
    String robotTipi;
    
    
    @Override
    public String setRobottipi(String robotTipi) {
        return (this.robotTipi=robotTipi);
    }
    
    @Override
    public int setKapasite(int kapasite) {
     return (this.kapasite = kapasite);
    }
    
   @Override
    public void setYukmiktari(int yukmiktari){
        this.yukmiktari=yukmiktari;
        
    }

    @Override
    public void setMotorsayisi(int motorsayisi)
    {
        this.motorsayisi=motorsayisi;
    }

    @Override
    public int setTasimahizi(int tasimahizi) {
        return (this.tasimahizi = tasimahizi);
    }

   

    @Override
    public int setKoluzunlugu(int koluzunlugu) {
        return (this.koluzunlugu = koluzunlugu);
    }
    
    
}
