# Email Administration Application

Selamat datang di Email Administration Application, sebuah aplikasi Java yang dirancang khusus untuk mempermudah proses pembuatan akun email bagi karyawan baru dalam perusahaan Anda. Sebagai seorang spesialis administrator dukungan IT, Anda dapat dengan mudah menggunakan aplikasi ini untuk mengelola dan mengatur berbagai parameter email.
![Screenshot from 2024-01-13 01-34-44](https://github.com/saidhafiz321/Email-Administration-Application/assets/85662790/f7d486a2-0055-4e8d-9904-ede359f7937f)


## Fitur Utama

### 1. Pembuatan Email Otomatis
Aplikasi ini dapat menghasilkan alamat email dengan sintaks berikut:
```
namadepan.namabelakang@departemen.perusahaan.com
```
Departemen dapat ditentukan (penjualan, pengembangan, akuntansi), namun jika tidak ada, akan secara otomatis dikosongkan.

### 2. Pembuatan Kata Sandi Otomatis
Aplikasi secara otomatis menghasilkan kata sandi yang aman dan unik untuk setiap akun email. Kata sandi ini dapat diubah kapan pun oleh pengguna.

### 3. Manajemen Kata Sandi
Aplikasi menyediakan beberapa metode untuk mengubah kata sandi dengan mudah sesuai kebutuhan pengguna.

### 4. Pengaturan Kapasitas Kotak Surat
Pengguna dapat mengatur kapasitas kotak surat mereka sendiri dengan menggunakan metode yang disediakan oleh aplikasi.

### 5. Alamat Email Alternatif
Pengguna dapat mendefinisikan alamat email alternatif untuk keamanan tambahan dan penerimaan pemberitahuan.

### 6. Informasi Karyawan
Aplikasi menyediakan metode untuk menampilkan informasi penting seperti nama karyawan, alamat email, dan kapasitas kotak surat.

## Cara Penggunaan

### Langkah 1: Pembuatan Akun Email
Panggil metode pembuatan akun email dengan menyertakan nama depan, nama belakang, dan departemen (jika ada).

```java
EmailAdministrator.createEmailAccount("John", "Doe", "pengembangan");
```

### Langkah 2: Manajemen Akun Email
Pengguna dapat dengan mudah mengelola akun email dengan menggunakan metode yang tersedia, seperti mengganti kata sandi atau mengatur kapasitas kotak surat.

```java
EmailAdministrator.changePassword("john.doe@pengembangan.perusahaan.com", "newPassword123");
EmailAdministrator.setMailboxCapacity("john.doe@pengembangan.perusahaan.com", 500);
```

### Langkah 3: Menampilkan Informasi Karyawan
Untuk melihat informasi karyawan, panggil metode sebagai berikut:

```java
EmailAdministrator.displayEmployeeInfo("john.doe@pengembangan.perusahaan.com");
```

## Keamanan
Aplikasi ini dirancang dengan memperhatikan keamanan data, dan kata sandi dienkripsi sebelum disimpan.

**Catatan:** Pastikan untuk mengganti kata sandi default segera setelah akun dibuat.

Gunakan Email Administration Application untuk mengoptimalkan proses pembuatan dan pengelolaan akun email karyawan. Jika Anda memiliki pertanyaan atau saran, jangan ragu untuk menghubungi tim dukungan IT. Terima kasih telah menggunakan aplikasi ini!
