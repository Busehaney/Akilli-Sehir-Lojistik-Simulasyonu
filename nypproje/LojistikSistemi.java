package nypproje;
import java.util.ArrayList;

public class LojistikSistemi {
	
	private IKaydedici kaydedici;
	
	ArrayList<Musteri> musteriListesi = new ArrayList<>();
	ArrayList<Arac> aracListesi= new ArrayList<>();
	ArrayList<Paket> paketKuyrugu= new ArrayList<>();
	
		
	public void setKaydedici(IKaydedici kaydedici) {
		this.kaydedici=kaydedici;
	}
	public IKaydedici getKaydedici() {
		return kaydedici;
	}
	public LojistikSistemi(IKaydedici kaydedici) {
		this.kaydedici=kaydedici;
	}
	public void musteriEkle(Musteri yeniMusteri) { // Yeni musteri ekleyip isim ve id bilgisi gosteren metot 
		this.musteriListesi.add(yeniMusteri);
		kaydedici.kayit("Yeni musteri eklendi: "+ yeniMusteri.getAd()+"||"+yeniMusteri.getId());
	}
	public void aracEkle(Arac yeniArac) { // Yeni arac ekleyip aracin plaka bilgisini gosterir
		this.aracListesi.add(yeniArac);
		kaydedici.kayit("Yeni arac eklendi. Plaka: "+yeniArac.getPlaka());
	}
	public void paketEkle(Paket yeniPaket) { //Yeni paket ekleyip paketin icerik bilgisini gosterir
		this.paketKuyrugu.add(yeniPaket);
		kaydedici.kayit("Yeni paket eklendi: "+ yeniPaket.getIcerik());
	}
	
	public void similasyonuBaslat() throws Exception{
	int aracSayaci=0;
	
	//Dizide paket oldugu sürece similasyon devam edecek
	while(paketKuyrugu.size()>0) {
		
		Paket mevcutPaket = paketKuyrugu.remove(0); //Ilk giren paketi daha once cikarir(FIFO)
		Musteri musteri = mevcutPaket.getMusteri(); //Her paketin bir musterisi var(kompozisyon ilişkisi)
		Arac secilenArac = aracListesi.get(aracSayaci);//Sayaca gore arac listesinden siradaki araci secer
		aracSayaci++;
		
		if (aracSayaci == aracListesi.size()) { //Son araca ulasinca dongu basa doner
	        aracSayaci = 0;
	    }
		
		try {
			secilenArac.teslimatYap(musteri, mevcutPaket); // Hata aranan kisim
			mevcutPaket.setDurum(Durum.Teslim_Edildi); // Hata bulunmazsa paketin durumunu teslim edildiye cevirir 
			kaydedici.kayit("Teslimat Basarili!");
		}
		catch(AgirPaketException e){ // Ağir paket hatasi yakalarsa uyari verir
			kaydedici.kayit("HATA: "+ e.getMessage());
		}
		catch(Exception e) { // Dar sokak hatasi alirsa uyari verir
			kaydedici.kayit("HATA: "+ e.getMessage());
		}
		finally {
			kaydedici.kayit("Paket Basariyla Teslim Edildi");
		}
	}
	}
	
	
	
	

	

}
