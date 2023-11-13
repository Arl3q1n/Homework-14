public class Elephant extends Animal {

    String name = "Ellie";
    String food = "Grass";

    int age = 5;

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
