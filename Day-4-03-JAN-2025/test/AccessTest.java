package test;

import mypackage.AccessModifiersExample;

public class AccessTest {
    public static void main(String[] args) {
        AccessModifiersExample obj=new AccessModifiersExample();
        // Access public member
        System.out.println(obj.publicVar);
        obj.publicMethod();
        // Access protected, default, and private member
//        System.out.println(obj.protectedVar);
//        System.out.println(obj.defaultVar);
//        System.out.println(obj.privateVar);
//        obj.protectedMethod();
//        obj.defaultMethod();
//        obj.privateMethod();
        obj.showPrivate(); //// Indirect access to private members
    }
}
