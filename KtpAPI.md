# **Dokumentasi API - Manajemen KTP Digital** 
### Dokumentasi ini berisi daftar endpoint untuk mengelola data KTP pada website Tugas CRUD.
___
**1. POST**
Menambahkan data penduduk baru ke dalam database. ID akan di-generate secara otomatis oleh sistem.

* **URL:** /api/ktp

* **Method:** POST

* **Header:** -

* **Content-Type:** application/json

**Request Body:**

**JSON**

{
  "nomorKtp": "3471010101050005",
  "namaLengkap": "Andi Wijaya",
  "alamat": "Jl. Malioboro",
  "tanggalLahir": "1995-08-20",
  "jenisKelamin": "Laki-laki"
}

**Hasil Sukses (200 OK):**

**JSON**

{
  "id": 2,
  "nomorKtp": "3471010101050005",
  "namaLengkap": "Andi Wijaya",
  "alamat": "Jl. Malioboro",
  "tanggalLahir": "1995-08-20",
  "jenisKelamin": "Laki-laki"
}
___

**2. GET**
Mendapatkan daftar seluruh data KTP yang tersimpan di dalam database.

* **URL:** /api/ktp

* **Method:** GET

**Hasil Sukses (200 OK):**

**JSON**

[
  {
    "id": 1,
    "nomorKtp": "3471140105050003",
    "namaLengkap": "Pradipta Pratama Putra",
    "alamat": "Berbah",
    "tanggalLahir": "2005-05-01",
    "jenisKelamin": "Laki-laki"
  },

  {
    "id": 2,
    "nomorKtp": "3471010101050005",
    "namaLengkap": "Andi Wijaya",
    "alamat": "Jl. Malioboro",
    "tanggalLahir": "1995-08-20",
    "jenisKelamin": "Laki-laki"
  }
]
___

**3. GET by ID**
Mendapatkan informasi detail satu KTP berdasarkan ID unik.

* **URL:** /api/ktp/{id}

* **Method:** GET

* **Path Variable:** id (Integer)

**Hasil Sukses (200 OK):**

**JSON**

{
  "id": 1,
  "nomorKtp": "3471140105050003",
  "namaLengkap": "Pradipta Pratama Putra",
  "alamat": "Berbah",
  "tanggalLahir": "2005-05-01",
  "jenisKelamin": "Laki-laki"
}
___

**4. PUT**
Memperbarui informasi data KTP yang sudah ada berdasarkan ID.

* **URL:** /api/ktp/{id}

* **Method:** PUT

**Request Body:**

**JSON**

{
  "nomorKtp": "3471010101050005",
  "namaLengkap": "Andi Wijaya Update",
  "alamat": "Jl. Malioboro",
  "tanggalLahir": "1995-08-20",
  "jenisKelamin": "Laki-laki"
}

**Hasil Sukses (200 OK):**

**JSON**

{
  "id": 2,
  "nomorKtp": "3471010101050005",
  "namaLengkap": "Andi Wijaya Update",
  "alamat": "Jl. Malioboro",
  "tanggalLahir": "1995-08-20",
  "jenisKelamin": "Laki-laki"
}
___

**5. DELETE**
Menghapus data KTP dari database berdasarkan ID.

* **URL:** /api/ktp/{id}

* **Method:** DELETE

**Hasil Sukses (204 No Content):**

(Body kosong, data berhasil dihapus)
