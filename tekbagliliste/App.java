public class App {

    public static void main(String[] args) throws Exception {
    Dugum d1=new Dugum(7);
    d1.yazdir();
    d1.setVeri(8);
    d1.yazdir();
    TBListe mylist=new TBListe();
    mylist.listele();
    mylist.basaEkle(5);
    mylist.basaEkle(10);
    mylist.sonaEkle(30);
    mylist.listele();
    Dugum d=new Dugum(50);
    mylist.basaEkle(d);
    Dugum dd=new Dugum(60);
    mylist.sonaEkle(dd);
    System.out.println("liste eleman sayisi: "+mylist.listeElemanSayisi());
    mylist.arayaEkle(70, 3);
    mylist.listele();
    int sil=70;
    int sonuc=mylist.elemaniSil(70);
    if(sonuc==0){
        System.out.println(sil+" listeden silindi");
    }
    else if(sonuc==-1){
        System.out.println(" liste boş!");
    }
    else if(sonuc==-2){
        System.out.println(sil+" listede bulunamadi");
    }
    mylist.listele();
    mylist.basaEkle(4);
    mylist.sonaEkle(4);
    mylist.arayaEkle(4,3);
    mylist.elemanSayi(4);








    }
}
