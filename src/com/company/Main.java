package com.company;

/*class Human {
    String name;//поле значения параметров объекта по умолчанию
    String gender;//поле
    private int age;// поле должно изменяться от 0 до 120
    public void setAge(int age){//создаем метод setAge, тип данных void тк меняем поле а не получаем данные, входные параметры age(set-устанавливаем)
        if (age > 0 && age < 120) {
            this.age = age;
        } else {
            this.age=0;
            System.out.println("ошибка");

        }
    }

    public int getAge() {// создаем метод getAge, тип данных на выходе устанавливаем int
        return this.age;
    }

    public Human(){//метод конструктор
        this.name = "Vasya";//знаение по умолчанию в конструкторе
        this.gender = "m";
        this.age = 18;
        System.out.println("создаем объект");
    }//перегружаем метод в метод конструктор с параметрами
    public Human(String name,String gender,int age){//сам конструктор с параметрами
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
}
public class Main {

    public static void main(String[] args) {
        Human h1 = new Human();
        h1.name = "Puasya";
        h1.age = 15;
        h1.gender = "f";
        System.out.println("h1 end");
        Human h2 = new Human();
        h2.name = "Masha";
        h2.age = 100;
        h2.gender = "f";
        System.out.println("h2 end");
        Human h3 = new Human("Ivan", "m", 20);//
        System.out.println(h3.name);
        }
}*/
class Pet {
    String vid;
    String name;
    String color;
    private int age;
    public void getInfo() {
        System.out.println(this.name+" "+this.vid+" "+this.color+" "+this.age);
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age > 0 && age < 20) {
            this.age = age;
        } else {
            this.age = 500;
        }
    }
    public Pet() {
        this.vid = "кошка";
        this.name = "Муся";
        this.color = "черная";
        this.age = 1;
    }

    public Pet(String vid, String name, String color, int age) {
        this.vid = vid;
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public Pet(String vid, String name, String color) {
        this.vid = vid;
        this.name = name;
        this.color = color;
        this.age = 0;
    }
}

public class Main {
    public static void main(String[] args) {
        Pet cat = new Pet();
        Pet dog = new Pet("собака", "Бобик", "рыжий");
        Pet homyak = new Pet("хомяк", "Хома", "белый", 100);
       // System.out.println(cat.vid + " " + cat.name + " " + cat.getAge() + " " + cat.color);
      // System.out.println(dog.vid + " " + dog.name + " " + dog.getAge() + " " + dog.color);
        //System.out.println(homyak.vid + " " + homyak.name + " " + homyak.getAge() + " " + homyak.color);
        homyak.setAge(70);
        cat.getInfo();
        homyak.getInfo();
    }
}