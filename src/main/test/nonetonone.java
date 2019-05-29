import c.cn.bean.*;
import c.cn.dao.FathorMapper;
import c.cn.dao.TeacharMapper;
import c.cn.dao.WifeMapper;
import c.cn.util.SessionFactoryUtil;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: wzy
 * Date: 2019/05/1710:41
 * Description:
 * Version: V1.0
 */
public class nonetonone {
    @Test
    public void  test(){
        WifeMapper mapper= SessionFactoryUtil.getSqlSession().getMapper(WifeMapper.class);
        System.out.println(mapper.selectAll());
        for(Wife h:mapper.selectAll()){
            System.out.println(h.getHusband().getName());
        }
    }

    @Test
    public  void manytonont(){
        FathorMapper mapper= SessionFactoryUtil.getSqlSession().getMapper(FathorMapper.class);
        for (Fathor fathor : mapper.selectAll()) {
            System.out.println(fathor.getName());
            for (Son son : fathor.getSons()) {
                System.out.println(son.getName());
            }
        }

    }


    @Test
    public  void manytomany(){
        TeacharMapper mapper= SessionFactoryUtil.getSqlSession().getMapper(TeacharMapper.class);
        for (Teachar teachar : mapper.selectAll()) {
            System.out.println(teachar.getName());
            for (Student student : teachar.getStudents()) {
                System.out.println(student.getName());
            }
        }
    }

        @Test
    public  void test3(){


    }

}
