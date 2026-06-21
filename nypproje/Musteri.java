package nypproje;

public class Musteri {
	
	private String ad;
	private int id;
	private Konum konum;
	private boolean darSokakMi;
	
	public void setAd(String ad) {
		this.ad=ad;
	}
	public String getAd() {
		return ad;
	}
	public void setId(int id) {
		this.id=id;
	}
	public int getId() {
		return id;
	}
	public void setKonum(Konum konum) {
		this.konum=konum;
	}
	public Konum getKonum() {
		return konum;
	}
	public void setDarSokakMi(boolean darSokakMi) {
		this.darSokakMi=darSokakMi;
	}
	public boolean getDarSokakMi() {
		return darSokakMi;
	}
	public Musteri(String ad, int id, Konum konum, boolean darSokakMi) {
		this.ad=ad;
		this.id=id;
		this.konum=konum;
		this.darSokakMi=darSokakMi;
		
	}
	

}
