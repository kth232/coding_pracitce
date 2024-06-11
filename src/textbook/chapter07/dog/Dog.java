package textbook.chapter07.dog;

public class Dog {
    private String name; //강아지 이름
    private String type; //견종

    public Dog(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String showDogInfo() {
        return name + " / " + type;
    }
}
