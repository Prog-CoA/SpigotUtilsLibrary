# SpigotUtilsLibrary

# Overview

CustomScoreBoard

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

        //※必須処理
        //必ず実行してください
        //次回起動時にエラーを吐きます
        scoreBoard.shutdown();

```

