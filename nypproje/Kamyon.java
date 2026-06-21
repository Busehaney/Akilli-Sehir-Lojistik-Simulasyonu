package nypproje;

public class Kamyon extends Arac {
	
	public Kamyon(String plaka, double kapasite, double yakit,double hiz) {
		super(plaka,kapasite,yakit,hiz);
	}

	@Override
	public void teslimatYap(Musteri musteri,Paket paket) throws Exception{
		if(musteri.getDarSokakMi()== true) {//Musteri dar sokaktaysa uyari verir
			throw new Exception("Kamyon dar sokaga giremez. Teslimat yapilamiyor.");
		}
		else {
			System.out.println("Teslimat yapiliyor.");
			//Musterinin konum degiskeninden mesafeHesapla metodunu cagirarak aracin gittiği mesafeyi hesaplar
		    double gidilenMesafe=musteri.getKonum().mesafeHesapla();
		    //Aracin gittigi mesafeye gore yakit tuketimi
	        yakitTuketim(gidilenMesafe);
		} 
	     
	     
	}
      


}
