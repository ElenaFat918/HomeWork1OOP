public class Cow extends Animal implements Movement, Eat, Sounds{
    private String name;
    
    public Cow(String name) {
        super(name);
        }
    
    @Override
    public void movement() {
        System.out.println("Корова подошла " );
    }

    @Override
    public void sounds() {
        System.out.println("Корова сказала <Муу> " );
    }

    @Override
    public void eat() {
        System.out.println("Корова поела");
    }

}
