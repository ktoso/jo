package pl.project13.jo.clazz;

/**
 * Very naive loader - avoid using it!
 */
public class SimpleGoClassLoader extends ClassLoader {

  public Class<?> defineClass(String name, byte[] bytecode) throws ClassNotFoundException {
    return super.defineClass(name, bytecode, 0, bytecode.length);
  }

//  @SuppressWarnings("UnnecessaryBoxing")
//  public static Class<?> loadClass(String className, byte[] b) {
//    //override classDefine (as it is protected) and define the class.
//    Class clazz = null;
//    try {
//      ClassLoader loader = ClassLoader.getSystemClassLoader();
//      Class cls = java.lang.ClassLoader.class;
//      Method method = cls.getDeclaredMethod("defineClass", new Class[] {
//          String.class, byte[].class, int.class, int.class
//      });
//
//      // protected method invocaton
//      method.setAccessible(true);
//
//      try {
//        Object[] args = new Object[]{className, b, new Integer(0), new Integer(b.length)};
//        clazz = (Class) method.invoke(loader, args);
//
//        System.out.println(String.format("Loaded class: [%s] successfuly!", className));
//
//      } finally {
//        method.setAccessible(false);
//      }
//    } catch (Exception e) {
//      e.printStackTrace();
//      System.exit(1);
//    }
//
//    return clazz;
//  }
}
