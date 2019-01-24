
import java.awt.*;
import javax.swing.*;



public class izgara extends JFrame{
    
    int engelsayisi;
    int engelx,engely;
    int yonx,yony,gezginstartx,gezginstarty;
    int engeltespitx, engeltespity,gezinmehizi;
    int spiderEngel=0;
    int i=0;
    int [] engelxdizisi = new int[400];
    int [] engelydizisi = new int[400];
    int [] adimlarx = new int[400];
    int [] adimlary = new int[400];  
    
    int sabitx=0; int sabity=0;
    int tasimahizi2;
    
    int as=0;
    float sure=0; float mesafe=0;   float tasimaMesafesi=0; float sure2=0; float sure3=0; 
                  float mesafe2=0;   float toplamTasimaMesafesi=0;
    int tasimaMesafesiKontrol=0;
    
    float toplamEngelGecmeSuresi=0;
    
    String tipKontrol;
    
    
   void robotTipiAl(String robotTipi)
   {
       //1,1 için başlangıç değer ataması
       for(int yc=0; yc<50; yc++)
    {
        engelydizisi[yc]=5058;
    }
       
       tipKontrol=robotTipi;
       
   }
    
  void engelSayisiAl(int engelsayisi)
  {
      this.engelsayisi=engelsayisi;
  }
 
    void engelKoordinat(int engelx, int engely)
  {
      this.engelx=engelx-1;
      this.engely=engely-1;
      engelxdizisi[i]=engelx-1;
      engelydizisi[i]=engely-1;
      i++;
  }
    void gezginStartKoordinat(int gezginstartx, int gezginstarty)
    {
        this.gezginstartx=gezginstartx-1;
        this.gezginstarty=gezginstarty-1;
        adimlarx[as]=gezginstartx-1;
        adimlary[as]=gezginstarty-1;
    }
   
    void gezginSonKoordinat(int yonx, int yony, int yonx2, int yony2, int gezinmehizi)
    {      
        as++;
       if(engelKontrol2())
       {        
       }
      if(engelKontrol2()==false)
       {
        this.yonx=yonx;
        this.yony=yony;
       adimlarx[as]+=(adimlarx[as-1]+yonx2);
       adimlary[as]+=(adimlary[as-1]+yony2);
       mesafe+=Math.abs(yonx2*10);
       mesafe+=Math.abs(yony2*10);
       mesafe2=Math.abs(yonx2*10)+Math.abs(yony2*10);
       
           
           
       sure+=(mesafe2/gezinmehizi);
       }
       System.out.println("gezinme hizi : "+gezinmehizi);
    
        this.gezinmehizi=gezinmehizi;
    }
    
    void hibritSabitleme()
    {
        System.out.println("Hibrit robotu sabitleme işlemi yapılıyor..");
        gezginstartx+=yonx;
        gezginstarty+=yony;
        yonx=0;
        yony=0;
    }
    //manipulator yük koordinat alma işlemi
    
    void yukSonKoordinat(int yonx, int yony, int yonx2, int yony2, int tasimahizi, int koluzunlugu)
    {
        
        this.yonx = yonx;
        this.yony=yony;
        tasimaMesafesi = (float) Math.sqrt( (yonx*10 * yonx*10) + (yony*10 * yony*10));
        tasimahizi2=tasimahizi;
               
        
        if(tasimaMesafesi>koluzunlugu)
        {
          
            System.out.println("Taşıma mesafesi kol uzunlugunu aştı ");
            
                while(koluzunlugu<(this.yonx*10))
            {
                
                this.yonx-=1;
            }
   
              while(koluzunlugu<(this.yony*10))
            {
               
                this.yony-=1;
            }
        sure3 = (koluzunlugu/tasimahizi);
         sure2 = (toplamTasimaMesafesi/tasimahizi);
            tasimaMesafesiKontrol=1;
        }
        if(tasimaMesafesi<=koluzunlugu)
        {
            toplamTasimaMesafesi +=(float) Math.sqrt( (yonx2*10 * yonx2*10) + (yony2*10 * yony2*10));
         
            sure3 = (tasimaMesafesi/tasimahizi);
            sure2 = (toplamTasimaMesafesi/tasimahizi);
        }
        
    }
    boolean TasimaMesafeKontrol()
    {
        return tasimaMesafesiKontrol==1;
    }
 
 void sure3Goster(int sabitlemesuresi, int gecissuresi)
 {
     System.out.println("Yük taşıma hızına göre toplam süre : "+( sure+sure3+sabitlemesuresi+gecissuresi)+ " saniye");
     System.out.println("Yük taşıma süratine göre toplam süre : "+(sure + sure2+sabitlemesuresi+gecissuresi)+ " saniye");
 }
 
  void sure2Goster()
 {
      System.out.println("Yukun taşınma süratine göre : "+sure2+ " saniye");
      System.out.println("Yukun taşınma hizina göre : "+sure3+ " saniye");
 }
void sureGoster()
{
    System.out.println("gezilen süre: "+sure + " saniye");
}
boolean ciktimi()
{
    if((this.gezginstartx*50)+20+(50*this.yonx)<20 || (this.gezginstarty*50)+40+(50*this.yony)<40)
    {
        while(mesafe2>0)
        {          
            sure-=(10/gezinmehizi);
             mesafe2-=10;
             
        }
        
        
        while((this.gezginstartx*50)+20+(50*this.yonx)<20)
                {
                   
                 yonx++;                
                 tasimaMesafesi-=10;
                 toplamTasimaMesafesi-=10;
            // sure-=(mesafe2/gezinmehizi);
                    //System.out.println("bool sure : "+sure);
             sure3 = (tasimaMesafesi/tasimahizi2);
            sure2 = (toplamTasimaMesafesi/tasimahizi2);
                
                }
        while((this.gezginstarty*50)+40+(50*this.yony)<40)
                {
                    
                 yony++;  
               
                 tasimaMesafesi-=10;
                 toplamTasimaMesafesi-=10;
                //sure-=(mesafe2/gezinmehizi);
                 
                 sure3 = (tasimaMesafesi/tasimahizi2);
              sure2 = (toplamTasimaMesafesi/tasimahizi2);
                  
                }
        return true;
    }
       
    return false;
}

boolean engelKontrol2()
{
        return (spiderEngel ==1);    
}

  void engelKontrol(float engelgecmesuresi)
  {

     for(int k =0; k<=engelsayisi; k++)
    {
      //x soldan sağa
        if(adimlarx[as]>adimlarx[as-1] && adimlary[as]==engelydizisi[k])
     {      
        for(int o=adimlarx[as-1]; o<= adimlarx[as]; o++)
        { 
                if(engelxdizisi[k] == o)
        {
           if(tipKontrol.equalsIgnoreCase("tekerlekli") || tipKontrol.equalsIgnoreCase("paletli") || tipKontrol.equalsIgnoreCase("hibrit"))
           {
               System.out.println("Engele dokundu");
                System.out.println("engel gecme suresi:  "+engelgecmesuresi);             
              
              
           sure+=engelgecmesuresi;
              

           }
           if(tipKontrol.equalsIgnoreCase("spider") || tipKontrol.equalsIgnoreCase("hibrit.spider") )
           {
               System.out.println("Spider robot engeli geçemez ");
               spiderEngel =1;
               
             mesafe-=Math.abs(10*((gezginstartx+this.yonx)-engelxdizisi[k]));
             mesafe-=Math.abs(10*((gezginstarty+this.yony)-engelydizisi[k]));
           
            System.out.println(" spider robotun aldıgı toplam mesafe =  "+mesafe);
            
                sure=(mesafe/gezinmehizi);
                
             
           }
           
        }
  
       } 
     } 
        // x sağdan sola
         if(adimlarx[as]<adimlarx[as-1] && adimlary[as]==engelydizisi[k])
     {      
        for(int o=adimlarx[as]; o<= adimlarx[as-1]; o++)
        { 
                if(engelxdizisi[k] == o)
        {
          if(tipKontrol.equalsIgnoreCase("tekerlekli") || tipKontrol.equalsIgnoreCase("paletli") || tipKontrol.equalsIgnoreCase("hibrit"))
           {
               System.out.println("Engele dokundu");
               System.out.println("engel gecme suresi:  "+engelgecmesuresi);             
            
              
               sure+=engelgecmesuresi;
               
               
           }      
          if(tipKontrol.equalsIgnoreCase("spider")|| tipKontrol.equalsIgnoreCase("hibrit.spider") )
           {
               System.out.println("Spider robot engeli geçemez ");
               
         mesafe-=Math.abs(10*((gezginstartx+this.yonx)-engelxdizisi[k]));
           mesafe-=Math.abs(10*((gezginstarty+this.yony)-engelydizisi[k]));
    System.out.println(" spider robotun aldıgı toplam mesafe =  "+mesafe);
               
               spiderEngel =1;
                sure=(mesafe/gezinmehizi);
                
               
           }
          
        }
  
       } 
     }
      
      //y yukarıdan aşağı
      if(adimlary[as]>adimlary[as-1] && adimlarx[as]== engelxdizisi[k])
      {
          for(int o = adimlary[as-1]; o<=adimlary[as]; o++)
          {
              if(engelydizisi[k]==o)
              {
                  if(tipKontrol.equalsIgnoreCase("tekerlekli") || tipKontrol.equalsIgnoreCase("paletli") || tipKontrol.equalsIgnoreCase("hibrit"))
           {
               System.out.println("Engele dokundu");
           System.out.println("engel gecme suresi:  "+engelgecmesuresi);             
             
           
                 sure+=engelgecmesuresi;
              
           }
                  
                  if(tipKontrol.equalsIgnoreCase("spider")|| tipKontrol.equalsIgnoreCase("hibrit.spider") )
           {
               System.out.println("Spider robot engeli geçemez ");
               spiderEngel =1;
                mesafe-=Math.abs(10*((gezginstartx+this.yonx)-engelxdizisi[k]));
           mesafe-=Math.abs(10*((gezginstarty+this.yony)-engelydizisi[k]));
             
               System.out.println(" spider robotun aldıgı toplam mesafe = "+mesafe);
                sure=(mesafe/gezinmehizi);
            
           }
              }
              
          }
      }
      
      //y aşağıdan yukarı
      if(adimlary[as-1]>adimlary[as] && adimlarx[as]== engelxdizisi[k])
      {
          for(int o = adimlary[as]; o<=adimlary[as-1]; o++)
          {
              if(engelydizisi[k]==o)
              {
                   if(tipKontrol.equalsIgnoreCase("tekerlekli") || tipKontrol.equalsIgnoreCase("paletli") || tipKontrol.equalsIgnoreCase("hibrit"))
           {
               System.out.println("Engele dokundu");
               System.out.println("engelgecme suresi:  "+engelgecmesuresi);             
              
              
                sure+=engelgecmesuresi;
               System.out.println("engele dokunduktan sonraki süre : "+sure);
           }
            
           if(tipKontrol.equalsIgnoreCase("spider")|| tipKontrol.equalsIgnoreCase("hibrit.spider"))
           {
               System.out.println("Spider robot engeli geçemez ");
               
           mesafe-=Math.abs(10*((gezginstartx+this.yonx)-engelxdizisi[k]));
           mesafe-=Math.abs(10*((gezginstarty+this.yony)-engelydizisi[k]));
                System.out.println(" spider robotun aldıgı toplam mesafe = "+mesafe);
               spiderEngel =1;
                sure=(mesafe/gezinmehizi);
              
           }
                   
              }
              
          }
  
      }
   
    } 
   
  }

    @Override
      public void paint (Graphics engel){
              
          super.paint(engel);
       
            Test t = new Test();

        for (int i = 40; i <= 1000; i+=50) {
            for (int j = 20; j < 1000; j+=50) {
                 engel.drawRect(j, i, 50, 50);
            }
        }
    engel.setColor(Color.BLACK);
    for(int k=0; k<engelsayisi; k++)
    {
         engel.fillRect((engelxdizisi[k]*50)+20, (engelydizisi[k]*50)+40, 50, 50); 
         if(engelKontrol2())
     {
         engel.setColor(Color.RED);
         engel.fillRect((engelxdizisi[k]*50)+20, (engelydizisi[k]*50)+40, 50, 50);
       
     }
    
    }
    
    engel.setColor(Color.RED);
  
    //gezginin başlangıç konumu
    engel.fillOval((this.gezginstartx*50)+20, (this.gezginstarty*50)+40, 50, 50);
    // engel.fillRect((this.gezginx*50)+20, (this.gezginy*50)+40, 50, 50);
   
    
   engel.setColor(Color.BLUE);
   if(engelKontrol2()==false)
   {
       if(ciktimi())
       {
           engel.setColor(Color.magenta);
           engel.fillRect((this.gezginstartx*50)+20+(50*this.yonx), (this.gezginstarty*50)+40+(50*this.yony), 50, 50);
       }
       
        engel.fillRect((this.gezginstartx*50)+20+(50*this.yonx), (this.gezginstarty*50)+40+(50*this.yony), 50, 50);
        
        
        sabitx+=(gezginstartx+yonx);
        sabity+=(gezginstarty+yony);
   }
   
    
    
    
        
    }

    
}
