public class Hibrit extends GezginRobot implements ManipulatorRobot{

    int tasimahizi;
    int kapasite;
    int koluzunlugu;
    
    //*****************
    int Tekersayisi;
    //*****************
    int Bacak_sayisi;
    //*****************
    int Palet_sayisi;
    //*****************
    //*****************
    int sabitlenmeSuresi;
    int gecisSuresi;
            
    public void getGecisSuresi(int gecisSuresi)
    {
       this.gecisSuresi=gecisSuresi;
    }
    
    public void getSabitlenmeSuresi(int sabitlenmeSuresi)
    {
        this.sabitlenmeSuresi=sabitlenmeSuresi;
    }
    @Override
    public void setMotorsayisi(int motorsayisi) {
        this.motorsayisi=motorsayisi;
    }

    @Override
    public void setYukmiktari(int yukmiktari) {
        this.yukmiktari=yukmiktari;
    }

    @Override
    public String setRobottipi(String robotTipi) {
        
    return (this.robotTipi=robotTipi);
    }

    @Override
    public int setTasimahizi(int tasimahizi) {
       return (this.tasimahizi=tasimahizi);
    }

    @Override
    public int setKapasite(int kapasite) {
    return (this.kapasite=kapasite);    
    }

    @Override
    public int setKoluzunlugu(int koluzunlugu) {
    return (this.koluzunlugu=koluzunlugu);    
    }
    
     public int setTekersayisi(int Tekersayisi)
   {
      return (this.Tekersayisi = Tekersayisi);
   }
     
    public int setBacakSayisi(int Bacak_sayisi)
    {
      return (this.Bacak_sayisi = Bacak_sayisi);
    }
     public int setPaletsayisi(int Palet_sayisi)
    {
    return (this.Palet_sayisi=Palet_sayisi);
    }

    @Override
    public float EngelGecmeSuresiBul() {
        
        if(this.motorsayisi>0)
        {
           return  (motorsayisi*0.3f);
        }
        if(this.Palet_sayisi>0)
        {
             return motorsayisi*5;
        }
        if(this.Bacak_sayisi>0)
        {
            return 0;
        }
        return 0;
            
      
    }

    @Override
    public void setGezinmehizi(int gezinmeHizi) {
        this.gezinmeHizi=gezinmeHizi;
    }
    
    
    
}
