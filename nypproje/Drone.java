package nypproje;

public class Drone extends Arac {
	
	public Drone(String plaka, double kapasite, double yakit,double hiz) {
		super(plaka,kapasite,yakit,hiz);
	}

	@Override
	
	public void teslimatYap(Musteri musteri,Paket paket) throws AgirPaketException{
	   //Paket 5 kilogramdan agir olursa AgirPaketException hatasi firlatir	
		if(paket.getAgirlik()>5) {
			throw new AgirPaketException("Paket 5 kg den agir olamaz. Teslimat yapilamiyor.");
			
		}
		else {
			System.out.println("Teslimat yapiliyor...");
			//Musterinin konum degiskeninden mesafeHesapla metodunu cagirarak aracin gittiği mesafeyi hesaplar
		    double gidilenMesafe=musteri.getKonum().mesafeHesapla();
		    //Aracin gittigi mesafeye gore yakit tuketimi
	        yakitTuketim(gidilenMesafe);
		} 
		
	}


}
