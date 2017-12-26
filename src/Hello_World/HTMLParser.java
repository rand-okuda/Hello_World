/**
 *
 */
package Hello_World;

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

    public static void main(String[] args) {
        if (args.length > 0) {
            // パーサオブジェクトを作成
            HTMLParser parser = new HTMLParser(args[0]);
            //タグを順番に処理
            while (parser.hasNext()) {
                Tag tag = parser.nextTag();
                System.out.println(tag);
            }
        }else {
            System.out.println("引数にHTML文字列をワンワード（ブランクなし）で代入してください。");
        }
    }

}
