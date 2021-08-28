package spigotutilslibrary.spigotutilslibrary.Utils;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitRunnable;

@SuppressWarnings("all")
public class Timer {

    protected JavaPlugin plugin;

    protected int count;
    protected int Max;
    protected int Minimum;

    protected String message;

    protected BukkitRunnable countDown;
    protected BukkitRunnable countUp;

    public Timer(JavaPlugin plugin){

        this(plugin, 90, 180, 0, ChatColor.YELLOW + "カウントが終了しました");
    }

    public Timer(JavaPlugin plugin, int count){

        this(plugin, count, 180, 0, ChatColor.YELLOW + "カウントが終了しました");
    }

    public Timer(JavaPlugin plugin, int count, int Max, int minimum){
        this(plugin, count, Max, minimum, ChatColor.YELLOW + "カウントが終了しました");
    }

    public Timer(JavaPlugin plugin, int count, int Max, int minimum, String message){
        this.plugin = plugin;
        this.count = count;
        this.Max = Max;
        this.Minimum = minimum;
        this.message = message;

        setting();
    }

    //countを設定
    public void setCount(int count){
        this.count = count;
    }

    //countを取得
    public int getCount(){
        return count;
    }

    //Maxを設定
    public void setMax(int Max){
        this.Max = Max;
    }

    //Maxを取得
    public int getMax(){
        return Max;
    }

    //Minimumを設定
    public void setMinimum(int minimum){
        this.Minimum = minimum;
    }

    //MInimumを取得
    public int getMinimum(){
        return Minimum;
    }

    //messageを設定
    public void setMessage(String message){
        this.message = message;
    }

    //messageを取得
    public String getMessage(){
        return message;
    }

    //カウントダウン
    public void CountDown(){
        countDown.runTaskTimer(plugin, 0L, 20L);
    }

    //カウントアップ
    public void CountUp(){
        countUp.runTaskTimer(plugin, 0L, 20L);
    }

    //countDown取得
    public BukkitRunnable getCountDown(){
        return countDown;
    }

    //countUp取得
    public BukkitRunnable getCountUp(){
        return countUp;
    }

    //BukkitRunnable設定
    private void setting(){
        countDown = new BukkitRunnable() {
            public void run() {
                if(count == Minimum){
                    Bukkit.broadcastMessage(message);
                    this.cancel();
                }

                count--;
            }
        };

        countUp = new BukkitRunnable() {
            public void run() {
                if(count == Max){
                    Bukkit.broadcastMessage(message);
                    this.cancel();
                }

                count++;
            }
        };
    }
}
