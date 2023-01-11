import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Person irina = new Person("Ирина", 80);
        Person vasya = new Person("Вася", 60);
        Person marina = new Person("Марина", 55);
        Person masha = new Person("Маша", 36);
        Person jane = new Person("Женя", 35);
        Person ivan = new Person("Ваня", 40);
        Person ruslan = new Person("Руслан", 6);
        Person timur = new Person("Тимур", 3);
        Person elena = new Person("Елена", 37);
        Person denis = new Person("Денис", 37);

        GeoTree gt = new GeoTree();
        gt.appendParentChildShip(irina, vasya);
        gt.appendParentChildShip(irina, masha);
        gt.appendParentChildShip(vasya, jane);
        gt.appendParentChildShip(vasya, ivan);
        gt.appendParentChildShip(marina, jane);
        gt.appendParentChildShip(marina, ivan);
        gt.appendParentChildShip(elena, ruslan);
        gt.appendParentChildShip(elena, timur);
        gt.appendParentChildShip(denis, ruslan);
        gt.appendParentChildShip(denis, timur);
        gt.appendWifeHusbandShip(marina, vasya);
        gt.appendWifeHusbandShip(elena, denis);

        System.out.println(new Reserch(gt).spend(irina,
                Relationship.parent)); 
        System.out.println("Родители Руслана: " + new Reserch(gt).spend(ruslan,
        Relationship.children));
        System.out.println("Родители Жени: " + new Reserch(gt).spend(jane,
        Relationship.children));
        System.out.println(new Reserch(gt).searchAge());
        System.out.println("Жена Дениса: " + new Reserch(gt).spend(denis, Relationship.husband));
        
        try {
          gt.write();
        } catch (IOException e) {
          System.out.println(e.getMessage());
        }
    }

}

/*
 *Используйте предыдущие задачи из прошлого домашнего задания. Необходимо гарантированно продумать 
 иерархию компонент и взаимодействия их между собой.
Обеспечить переход от использования явных классов в сторону использования абстрактных типов. 
Т е работаем не с:
конкретным экземпляром генеалогического древа, а с интерфейсом “ генеалогическое древо”
 */