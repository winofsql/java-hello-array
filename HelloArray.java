import java.util.*;

public class HelloArray {
    public static void main (String[] args) {

        System.out.println("配列のループ処理");

        int a;
        a = 12345;

        System.out.println("------------int 変数の内容------------");
        System.out.println(a);

        System.out.println("------------int 配列の数------------");
        // 10個のエリアを割り付ける処理( int の配列を作成 )
        int[] b = new int[10]; 
        
        System.out.println(b.length);

        System.out.println("------------等差数列データ------------");

        // 等差数列でデータセット
        for( int i = 0; i < b.length; i++ ){
            b[i] = 10 + (i) * 2;
        }
        
        // for ループ で表示
        for( int i = 0; i < b.length; i++ ){
            System.out.println( b[i] );
        }

        System.out.println("-----------初期化子( int )-------------");

        // 初期化子
        int[] c = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

        // for ループ で表示
        for( int i = 0; i < c.length; i++ ){
            System.out.println( c[i] );
        }

        System.out.println("-----------文字列を初期化子でセット-------------");

        // 文字列を初期化子でセット
        String[] d = {"睦月","如月","弥生","卯月","皐月","水無月","文月","葉月","長月","神無月","霜月","師走"};

        // for ループ で表示
        for( int i = 0; i < d.length; i++ ){
            System.out.println( d[i] );
        }

        System.out.println("-----------拡張 for で文字列配列表示-------------");

        // 拡張 for で表示
        for( String x : d ) {
            System.out.println( x );
        }

        System.out.println("-----------配列を List に変換-------------");

        List<String> list =  Arrays.asList(d);

        // 拡張 for で表示
        for( String x : list ) {
            System.out.println( x );
        }

        System.out.println("-----------さらに追加可能にして追加後一覧表示-------------");

        // 追加処理できるように、再作成
        ArrayList<String> list2 = new ArrayList<String>(list);

        list2.add("あたらしい月");

        // 拡張 for で表示
        for( String x : list2 ) {
            System.out.println( x );
        }

    }
}
