import cloth.Wardrobe;
import utils.FileHandler;

import java.io.IOException;

public class WardrobeMain {
    Wardrobe wardrobe = new Wardrobe();


    private void fillWardrobe() throws IOException {
        wardrobe.setAllCloth(FileHandler.readAllClothes());
        wardrobe.wardrobeChecker();
    }

    public static void main(String[] args) throws IOException {
    WardrobeMain wardrobeMain = new WardrobeMain();
    wardrobeMain.fillWardrobe();

    }
}
