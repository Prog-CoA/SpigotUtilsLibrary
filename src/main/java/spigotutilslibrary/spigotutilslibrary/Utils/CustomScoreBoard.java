package spigotutilslibrary.spigotutilslibrary.Utils;

import org.bukkit.Bukkit;
import org.bukkit.scoreboard.*;

import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("all")
public class CustomScoreBoard {

    private final ScoreboardManager manager;
    private final Scoreboard board;
    private final Objective object;

    private final Map<String, Score> map = new HashMap<>();

    public CustomScoreBoard(String id){
        this.manager = Bukkit.getScoreboardManager();
        this.board = manager.getNewScoreboard();

        this.object = board.registerNewObjective(id, "dummy");
    }

    //名前を設定
    public void setName(String name){
        object.setDisplayName(name);
    }

    //スコア追加
    public void addScore(String id, String name){
        map.put(id, object.getScore(name));
    }

    //スコアを設定
    public void setScore(String id, int score){
        map.get(id).setScore(score);
    }

    //スコアを取得
    public int getScore(String id){
        return map.get(id).getScore();
    }

    //スコアボード表示
    public void show(){
        object.setDisplaySlot(DisplaySlot.SIDEBAR);
    }

    //スコアボード非表示
    public void hide(){
        object.setDisplaySlot(null);
    }

    //終了処理
    public void shutdown(){
        for(String name : map.keySet()){
            object.getScoreboard().resetScores(map.get(name).getEntry());
        }
        object.unregister();
    }
}
