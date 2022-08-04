public class Main {
    public static void main(String[] args) {
        System.out.println("Второе ДЗ");
        byte pervoe = 12;
        short vtoroe = 324;
        int tretie = 57573939;
        long chtvertoe = 4398579L;
        float drobnoe1 = 2.363f;
        double drobnoe2 = 4.54;
        double boxer1 = 78.2;
        double boxer2 = 82.7;
        double boxer1i2 = boxer1 + boxer2;
        System.out.println("Вес боксеров " + boxer1i2);
        double boxer22 = 82.7;
        double boxer11 = 78.2;
        double boxer2i1 = boxer22 - boxer11;
        System.out.println("Разница в весе " + boxer2i1 + " кг");
        byte bananas = 80;
        System.out.println("Вес 5 бананов = " + bananas * 5 + " гр.");
        int milk = 105;
        System.out.println("Вес 200 мл молока = " + milk * 2 + " гр." );
        byte ice = 100;
        System.out.println("Вес 2 брикетов мороженного = " + ice * 2 + " гр." );
        byte eggs = 70;
        System.out.println("Вес 4 яйиц = " + eggs * 4 + " гр");
        int bananas1 = 400;
        int milk1 = 210;
        int ice1 = 200;
        int eggs1 = 280;
        int general = bananas1 + milk1 + ice1 + eggs1;
        System.out.println("Общий вес = " + general + " гр");
        float general1 = 1000;
        float general22 = general / general1;
        System.out.println("Вес в кг = " + general22);
        int weightSevenKg = 7;
        int weightSevenGr = weightSevenKg * 1000;
        int weightOneDay = 250;
        int weightOneDay500 = 500;
        int weightSevenKg1 = weightSevenGr / weightOneDay;
        System.out.println("Понадобится " + weightSevenKg1 + " дней если худеть по 250 грамм");
        int weightSevenDay77 = weightSevenGr / weightOneDay500;
        System.out.println("Понадобится " + weightSevenDay77 + " дней если худеть по 500 грамм");

        int masha = 67760;
        int mashNa10 = masha * 10 / 100;
        System.out.println("Зарплата повысится у Маши " + mashNa10);
        int denis = 83690;
        int denis10 = denis * 10 / 100;
        System.out.println("Зарплата повысится у Дениса " + denis10);
        int kristina =  76230;
        int kristina10 =  kristina * 10 / 100;
        System.out.println("Зарплата повысится у Кристины " + kristina10);
        int obshayaMasha = masha * 12;
        System.out.println("Годовая зарплата у Маши до повышения " + obshayaMasha);
        int obshayaDenis = denis * 12;
        System.out.println("Годовая зарплата у Дениса до повышения " + obshayaDenis);
        int obshayaKristina = kristina * 12;
        System.out.println("Годовая зарплата у Кристины до повышения " + obshayaKristina);

        int obshayaMashaPovshenie = obshayaMasha + mashNa10 * 12;
        System.out.println("Годовая зарплата у Маши после повышения " + obshayaMashaPovshenie);
        int obshayaDenisPovshenie = obshayaDenis + denis10 * 12;
        System.out.println("Годовая зарплата у Дениса после повышения " + obshayaDenisPovshenie);
        int obshayaKristinaPovshenie = obshayaKristina + kristina10 * 12;
        System.out.println("Годовая зарплата у Кристины после повышения " + obshayaKristinaPovshenie);
        int raznicaMasha = obshayaMashaPovshenie - obshayaMasha;
        System.out.println("Разница в зарплате " + raznicaMasha + " у Маши");
        int raznicaDenis = obshayaDenisPovshenie - obshayaDenis;
        System.out.println("Разница в зарплате " + raznicaDenis + " у Дениса");
        int raznicaKristina = obshayaKristinaPovshenie - obshayaKristina;
        System.out.println("Разница в зарплате " + raznicaKristina + " у Кристины");







    }
}