package nypproje;

public class Paket {
	private double agirlik;
	private String icerik;
	private Durum durum;
	private Musteri musteri;
	
	
	public void setAgirlik(double agirlik) {
		this.agirlik=agirlik;
	}
	public double getAgirlik() {
		return agirlik;
	}
	public void setIcerik(String icerik) {
		this.icerik=icerik;
	}
	public String getIcerik() {
		return icerik;
	}
	public void setDurum(Durum durum) {
		this.durum=durum;
	}
	public Durum getDurum() {
		return durum;
	}
	
	public void setMusteri(Musteri musteri) {
		this.musteri=musteri;
	}
	
	public Musteri getMusteri() {
        return musteri;
    }
	
	
	public Paket(double agirlik, String icerik, Durum durum,Musteri musteri) {
		this.agirlik=agirlik;
		this.icerik=icerik;
		this.durum=durum;
		this.musteri=musteri;
		
	}

}
