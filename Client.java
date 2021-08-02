package kadai7;

class IteratorTest {
    public static void main(String[] args) {
        GameListAggregate gameListAggregate = new GameListAggregate();
        Iterator iterator = gameListAggregate.createIterator();
        gameListAggregate.add(new Game("みんなでゴルフ", 3700));
        gameListAggregate.add(new Game("ファイナルファンタジア", 7300));
        gameListAggregate.add(new Game("ロケットモンスター", 5400));
        gameListAggregate.add(new Game("さいころの達人", 5200));
        iterator.first();
        gameListAggregate.sortlist();
        while(!iterator.isDone()) {
            Game game = (Game)iterator.getItem();
            System.out.println(game.getName());
            iterator.next();
        }
    }
}