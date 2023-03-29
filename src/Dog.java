class Dog extends Animal {
    final private String color;

    public Dog(String name, String color) {
        super(name); // refers to Animal's constructor
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void bark(){
        System.out.println("wouf wouf");
    }

    public void bark(String language){
        System.out.println("woof woooof but in " + language);
    }

    public void eat() {
        System.out.println(super.name + "is eating");
    }

}
