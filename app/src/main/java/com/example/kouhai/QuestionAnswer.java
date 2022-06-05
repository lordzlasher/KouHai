package com.example.kouhai;

public class QuestionAnswer {

    public static String question[] ={
            "1. Dari tiga pilihan ini, yang mana yang benar pengucapannya dalam bahasa Jepang? \nHalo, salam kenal. Saya Thomas. Karyawan.",
            "2. Terjemahkanlan ke dalam Bahasa Jepang",
            "3. Ani bertemu dengan kenalan baru yang bernama seito setelah perkenalan kata terakhir yang diucapkan ani adalah?",
    };
    public static String subquestion[] ={
            "トーマス | 会社員 \n Toomasu | kaishain \n Thomas | karyawan",
            "Saya adalah RiniSaya adalah Rini",
            ""
    };

    public static String choices[][] = {
            {"Hajimemashite. Toomasu desu ka. Kaishain desu ka.","Hajimemashite. Toomasu desu. Kaishain desu.","Hajimemashite. Toomasu deshita. Kaishain deshita."},
            {"Watashi wa Rini san desu","Watashi wa Rini desu ka","Watashhi wa Rini desu"},
            {"Douzo yoroshiku","Ganbatte kudasai","Aishiteru"}
    };

    public static String correctAnswers[] = {
            "Hajimemashite. Toomasu desu. Kaishain desu.",
            "Watashhi wa Rini desu",
            "Douzo yoroshiku"
    };

}