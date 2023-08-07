public enum Places {
    LONDON("Лондон","В этом месте есть Поднимающийся мост и большая башня с часами Биг Бен"),
    STAMBUL("Стамбул", "столица Турции, в Турции можно отдохнуть как на Мальдивах, только это дешевле"),
    BERLIN("Берлин", "\n" +
            "Es wird genug für alle sein,\n" +
            "wir trinken zusammen, roll das Faß mal rein,\n" +
            "wir trinken zusammen, nicht allein.\n" +
            "Es wird genug für alle sein,\n" +
            "wir trinken zusammen, roll das Faß mal rein,\n" +
            "wir trinken zusammen, nicht allein.\n" +
            "\n"),
    MADRID("Мадрид", "столица Испании, сама страна красивая и мне нечего сюда добавлять"),
    RIM("Рим", "Столицы Италии со старыми зданиями с которыми можно пофоткаться"),
    PARIS("Париж", "Я в Париже Donnez-moi une suite au Ritz,\n" +
            "Je n'en veux pas\n" +
            "Des bijoux de chez Chanel,\n" +
            "Je n'en veux pas\n" +
            "Donnez moi une limousine,\n" +
            "J'en ferais quoi\n" +
            "Papalapapapa\n" +
            "\n"),
    VENA("Вена", "Ура я попал в Вену");
    private String name;
    private String a;

    @Override
    public String toString() {
        return "Места \n Название места: "+getName()+"\n Что особенного?: "+getA();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    Places(String name, String a) {
        this.name = name;
        this.a = a;
    }
}
