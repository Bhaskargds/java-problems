package runtimepolymorphism;
class Animal
{  void eat()
    {
        System.out.println("eating...");
    }
}
class Dog extends Animal
{  void eat()
    {
        System.out.println("Dog eats biscuits...");
    }
}class Cat extends Animal
{  void eat()
    {
        System.out.println("cat eats rat...");
    }
}
class TestPolymorphism
{ public static void main(String args[])
    {
        Animal a;
        a= new Dog();
        a.eat();
        a= new Cat();
        a.eat();
    }
}
