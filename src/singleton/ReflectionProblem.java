package singleton;

import java.lang.reflect.Constructor;

public class ReflectionProblem {
    public static void main(String[] args) throws Exception {

        DateUtil instance1 = DateUtil.getInstance();
        DateUtil instance2 = null;
        Constructor<?>[] declaredConstructors = DateUtil.class.getDeclaredConstructors();

        for (Constructor constructor : declaredConstructors) {
            constructor.setAccessible(true);
            instance2 = (DateUtil) constructor.newInstance();
            break;
        }
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
        System.out.println(instance1 == instance2);
    }

}
