public class Dog extends Animal implements Movement, Eat, Sounds{
    private String name;
    
    public Dog(String name) {
        super(name);
    }
    
    @Override
    public void movement() {
        System.out.println("Собака подошла " );
    }

    @Override
    public void sounds() {
        System.out.println("Собака сказала <Гав> " );
    }

    @Override
    public void eat() {
        System.out.println("Собака поела");
    }
}
