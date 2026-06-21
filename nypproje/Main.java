package nypproje;
import java.util.ArrayList;
import java.lang.Exception;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		
		

        
        
        IKaydedici basitleştirilmişKaydedici = new SistemKaydedicisi(); 
        
        
        LojistikSistemi lojistikMerkezi = new LojistikSistemi(basitleştirilmişKaydedici);
        
       
        Musteri m1 = new Musteri("Ahmet Yılmaz", 1, new Konum(10, 20), false); 
        Musteri m2 = new Musteri("Ayşe Demir", 2, new Konum(30, 40), true);   
        Musteri m3 = new Musteri("Mehmet Kaya", 3, new Konum(50, 60), false); 
        
        lojistikMerkezi.musteriEkle(m1);
        lojistikMerkezi.musteriEkle(m2);
        lojistikMerkezi.musteriEkle(m3);
        
       
        
        Arac kamyon1 = new Kamyon("34KAM123", 500, 100, 60);
        Arac motor1 = new Motor("34MOT456", 50, 40, 80);
        Arac drone1 = new Drone("34DRN789", 5, 30, 40);
        
        lojistikMerkezi.aracEkle(kamyon1);
        lojistikMerkezi.aracEkle(motor1);
        lojistikMerkezi.aracEkle(drone1);
        
       
        Paket p1 = new Paket(3.0, "Akıllı Telefon", Durum.Hazirlaniyor,m1);
        Paket p2 = new Paket(12.0, "Büyük Televizyon", Durum.Hazirlaniyor,m2);
        Paket p3 = new Paket(8.5, "Dizüstü Bilgisayar", Durum.Hazirlaniyor,m3); 

        lojistikMerkezi.paketEkle(p1);
        lojistikMerkezi.paketEkle(p2);
        lojistikMerkezi.paketEkle(p3);
        
       
        lojistikMerkezi.similasyonuBaslat();
        
        
    }

		

	}


