/**
 *
 * @author YasarCan
 */
public class TekerlekliRobot extends GezginRobot{

    int Tekersayisi;
            
     public int setTekersayisi(int Tekersayisi)
   {
      return (this.Tekersayisi = Tekersayisi);
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
       
        return  (motorsayisi*0.5f);
    }

    public int getGezinmeHizi() {
        return gezinmeHizi;
    }

    public int getMotorsayisi() {
        return motorsayisi;
    }

    public int getYukmiktari() {
        return yukmiktari;
    }

    public String getRobotTipi() {
        return robotTipi;
    }
    
    
    
    
}
