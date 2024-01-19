//Класс Phone.
//Создайте класс Phone, который содержит переменные number, model и
//weight.
//Создайте три экземпляра этого класса.
//Выведите на консоль значения их переменных.
//Добавить в класс Phone методы: receiveCall, имеет один параметр – имя
//звонящего. Выводит на консоль сообщение “Звонит {name}”. getNumber –
//возвращает номер телефона. Вызвать эти методы для каждого из
//объектов.
//Добавить конструктор в класс Phone, который принимает на вход три
//параметра для инициализации переменных класса - number, model и
//weight.
//Добавить конструктор, который принимает на вход два параметра для
//инициализации переменных класса - number, model.
//Добавить конструктор без параметров.
//Вызвать из конструктора с тремя параметрами конструктор с двумя.
//Добавьте перегруженный метод receiveCall, который принимает два
//параметра - имя звонящего и номер телефона звонящего. Вызвать этот
//метод.
//Создать метод sendMessage с аргументами переменной длины. Данный
//метод принимает на вход номера телефонов, которым будет отправлено
//сообщение. Метод выводит на консоль номера этих телефонов

package Phone;

public class Phone {
    String model;
    long number;
    float weight;

    public Phone(String model, long number, float weight) {
        this(model, number);
        this.weight = weight;
    }

    public Phone(String model, long number) {
        this.model = model;
        this.number = number;
    }

    public Phone() {
    }

    public void printer(String model, long number, float weight) {
        System.out.println("Телефон модели " + model + " с номером телефона " + number + " и весом " + weight);
    }

    public void getNumber(long number) {
        System.out.println("Номер телефона " + number);
    }

    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    public void receiveCall(String name, long number) {
        System.out.println("Звонит " + name + " с номера телефона " + number);
    }

    public void sendMessage(String... message) {
        for (String value : message)
            System.out.print(value + " ");
    }

    public static void main(String[] args) {
        Phone phone1 = new Phone("jhjhk", 375292623530L, 57678);
        Phone phone2 = new Phone("hghgh", 375292623530L, 57678);
        Phone phone3 = new Phone("hghgh", 375292623530L, 57678);

        phone1.printer(phone1.model, phone1.number, phone1.weight);
        phone2.printer(phone2.model, phone2.number, phone2.weight);
        phone3.printer(phone3.model, phone3.number, phone3.weight);

    }
}