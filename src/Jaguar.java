public class Jaguar extends Animal {

    String name = "Jax";
    String food = "Meat";

    int age = 6;

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
