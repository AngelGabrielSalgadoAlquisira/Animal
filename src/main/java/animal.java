public class animal {
    private String name;
    private String color;
    private int age;
    private String type;

    public animal() {
    }

    public animal(String name, String color, int age, String type){
        this.name = name;
        this.color = color;
        this.age = age;
        this.type = type;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    public String sonido(){ return null;}
}
