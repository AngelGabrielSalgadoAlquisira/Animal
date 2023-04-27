public class rooster extends animal{
    public rooster(String name, String color, int age, String type){
        super(name,color,age,type);
    }

    public String toString() {
        System.out.println("Nombre: " + getName());
        System.out.println("Color: " + getColor());
        System.out.println("Edad: " + getAge());
        System.out.println("Tipo: " + getType());
        return "Rooster;";
    }
    public String sonido(){
        return "Quiquiriqui";
    }

}
