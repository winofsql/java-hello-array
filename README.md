# java-hello-array
配列とArrayList

Visual Studio Code ターミナル( コマンドプロンプト )
```json
    "terminal.integrated.profiles.windows": {

        "PowerShell": {
            "source": "PowerShell",
            "icon": "terminal-powershell"
        },
        "Command Prompt": {
            "path": [
                "${env:windir}\\Sysnative\\cmd.exe",
                "${env:windir}\\System32\\cmd.exe"
            ],
            "args": [],
            "icon": "terminal-cmd"
        },
        "Git Bash": {
            "source": "Git Bash"
        }
    },
    "terminal.integrated.defaultProfile.windows": "Command Prompt"
```
## 10個のエリアを割り付ける処理( int の配列を作成 )
```java
int[] b = new int[10]; 

System.out.println(b.length);
```

```txt
配列のループ処理
------------int 変数の内容------------ 
12345
------------int 配列の数------------   
10
------------等差数列データ------------ 
10
12
14
16
18
20
22
24
26
28
-----------初期化子( int )-------------
1
2
3
4
5
6
7
8
9
10
11
12
-----------文字列を初期化子でセット-------------
睦月
如月
弥生
卯月
皐月
水無月
文月
葉月
長月
神無月
霜月
師走
-----------拡張 for で文字列配列表示-------------
睦月
如月
弥生
卯月
皐月
水無月
文月
葉月
長月
神無月
霜月
師走
-----------配列を List に変換-------------
睦月
如月
弥生
卯月
皐月
水無月
文月
葉月
長月
神無月
霜月
師走
-----------さらに追加可能にして追加後一覧表示-------------
睦月
如月
弥生
卯月
皐月
水無月
文月
葉月
長月
神無月
霜月
師走
あたらしい月
```
