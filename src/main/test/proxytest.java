import c.cn.Proprex.MapperHandler;
import c.cn.dao.UserMapper;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: wzy
 * Date: 2019/05/1619:20
 * Description:
 * Version: V1.0
 */
public class proxytest {
@Test
    public void  Tset(){
    MapperHandler.init("mapping");
    UserMapper proxy = MapperHandler.getProxy(UserMapper.class);
    proxy.selectAll();
    }
}
