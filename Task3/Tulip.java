package by.epam.les10.main;

public class Tulip extends Flower{
    private final static String name = "Тюльпан";// нужно более подробно прочувствовать тему нАследование
    // это не корректное наследование, т.к. оно не привносит в производный класс ничего, что нельзы сделать через базовый
    public Tulip(double price, Color color) {
        super(price, name, color);
    }
}
