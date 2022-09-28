package randomIdea.sidemover._core;

import java.util.ArrayList;
import java.util.List;

import randomIdea.sidemover.cards.abstracts.Card;
import randomIdea.sidemover.cards.HeroCard;
import randomIdea.sidemover.cards.KnockBackPowerCard;
import randomIdea.sidemover.cards.NormalBlockCard;
import randomIdea.sidemover.cards.PowerCard;
import randomIdea.sidemover.cards.SpecialBlockCard;
import randomIdea.sidemover.interfaces.ISelectable;

public class Player {

    List<Card> deck = new ArrayList<Card>();
    public int Gem = 10;

    public void init() {
        creation();
    }

    public void select(ISelectable selection) {
        selection.selectionShow();
    }

    public void action() {

    }

    void creation() {
        deck.add(new SpecialBlockCard());
        deck.add(new NormalBlockCard(5));
        deck.add(new HeroCard(3, 2));
        deck.add(new HeroCard(5, 1));
        deck.add(new PowerCard(2, 1, "2hp 1dmg Special Power"));
        deck.add(new KnockBackPowerCard());
    }

    void show() {
        System.out.println("----- CARDS -----");
        for (int i = 0; i < deck.size(); i++) {
            System.out.println(i + ". " + deck.get(i).symbol + deck.get(i).fullDescription());
        }
        System.out.println();
        System.out.println("----- CARDS -----");
        System.out.println();
        System.out.println("Remaining Gem : " + Gem);
        System.out.println();
    }
}
