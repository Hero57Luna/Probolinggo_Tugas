package id.ac.polinema.recyclerviewsangatsederhana.Models;

public class SuperHero {

    public String heroName;
    public int[] images;

    public int[] getImages() {
        return images;
    }

    public void setImages(int[] images) {
        this.images = images;
    }

    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public SuperHero(String heroName) {
        this.heroName = heroName;
    }
}
