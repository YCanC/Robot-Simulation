
import java.util.*;



public class Test {
 

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Scanner scan2= new Scanner(System.in);
        Scanner scan3 = new Scanner(System.in);
       //Nesne dizileri oluşturma kısmı
 
       
        TekerlekliRobot t[] = new TekerlekliRobot[10];
        PaletliRobot p[]=new PaletliRobot[10];
        SpiderRobot s2[] = new SpiderRobot[10];
        Hibrit h[] = new Hibrit[10];
        ParalelRobot p2[] = new ParalelRobot[10];
        SeriRobot s[]=new SeriRobot[10];
        
        System.out.println("Kaç robot tanımlamak istiyorsunuz ?");
        int sayac;
        sayac=scan.nextInt();
        scan.nextLine();
        
        int tasimahizikontrol=0;
        int kapasitekontrol=0;
        int sayi;
        String robotTipi,Hibrit1,Hibrit2;
        int i=0;
        int k;
       String engelKontrol; int engelsayisi;  
        int gezginx,gezginy,gezginstartx,gezginstarty;
        int manistartx, manistarty;
        int hibritstartx, hibritstarty;
        
       //   t[5]= new TekerlekliRobot();
       //  t[5].getMotorsayisi(5);
      
       int seriKapasite=0;
       int paralelKapasite=0;
       
       int tekerlekliMin=10;
       int PaletliMin=5;
       int SpiderMin=1;
       int hibritParalelKontrol=0;
       int hibritPyuk=0;
       
        while(true)
        {
            if(sayac==0)
            {
                break;
            }
            
            System.out.println((i+1)+". robot tipini giriniz ");
          
            
            robotTipi=scan.nextLine();
            
           if(robotTipi.equalsIgnoreCase("tekerlekli")==true)
           {
                t[i]= new TekerlekliRobot();
               System.out.println("Motor sayısını giriniz");
               sayi = scan.nextInt();
               t[i].setMotorsayisi(sayi);
               System.out.println("Yuk miktarini giriniz");
               sayi=scan.nextInt();
               t[i].setYukmiktari(sayi);
               System.out.println("Teker sayisini giriniz");
               sayi=scan.nextInt();
               t[i].setTekersayisi(sayi);
               System.out.println("Tekerlekli robotun minimum hızı : "+tekerlekliMin);
               System.out.println("Gezinme hızını giriniz");
               sayi=scan.nextInt();
               t[i].setGezinmehizi(sayi);
               while(t[i].gezinmeHizi<tekerlekliMin)
               {
                   System.out.println("Tekerlekli robotun minimum hızı : "+tekerlekliMin+" olmalı !!..");
               System.out.println("Gezinme hızını giriniz");
               sayi=scan.nextInt();
               t[i].setGezinmehizi(sayi);
               }
               
                i++;
           }
           
           if(robotTipi.equalsIgnoreCase("paletli")==true)
           {
                p[i]= new PaletliRobot();
               System.out.println("Motor sayısını giriniz");
               sayi = scan.nextInt();
               p[i].setMotorsayisi(sayi);
               System.out.println("Yuk miktarini giriniz");
               sayi=scan.nextInt();
               p[i].setYukmiktari(sayi);
               System.out.println("Palet sayisini giriniz");
               sayi=scan.nextInt();
               p[i].setPaletsayisi(sayi);
               
                System.out.println("Paletli robotun minimum hızı : "+PaletliMin);
               System.out.println("Gezinme hızını giriniz");
               sayi=scan.nextInt();
               p[i].setGezinmehizi(sayi);
               
               while(p[i].gezinmeHizi<PaletliMin)
               {
                   System.out.println("Paletli robotun minimum hızı "+PaletliMin +" olmalı !!..");
               System.out.println("Gezinme hızını giriniz");
               sayi=scan.nextInt();
               p[i].setGezinmehizi(sayi);
                   
               }
        
               
                i++;
           }
           
               if(robotTipi.equalsIgnoreCase("spider")==true)
           {
                s2[i]= new SpiderRobot();
               System.out.println("Motor sayısını giriniz");
               sayi = scan.nextInt();
               s2[i].setMotorsayisi(sayi);
               System.out.println("Yuk miktarini giriniz");
               sayi=scan.nextInt();
               s2[i].setYukmiktari(sayi);
               System.out.println("Bacak sayisini giriniz");
               sayi=scan.nextInt();
               s2[i].getBacakSayisi(sayi);
               
               System.out.println("Spider robotun minimum hızı : "+SpiderMin);
               System.out.println("Gezinme hızını giriniz");
               sayi=scan.nextInt();
               s2[i].setGezinmehizi(sayi);
               while(s2[i].gezinmeHizi<SpiderMin)
               {
                   System.out.println("Spider robotun minimum hızı : "+SpiderMin+" olmalı!!..");
               System.out.println("Gezinme hızını giriniz");
               sayi=scan.nextInt();
               s2[i].setGezinmehizi(sayi);
               }
               
                i++;
           }
           
           
           
           
           
             if(robotTipi.equalsIgnoreCase("paralel")==true)
           {
               if(paralelKapasite==0)
               {
               System.out.println("Paralel robotların yuk kapasitesini giriniz");
               paralelKapasite = scan.nextInt();
               }

                p2[i]= new ParalelRobot();
               System.out.println("Motor sayısını giriniz");
               sayi = scan.nextInt();
               p2[i].setMotorsayisi(sayi);
               
              //kapasite işlemi
            /*    System.out.println("Yuk kapasitesini giriniz");
              sayi=scan.nextInt();
              p2[i].setKapasite(sayi);
              */
            
               System.out.println("Yuk miktarini giriniz");
               sayi=scan.nextInt();
              p2[i].setYukmiktari(sayi);
              
              
                while(p2[i].yukmiktari>paralelKapasite)
                 {
                    System.out.println("Yuk miktari kapasiteden fazla olamaz!!.. ");
                      //kapasite işlemi
                 System.out.println("Yuk miktarini giriniz");
                 sayi=scan.nextInt();
                 p2[i].setYukmiktari(sayi);
              
                 }
               kapasitekontrol=p2[i].kapasite;
                
                System.out.println("Kol uzunlugunu giriniz ");
                 sayi=scan.nextInt();
                 p2[i].setKoluzunlugu(sayi);
              
               System.out.println("Taşıma hızını giriniz ");
                sayi=scan.nextInt();
               p2[i].setTasimahizi(sayi);
               tasimahizikontrol = p2[i].tasimahizi;
                i++;
                
           }
           
             
            if(robotTipi.equalsIgnoreCase("seri")==true)
           {
               if(seriKapasite==0)
               {
                System.out.println("Seri robotların yük kapasitesini giriniz");
               seriKapasite = scan.nextInt();
               }
             while(paralelKapasite!=0 && seriKapasite>paralelKapasite)
             {
               System.out.println("seri robotun kapasitesi paralelden fazla olamaz !!..");
               System.out.println("Seri robotların yük kapasitesini giriniz");
               seriKapasite = scan.nextInt();
             }
               
               
                s[i]= new SeriRobot();
               System.out.println("Motor sayısını giriniz");
               sayi = scan.nextInt();
               s[i].setMotorsayisi(sayi);
               
             
             /*  System.out.println("Yuk kapasitesini giriniz");
               sayi=scan.nextInt();
               s[i].setKapasite(sayi);
  
                while(s[i].kapasite<kapasitekontrol)
               {
               System.out.println("Seri robot nesnesi Paralel robot nesnesinden fazla yük kaldıramaz!!");
               System.out.println("Yuk kapasitesini giriniz");
               sayi=scan.nextInt();
               s[i].setKapasite(sayi);
               }              
               */

             System.out.println("Yuk miktarini giriniz");
               sayi=scan.nextInt();
               s[i].setYukmiktari(sayi);
 
              while(seriKapasite<s[i].yukmiktari)
              {
              System.out.println("Yuk miktari kapasiteden fazla olamaz!!..");
               //kapasite işlemi
               System.out.println("Yuk miktarini giriniz");
               sayi=scan.nextInt();
               s[i].setYukmiktari(sayi);
              }
              
               System.out.println("Kol uzunlugunu giriniz");
               sayi=scan.nextInt();
              s[i].setKoluzunlugu(sayi);
              
               System.out.println("Taşıma hızını giriniz ");
               sayi=scan.nextInt();
               s[i].setTasimahizi(sayi);
               while(s[i].tasimahizi>tasimahizikontrol && tasimahizikontrol!=0)
               {
                   System.out.println("Seri robotların taşıma hızı paralel robotlarınkinden fazla olamaz!!..");
                   
               System.out.println("Taşıma hızını giriniz ");
               sayi=scan.nextInt();
               s[i].setTasimahizi(sayi);
                   
               }
              i++;   
           }
           
           if(robotTipi.equalsIgnoreCase("hibrit")==true)
           {
               System.out.println("Hibrit için hareketli kısım : ");
               Hibrit1=scan.nextLine();
               System.out.println("Hibrit için manipulator kısım : ");
               Hibrit2=scan.nextLine();
               
               //Hepsi için ortak özellikleri alma kısmı
                h[i]= new Hibrit();
               System.out.println("Motor sayısını giriniz ");
               sayi = scan.nextInt();
               h[i].setMotorsayisi(sayi);
               
               System.out.println("Yük kapasitesini giriniz ");
               sayi=scan.nextInt();
               h[i].setKapasite(sayi);
               if(Hibrit2.equalsIgnoreCase("paralel"))
               {
                   hibritPyuk=h[i].kapasite;
               }
                 if(Hibrit2.equalsIgnoreCase("seri"))
               {
                   while(hibritPyuk!=0 && h[i].kapasite>hibritPyuk)
                   {
               System.out.println("Hibrit serinin yük kapasitesi hibrit paralelinkinden fazla olamaz!!..");
               System.out.println("Yük kapasitesini giriniz ");
               sayi=scan.nextInt();
               h[i].setKapasite(sayi);
                   }
                   
               }
               
               System.out.println("Yuk miktarini giriniz ");
               sayi=scan.nextInt();
               h[i].setYukmiktari(sayi);
               while(h[i].yukmiktari>h[i].kapasite)
               {
              System.out.println("yük miktari kapasiteden fazla olamaz..");
              System.out.println("Yuk miktarini giriniz ");
               sayi=scan.nextInt();
               h[i].setYukmiktari(sayi);
               }
               
               
               System.out.println("Gezinme hızını giriniz ");
               sayi=scan.nextInt();
               h[i].setGezinmehizi(sayi);
               if(Hibrit1.equalsIgnoreCase("tekerlekli"))
               {
                   while(h[i].gezinmeHizi<tekerlekliMin)
                   {
                System.out.println("Hibrit tekerlekli robotların minimum hızı :"+ tekerlekliMin+ " olmalıdır");
               System.out.println("Gezinme hızını giriniz ");
               sayi=scan.nextInt();
               h[i].setGezinmehizi(sayi);
                       
                   }
               }
                   if(Hibrit1.equalsIgnoreCase("paletli"))
               {
                   while(h[i].gezinmeHizi<PaletliMin)
                   {
                System.out.println("Hibrit tekerlekli robotların minimum hızı :"+ PaletliMin+ " olmalıdır");
               System.out.println("Gezinme hızını giriniz ");
               sayi=scan.nextInt();
               h[i].setGezinmehizi(sayi);
                       
                   }
               }
                        if(Hibrit1.equalsIgnoreCase("spider"))
               {
                   while(h[i].gezinmeHizi<SpiderMin)
                   {
                System.out.println("Hibrit tekerlekli robotların minimum hızı :"+SpiderMin+ " olmalıdır");
               System.out.println("Gezinme hızını giriniz ");
               sayi=scan.nextInt();
               h[i].setGezinmehizi(sayi);
                       
                   }
               }
                     
               System.out.println("Kol uzunlugunu giriniz ");
               sayi=scan.nextInt();
               h[i].setKoluzunlugu(sayi);
              
                System.out.println("Taşıma hızını giriniz ");
                sayi=scan.nextInt();
                h[i].setTasimahizi(sayi);
                if(Hibrit2.equalsIgnoreCase("paralel"))
                {
                    hibritParalelKontrol=h[i].tasimahizi;
                }
                if(Hibrit2.equalsIgnoreCase("seri"))
                {
                   while(h[i].tasimahizi>hibritParalelKontrol && hibritParalelKontrol !=0)
                   {
                       System.out.println("Hibrit seri robotun taşıma hızı hibrit paralel robotun taşıma hızından fazla olamaz!!..");
                System.out.println("Taşıma hızını giriniz ");
                sayi=scan.nextInt();
                h[i].setTasimahizi(sayi);
                   }
                    
                }
               if(Hibrit1.equalsIgnoreCase("tekerlekli"))
               {
               System.out.println("Teker sayisini giriniz");
               sayi=scan.nextInt();
               h[i].setTekersayisi(sayi);
               }
               
               if(Hibrit1.equalsIgnoreCase("paletli"))
               {
               System.out.println("Palet sayisini giriniz");
               sayi=scan.nextInt();
               h[i].setPaletsayisi(sayi);
               }
               
                if(Hibrit1.equalsIgnoreCase("spider"))
               {
               System.out.println("Bacak sayisini giriniz");
               sayi=scan.nextInt();
               h[i].setBacakSayisi(sayi);

               }
                
                System.out.println("Sabitlenme suresini giriniz ");
                sayi=scan.nextInt();
                h[i].getSabitlenmeSuresi(sayi);
                
                System.out.println("Gecis suresini giriniz ");
                sayi=scan.nextInt();
                h[i].getGecisSuresi(sayi);
                
                
               i++;
               
           }
           
           
           
           
         scan.nextLine();
            sayac--;
          
            
        }
        
        System.out.println("kaçıncı robot problemi çözsün ?");
        k = scan.nextInt();
        
        //grafik kütüphanesi başlangıcı
        izgara pencere = new izgara();
      //tekerlekli robot işlemleri*******************************************
        if(t[k-1]!=null)
        {
            float engelgecmesuresi = t[k-1].EngelGecmeSuresiBul();
            //Tekerlekli problemi çözer...
            pencere.robotTipiAl("tekerlekli");
            scan.nextLine();
            System.out.println("Engel girmek istiyor musunuz ?");
            engelKontrol=scan.nextLine();
            
            if(engelKontrol.equalsIgnoreCase("evet"))
            {
                System.out.println("Engel sayisini giriniz");
                engelsayisi = scan.nextInt();
                pencere.engelSayisiAl(engelsayisi);
                int engelsayaci=1;
                int engelx, engely;
                while(engelsayisi>0)
                {
                    System.out.println(engelsayaci+ " engel koordinatını giriniz ");
                    System.out.println("x koordinatı :");
                    engelx = scan.nextInt();
                    System.out.println("y koordinatı ");
                    engely=scan.nextInt();
                   
                    pencere.engelKoordinat(engelx, engely);
                     
                    engelsayisi--;
                    engelsayaci++;
                }
            
        
            }
            System.out.println("Tekerlekli robotun başlangıç konumunu giriniz");
            
            gezginx=scan.nextInt();
            gezginy=scan.nextInt();
            
            gezginstartx = gezginx;
            gezginstarty = gezginy;
           
            int yonx=0;
           int yony=0;
           
        //   hareket alma işlemi-------------------
              pencere.setSize(1200,1200);
                pencere.setVisible(true);
               pencere.gezginStartKoordinat(gezginstartx, gezginstarty);
               
           while(true)
        {
          System.out.println("Yön bilgisi giriniz cikis icin cikis yaziniz");

          String yön;
          yön=scan2.nextLine();
          int yony2 = 0,yonx2 = 0;
    
          if(yön.contains("ileri"))
           {
               yony2=0;
               yony2+=Character.getNumericValue(yön.charAt(0));
               yony+=Character.getNumericValue(yön.charAt(0));
               System.out.println("ileri işlemi girildi");
                 pencere.gezginSonKoordinat(yonx, yony, yonx2, yony2,t[k-1].gezinmeHizi);
                 pencere.engelKontrol(engelgecmesuresi);
                  if(pencere.ciktimi()==true)
              {
                  System.out.println("ızgara dışına çıkıldı. ");
                   pencere.sureGoster();
                  break;
              }
               continue;
           }
           if(yön.contains("geri"))
           {
                yony2=0;
               yony2-=Character.getNumericValue(yön.charAt(0));
               yony-=Character.getNumericValue(yön.charAt(0));
               System.out.println("geri işlemi girildi");
               pencere.gezginSonKoordinat(yonx, yony, yonx2, yony2,t[k-1].gezinmeHizi);
               pencere.engelKontrol(engelgecmesuresi);
                if(pencere.ciktimi()==true)
              {
                  System.out.println("ızgara dışına çıkıldı. ");
                   pencere.sureGoster();
                  break;
              }
               continue;
           }
           if(yön.contains("sag"))
           {
                yonx2=0;
               yonx2+=Character.getNumericValue(yön.charAt(0));
               yonx+=Character.getNumericValue(yön.charAt(0));
               System.out.println("sag işlemi girildi");
               pencere.gezginSonKoordinat(yonx, yony, yonx2, yony2,t[k-1].gezinmeHizi);
               pencere.engelKontrol(engelgecmesuresi);
                if(pencere.ciktimi()==true)
              {
                  System.out.println("ızgara dışına çıkıldı. ");
                   pencere.sureGoster();
                  break;
              }
               continue;
           }      
           
           if(yön.contains("sol"))
           {
               yonx2=0;
               yonx2-=Character.getNumericValue(yön.charAt(0));
               yonx-=Character.getNumericValue(yön.charAt(0));
               System.out.println("sol işlemi girildi");
               pencere.gezginSonKoordinat(yonx, yony, yonx2, yony2,t[k-1].gezinmeHizi);
               pencere.engelKontrol(engelgecmesuresi);
              if(pencere.ciktimi()==true)
              {
                  System.out.println("ızgara dışına çıkıldı. ");
                  pencere.sureGoster();
                  break;
              }
               continue;
           }    
                   

               System.out.println(yön+ " girildi");
               
           if(yön.equalsIgnoreCase("cikis"));
           {
               pencere.sureGoster();
               break;
           }
           
           
      } 
            
    }
   
        //paletli robot işlemleri******************************************
        if(p[k-1]!=null)
        {
            
            float engelgecmesuresi = p[k-1].EngelGecmeSuresiBul();
            //Paletli problemi çözer...
            pencere.robotTipiAl("paletli");
            scan.nextLine();
            System.out.println("Engel girmek istiyor musunuz ?");
            engelKontrol=scan.nextLine();
            
            if(engelKontrol.equalsIgnoreCase("evet"))
            {
                System.out.println("Engel sayisini giriniz");
                engelsayisi = scan.nextInt();
                pencere.engelSayisiAl(engelsayisi);
                int engelsayaci=1;
                int engelx, engely;
                while(engelsayisi>0)
                {
                    System.out.println(engelsayaci+ " engel koordinatını giriniz ");
                    System.out.println("x koordinatı :");
                    engelx = scan.nextInt();
                    System.out.println("y koordinatı ");
                    engely=scan.nextInt();
                   
                    pencere.engelKoordinat(engelx, engely);
                     
                    engelsayisi--;
                    engelsayaci++;
                }
            
        
            }
            System.out.println("Paletli robotun başlangıç konumunu giriniz");
            
            gezginx=scan.nextInt();
            gezginy=scan.nextInt();
            
            gezginstartx = gezginx;
            gezginstarty = gezginy;
           
            int yonx=0;
           int yony=0;
           
        //   hareket alma işlemi-------------------
              pencere.setSize(1200,1200);
                pencere.setVisible(true);
               pencere.gezginStartKoordinat(gezginstartx, gezginstarty);
               
           while(true)
        {
          System.out.println("Yön bilgisi giriniz cikis icin cikis yaziniz");

          String yön;
          yön=scan2.nextLine();
          int yony2 = 0,yonx2 = 0;
    
          if(yön.contains("ileri"))
           {
               yony2=0;
               yony2+=Character.getNumericValue(yön.charAt(0));
               yony+=Character.getNumericValue(yön.charAt(0));
               System.out.println("ileri işlemi girildi");
                 pencere.gezginSonKoordinat(yonx, yony, yonx2, yony2,p[k-1].gezinmeHizi);
                 pencere.engelKontrol(engelgecmesuresi);
                  if(pencere.ciktimi()==true)
              {
                  System.out.println("ızgara dışına çıkıldı. ");
                   pencere.sureGoster();
                  break;
              }
               continue;
           }
           if(yön.contains("geri"))
           {
                yony2=0;
               yony2-=Character.getNumericValue(yön.charAt(0));
               yony-=Character.getNumericValue(yön.charAt(0));
               System.out.println("geri işlemi girildi");
               pencere.gezginSonKoordinat(yonx, yony, yonx2, yony2,p[k-1].gezinmeHizi);
               pencere.engelKontrol(engelgecmesuresi);
                if(pencere.ciktimi()==true)
              {
                  System.out.println("ızgara dışına çıkıldı. ");
                   pencere.sureGoster();
                  break;
              }
               continue;
           }
           if(yön.contains("sag"))
           {
                yonx2=0;
               yonx2+=Character.getNumericValue(yön.charAt(0));
               yonx+=Character.getNumericValue(yön.charAt(0));
               System.out.println("sag işlemi girildi");
               pencere.gezginSonKoordinat(yonx, yony, yonx2, yony2,p[k-1].gezinmeHizi);
               pencere.engelKontrol(engelgecmesuresi);
                if(pencere.ciktimi()==true)
              {
                  System.out.println("ızgara dışına çıkıldı. ");
                   pencere.sureGoster();
                  break;
              }
               continue;
           }      
           
           if(yön.contains("sol"))
           {
               yonx2=0;
               yonx2-=Character.getNumericValue(yön.charAt(0));
               yonx-=Character.getNumericValue(yön.charAt(0));
               System.out.println("sol işlemi girildi");
               pencere.gezginSonKoordinat(yonx, yony, yonx2, yony2,p[k-1].gezinmeHizi);
               pencere.engelKontrol(engelgecmesuresi);
              if(pencere.ciktimi()==true)
              {
                  System.out.println("ızgara dışına çıkıldı. ");
                  pencere.sureGoster();
                  break;
              }
               continue;
           }    
                   

               System.out.println(yön+ " girildi");
               
           if(yön.equalsIgnoreCase("cikis"));
           {
               pencere.sureGoster();
               break;
           }
           
           
      } 
            
     
        }
      
        
        //Spider robot işlemleri****************
          if(s2[k-1]!=null)
        {
             float engelgecmesuresi = s2[k-1].EngelGecmeSuresiBul();
            //Spider problemi çözer...
            pencere.robotTipiAl("spider");
            scan.nextLine();
            System.out.println("Engel girmek istiyor musunuz ?");
            engelKontrol=scan.nextLine();
            
            if(engelKontrol.equalsIgnoreCase("evet"))
            {
                System.out.println("Engel sayisini giriniz");
                engelsayisi = scan.nextInt();
                pencere.engelSayisiAl(engelsayisi);
                int engelsayaci=1;
                int engelx, engely;
                while(engelsayisi>0)
                {
                    System.out.println(engelsayaci+ " engel koordinatını giriniz ");
                    System.out.println("x koordinatı :");
                    engelx = scan.nextInt();
                    System.out.println("y koordinatı ");
                    engely=scan.nextInt();
                   
                    pencere.engelKoordinat(engelx, engely);
                     
                    engelsayisi--;
                    engelsayaci++;
                }
            
        
            }
            System.out.println("Spider robotun başlangıç konumunu giriniz");
            
            gezginx=scan.nextInt();
            gezginy=scan.nextInt();
            
            gezginstartx = gezginx;
            gezginstarty = gezginy;
           
           int yonx=0;
           int yony=0;
           
        //   hareket alma işlemi-------------------
            pencere.setSize(1200,1200);
            pencere.setVisible(true);
            pencere.gezginStartKoordinat(gezginstartx, gezginstarty);
               
           while(true)
        {
          System.out.println("Yön bilgisi giriniz cikis icin cikis yaziniz");

          String yön;
          yön=scan2.nextLine();
          int yony2 = 0,yonx2 = 0;
    
          if(yön.contains("ileri"))
           {
               yony2=0;
               yony2+=Character.getNumericValue(yön.charAt(0));
               yony+=Character.getNumericValue(yön.charAt(0));
               System.out.println("ileri işlemi girildi");
                 pencere.gezginSonKoordinat(yonx, yony, yonx2, yony2,s2[k-1].gezinmeHizi);
                 pencere.engelKontrol(engelgecmesuresi);
                  if(pencere.engelKontrol2())
               {
                   System.out.println("Spider robot engeli geçemez ");
                   pencere.sureGoster();
                   break;
               }
                  if(pencere.ciktimi()==true)
              {
                  System.out.println("ızgara dışına çıkıldı. ");
                   pencere.sureGoster();
                  break;
              }
                  
               continue;
           }
           if(yön.contains("geri"))
           {
                yony2=0;
               yony2-=Character.getNumericValue(yön.charAt(0));
               yony-=Character.getNumericValue(yön.charAt(0));
               System.out.println("geri işlemi girildi");
                  pencere.gezginSonKoordinat(yonx, yony, yonx2, yony2,s2[k-1].gezinmeHizi);
               pencere.engelKontrol(engelgecmesuresi);
               
               if(pencere.engelKontrol2())
               {
                   System.out.println("Spider robot engeli geçemez ");
                   pencere.sureGoster();
                   break;
               }
               
                if(pencere.ciktimi()==true)
              {
                  System.out.println("ızgara dışına çıkıldı. ");
                   pencere.sureGoster();
                  break;
              }
             
               continue;
           }
           if(yön.contains("sag"))
           {
                yonx2=0;
               yonx2+=Character.getNumericValue(yön.charAt(0));
               yonx+=Character.getNumericValue(yön.charAt(0));
               System.out.println("sag işlemi girildi");
               pencere.gezginSonKoordinat(yonx, yony, yonx2, yony2,s2[k-1].gezinmeHizi);
               pencere.engelKontrol(engelgecmesuresi);
                if(pencere.engelKontrol2())
               {
                   System.out.println("Spider robot engeli geçemez ");
                   pencere.sureGoster();
                   break;
               }
                if(pencere.ciktimi()==true)
              {
                  System.out.println("ızgara dışına çıkıldı. ");
                   pencere.sureGoster();
                  break;
              }
               
               continue;
           }      
           
           if(yön.contains("sol"))
           {
               yonx2=0;
               yonx2-=Character.getNumericValue(yön.charAt(0));
               yonx-=Character.getNumericValue(yön.charAt(0));
               System.out.println("sol işlemi girildi");
               pencere.gezginSonKoordinat(yonx, yony, yonx2, yony2,s2[k-1].gezinmeHizi);
               pencere.engelKontrol(engelgecmesuresi);
                if(pencere.engelKontrol2())
               {
                   System.out.println("Spider robot engeli geçemez ");
                   pencere.sureGoster();
                   break;
               }
              if(pencere.ciktimi()==true)
              {
                  System.out.println("ızgara dışına çıkıldı. ");
                  pencere.sureGoster();
                  break;
              }
               
               continue;
           }    
                   

               System.out.println(yön+ " girildi");
               
           if(yön.equalsIgnoreCase("cikis"));
           {
               pencere.sureGoster();
               break;
           }
           
           
      } 
 
        }
       
        
          //seri robot************************
          if(s[k-1]!=null)
          {
              pencere.robotTipiAl("seri");
              System.out.println("seri robotun sabitleneceği konumunu giriniz");
              manistartx=scan.nextInt();
              manistarty =scan.nextInt();
         
          int yonx=0;
          int yony=0;
           pencere.setSize(1200,1200);
           pencere.setVisible(true);
           pencere.gezginStartKoordinat(manistartx, manistarty);
              
                while(true)
        {
          System.out.println("Yükün taşınacağı yön bilgisini giriniz cikis icin cikis yaziniz");

          String yön;
          yön=scan2.nextLine();
          int yony2 = 0,yonx2 = 0;
          
          if(yön.contains("ileri"))
           {    
               
               yony2+=Character.getNumericValue(yön.charAt(0));
               yony+=Character.getNumericValue(yön.charAt(0));
               System.out.println("yük için ileri işlemi girildi");
               pencere.yukSonKoordinat(yonx, yony,yonx2,yony2, s[k-1].tasimahizi, s[k-1].koluzunlugu);
               if(pencere.ciktimi()==true)
              {
                  System.out.println("ızgara dışına çıkıldı. ");
                     pencere.sure2Goster();
                  break;
              }
               if(pencere.TasimaMesafeKontrol())
               {
                    pencere.sure2Goster();
                      break;
               }
               
           }
          if(yön.contains("geri"))
           {          
               
               yony2-=Character.getNumericValue(yön.charAt(0));
               yony-=Character.getNumericValue(yön.charAt(0));
               System.out.println("yük için geri işlemi girildi");
               pencere.yukSonKoordinat(yonx, yony,yonx2,yony2, s[k-1].tasimahizi, s[k-1].koluzunlugu);
               if(pencere.ciktimi()==true)
              {
                  System.out.println("ızgara dışına çıkıldı. ");
                    pencere.sure2Goster();
                  break;
              }
                 if(pencere.TasimaMesafeKontrol())
               {
                    pencere.sure2Goster();
                      break;
               }
           }
          if(yön.contains("sag"))
           {         
               
               yonx2+=Character.getNumericValue(yön.charAt(0));
               yonx+=Character.getNumericValue(yön.charAt(0));
               System.out.println("yük için sag işlemi girildi");
              pencere.yukSonKoordinat(yonx, yony,yonx2,yony2, s[k-1].tasimahizi, s[k-1].koluzunlugu);
               if(pencere.ciktimi()==true)
              {
                  System.out.println("ızgara dışına çıkıldı. ");
                     pencere.sure2Goster();
                  break;
              }
                 if(pencere.TasimaMesafeKontrol())
               {
                    pencere.sure2Goster();
                      break;
               }
           }
          if(yön.contains("sol"))
           {          
               
               yonx2-=Character.getNumericValue(yön.charAt(0));
               yonx-=Character.getNumericValue(yön.charAt(0));
               System.out.println("yük için sol işlemi girildi");
             pencere.yukSonKoordinat(yonx, yony,yonx2,yony2, s[k-1].tasimahizi, s[k-1].koluzunlugu);
               if(pencere.ciktimi()==true)
              {
                  System.out.println("ızgara dışına çıkıldı. ");
                   pencere.sure2Goster();
                  break;
              }
                 if(pencere.TasimaMesafeKontrol())
               {
                    pencere.sure2Goster();
                      break;
               }
           }
          
          if(yön.contains("cikis"))
          {
              pencere.sure2Goster();
              break;
          }
          
        }
 
          }
          
          
          
 //paralel robot özellikleri--------------------------         
          
               if(p2[k-1]!=null)
          {
              pencere.robotTipiAl("paralel");
              System.out.println("Paralel robotun sabitleneceği konumunu giriniz");
              manistartx=scan.nextInt();
              manistarty =scan.nextInt();
         
          int yonx=0;
          int yony=0;
           pencere.setSize(1200,1200);
           pencere.setVisible(true);
           pencere.gezginStartKoordinat(manistartx, manistarty);
              
                while(true)
        {
          System.out.println("Yükün taşınacağı yön bilgisini giriniz cikis icin cikis yaziniz");

          String yön;
          yön=scan2.nextLine();
          int yony2 = 0,yonx2 = 0;
          
          if(yön.contains("ileri"))
           {    
               
               yony2+=Character.getNumericValue(yön.charAt(0));
               yony+=Character.getNumericValue(yön.charAt(0));
               System.out.println("yük için ileri işlemi girildi");
               pencere.yukSonKoordinat(yonx, yony,yonx2,yony2, p2[k-1].tasimahizi, p2[k-1].koluzunlugu);
               if(pencere.ciktimi()==true)
              {
                  System.out.println("ızgara dışına çıkıldı. ");
                    pencere.sure2Goster();
                  break;
              }
                if(pencere.TasimaMesafeKontrol())
               {
                    pencere.sure2Goster();
                      break;
               }
               
           }
          if(yön.contains("geri"))
           {          
               
               yony2-=Character.getNumericValue(yön.charAt(0));
               yony-=Character.getNumericValue(yön.charAt(0));
               System.out.println("yük için geri işlemi girildi");
               pencere.yukSonKoordinat(yonx, yony,yonx2,yony2, p2[k-1].tasimahizi, p2[k-1].koluzunlugu);
               if(pencere.ciktimi()==true)
              {
                  System.out.println("ızgara dışına çıkıldı. ");
                    pencere.sure2Goster();
                  break;
              }
                if(pencere.TasimaMesafeKontrol())
               {
                    pencere.sure2Goster();
                      break;
               }
               
           }
          if(yön.contains("sag"))
           {         
               
               yonx2+=Character.getNumericValue(yön.charAt(0));
               yonx+=Character.getNumericValue(yön.charAt(0));
               System.out.println("yük için sag işlemi girildi");
              pencere.yukSonKoordinat(yonx, yony,yonx2,yony2, p2[k-1].tasimahizi, p2[k-1].koluzunlugu);
               if(pencere.ciktimi()==true)
              {
                  System.out.println("ızgara dışına çıkıldı. ");
                    pencere.sure2Goster();
                  break;
              }
                if(pencere.TasimaMesafeKontrol())
               {
                    pencere.sure2Goster();
                      break;
               }
           }
          if(yön.contains("sol"))
           {          
               
               yonx2-=Character.getNumericValue(yön.charAt(0));
               yonx-=Character.getNumericValue(yön.charAt(0));
               System.out.println("yük için sol işlemi girildi");
             pencere.yukSonKoordinat(yonx, yony,yonx2,yony2, p2[k-1].tasimahizi, p2[k-1].koluzunlugu);
             if(pencere.ciktimi()==true)
              {
                  System.out.println("ızgara dışına çıkıldı. ");
                    pencere.sure2Goster();
                  break;
              }
              if(pencere.TasimaMesafeKontrol())
               {
                    pencere.sure2Goster();
                      break;
               }
               
           }
          
          if(yön.contains("cikis"))
          {
              pencere.sure2Goster();
              break;
          }
          
        }
              
                
      }
        
               
 
      if(h[k-1]!=null)
          {
            float engelgecmesuresi = h[k-1].EngelGecmeSuresiBul();
            
              System.out.println("hibrit engel geçme süresi : "+engelgecmesuresi);
              
            if(h[k-1].Bacak_sayisi>0)
            {
                pencere.robotTipiAl("hibrit.spider");
            }
            else
            {
                 pencere.robotTipiAl("hibrit");
            }
       
            System.out.println("Engel girmek istiyor musunuz ?");
            engelKontrol=scan2.nextLine();
         
            if(engelKontrol.equalsIgnoreCase("evet"))
            {
                System.out.println("Engel sayisini giriniz");
                engelsayisi = scan.nextInt();
                pencere.engelSayisiAl(engelsayisi);
                int engelsayaci=1;
                int engelx, engely;
                while(engelsayisi>0)
                {
                    System.out.println(engelsayaci+ " engel koordinatını giriniz ");
                    System.out.println("x koordinatı :");
                    engelx = scan.nextInt();
                    System.out.println("y koordinatı ");
                    engely=scan.nextInt();
                   
                    pencere.engelKoordinat(engelx, engely);
                     
                    engelsayisi--;
                    engelsayaci++;
                }
            
        
            }
              System.out.println("Hibrit robotun başlangıç konumunu giriniz ");
              System.out.println("x: ");
              hibritstartx = scan.nextInt();
              System.out.println("y: ");
              hibritstarty= scan.nextInt();
              
           int yonx=0;
           int yony=0;
           
        //   hareket alma işlemi-------------------
            pencere.setSize(1200,1200);
            pencere.setVisible(true);
            pencere.gezginStartKoordinat(hibritstartx, hibritstarty);
            int donguyubitir=0;
               while(true)
        {
            
              if(donguyubitir==1)
          {
              pencere.sureGoster();
              pencere.sure3Goster(h[k-1].sabitlenmeSuresi,h[k-1].gecisSuresi);
              break;
          }
    
          System.out.println("Yön bilgisi giriniz");
            System.out.println("hibrit robotun sabitlenmesi için sabit yaziniz");

          String yön;
          String yön2;
          yön=scan2.nextLine();
          int yony2 = 0,yonx2 = 0;

            if(yön.contains("ileri"))
           {
               yony2=0;
               yony2+=Character.getNumericValue(yön.charAt(0));
               yony+=Character.getNumericValue(yön.charAt(0));
               System.out.println("ileri işlemi girildi");
                pencere.gezginSonKoordinat(yonx, yony, yonx2, yony2,h[k-1].gezinmeHizi);
                
                 pencere.engelKontrol(engelgecmesuresi);
                if(pencere.engelKontrol2())
                {
                  System.out.println("Spider robot engelden geçemez!.sdadasfafs.");
              pencere.sureGoster();
              break;
                }      
                
                  if(pencere.ciktimi()==true)
              {
                  System.out.println("ızgara dışına çıkıldı. ");
                  pencere.sureGoster();
                    pencere.sure3Goster(0,0);
              break;
              }
               
           }
          if(yön.contains("geri"))
           {
               yony2=0;
               yony2-=Character.getNumericValue(yön.charAt(0));
               yony-=Character.getNumericValue(yön.charAt(0));
               System.out.println("geri işlemi girildi");
                pencere.gezginSonKoordinat(yonx, yony, yonx2, yony2,h[k-1].gezinmeHizi);
                 pencere.engelKontrol(engelgecmesuresi);
                if(pencere.engelKontrol2())
                {
                  System.out.println("Spider robot engelden geçemez!.sdadasfafs.");
               pencere.sureGoster();
              break;
                }             
                  if(pencere.ciktimi()==true)
              {
                  System.out.println("ızgara dışına çıkıldı. ");
                  pencere.sureGoster();
               pencere.sure3Goster(0,0);
              break;
              }
               
           }
           if(yön.contains("sag"))
           {
               yonx2=0;
               yonx2+=Character.getNumericValue(yön.charAt(0));
               yonx+=Character.getNumericValue(yön.charAt(0));
               System.out.println("sag işlemi girildi");
                pencere.gezginSonKoordinat(yonx, yony, yonx2, yony2,h[k-1].gezinmeHizi);
                 pencere.engelKontrol(engelgecmesuresi);
                if(pencere.engelKontrol2())
                {
                  System.out.println("Spider robot engelden geçemez!.sdadasfafs.");
               pencere.sureGoster();
              break;
                }      
                  if(pencere.ciktimi()==true)
              {
                  System.out.println("ızgara dışına çıkıldı. ");
                  pencere.sureGoster();
                    pencere.sure3Goster(0,0);
              break;
              }
               
           }
           if(yön.contains("sol"))
           {
               yonx2=0;
               yonx2-=Character.getNumericValue(yön.charAt(0));
               yonx-=Character.getNumericValue(yön.charAt(0));
               System.out.println("sag işlemi girildi");
                pencere.gezginSonKoordinat(yonx, yony, yonx2, yony2,h[k-1].gezinmeHizi);
                 pencere.engelKontrol(engelgecmesuresi);
                if(pencere.engelKontrol2())
                {
                  System.out.println("Spider robot engelden geçemez!.sdadasfafs.");
                pencere.sureGoster();
              break;
                }      
                  if(pencere.ciktimi()==true)
              {
                  System.out.println("ızgara dışına çıkıldı. ");
                    pencere.sureGoster();
                 pencere.sure3Goster(0,0);
              break;
              }
               
           }
           
             if(yön.contains("cikis") || donguyubitir==1)
          {
              pencere.sureGoster();
            pencere.sure3Goster(h[k-1].sabitlenmeSuresi,h[k-1].gecisSuresi);
            
              break;
          }
        
           //HİBRİTİN MANİPÜLATÖR HALE GEÇTİKTEN SONRAKİ HALİ--------------------------------------
           if(yön.contains("sabit"))
           {
               pencere.hibritSabitleme();
               yonx=0;
               yony=0;
            
  
           while(true)
           {
               System.out.println("Yükün taşınacağı yön bilgisini giriniz cikis icin cikis yaziniz");
               yön2=scan3.nextLine();
           
                if(yön2.contains("ileri"))
           {    
               
               yony2+=Character.getNumericValue(yön2.charAt(0));
               yony+=Character.getNumericValue(yön2.charAt(0));
               System.out.println("yük için ileri işlemi girildi");
               pencere.yukSonKoordinat(yonx, yony,yonx2,yony2, h[k-1].tasimahizi, h[k-1].koluzunlugu);
               if(pencere.TasimaMesafeKontrol())
               {
                    donguyubitir=1;
                  break;
                  
               }
               
               if(pencere.ciktimi()==true)
              {
                  System.out.println("ızgara dışına çıkıldı. ");
                     donguyubitir=1;
                  break;
              }
               
           }
          if(yön2.contains("geri"))
           {          
               
               yony2-=Character.getNumericValue(yön2.charAt(0));
               yony-=Character.getNumericValue(yön2.charAt(0));
               System.out.println("yük için geri işlemi girildi");
               pencere.yukSonKoordinat(yonx, yony,yonx2,yony2, h[k-1].tasimahizi, h[k-1].koluzunlugu);
               if(pencere.TasimaMesafeKontrol())
               {
                      donguyubitir=1;
                      break;
               }
               if(pencere.ciktimi()==true)
              {
                  System.out.println("ızgara dışına çıkıldı. ");
                    donguyubitir=1;
                    break;
              }
               
           }
          if(yön2.contains("sag"))
           {         
               
               yonx2+=Character.getNumericValue(yön2.charAt(0));
               yonx+=Character.getNumericValue(yön2.charAt(0));
               System.out.println("yük için sag işlemi girildi");
              pencere.yukSonKoordinat(yonx, yony,yonx2,yony2, h[k-1].tasimahizi, h[k-1].koluzunlugu);
              if(pencere.TasimaMesafeKontrol())
               {
                 donguyubitir=1;
                 break;
               }
               if(pencere.ciktimi()==true)
              {
                     donguyubitir=1;
                  break;
              }
           }
          if(yön2.contains("sol"))
           {          
               
               yonx2-=Character.getNumericValue(yön2.charAt(0));
               yonx-=Character.getNumericValue(yön2.charAt(0));
               System.out.println("yük için sol işlemi girildi");
             pencere.yukSonKoordinat(yonx, yony,yonx2,yony2, h[k-1].tasimahizi, h[k-1].koluzunlugu);
             if(pencere.TasimaMesafeKontrol())
               {
                       donguyubitir=1;
                    break;
               }
             if(pencere.ciktimi()==true)
              {
                  System.out.println("ızgara dışına çıkıldı. ");
                       donguyubitir=1;
                  break;
              }
               
           }
          
          if(yön2.contains("cikis"))
          {             
              donguyubitir=1;
              break;
          }
              
           }
           
           
           
               
         
           }
           
          
             
          
        }
               
       
              
          }
               
     
        
    }
    
 public static void hareketal(int gezginx, int gezginy)
 {
 
     
        
           
       
 }
    
    
    
    
    
    
}
