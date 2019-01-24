/**
 *
 * @author YasarCan
 */
public class SpiderRobot extends GezginRobot{

  int Bacak_sayisi;
  
    public int getBacakSayisi(int Bacak_sayisi)
    {
      return (this.Bacak_sayisi = Bacak_sayisi);
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
    
     
  
   

    
   
    
    
    
}
