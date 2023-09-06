
abstract class Pen{
    abstract void write();
    abstract void refill();
}

class FountainPen extends Pen{
    void write(){
        System.out.println("Writing");
    }
    void refill(){
        System.out.println("Refilling");
    }
    void changeNib(){
        System.out.println("Changing the nib");
    }
}


//problem2

class Monkey{
    void jump(){
        System.out.println("Jumping");
    }
    void bite(){
        System.out.println("Bite");
    }
}

interface BasicHuman{
    void eat();
    void talk();
}

class Human extends Monkey implements BasicHuman{
    public void eat(){
        System.out.println("Eating");
    }

    public void talk(){
        System.out.println("Hi");
    }
}


public class abstractjava {
    public static void main(String[] args) {
        FountainPen p = new FountainPen();
        p.changeNib();
        p.refill();

        Human happy = new Human();
        happy.jump();
        happy.eat();

        //polymorphism
        // Smart phone can be used in different way like camera, browser, mediaplayer...
        // Camera c = new Smartphone();  --> Only can access camera properties and methods
        Monkey m = new Human();
        m.jump();
        // m.eat();  --> monkey doesnt have eat method


    }
}
