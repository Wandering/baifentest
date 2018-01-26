import com.alibaba.fastjson.JSON;
import com.bwl.yyp.postcat.PostCat;

import java.io.File;
import java.net.URISyntaxException;
import java.util.Map;

public class Test {
    public static void main(String[] args) throws URISyntaxException {

        String hphm1b = "AG98T3";
        String type = "辽";
        Integer fdjh = 279903;
        Map<String, Object> rtnMap = PostCat.post(hphm1b, type, fdjh);
        System.out.println(JSON.toJSONString(rtnMap));
    }
}
