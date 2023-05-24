public class TBListe {
    private Dugum ilk;

    public TBListe(){
        this.ilk=null;
    }
    //Listenin başına eleman ekleme 
    public void basaEkle(int deger){
        Dugum yeni=new Dugum(deger);
        yeni.setSonraki(this.ilk);
        this.ilk=yeni;
    }
    public void basaEkle(Dugum yeni){
       yeni.setSonraki(this.ilk);
       this.ilk=yeni;

    }
    //Listedeki tüm elemanların değerlerini ekrana yazma
    public void listele(){
        Dugum temp=this.ilk;
        if(temp==null){
            System.out.println("Liste boş!");
            return;
        }
        while(temp!=null){
            temp.yazdir();
            temp=temp.getSonraki();
        }
        System.out.println("----------------------------");
    }
       //Listenin sonuna eleman ekleme
    public void sonaEkle(int deger){
        Dugum yeni=new Dugum(deger);
        if(this.ilk==null){
            this.ilk=yeni;
            return;
        }
        Dugum temp=this.ilk;
        while(temp.getSonraki()!=null){
            temp=temp.getSonraki();
        }
        temp.setSonraki(yeni);
    }
    public void sonaEkle(Dugum yeni){
         if(this.ilk==null){
            this.ilk=yeni;
            return;
         }
         Dugum temp=this.ilk;
        while(temp.getSonraki()!=null){
            temp=temp.getSonraki();
        }
        temp.setSonraki(yeni);
    }
      //Listedeki eleman sayısını hesaplama
    public int listeElemanSayisi(){
        int sayac=0;
        Dugum temp=this.ilk;
        while(temp!=null){
            sayac++;
            temp=temp.getSonraki();
        }
        return sayac;
    }
    //listede bir değer arar ve bulursa o düğümü geri döndürür
    public Dugum elemanBul(int deger){
       Dugum temp=this.ilk;
       Dugum bulunan=null;
       while(temp!=null){
        if(temp.getVeri()!=deger){
            temp=temp.getSonraki();
        }
        else{
            bulunan=temp;
            break;
        }
       }
       return bulunan;
    }
    //değeri listede herhangi bir indekse ekleme
    public void arayaEkle(int deger,int indis){
        if((this.ilk==null) || (indis==1)){
            this.basaEkle(deger);
            return;
        }
        Dugum yeni=new Dugum(deger);
        Dugum temp=this.ilk;
        int sayac=1;
        while(temp.getSonraki()!=null){
            if(temp.getSonraki()==null){
                this.sonaEkle(deger);
                return;
            }
            if(sayac+1==indis){
                break;
            }
            sayac++;
            temp=temp.getSonraki();
        }
        yeni.setSonraki(temp.getSonraki());
        temp.setSonraki(yeni);

    }

   //verilen değeri listeden siler (birden fazla varsa ilk bulduğunu siler)
   public int elemaniSil(int deger ){
          if(this.ilk==null){
            return -1;
          }
          if(this.ilk.getVeri()==deger){
            this.ilk=this.ilk.getSonraki();
            return 0;
          }
          Dugum temp=this.ilk;
          while(temp.getSonraki().getVeri()!=deger){
            if(temp.getSonraki().getSonraki()==null){
                return -2;
            }
            temp=temp.getSonraki();
          }
          temp.setSonraki(temp.getSonraki().getSonraki());
          return 0;
   }
   //aranan değerden listede kaç tane olduğunu döndürür
   public int elemanSayi(int deger){
    int sayac=0;
    if(this.ilk==null){
        return -1;
      }
    Dugum temp=this.ilk;
    while(temp!=null){
        if(temp.getVeri()==deger){
            sayac++;
        }
        temp=temp.getSonraki();
    }
    return sayac;      
   }

   //sıralıEkle değeri sayısal olarak sıralı ekleyeck(indis parametre yok)
   public void siraliEkle(int deger){
     Dugum yeniDugum=new Dugum(deger);
     if(this.ilk==null){
        this.basaEkle(deger);
        return;
     }
     else if(deger<this.ilk.getVeri()){
        yeniDugum.getSonraki(this.ilk);
        this.ilk=yeniDugum;
     }
     else{
     Dugum temp=this.ilk;
     while((temp.getSonraki()!=null) && (deger>temp.getSonraki.getVeri())){
         temp=temp.getSonraki();
    }
    yeniDugum.setSonraki(temp.getSonraki());
    temp.setSonraki(yeniDugum);
   } 
  }
    //verilen değeri listeden silen(birden fazla var ise hepsini silecek)
    public void hepsiniSil(int deger){
        while((this.ilk!=null) && (this.ilk.getVeri()==deger)){
            this.ilk=this.ilk.getSonraki();
        }
        Dugum temp=this.ilk;
        while((temp!=null) && (temp.getSonraki()!=null)){
            if(temp.getSonraki().getVeri()==deger){
                temp.setSonraki(temp.getSonraki().getSonraki());
            }else{
                temp=temp.getSonraki();
            }
        }
    }
}
