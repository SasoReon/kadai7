package kadai7;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
class GameListAggregate implements Aggregate{
    //private Game[] list = new Game[20];
    private List<Game> list = new ArrayList<Game>();
    private int numberOfStock;
    @Override
    public Iterator createIterator() {
        return new GameListIterator(this);
    }
    public void add(Game game) {
        //list[numberOfStock] = game;
        //numberOfStock += 1;
        list.add(game);
        numberOfStock += 1;
    }
    public Object getAt(int number) {
        //return list[number];
        return list.get(number);
    }
    public int getNumberOfStock() {
        return numberOfStock;
    }
    public void sortlist() {
        list.sort(Comparator.comparing(Game::getPrice));
    }
}