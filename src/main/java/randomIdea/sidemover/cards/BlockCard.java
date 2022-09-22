package randomIdea.sidemover.cards;

import randomIdea.sidemover.cards.abstracts.Card;
import randomIdea.sidemover.coordinate.Vector2;
import randomIdea.sidemover.places.NormalBlock;
import randomIdea.sidemover.places.abstracts.Placement;

public abstract class BlockCard extends Card {

    public BlockCard() {
        this.hitPoint = 1;
        symbol = "[B]";
    }

    public BlockCard(int hitPoint) {
        this.hitPoint = hitPoint;
        symbol = "[B]";
    }

    @Override
    public boolean selectionShow() {
//        TODO: input position data
        Vector2 position = new Vector2(2, 4); // dummy position data
        return false;
    }

    @Override
    public Placement UseCard(Vector2 position) {
        Placement plc = new NormalBlock(this, position);
        return plc;
    }
}
