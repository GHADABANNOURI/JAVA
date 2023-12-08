package tn.esprit.gestionzoo.entities;

public non-sealed class Dolphin extends Aquatic {
    private float swimmingSpeed;

    public Dolphin(){}

    public Dolphin(String family, String name, int age, boolean isMammal, String habitat, float swimmingSpeed) {
        super(family, name, age, isMammal, habitat);
        this.swimmingSpeed = swimmingSpeed;
    }

    public float getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(float swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }

    @Override
    public String toString() {
        return "Dolphin:\nFamily: " + family + "\nName: " + name + "\nAge: " + age + "\nisMammal: " + isMammal + "\nHabitat: " + habitat + "\nSwimming Speed: " + swimmingSpeed + "\n";
    }

    public void swim(){
        System.out.println("This dolphin is swimming.\n");
    }
}
