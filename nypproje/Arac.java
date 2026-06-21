package nypproje;

public abstract class Arac {
	private String plaka;
	private double kapasite;
	protected double yakit;
	protected double hiz;
	
	public void setPlaka(String plaka) {
		this.plaka=plaka;
	}
	public String getPlaka() {
		return plaka;
	}
	public void setKapasite(double kapasite) {
		this.kapasite=kapasite;
	}
	public double getKapasite() {
		return kapasite;
	}
	public void setYakit(double yakit) {
		this.yakit=yakit;
	}
	public double getYakit() {
		return yakit;
	}
	public void setHiz(double hiz) {
		this.hiz=hiz;
	}
	public double getHiz() {
		return hiz;
	}
	
	public Arac(String plaka, double kapasite, double yakit, double hiz) {
		this.plaka=plaka;
		this.kapasite=kapasite;
		this.yakit=yakit;
		this.hiz=hiz;
	}
	//Her aracin kisitlamasi farkli oldugu icin abstract yazilan metot
	//throws Exception metodun hata üretebilecegini bildirir
	public abstract void teslimatYap(Musteri musteri, Paket paket) throws Exception; 
	
	//Yakit sifirlandiginda yakıtı doldurur
	public void yakitIkmal() {
		System.out.println("Yakit ikmali yapiliyor...");
		yakit=100.0;
	}
	
	//Gidilen mesafe kadar yakiti dusurur yakit bittiğinde yakitIkmal metodunu cağirir
	public void yakitTuketim(double mesafe) {
		yakit=yakit-mesafe;
		
		if(yakit<=0.0) {
			yakitIkmal();
		}
		
	}
	
		
	
	
}


