package main.company;

public class Casing {
    private String material;

    public void setMaterial(String casingMaterial) {
        material = casingMaterial;
    }

    public void describeMaterial() {
        System.out.println("Current flashlight case is made of " + material);
    }
}
