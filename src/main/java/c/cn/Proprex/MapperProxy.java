package c.cn.Proprex;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * ClassName:  MapperProxy
 * Author:   命运造我
 * Date:     2019/5/15 21:54
 * Description:
 */
public class MapperProxy implements InvocationHandler {

    private Class trueObject;

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //调用getMapper的方法获得SqlMapper对象
        SqlMapper mapper = MapperHandler.getMapper(trueObject.getName(), method.getName());
        //将他的sql打印出来
        System.out.println(mapper.getSql());
        return null;
    }

    public void setTrueObject(Class trueObject) {
        this.trueObject = trueObject;
    }

    public <T> T newMapperProxy(Class<T> mapperInterface) {
        ClassLoader classLoader = mapperInterface.getClassLoader();
        Class<?>[] interfaces = new Class[]{
                mapperInterface};
        MapperProxy mapperProxy = new MapperProxy();
        mapperProxy.setTrueObject(mapperInterface);
        return (T) Proxy.newProxyInstance(classLoader, interfaces, mapperProxy);
    }
}
