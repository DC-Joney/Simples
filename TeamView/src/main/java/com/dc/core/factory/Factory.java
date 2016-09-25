package com.dc.core.factory;

/**
 * Created by in IntelliJ IDEA.
 *
 * @author Joney
 * @create 2016-09-22-17:05
 */

public class Factory{
    private static Object handler;
    private static Object[]objects ;
    private static <T> Object getInstance(Class<T>cls) throws Exception {
        if(handler==null){
            handler= (Object) cls.newInstance();
            return handler;
        }
        return handler;
    }
    public static <T> Object getOneInstance(Class<T> cls) {
        try {
            return (Object) getInstance(cls);
        } catch (Exception e) {
            throw new ClassCastException("类型不匹配");
        }
    }
    public  static <T> void addBean(T...handler){
//        objects=new Object[handler.length];
//        for(int i=0;i<handler.length;i++){
//                if(i==id){
//                    objects[i]=handler[];
//                }
        //}
        //return handler;
        objects=handler;
    }
    public static Object getBean(Integer id){
        for (int i = 0; i < objects.length; i++) {
            if(i==id){
                return objects[i];

            }
        }
        return null;
    }

}