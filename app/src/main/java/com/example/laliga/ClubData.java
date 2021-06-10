package com.example.laliga;

import java.util.ArrayList;

public class ClubData {
    private static String [] clubName = {
            "Alaves",
            "Athletic Bilbao",
            "Atletico Madrid",
            "Barcelona",
            "Cadiz",
            "Celta Vigo",
            "Elche",
            "Espanyol",
            "Getafe",
            "Granada",
            "Levante",
            "Mallorca",
            "Osasuna",
            "Real Betis",
            "Real Madrid",
            "Real Sociedad",
            "Sevilla",
            "Valencia",
            "Villareal"
    };

    private static String [] clubDetail = {
            "Deportivo Alavés, S.A.D. (Sporting Alavés), biasanya disingkat Alavés, adalah klub sepakbola Spanyol yang berbasis di Vitoria-Gasteiz, Álava, dalam komunitas otonom di Negara Basque. Didirikan pada 23 Januari 1921 sebagai Sport Friends Club.",
            "Athletic Club, juga dikenal sebagai Athletic Bilbao, adalah klub sepak bola profesional, yang berbasis di Bilbao, Basque Country, Spanyol. Mereka dikenal sebagai Los Leones (The Lions) karena stadion mereka dibangun di dekat sebuah gereja bernama San Mamés (Saint Mammes). Mammes adalah orang Kristen zaman Romawi yang dilemparkan ke singa oleh orang Romawi. Mammes menenangkan pertarungan dengan singa-singa itu dan kemudian dijadikan orang suci.",
            "Club Atlético de Madrid, SAD, umumnya dikenal sebagai Atlético Madrid, atau hanya sebagai Atlético atau Atleti, adalah klub sepak bola profesional Spanyol yang berbasis di Madrid. Kot kandang Atletico adalah kemeja bergaris vertikal merah dan putih, dengan celana pendek biru, dan kaus kaki biru dan merah. Kombinasi ini telah digunakan sejak 1911.",
            "Futbol Club Barcelona, umumnya dikenal sebagai Barcelona dan akrab dengan sebutan Barça, adalah klub sepakbola profesional yang berbasis di Barcelona, Catalonia, Spanyol. Didirikan pada tahun 1899 oleh sekelompok pemain Swiss, Inggris dan Catalan yang dipimpin oleh Joan Gamper, klub ini telah menjadi simbol budaya Catalan dan Katalanisme, dengan motto Més que un club (Lebih dari sebuah klub).",
            "Cádiz Club de Fútbol, S.A.D. adalah tim sepak bola Spanyol yang berbasis di Cádiz, dalam komunitas otonom Andalusia. Didirikan pada tahun 1910.",
            "Real Club Celta de Vigo, umumnya dikenal sebagai Celta Vigo atau hanya Celta, adalah klub sepak bola profesional Spanyol yang berbasis di Vigo, Galicia. Didirikan pada 23 Agustus 1923 setelah bergabungnya klub Real Vigo Sporting dan Real Fortuna Football Club.",
            "Elche Club de Fútbol, S.A.D. adalah tim sepak bola Spanyol yang berbasis di Elche, Provinsi Alicante, di Komunitas Valencia.",
            "Reial Club Deportiu Espanyol de Barcelona, umumnya dikenal sebagai RCD Espanyol, atau hanya sebagai Espanyol, adalah klub olahraga profesional yang berbasis di Barcelona, Spanyol.",
            "Getafe Club de Fútbol, atau hanya Getafe, adalah klub sepak bola profesional Spanyol yang berbasis di Getafe, sebuah kota di wilayah metropolitan Madrid. Getafe awalnya didirikan pada tahun 1946 dan didirikan kembali pada tahun 1983.",
            "Granada Club de Fútbol, atau hanya Granada CF, adalah klub sepakbola Spanyol yang berbasis di Granada, dalam komunitas otonom Andalusia. Didirikan pada 14 April 1931.",
            "Levante Unión Deportiva, S.A.D. adalah klub sepak bola Spanyol yang berbasis di Valencia, Spanyol. Didirikan pada 9 September 1909.",
            "Real Club Deportivo Mallorca, S.A.D. adalah tim sepak bola Spanyol yang berbasis di Palma, di Kepulauan Balearic.",
            "Club Atlético Osasuna, Athletic Club Osasuna, atau hanya Osasuna, adalah tim sepak bola Spanyol yang berbasis di Pamplona, Navarre. Didirikan pada tahun 1920.",
            "Real Betis Balompie, SAD, lebih sering disebut sebagai Real Betis atau hanya Betis, adalah klub sepakbola Spanyol yang berbasis di Seville, dalam komunitas otonom Andalusia. Didirikan pada 12 September 1907.",
            "Real Madrid Club de Fútbol, umumnya dikenal sebagai Real Madrid, atau hanya Real, adalah klub sepakbola profesional yang berbasis di Madrid, Spanyol. Didirikan pada 6 Maret 1902 sebagai Madrid Football Club, klub ini secara tradisi mengenakan kostum kandang serba putih sejak awal. Kata Real adalah bahasa Spanyol untuk Royal dan dianugerahkan kepada klub oleh Raja Alfonso XIII pada tahun 1920 bersama dengan mahkota kerajaan dalam lambang klub.",
            "Real Sociedad de Fútbol, S.A.D., lebih sering disebut sebagai Real Sociedad atau La Real, adalah klub sepak bola Spanyol yang berbasis di kota San Sebastián, Basque Country, didirikan pada 7 September 1909.",
            "Sevilla Fútbol Club, S.A.D., atau hanya Sevilla, adalah klub sepak bola tertua di Spanyol yang berbasis di Seville, ibu kota dan kota terbesar dari komunitas otonom Andalusia.",
            "Valencia Club de Fútbol (juga dikenal sebagai Valencia CF, Valencia atau Los Che) adalah klub sepak bola Spanyol yang berbasis di Valencia. Valencia didirikan pada tahun 1919 dan memiliki persaingan sengit dengan sesama klub di Valencia yaitu Villarreal, dengan nama Derbi de la Comunitat.",
            "Villarreal Club de Fútbol, S.A.D., biasanya disingkat dengan Villarreal CF atau hanya Villarreal, adalah klub sepak bola Spanyol yang berbasis di Villarreal, sebuah kota di provinsi Castellón dalam Komunitas Valencia. Didirikan pada tahun 1923."
    };

    private static int[] clubimage = {
            R.drawable.alaves,
            R.drawable.atb,
            R.drawable.atm,
            R.drawable.barcelona,
            R.drawable.cadiz,
            R.drawable.celtavigo,
            R.drawable.elche,
            R.drawable.espanyol,
            R.drawable.getafe,
            R.drawable.granada,
            R.drawable.levante,
            R.drawable.mallorca,
            R.drawable.osasuna,
            R.drawable.realbetis,
            R.drawable.realmadrid,
            R.drawable.realsociedad,
            R.drawable.sevilla,
            R.drawable.valencia,
            R.drawable.villareal,

    };

    static ArrayList<Club> getlistData(){
        ArrayList<Club> list = new ArrayList<>();
        for (int position = 0; position <clubName.length; position++) {
            Club club = new Club();
            club.setName(clubName[position]);
            club.setDetail(clubDetail[position]);
            club.setPhoto(clubimage[position]);
            list.add(club);
        }
        return list;
    };
}
