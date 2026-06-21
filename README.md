# [cite_start]Akıllı Şehir Lojistik ve Dağıtım Simülasyonu 🚚📦 [cite: 2]

[cite_start]Bu proje, Nesneye Yönelik Programlama (NYP) prensipleri (Kalıtım, Polimorfizm, Soyutlama, Kapsülleme) kullanılarak gerçek dünya lojistik problemlerine çözüm üretmek amacıyla Java dilinde geliştirilmiş bir simülasyon motorudur[cite: 4, 5, 7].

## 🚀 Proje Amacı
[cite_start]Bir şehrin dinamik lojistik ağını yönetmek, gelen paketleri sırasıyla (FIFO) işlemek ve araçların (Kamyon, Motosiklet, Drone) kapasite, hız ve rota kısıtlamalarına göre dağıtım simülasyonunu gerçekleştirmektir[cite: 5, 13, 14, 19].

## 🛠️ Teknik Gereksinimler & Mimari
- [cite_start]**Programlama Dili:** Java (Standart kütüphaneler kullanılmıştır)[cite: 7, 10].
- [cite_start]**İsimlendirme Standartı:** Akademik isterler doğrultusunda tüm değişken ve metot isimleri Türkçe olarak kurgulanmıştır (Örn: `MesafeHesapla`, `DarSokakMi`)[cite: 8, 13].
- [cite_start]**Hata Yönetimi:** Sistem genelinde beklenmedik durumlar için `try-catch` blokları ve özel exception yapıları kullanılmıştır[cite: 9, 16].

### [cite_start]Sınıf Yapısı [cite: 12, 13]
- [cite_start]**Konum:** x ve y koordinatlarını tutar, `MesafeHesapla()` metodu içerir[cite: 13].
- [cite_start]**Musteri:** Ad, ID, Konum ve `DarSokakMi` (boolean) bilgisini barındırır[cite: 13].
- [cite_start]**Paket:** Ağırlık, İçerik ve Durum (Hazırlanıyor, Yolda, Teslim Edildi) takibini yapar[cite: 13].
- **Arac (Abstract):** Plaka, Kapasite, Yakıt ve Hız özelliklerini barındıran; [cite_start]`TeslimatYap()` soyut metoduna sahip temel sınıftır[cite: 13].
  - [cite_start]*Türetilen Sınıflar:* Kamyon, Motor, Drone[cite: 13].
- [cite_start]**LojistikSistemi:** Müşteri/araç listelerini ve `ArrayList` tabanlı FIFO Paket Kuyruğunu yöneten ana merkezdir[cite: 13, 19].

## [cite_start]🛑 Simülasyon İş Kuralları (Kısıtlar) [cite: 14]
Simülasyon motoru, gerçekçi lojistik senaryolarını test etmek adına şu zorunlu kısıtları işletmektedir:
1. [cite_start]**Kamyon Kısıtı:** Müşterinin adresi dar sokak (`DarSokakMi == true`) ise kamyon teslimat yapamaz ve hata mesajı verir[cite: 15].
2. **Drone Kısıtı:** Drone'lar en fazla 5 kg paket taşıyabilir. [cite_start]Bu sınır aşılırsa `AgirPaketException` fırlatılır[cite: 16].
3. [cite_start]**Motosiklet Kısıtı:** Paket ağırlığı 10 kg üzerindeyse motosiklet hızı otomatik olarak %20 azalır[cite: 17].
4. **Yakıt Yönetimi:** Araçlar katettikleri mesafe oranında yakıt tüketir. [cite_start]Yakıt tükendiğinde `YakitIkmal()` metodu tetiklenir[cite: 18].
5. [cite_start]**Kuyruk Mantığı:** Paketler sisteme giriş sırasına göre (FIFO) kuyruktan çekilerek sırayla dağıtılır[cite: 19].

## 💻 Nasıl Çalıştırılır?
Proje klasörünü herhangi bir Java IDE'sine (IntelliJ IDEA, Eclipse, VS Code vb.) aktardıktan sonra ana sınıfı çalıştırarak simülasyon test senaryolarını izleyebilirsiniz.lasyonu
