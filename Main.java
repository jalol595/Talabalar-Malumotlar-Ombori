package com.company;

public class Main {

    public static void main(String[] args) {

        Data data = new Data();

        data.getName();

        data.add("Malika", "Karimova", "12343323");
        data.add("Madin", "Odilova", "12343");
        data.add("Kamila", "Karimova", "3366555");
        data.add("Rano", "Oduee", "8876t55r");
        data.add("Xurshid", "Jonsom", "756433456");
        data.add("Adiba", "Karimova", "87654");
        data.add("Maykl", "Jekson", "3456789");
        data.add("Malashka", "Qurbonova", "9900303");
        data.add("Kelli", "Odilova", "34578943");
        data.add("Aduriz", "Kamola", "6543213456");
        data.add("Alaba", "Komil;ova", "234565432");
        data.add("adiba", "Maxmudova", "994662873");


        System.out.println(data.first());

        System.out.println(data.get(5));

        data.tostring();

        System.out.println(data.find("Mal"));

    }
}
