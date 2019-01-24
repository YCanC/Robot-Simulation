/**
 *
 * @author YasarCan
 */
public abstract class GezginRobot implements Robot{
   
    
    protected int gezinmeHizi;
    protected int motorsayisi;
    protected int yukmiktari;
    protected String robotTipi;    

    public void setGezinmehizi(int gezinmeHizi)
    {
        
    }
//----------------------------------------------------------------
//superclass kısmı
    public float EngelGecmeSuresiBul(){    
        
        //spider robotlar engelden geçemez      

        return 0;
    }
   
}
