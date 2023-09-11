package com.example.bukuceritaapp;

import java.util.ArrayList;

public class DataBuku {
    private static final String[] urutanRukun ={
            "Macan Kelaparan",
            "Raja Hutan yang Kelaparan",
            "Sang Kuda Kecil",
    };

    private static String detailRukun[] = {
            "Pada suatu hari di hutan belantara yang lebat, hiduplah seorang macan yang sangat lapar. Macan ini bernama Raju, dan dia adalah salah satu dari sedikit macan yang masih tersisa di hutan tersebut. Namun, Raju memiliki masalah besar - sumber makanan di hutan ini semakin berkurang.\n" +
                    "\n" +
                    "Hari demi hari, Raju berusaha mencari mangsa, tetapi hasilnya selalu nihil. Dia merasa semakin lemah dan kelaparan. Hutan yang dulu ramai dengan beragam binatang buruan sekarang menjadi sunyi dan kosong.\n" +
                    "\n" +
                    "Suatu hari, saat berkeliling mencari makan, Raju melihat sesuatu yang menarik perhatiannya. Di antara semak-semak, dia melihat sekelompok binatang kecil yang tampaknya sedang bermain. Mereka adalah keluarga tupai kecil yang sedang bahagia bermain-main.\n" +
                    "\n" +
                    "Melihat tupai-tupai itu, Raju merasa semakin lapar. Dia tahu dia tidak boleh melukai keluarga kecil ini, tapi rasa laparnya begitu kuat sehingga dia tidak bisa mengendalikan dirinya. Dengan hati berat, dia mencoba mendekati tupai-tupai itu dengan perlahan.\n" +
                    "\n" +
                    "Tupai-tupai itu segera melihat Raju dan merasa ketakutan. Mereka berhenti bermain dan berusaha bersembunyi di balik semak-semak. Raju berhenti, merasa bersalah atas ketakutan yang dia sebabkan pada keluarga tupai ini.\n" +
                    "\n" +
                    "Merasa sangat kelaparan dan juga bersalah, Raju memutuskan untuk mencari makanan yang tidak akan melukai makhluk lain. Dia mulai mencari buah-buahan dan tumbuhan di hutan tersebut. Setiap kali dia menemukan makanan, dia berusaha untuk tidak merusaknya sepenuhnya sehingga tanaman tersebut bisa terus tumbuh.\n" +
                    "\n" +
                    "Waktu berlalu, dan Raju belajar untuk hidup berdampingan dengan alam. Dia belajar mencari makanan yang tidak membahayakan makhluk lain dan juga membantu menjaga keseimbangan ekosistem di hutan. Meskipun dia masih merasa lapar kadang-kadang, dia merasa lebih baik karena dia tahu dia telah berubah menjadi macan yang lebih baik.\n" +
                    "\n" +
                    "Hutan itu pun perlahan-lahan mulai hidup kembali. Binatang-buatnag lain pun kembali ke hutan tersebut karena ada cukup makanan untuk semua. Raju tidak lagi merasa kelaparan, dan dia merasa bahagia karena dia telah memilih jalan yang benar.\n" +
                    "\n" +
                    "Cerita tentang Raju, si macan yang kelaparan, mengajarkan kepada kita tentang pentingnya menjaga alam dan menghormati makhluk lain. Meskipun dalam kondisi sulit, kita selalu memiliki pilihan untuk bertindak dengan bijak dan berbuat baik kepada orang lain dan alam sekitar kita.",
            "Di tengah hutan yang lebat dan indah terdapat sebuah kerajaan yang diperintah oleh seorang raja hutan yang gagah dan bijaksana. Raja ini memiliki mahkota yang berkilauan dan bulu yang indah. Namun, meskipun kelihaiannya dalam memerintah, hutan ini menghadapi masa kelaparan yang besar.\n" +
                    "\n" +
                    "Hutan yang dulu subur dan penuh dengan berbagai jenis hewan dan tumbuhan sekarang mengalami kekeringan yang luar biasa. Sumber daya alam semakin berkurang, dan hewan-hewan serta tumbuhan di hutan ini terancam punah.\n" +
                    "\n" +
                    "Raja hutan, yang sangat mencintai kerajaannya dan semua makhluk yang tinggal di dalamnya, merasa sangat khawatir. Dia tahu dia harus mencari solusi untuk menyelamatkan kerajaannya. Raja hutan itu memutuskan untuk pergi mencari biji pohon ajaib yang konon bisa mengembalikan kesuburan hutan.\n" +
                    "\n" +
                    "Perjalanan raja hutan melewati hutan-hutan yang gersang dan sungai-sungai yang mengering. Dia harus melewati banyak rintangan, tetapi dia tidak pernah menyerah. Dia bertemu dengan berbagai makhluk hutan yang juga mengalami kelaparan, dan dia berbagi makanan yang dia bawa dengan mereka.\n" +
                    "\n" +
                    "Akhirnya, setelah berbulan-bulan perjalanan, raja hutan menemukan pohon ajaib yang konon memiliki biji yang bisa mengembalikan kesuburan hutan. Dia mengumpulkan biji-bijian tersebut dengan hati-hati dan membawanya kembali ke kerajaannya.\n" +
                    "\n" +
                    "Sesampainya di kerajaannya, raja hutan segera memerintahkan penghuninya untuk membantu dalam menanam biji-bijian itu. Mereka bekerja sama dengan penuh semangat dan harapan. Mereka merawat bibit-bibit yang tumbuh dari biji-bijian tersebut dengan penuh kasih sayang.\n" +
                    "\n" +
                    "Waktu berlalu, dan hutan itu mulai pulih. Tanaman-tanaman tumbuh dengan subur, sungai-sungai kembali mengalir, dan berbagai jenis hewan mulai kembali ke hutan itu. Raja hutan melihat kebahagiaan di wajah penghuninya dan merasa bahagia.\n" +
                    "\n" +
                    "Raja hutan yang pernah kelaparan sekarang menjadi raja yang lebih bijaksana dan peduli. Dia belajar bahwa penting untuk merawat alam dan berbagi dengan mereka yang kurang beruntung. Hutan dan semua makhluknya kembali hidup bahagia di bawah kepemimpinan yang penuh kasih dari raja hutan yang bijaksana.\n" +
                    "\n" +
                    "Cerita tentang raja hutan ini mengingatkan kita akan pentingnya menjaga alam dan berbagi dengan mereka yang membutuhkan. Kita semua memiliki peran dalam menjaga keseimbangan alam dan menjaga keberlanjutan bumi ini.",
            "Pada suatu pagi yang cerah di ladang terbuka, seorang kuda kecil yang bernama Kiko merasa sedih. Dia merasa kehilangan sesuatu yang sangat penting dalam hidupnya, yaitu ibunya, Bella. Bella adalah kuda yang sangat penyayang dan selalu menjaga Kiko dengan penuh kasih sayang. Namun, suatu hari, saat Kiko sedang bermain di padang rumput, dia kehilangan jejak ibunya.\n" +
                    "\n" +
                    "Kiko berjalan melintasi ladang dengan cemas, memanggil-manggil \"Ibu! Ibu!\" namun tidak mendapatkan jawaban. Dia bertanya kepada teman-teman hewan lainnya, seperti burung-burung dan kelinci-kelinci, apakah mereka melihat ibunya, tetapi mereka juga tidak tahu. Kiko merasa semakin khawatir dan sedih.\n" +
                    "\n" +
                    "Dia memutuskan untuk mencari jejak ibunya sendiri. Kiko mengikuti jejak-jejak kaki yang dia kenal dan mencoba mengingat tempat-tempat yang sering dia kunjungi bersama ibunya. Saat dia melewati sungai, dia ingat betapa ibunya selalu menjaganya agar tidak jatuh ke dalam air saat mereka minum.\n" +
                    "\n" +
                    "Kiko terus berjalan, melewati hutan yang lebat. Dia mengingat saat-saat indah ketika ibunya mengajarinya mengunyah rumput hijau yang paling lezat. Kiko berharap dapat menemukan ibunya dan berkata padanya betapa dia merindukannya.\n" +
                    "\n" +
                    "Setelah beberapa hari perjalanan yang panjang, Kiko tiba di sebuah lembah yang luas. Di sana, dia melihat sosok yang sangat dikenalnya. Itu adalah Bella, ibunya! Bella juga merindukan Kiko dan sangat bahagia melihat anaknya yang kembali.\n" +
                    "\n" +
                    "Mereka berlari mendekat satu sama lain dan berkumpul dalam pelukan yang hangat. Kiko merasa aman dan bahagia di samping ibunya. Mereka berdua menghabiskan waktu bersama-sama, makan rumput hijau yang lezat, dan bermain di padang rumput.\n" +
                    "\n" +
                    "Kiko belajar dari pengalaman ini bahwa meskipun terkadang kita merasa tersesat atau kehilangan arah, keluarga selalu ada untuk menyambut kita kembali. Ibu Bella selalu di samping Kiko, menjaganya dengan penuh kasih sayang, dan Kiko berjanji untuk tidak pernah meninggalkan ibunya lagi.\n" +
                    "\n" +
                    "Cerita tentang Kiko dan Bella mengajarkan kita tentang pentingnya keluarga, cinta, dan kesetiaan dalam hidup. Meskipun ada saat-saat sulit, cinta keluarga selalu mengarahkan kita kembali ke rumah.",
    };

    private static final int[] imageRukun = {
            R.drawable.tiger,
            R.drawable.lion,
            R.drawable.horse,
    };

    static ArrayList<Buku> getListData(){
        ArrayList<Buku> list = new ArrayList<>();
        for (int position = 0; position < urutanRukun.length; position++){
            Buku Buku = new Buku();
            Buku.setNama(urutanRukun[position]);
            Buku.setDetail(detailRukun[position]);
            Buku.setPhoto(imageRukun[position]);
            list.add(Buku);
        }
        return list;
    }
}
