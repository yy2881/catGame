public class Cats {
    String catName;
    String[] catBreeds = {"British Shorthair","Bombay","Persian"};
    public Cats(String catName){
        this.catName = catName;
    }
    public int getCatCans(int catCans) {
        if(catName.equals(catBreeds[0])){
            catCans = catCans - 40;
        }else if(catName.equals(catBreeds[1])){
            catCans = catCans - 80;
        }else if(catName.equals(catBreeds[2])){
            catCans = catCans - 100;
        }else{
            System.out.println("Please choose a cat among the three: British Shorthair, Bombay or Persian");
        }
        return catCans;
    }
}
