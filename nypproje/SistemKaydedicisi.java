package nypproje;

public class SistemKaydedicisi implements IKaydedici {

	@Override
	//Sistem uyarilarini veren metot 
	public void kayit(String mesaj) {
		System.out.println("Sistem uyarisi:"+ mesaj);
		
	}

}
