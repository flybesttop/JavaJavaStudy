package study.java.jdk8.$1_default;

/**
 * jdk8 新特性中的default关键字
 *
 * 在普通的接口中时无法编写方法实体的
 * 但是在jdk8之后通过default关键字可以
 * 对于没有实现的方法都会引用default修饰的方法实体
 *
 * 实现上跟抽象类很像
 *
 * @author mtx
 * @date 2021-01-19
 */
public interface Animal {

    void run();

    void eat();

    default void breath(){
        System.out.println("呼吸");
    }
}
