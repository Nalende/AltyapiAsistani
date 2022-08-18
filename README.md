# AltyapiAsistani
v1.0.0
Haritacılık Faaliyetleri esnasında altyapı işlemlerinde kullandığımız hesaplamaları otomasyonlaştırdığım bir programcık. 
Bacalar arası boru döşerken nivo ile kotlama yaptığımızda her mesafe için ayrı bir enterpolasyon hesabı yapmamız gerekmekte 
ve bazı zamanlarda bu hesaplamaları yaparken dikkatsizlik sonucu hatalar elde etmekteyiz. İşte bunu önlemek maksadıyla basit bir otomasyon çalışmasıdır bu programcık.

NOT: Program "Boru üstü" Ve "Boru Altı" değerlerini "MİRADA OKUNACAK DEĞER" olarak vermektedir, Kot olarak DEĞİL!

Programın çalıştığı formül ise şu şekildedir;

Boru Üstü:   (((Aletkotu - (baca1 - (((baca1 - baca2)/bacamesafe)*Kaçıncı_Metredesin))) - borucapı))
Boru Altı:   (Aletkotu - (baca1 - (((baca1 - baca2)/bacamesafe)*Kaçıncı_Metredesin)))


****Değerler eksik girildiğinde yazan HATA yazısı değerleri girdikten sonra silinmiyor, Sonraki versiyonda düzeltilecektir.
****BU PROGRAM İLE YAPILAN ÇALIŞMALARIN HERHANGİ BİR YANLIŞ SONUÇ DOĞURMASI DURUMUNDA UYGULAMA VEYA ÜRETEN KİŞİ OLARAK ŞAHSIM SORUMLU DEĞİLDİR, 
LÜTFEN KENDİNİZ MANUEL OLARAK HESAPLAMALARI KONTROL EDİNİZ. 
**** Özellikle borunun ve bacanın cinsine bağlı olarak (gayrinizami dökülmüş baca betonu gibi durumlardan kaynaklı) sorunlar konusunda özellikle titiz davranmanızı hatırlatırız.

---herhangi bir konuda ulaşmak isterseniz 
İletişim : eminkepenek@gmail.com 
---adresinden ulaşabilirsiniz.  


Apk Download : https://github.com/Nalende/AltyapiAsistani/releases/tag/apk
