package study.java.jdk8.$1_default;

/**
 * 主函数
 * @author mtx
 * @date 2021-01-19
 */
public class Main {
    public static void main(String[] args) {
        Dog dog=new Dog();
        //直接调用了接口中的default修饰的方法
        dog.breath();
    }
}
