# 🏦 Bank Queue Console App (Java)

## 📌 Description

This is a simple Java console application that simulates a basic bank queue system.  
The user is prompted to enter a Turkish ID Number (**TCKN**), and after validation, the system assigns a random queue number between 0 and 99.

---

## 🧾 Contents

The application consists of two main classes:

### 1. `Queue` Class

This class is responsible for validating the TCKN input and generating the queue number.

**Fields:**
- `Long id` : (Reserved for possible future extension)
- `String homeTown` : (Reserved for future use)
- `String tckn` : Stores the Turkish ID number
- `boolean control` : Internal flag used during validation

**Methods:**
- `setTckn(String tckn)` : Validates the TCKN, and if valid, generates a queue number
- `printScreen(String text)` : Utility method for displaying messages on the screen

---

### 2. `Machine` Class (Main Class)

This is where the application starts and interacts with the user.

**Flow:**
1. Displays a welcome message
2. Prompts the user to enter a TCKN
3. Passes the TCKN to the `Queue` object for validation and processing
4. Shows the result on the screen

---

## 🖥️ Example Usage

```
Welcome to Bank Queue App
Please Enter TCKN Number : 12345678901
Your Queue Num : 42
```

---

## 📌 Açıklama (Türkçe)

Bu proje, kullanıcıdan alınan **TC kimlik numarasını** kontrol ederek ona rastgele bir sıra numarası veren basit bir **Java konsol uygulamasıdır**.

---

## 🧾 İçerik

Uygulama iki ana Java sınıfından oluşur:

### 1. `Queue` Sınıfı

Kullanıcının TCKN girişini doğrular ve geçerliyse rastgele bir sıra numarası üretir.

**Alanlar:**
- `Long id` : (İleride kullanılmak üzere rezerve edilmiştir)
- `String homeTown` : (İleride kullanılmak üzere rezerve edilmiştir)
- `String tckn` : TC Kimlik numarası
- `boolean control` : Doğrulama işlemlerinde kullanılan kontrol değişkeni

**Yöntemler:**
- `setTckn(String tckn)` : Girilen TCKN’yi kontrol eder, geçerliyse sıra numarası oluşturur
- `printScreen(String text)` : Konsola mesaj yazdırmak için kullanılır

---

### 2. `Machine` Sınıfı (Ana Sınıf)

Uygulamanın başladığı ve kullanıcı ile etkileşimin sağlandığı kısımdır.

**Akış:**
1. Kullanıcıya hoş geldiniz mesajı gösterilir
2. TC kimlik numarası girmesi istenir
3. Girilen numara `Queue` sınıfına gönderilir
4. Sonuç kullanıcıya gösterilir

---

## 🖥️ Örnek Kullanım

```
Welcome to Bank Queue App
Please Enter TCKN Number : 12345678901
Your Queue Num : 42
```

---

## 🖼️ Screenshots / Ekran Görüntüleri

> Add terminal screenshots below:

![Görüntü 7-29-25 ÖÖ 11 09](https://github.com/user-attachments/assets/ac42852a-94e0-4f8e-b2de-f13a7d337032)

![Görüntü 7-29-25 ÖÖ 11 10](https://github.com/user-attachments/assets/e717c7b2-6a8a-4ad5-ad68-75f0fce8be66)

![Görüntü 7-29-25 ÖÖ 11 10 (1)](https://github.com/user-attachments/assets/26034901-4076-4ffc-8b24-e9e96ea6f9ab)

---

## 🛠️ Technologies Used / Kullanılan Teknolojiler
- Java 17+
- Java Scanner
- Java Random

---

## 📁 Project Structure / Proje Yapısı

```
Machine/
├── Machine.java      # Main class, handles user input and startup
├── Queue.java        # Handles TCKN validation and queue generation
```

---
