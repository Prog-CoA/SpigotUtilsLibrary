# Overview

## CustomScoreBoard

スコアボードを簡単に作成するためのクラス

```Java

CustomScoreBoard scoreBoard = new CustomScoreBoard("スコアボードのID");

//表示される名前を設定
scoreBoard.setName(ChatColor.YELLOW + "TEST_BOARD");

//Scoreを追加
//id: 管理する名前 / name: Entityの表示される名前
scoreBoard.addScore("test", ChatColor.RED + "TEST_ENTITY");

//スコアを設定
//id: 管理する名前 / score: 設定する値(int型)
scoreBoard.setScore("test", 10);

//スコアを取得
//id: 管理する名前
scoreBoard.getScore("id");

//スコアボードを表示(SideBar)
scoreBoard.show();

//スコアボードを非表示
scoreBoard.hide();

//終了処理
//※必須処理
//必ず実行してください
scoreBoard.shutdown();

```

## Timer

Timerを設定するクラス

```Java

//plugin: JavaPlugin
//count: タイマーのカウント
//Max: カウントアップタイマーの終了値
//Minimum: カウントダウンタイマーの終了値
//message: タイマーが終了した際に表示されるメッセージ

//初期値
//count: 90
//Max: 180
//Minimum: 0
//message: ChatColor.YELLOW + "カウントが終了しました"


Timer timer = new Timer(plugin, count, Max, Minimum, message);
        
//カウントダウン
timer.CountDown();
        
//カウントアップ
timer.CountUp();
       
//カウントアップタイマー取得(BukkitRunnable)
timer.getCountUp();

//カウントダウンタイマー取得(BukkitRunnable)
timer.getCountDown();

//countを設定
timer.setCount(10);

//countを取得
timer.getCount();

//Maxを設定
timer.setMax(600);

//Maxを取得
timer.getMax();

//Minimumを設定
timer.setMinimum(-10);

//Minimumを取得
timer.getMinimum();

//messageを設定
timer.setMessage(ChatColor.AQUA + "タイムアップ！");

//messageを取得
timer.getMessage();

//備考
//Timerのキャンセル方法
timer.getCountDown().cancel();
timer.getCountUp().cancel();

```

## CustomItem

[M1n1don/ItemUtility](https://github.com/M1n1don/ItemUtility)

## Function

Worldに対して処理を行うためのクラス

```Java

//LocationのブロックをMaterialに変更
Function.setBlock(Material, Location);

//name: Worldの名前
//type: WorldType
//worldを新規作成
Function.createWorld(String name, WorldType type);

```

## LocationData

Locationに対して処理を行うためのクラス

```Java

//Location追加
LocationData.add(Location);

//Location削除
LocationData.remove(Location);

//追加されているLocationのListを取得
LocationData.getList();

//追加されているLocation全てにDataFuncを実行
LocationData.RUN(DataFunc);

//LocationにDataFuncを実行する
LocationData.RUN(Location, DataFunc);

```
