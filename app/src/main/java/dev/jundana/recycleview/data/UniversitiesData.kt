package dev.jundana.recycleview.data

import dev.jundana.recycleview.R
import dev.jundana.recycleview.model.Universities

internal object UniversitiesData {
    private val universitiesName = arrayOf(
        "Institut Teknologi Bandung",
        "Universitas Gadjah Mada",
        "Institut Pertanian Bogor",
        "Institut Teknologi Sepuluh Nopember",
        "Universitas Indonesia",
        "Universitas Diponegoro"
    )

    private val universitiesInfo = arrayOf(
        "Dengan skor 3.671 – klaster 1. Peringkat universitas terbaik di Indonesia dipegang ITB, singkatan dari Institut Teknologi Bandung. PTN di Bandung ini layak menjadi institut terbaik di Indonesia yang bergerak di bidang pengembangan teknik dan sains. ITB didirikan sejak tahun 1959 dan mampu mempertahankan kualitas sebagai salah satu yang termasuk daftar PTN terbaik di Indonesia.",
        ("Dengan skor 3.594 – klaster 1. Urutan universitas terbaik di Indonesia selanjutnya adalah Universitas Gajah Mada atau biasa disingkat UGM. Kampus UGM terletak di Yogyakarta dan sudah didirikan sejak tahun 1949. UGM memang konsisten menempati posisi 1 daftar universitas terbaik di Indonesia. Dengan statusnya sebagai PTN."),
        ("Dengan skor 3.577 – klaster 1. Sama seperti ITB, Institut Pembangunan Bogor adalah perguruan tinggi berbentuk institut yang berada di provinsi Jawa Barat, tepatnya di kota Bogor. IPB lebih berfokus di bidang pertanian, meski banyak juga jurusan non-agragris. IPB konsisten masuk dalam daftar universitas terbaik di Indonesia di peringkat 10 besar."),
        ("Dengan skor 3.462 – klaster 1. Tak lengkap membahas daftar ranking universitas di Indonesia terbaru tanpa memasukkan universitas di Surabaya. Singkatan dari ITS adalah Institut Teknologi Sepuluh Nopember dan terletak di daerah Sukolilo, Surabaya. Pertama didirikan di tahun 1957, ITS berfokus untuk mengembangkan bidang teknologi dan maritim Indonesia."),
        ("Dengan skor 3.401 – klaster 1. Berikutnya dalam daftar perguruan tinggi terbaik di Indonesia adalah Universitas Indonesia atau UI. Letaknya berada di perbatasn kota Depok dan Jakarta, namun sering dianggap sebagai universitas di Jakarta. Kampus negeri di Jakarta ini pertama didirikan di tahun 1849. UI juga pernah beberapa kali menempati peringkat 1 list universitas terfavorit di Indonesia dan termasuk salah satu universitas terbesar di Indonesia."),
        ("Dengan skor 3.207 – klaster 1. UNDIP juga termasuk dalam urutan universitas terbaik se Indonesia ini. UNDIP atau Universitas Diponegoro terletak di kota Semarang, dan layak dianggap sebagai universitas terbaik di Jawa Tengah. Letaknya yang cukup strategis serta pilihan jurusan yang bervariasi membuat UNDIP jadi salah satu rekomendasi tempat kuliah terbaik di Indonesia yang enak.")
    )

    private val universityLocation = arrayOf(
        "a. Singkatan : ITB\n" +
                "b. Kota : Bandung, Jawa Barat\n" +
                "c. Didirikan : 2 Maret 1959",
        "a. Singkatan : UGM\n" +
                "b. Kota : Sleman, Yogyakarta\n" +
                "c. Didirikan : 19 Desember 1949",
        "a. Singkatan : IPB\n" +
                "b. Kota : Bogor, Jawa Barat\n" +
                "c. Didirikan : 1 September 1963",
        "a. Singkatan : ITS\n" +
                "b. Kota : Surabaya, Jawa Timur\n" +
                "c. Didirikan : 10 November 1957",
        "a. Singkatan : UI\n" +
                "b. Kota : Depok, Jawa Barat\n" +
                "c. Didirikan : 1849",
        "a. Singkatan : UNDIP\n" +
                "b. Kota : Semarang, Jawa Tengah\n" +
                "c. Didirikan : 9 Januari 1957"
    )

    private val universitiesImage = intArrayOf(
        R.drawable.itb,
        R.drawable.ugm,
        R.drawable.ipb,
        R.drawable.its,
        R.drawable.ui,
        R.drawable.undip
    )

    val listData: ArrayList<Universities>
        get() {
            val list: ArrayList<Universities> = ArrayList()
            for (position in universitiesName.indices) {
                val universities = Universities()
                universities.universityPhoto = universitiesImage[position]
                universities.universityName = universitiesName[position]
                universities.universityInfo = universitiesInfo[position]
                universities.universityLocation = universityLocation[position]
                list.add(universities)
            }
            return list
        }
}