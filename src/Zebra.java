public class Zebra extends Animal {

    String name = "Zelda";
    String food = "Grass";

    int age = 11;

    @Override
    public void setName(String name) {
        super.setName(this.name);
    }

    @Override
    public void setFood(String food) {
        super.setFood(this.food);
    }

    @Override
    public void setAge(int age) {
        super.setAge(this.age);
    }


}
