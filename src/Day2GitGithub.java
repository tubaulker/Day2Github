public class Day2GitGithub {
    /*
    1-) git init --> Local repo oluşturmak için yani .git ile klasörümüzün içindeki dosyaları
    ilişkilendirmmek için kullanılır.
    2-) git add . --> Working Space den (yani yerel) dosyalarımı staging area'ya
    (yani commitlemek için beklenen yer) gönderir.
    3-) git status --> Working Space deki ve staging area daki durumu gösterir.
    4-) git commit -m "mesaj" -->Staging Area 'dan Commit Store dosyalarımı göndermek için kullanılır.
    (commit yani versiyon yani sürüm oluşturmuş olurum)
    5-) git push--> Uzak Repo ya (yani remote - Github) göndermek için kullandığımz kod
    yalnız git push komutunu direk kullanmak istersek 1 kez
        git remote add origin adres
        git push -u origin master
    Not: Bu iki komutu tek seferde kullandıktan sonra ikinci commitlerim için sadece git push kullanırız.
    Not: git log --oneline -->Commitlerimdeki yani versiyonlarımdaki durumu gösterir.
     */
    public static void main(String[] args) {
        System.out.println("Github ı da ogrendim");
    }
}
