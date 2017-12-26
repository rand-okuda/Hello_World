/**
 *
 */
package Hello_World;

/**
 * @author okuda
 */

/**
 *HTMLを構成する「タグ」をTagクラスにて定義
 *このTagクラスでは、タグというものを以下のような構造であると仮定
 *<タグ名 属性名1=属性値1 属性名2=属性値2 ・・・> テキスト・・・
 */
public class Tag {
    private String tagStr;
    private String tagName;
    private String tagAttribute;
    private String tagText;
    public Tag(String tagStr,String tagName,  String tagAttribute, String tagText) {
        this.tagStr  = tagStr;
        this.tagName = tagName;
        this.tagAttribute = tagAttribute;
        this.tagText = tagText;
    }

    @Override
    public String toString() {
        return "タグ:[" + tagName + "], 属性:[" + tagAttribute + "], テキスト:[" + tagText + "]";
    }

}
