# Android勉強会
2018/08/01

---
# 今日の予定
### 14:00 ~ 15:30 前半
### 15分休憩
### 15:45 ~ 17:00 後半

### 計3時間
---
# Androidは深い
---
* **バージョン毎に異なる仕様**(泣きながら修正
* **機種依存による動作の違い**(死にながら修正
* **複雑な機能群**(覚えきれない、使いこなせない
* etc...

---

## 3時間でマスターは不可能
今後Androidを勉強・開発するなかで重要なことを広く浅く教えていきます。質問があったら3分以内で  
それ以上は終わってからが助かる

---

# 前半
Androidで開発するための知識

---

## Androidはバージョンが沢山ある
 
バージョンコードはお菓子の名前  
最新のリリースバージョンはNougat  
[バージョン一覧](https://developer.android.com/guide/topics/manifest/uses-sdk-element.html?hl=ja#ApiLevels)

---
### どのバージョンで開発すればいいの？  
研究なので自分の端末に合うバージョンで良い。端末のバージョンは端末情報で分かるよ  
複数台ならば、一番低いのに合わせてあげる

---
### ただし
開発バージョンの幅が広すぎると、それぞれに合わせるのが大変。KitKat(4.4)以上にしておくべし  
BLE通信を使う場合は、端末のBLE規格も確認すべし

---
### バージョンと一緒にあるAPIレベルに注意せよ

* 多くはバージョンとAPIレベルが対応関係  
* あるAPIレベルで動作するメソッドが、一つ上のレベルで動かないことも多々  
* コードを検索するときは、APIレベルに十分注意すること

---
# 開発環境
---
## **AndroidStudio**と**Eclipse**  
両者はコードが異なる部分が多少ある  
注意せよ(Build設定関係)  
AndroidStudioがオススメ  

---
## AndroidStudio使い方
![AndroidStudio](https://github.com/ragrog/AndroidStudySession/raw/image/AndroidStudioTop.jpg)
---
### Projectの新規作成
---
#### Applicationの名前
* ApplicationName - HelloWorld
* domain - com.study.hamalab
#### バージョン
KitKat

---
#### 初期の形式を選択
EmptyActivityにする  
名前をMainActivityに

---
## AndroidStudioの見方
* Project
* Code
* AndroidMonitor

---
### Project構成
* 表示形式を変更できる(基本はAndroid
```
.
├── app
|    ├── manifests (アプリの情報を宣言
|    ├── java (Javaコード
|    └── res (xmlコード
└── GradleScript (必要なライブラリ等明記
```
### Code
ソースコードが表示される  
projectのコードをダブルクリックすれば表示される

---
### AndroidMonitor
Logが出力されたり、メモリ・CPU使用率などを確認することができる

---
## Android の基礎
---
画面はActivityとLayoutで作られている  
Activityはその画面の動作  
Layoutはその画面のUIを定義する  
ActivityとLayoutを繋ぐのはLayoutのIDである
---
### Activity
画面の生成から終了までのライフサイクルを持つ
Overideをすることで、適切なタイミングでコールバックされる

---?code=1-HelloWorld/app/src/main/java/com/study/hamalb/helloworld/MainActivity.java
---
### Layout
xml形式で記述される  
様々な部品をxmlで記述していく  
主に構造と機能の２種類の部品がある  
(LinierLayout, ReactiveLayout, Button, TextView)  

---
---?code=1-HelloWorld/app/src/main/res/layout/activity_main.xml
---
### ActivityとLayoutの連携
IDを指定することで、Activityからアクセスすることが可能となる
Activity内でfindViewByIdメソッドを使うとView型が手に入る。
それをそれぞれ適切な型キャストを用いて使う
```java
TextView textView = (TextView)findViewById(R.id.Text)
```
---
---?code=1-HelloWorld/app/build.gradle
---
## Projectのダウンロード

## 実行方法
## バグの直し方
### その1
デバッグ実行
### その2
Log出力


