package nypproje;

public class Motor extends Arac {
	
	   public Motor(String plaka, double kapasite, double yakit,double hiz) {
		super(plaka,kapasite,yakit,hiz);
	}

	   @Override
	   public void teslimatYap(Musteri musteri, Paket paket) {
		   if(paket.getAgirlik()>10) { //Paket agirligi 10 kilogramdan fazlaysa hızı düsürür
			   System.out.println("Paket 10 kilogramdan agir. Hiz %20 azaliyor.");
			   hiz=hiz*0.80;
		    }
		   else {
			   System.out.println("Teslimat basariyla gerceklestiriliyor.");
		       //Musterinin konum degiskeninden mesafeHesapla metodunu cagirarak aracin gittiği mesafeyi hesaplar
			   double gidilenMesafe=musteri.getKonum().mesafeHesapla();
		       //Aracin gittigi mesafeye gore yakit tuketimi
		       yakitTuketim(gidilenMesafe);
		   }	 

}
}