# AltyapiAsistani
<br><h2>v1.0</h2><br>
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

<br><h2>v1.1</h2><br>
*** Kaybolmayan hata yazısı düzeltildi.
*** İfade edilen kotların yanlış anlaşılıp hesaplanmaması için ifadeler düzenlendi (ör: baca kotu yerine boru altı gibi)
*** Santimetreden düşük değerleri aşağı yuvarlarken artık 0.5 den büyükleri yukarıya, düşükleri ise aşağı yuvarlamakta. 


<br><h2>Herhangi bir konuda ulaşmak isterseniz </h2><br>
İletişim : eminkepenek@gmail.com 
---adresinden ulaşabilirsiniz.  


Apk Download : https://github.com/Nalende/AltyapiAsistani/releases/tag/V1.1


<br><br><br><br><br><br><br>


//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
<br><br><br><br><br><br><br>

It is a program that I automate the calculations we use in infrastructure operations during Survey Activities. When laying pipes between the chimneys, when we come to the same level with the level, we need to make separate interpolation calculations for each distance, and sometimes we get careless errors while making these calculations. To avoid this, this program is a simple automation work.
NOTE: The program gives the "Above Pipe" and "Under Pipe" values as "​VALUE TO BE READ ON THE NIVO DEVICE​", NOT as a level!

 ****I AM NOT RESPONSIBLE AS THE APPLICATION OR THE MANUFACTURER IF THE WORK DONE WITH THIS PROGRAM IS GIVEN INCORRECTLY, PLEASE MANUALLY CHECK THE ACCOUNTS YOURSELF. **** We remind you to be particularly meticulous about problems (caused by situations such as unevenly poured chimney concrete), especially depending on the type of pipe and chimney.



<br><h2>v1.1</h2><br>

*** Fixed bug text not disappearing. *** Expressions have been adjusted so that the expressed levels are not misunderstood and calculated (eg below the pipe instead of the chimney level).


If you want to reach any subject

Email : eminkepenek@gmail.com

Apk Download : https://github.com/Nalende/AltyapiAsistani/releases/tag/V1.1
