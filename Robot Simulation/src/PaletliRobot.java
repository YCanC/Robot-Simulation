
/**
 *
 * @author YasarCan
 */
public class PaletliRobot extends GezginRobot{

    int Palet_sayisi;

    
  
    public int setPaletsayisi(int Palet_sayisi)
    {
    return (this.Palet_sayisi=Palet_sayisi);
    }
     @Override
    public void setGezinmehizi(int gezinmeHizi) {
        this.gezinmeHizi=gezinmeHizi;
    }
    
    @Override
    public String setRobottipi(String robotTipi)
    {
        return (this.robotTipi=robotTipi);
    }

        @Override
    public void setYukmiktari(int yukmiktari)
    {
        this.yukmiktari=yukmiktari;
    }

        @Override
    public void setMotorsayisi(int motorsayisi)
    {
        this.motorsayisi=motorsayisi;
    }
    
       @Override
    public float EngelGecmeSuresiBul() {
       
        return motorsayisi*3;
    }
    

}
