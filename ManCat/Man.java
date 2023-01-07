public class Man {
    private String name;
       
    public Man(String name) {
        this.name = name;
    } 
    
    public void call(Animal a) {
        if (a instanceof Cat) {// instanceof проверяет : явл ли экземпляр a типом Cat
            System.out.println("Человек " + name + " позвал кошку " + a.getName());
        }
        else if (a instanceof Cow) {
            System.out.println("Человек " + name + " позвал корову " + a.getName());
        } 
        else if (a instanceof Dog) {
            System.out.println("Человек " + name + " позвал собаку " + a.getName());
        } 
        else {
            System.out.println("Человек " + name + " позвал лошадь " + a.getName());
        } 
    }
    
    public void feed(Animal a){ 
        System.out.println("Человек " + name + " покормил животное " + a.getClass() + " " + a.getName());
    }

    public void stroked (Animal a){
        System.out.println("Человек " + name + " погладил животное " + a.getClass() + " " + a.getName());
    }    
}
