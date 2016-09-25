package studentExecse.inheritance.day14;

/**
 * Created by Administrator on 2016/9/14.
 * static所声明的对象方法以及类在类加载的时候就会被加载 而不是说在new对象的时候才会加载的
 * 例如:Class.forName("java.lang.String");
 * 这就意味着该类被加载时 类中的static 就已经被加载了
 *
 * 普通内部类不允许 静态内部类的成员存在。
 * 内部类不允许访问外部类的非静态成员
 *局部内部类不允许访问非final的成员
 *
 */
public class Static {

}
