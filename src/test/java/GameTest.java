import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class GameTest {

    @Test
    public  void testWhenFirstPlayerWin () {
        Player vasya = new Player(1,"Вася",100);
        Player petya = new Player(2,"Петя",120);
        Game game = new Game();

        game.register(vasya);
        game.register(petya);
        int actual = game.round("Петя","Вася");
        int expected =1;

        Assertions.assertEquals(expected,actual);
    }
    @Test
    public  void testWhenFirstPlayerNotExist () {
        Player vasya = new Player(1,"Вася",100);
        Player petya = new Player(2,"Петя",120);
        Game game = new Game();

        game.register(vasya);
        game.register(petya);

        Assertions.assertThrows(NotRegisteredException.class,
                () -> game.round("Жора", "Вася")
                );
    }
    @Test
    public  void testWhenFirstPlayerNotExist2 () {
        Player vasya = new Player(1,"Вася",100);
        Player petya = new Player(2,"Петя",120);
        Game game = new Game();

        game.register(vasya);
        game.register(petya);

        Assertions.assertThrows(NotRegisteredException.class,
                () -> game.round("Петя", "Жора")
        );
    }
    @Test
    public  void testWhenFirstPlayerNotExist3 () {
        Player vasya = new Player(1,"Вася",100);
        Player petya = new Player(2,"Петя",120);
        Game game = new Game();

        game.register(vasya);
        game.register(petya);

        Assertions.assertThrows(NotRegisteredException.class,
                () -> game.round("Света", "Жора")
        );
    }
    @Test
    public  void testWhenFirstPlayerWin1 () {
        Player vasya = new Player(1,"Вася",100);
        Player petya = new Player(2,"Петя",120);
        Game game = new Game();

        game.register(vasya);
        game.register(petya);
        int actual = game.round("Вася","Петя");
        int expected =2;

        Assertions.assertEquals(expected,actual);
    }
}
