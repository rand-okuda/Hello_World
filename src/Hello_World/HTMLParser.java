/**
 *
 */
package Hello_World;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author okuda
 *
 */

/**
 * HTMLファイルのソースを受け取って、タグを ひとつずつ読み取るHTMLParserクラス
 */
public class HTMLParser {

    private static Pattern tagPattern = Pattern.compile("(<([^ >]+)([^>]*)>)([^<]*)");
    private Matcher matcher;
    private Tag tag;

    /**
     * コンストラクタ
     * @param src
     */
    public HTMLParser(String src) {
        matcher = tagPattern.matcher(src);
    }

    /**
     * 次のHTMLタグ有無検査
     * @return HTMLタグ有り＝true
     */
    public boolean hasNext() {
        boolean found = matcher.find();
        if (found) {
            tag = new Tag(matcher.group(1), matcher.group(2), matcher.group(3), matcher.group(4));
        }
        return found;
    }

    /**
     * 次のHTMLタグを返却
     * @return タグをあらわすオブジェクト
     */
    public Tag nextTag() {
        return tag;
    }

    /**
     * main()
     *引数が空白の場合はメッセージをコンソール出力
     *引数が与えられた場合はHTMLパーサーで処理
     * @param args
     */
    public static void main(String[] args) {
        // 引数が与えられた場合
        if (args.length > 0) {
            // HTMLタグのパーサに引数を代入しListを作成
            List<Tag> tagList = TagArray(args[0]);
            // Listを準備処理
            for (Tag tag : tagList) {
                // HTMLタグをコンソール出力し動作確認
                System.out.println(tag);
            }
        // 引数が与えられなかった場合
        }else {
            // メッセージをコンソール出力
            System.out.println("引数にHTML文字列をワンワード（ブランクなし）で代入してください。");
        }

    }

    /**
     * 次のHTMLタグObjectの配列を返却
     * @param htmlString
     * @return tagArray
     */
    public static List<Tag> TagArray(String htmlString) {
        // 返却用Listを作成
        List<Tag> tagArray = new ArrayList<>();
        // パーサオブジェクトを作成
        HTMLParser parser = new HTMLParser(htmlString);
        //次のタグが存在する場合Listを順番に処理
        while (parser.hasNext()) {
            // タグを作成
            Tag tag = parser.nextTag();
            // タグを返却用Listに追加
            tagArray.add(tag);
        }
        // 返却用リストをReturn
        return tagArray;

    }

}
