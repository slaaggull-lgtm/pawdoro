# 🐾 Pawdoro

**Odaklanmayı önceliklendiren, oyunlaştırılmış bir çalışma arkadaşı uygulaması — Pomodoro seansları, bir Study Buddy ve sıcak bir sanal kütüphane; 5 kişilik ekip ve AI destekli bir iş akışıyla geliştiriliyor.**

![Durum](https://img.shields.io/badge/durum-geli%C5%9Ftirme%20a%C5%9Famas%C4%B1nda-yellow)
![Backend](https://img.shields.io/badge/backend-Spring%20Boot%203-6DB33F?logo=springboot&logoColor=white)
![Veritabanı](https://img.shields.io/badge/veritaban%C4%B1-PostgreSQL%2016-336791?logo=postgresql&logoColor=white)
![Android](https://img.shields.io/badge/android-Kotlin%20%2F%20Jetpack%20Compose-3DDC84?logo=android&logoColor=white)
![Java](https://img.shields.io/badge/Java-21-orange?logo=openjdk&logoColor=white)
![Lisans](https://img.shields.io/badge/lisans-yay%C4%B1nlanmad%C4%B1-lightgrey)

---

## 📖 Pawdoro Nedir?

Pawdoro, çalışırken kendini yalnız ve mekanik hissetmek istemeyen öğrenciler için tasarlanmış bir mobil çalışma/verimlilik uygulamasıdır. Klasik bir **Pomodoro sayacını**, kişiselleştirilebilir bir **insan avatarı** ve seçilebilir bir hayvan **Study Buddy** (kedi, tavşan, tilki, panda, koala...) ile birleştirir; ilerlemeyi bir **XP / Level / Streak** sistemiyle ödüllendirir ve kullanıcıların arkadaşlarıyla birlikte, dikkat dağıtan bir sohbet penceresi olmadan çalışabileceği sakin, kitaplık atmosferli **sanal çalışma odaları** sunar.

**Hedef kullanıcı:** günlük çalışma alışkanlığından uzun soluklu sınav hazırlığına (örn. üniversite sınavı) kadar geniş bir yelpazede, nazik bir sorumluluk hissi, yalnız çalışırken bile bir arkadaşlık hissi ve zaman içinde görünür/ödüllendirici bir ilerleme isteyen öğrenciler.

**Tasarım felsefesi:** premium ve minimalist bir **pastel** görsel kimlik, loş/gece kütüphane atmosferi, yumuşak geçişler ve uzun çalışma seansları için pil dostu statik/OLED mod — çalışmayı bölmeyecek kadar sakin bir deneyim.

> Bu README, ürünün **tüm vizyonunu** anlatır. Aşağıdaki [Proje Durumu](#-proje-durumu) bölümü, bugün gerçekten neyin tamamlandığını ve neyin planlandığını net şekilde belirtir.

---

## ✨ Özellik Özeti

### 🎨 Görsel Kimlik ve Pil Optimizasyonu
- Gözü yormayan, mat ve dinlendirici Minimalist Pastel tasarım dili
- Yumuşak geçişli açık/koyu tema desteği
- Uzun ekran açık kalma sürelerinde pil tüketimini azaltan OLED/statik mod

### 🧑‍🎓🐱 Study Buddy ve İnsan Avatarı
- Kullanıcıyı temsil eden, kişiselleştirilebilir insan avatarı
- Seçilebilir hayvan Study Buddy (kedi, tavşan, tilki, panda, koala vb.)
- Çalışma durumuna göre değişen animasyonlar ve mimikler (birlikte not alma, dinlenme, kahve içme)

### ⏱️ Pomodoro, Sıkı Odaklanma Modu ve Çevrimdışı Çalışma
- Özelleştirilebilir sayaç (25 / 40 / 50 / 60 dakika veya serbest süre)
- **Strict Focus Mode**: seans sırasında uygulamadan çıkılırsa oturum "Interrupted" olarak işaretlenir
- Esnek mola mantığı — bir sonraki seans otomatik başlamaz
- **Offline-first**: Pomodoro internetsiz çalışır, bağlantı geldiğinde veriler senkronize olur

### 📚 Ders ve Sınav Sayacı
- Ders ekleme/düzenleme/silme, derslere özel renk ve ikon
- Ders bazlı toplam çalışma süresi ve son çalışma zamanı
- Yaklaşan sınavlar için canlı geri sayım kartı ("Sınava 120 gün kaldı")

### 🎯 Hedef ve Günlük Ödül Sistemi
- Günlük/haftalık hedef belirleme ve ilerleme çubuğu
- Hedefini tamamlayan kullanıcılara günlük **Gizemli Kutu** ödülü

### ⭐ Streak Sistemi
- Duolingo tarzı günlük çalışma serisi, klasik ateş yerine özgün "takımyıldız/sihirli yıldız" ikonu
- **Streak Freeze** koruması ve streak bazlı rozetler

### ✨ XP ve Seviye Sistemi
- Çalışma süresine göre XP kazanımı, seviye ilerleme çubuğu ve seviye atlama animasyonu
- Seviyeye göre açılan yeni ödüller

### 🛍️ Rozet, Mağaza ve Sezonluk Aksesuarlar
- Başarı, streak ve ders bazlı özel rozetler
- Avatar, Study Buddy ve masa için kozmetik mağazası
- Yılbaşı, Cadılar Bayramı, Bahar gibi sınırlı süreli sezonluk koleksiyonlar

### 🪑 Çalışma Odaları ve Canlı Etkileşim
- Kod/link ile katılınan özel odalar (5 kişiye kadar) ve genel kütüphane odası (15 kişiye kadar)
- Gece/gündüz/loş kütüphane atmosferi, masa lambası aydınlatması
- Lo-fi müzik, yağmur sesi ve kütüphane ortam sesi seçenekleri

### 👥 Sosyal Özellikler
- **Buddy Call**: tek tıkla gönderilen hazır mesaj baloncukları ("Masaya geçiyorum, sen de gel!")
- **Silent Presence**: bildirim göndermeyen mikro etkileşimler — Sessiz Alkış 👏, Omuz Dürt 🤜🤛, Kahve Ismarla ☕
- Arkadaş ekleme/kabul/silme ve yalnızca arkadaş grubuna özel haftalık sıralama (global sıralama yok)

### 📊 İstatistik ve AI Analiz
- Günlük/haftalık çalışma grafikleri, toplam süre, en çok çalışılan ders, tamamlanan Pomodoro sayısı
- **AI Study Insights**: kişiselleştirilmiş verim analizi (örn. "En yüksek odağı 09:00-11:00 arasında yakalıyorsun")
- Tam çalışma geçmişi kaydı

### 👤 Profil, Bildirimler, Onboarding ve Ayarlar
- Avatar, Buddy, level, XP, streak, sınav geri sayımı ve istatistik özetini içeren profil
- Pomodoro tamamlanma, günlük hedef, streak hatırlatma ve Buddy Call bildirimleri
- Onboarding akışı: karşılama, avatar/Buddy oluşturma, hedef belirleme, ders ekleme
- Hesap, odaklanma, görünüm, ses ve gizlilik ayarları

### 🔒 Güvenlik ve Hile Önleme
- Tek cihazda oturum kontrolü (paralel sayaç başlatma engeli)
- İnsani olmayan, aralıksız çalışma sürelerinin otomatik tespiti
- Arkadaş sıralamasının adil kalması için süre doğrulama kontrolleri
- Özel odalar için davet kodu/link koruması
- Kullanıcı bilgilerinin ve çalışma geçmişinin güvenli saklanması

---

## 🚧 Proje Durumu

Pawdoro, 5 kişilik bir ekip tarafından, her üyenin kendi alanında AI araçlarıyla kod, tasarım ve içerik ürettiği **16 haftalık bir roadmap** üzerinden geliştiriliyor.

### ✅ Tamamlananlar (1. Hafta — Backend İskeleti)
- Spring Boot 3 + PostgreSQL proje iskeleti (`pawdoro-backend`)
- Ortam değişkenleriyle yapılandırılan, çalışır durumdaki uygulama
- Sağlık/durum kontrol uçları (`/actuator/health`, `/api/v1/ping`)
- `docker-compose` ile yerel PostgreSQL kurulumu
- Temel test altyapısı (`PingControllerTest`)

### 🔜 Planlanan Özellikler
Yukarıda anlatılan diğer her şey — domain entity'leri, JWT ile kimlik doğrulama, Android ekranları, avatar/Buddy sistemi, Pomodoro mantığı, ders ve sınav sistemi, hedef/gizemli kutu, streak, XP/level, mağaza, çalışma odaları, sosyal özellikler, istatistikler, AI Insights, bildirimler, onboarding, ayarlar ve tam hile önleme sistemi — **planlanmış** durumdadır ve aşağıdaki roadmap'e göre kademeli olarak geliştirilecektir. Bunların hiçbiri şu an kod tabanında bulunmamaktadır.

---

## 🏗️ Teknoloji ve Mimari

| Katman | Teknoloji |
|---|---|
| Backend | Java 21, Spring Boot 3 (Web, Data JPA, Validation, Actuator, Security planlanıyor) |
| Veritabanı | PostgreSQL 16+ |
| Mobil (Android) | Kotlin, Jetpack Compose, Retrofit, Room (offline önbellek) |
| Tasarım | Figma, Illustrator/Inkscape/Canva |
| AI ile üretilen görseller | Midjourney / DALL·E 3 / Ideogram / Recraft.ai |
| Gerçek zamanlı (planlanan) | WebSocket (çalışma odaları, canlı durum) |
| Kimlik doğrulama (planlanan) | Spring Security + JWT |
| Araçlar | IntelliJ IDEA, Android Studio, Postman/Bruno, Git & GitHub |

## 📁 Depo Yapısı (backend, mevcut durum)

```
pawdoro-backend/
├── docker-compose.yml              # Geliştirme için yerel PostgreSQL
├── pom.xml                         # Maven yapılandırması
├── src/
│   ├── main/
│   │   ├── java/com/pawdoro/backend/
│   │   │   ├── PawdoroBackendApplication.java
│   │   │   ├── controller/PingController.java
│   │   │   └── dto/StatusResponse.java
│   │   └── resources/
│   │       ├── application.properties
│   │       └── application-dev.properties
│   └── test/
│       └── java/com/pawdoro/backend/controller/PingControllerTest.java
├── README.md
└── README_TR.md
```

## 🚀 Başlarken (Backend)

**Gereksinimler:** JDK 21, Maven (veya dahili wrapper), Docker (yerel PostgreSQL için).

```bash
# 1. Yerel PostgreSQL'i başlat
docker compose up -d

# 2. Backend'i çalıştır (varsayılanlar docker-compose.yml ile uyumludur)
./mvnw spring-boot:run

# 3. Çalıştığını doğrula
curl http://localhost:8080/api/v1/ping
curl http://localhost:8080/actuator/health
```

Bağlantı ayarları `DB_URL`, `DB_USERNAME`, `DB_PASSWORD`, `SERVER_PORT` ortam değişkenleriyle değiştirilebilir.

## 👥 Ekip Rolleri

| Rol | Sorumluluk |
|---|---|
| 🖥️ Backend AI Yöneticisi | Java/Spring Boot kodu, PostgreSQL entity'leri, JWT güvenliği, hile önleme mantığı |
| 📱 Android AI Yöneticisi | Kotlin/Compose ekranları, Retrofit entegrasyonu, offline Room veritabanı |
| 🎨 UI/UX & Görsel AI Yöneticisi | Pastel paletler, avatar/Buddy görselleri, oda atmosferleri, ikon setleri |
| ⭐ Gamification AI Yöneticisi | XP, Level, Streak, Gizemli Kutu, mağaza mantığı, sosyal/sıralama kuralları |
| 📅 QA, Analytics & Flow Yöneticisi | Kullanıcı akışları, AI Insights prompt/algoritmaları, test senaryoları, hata takibi |

Her rol, kendi alanındaki kodu, tasarımı ve içeriği üretmek/geliştirmek için AI araçlarıyla (Claude, ChatGPT, Cursor, Midjourney vb.) çalışır ve çıktıyı ortak projeye entegre eder.

## 🗺️ 16 Haftalık Roadmap

| Hafta | Odak |
|---|---|
| 1 | ✅ İskelet kurulumu (Spring Boot + PostgreSQL, Compose projesi, tasarım sistemi, gamification kuralları dokümanı, kullanıcı akışları) |
| 2 | Temel yapı taşları: entity'ler, temel ekranlar, Figma tasarımları, XP ikon seti |
| 3 | Login / Register / JWT kimlik doğrulama |
| 4 | İnsan avatarı ve Study Buddy seçimi |
| 5 | Ders sistemi ve sınav sayacı |
| 6 | Pomodoro sayacı ve Strict Focus Mode |
| 7 | Haftalık program oluşturma |
| 8 | Program + Pomodoro entegrasyonu |
| 9 | Dashboard (ana sayfa) |
| 10 | Gamification: XP, Level, Streak & Streak Freeze |
| 11 | Hedef, ödül, Gizemli Kutu & mağaza |
| 12 | İstatistikler ve offline-first senkronizasyon |
| 13 | Arkadaş sistemi ve haftalık sıralama |
| 14 | Çalışma odaları ve canlı etkileşim |
| 15 | AI Insights, güvenlik ve ayarlar |
| 16 | 🔴 Hata düzeltme ve QA turu (yeni özellik eklenmez) |

---

*Bu doküman, ekibin planlama materyallerindeki ürün vizyonunu yansıtır. Özellik durumu, geliştirme ilerledikçe güncel tutulur — bugün gerçekten teslim edilenler için [Proje Durumu](#-proje-durumu) bölümüne bakın.*
