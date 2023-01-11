public class Cat extends Animal implements Movement, Eat, Sounds{
    
    private String name;
    
    public Cat (String name) {
        super(name);
    }
    
    @Override
    public void movement() {
        System.out.println("Кошка подошла " );
    }

    @Override
    public void sounds() {
        System.out.println("Кошка сказала <Мяу> " );
    }

    @Override
    public void eat() {
        System.out.println("Кошка поела");
    }

    @Override
    public String toString() {
        return "Кошка"+ name;
    }
}