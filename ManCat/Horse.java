public class Horse extends Animal implements Movement, Eat, Sounds{
    private String name;

    public Horse(String name) {
        super(name);
    }
    
    @Override
    public void movement() {
        System.out.println("Лошадь подошла " );
    }

    @Override
    public void sounds() {
        System.out.println("Лошадь сказала <Пруу> " );
    }

    @Override
    public void eat() {
        System.out.println("Лошадь поела");
    }
}
