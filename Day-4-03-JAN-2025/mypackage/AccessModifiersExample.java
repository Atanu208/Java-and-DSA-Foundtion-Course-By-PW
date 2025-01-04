package mypackage;

public class AccessModifiersExample {
    public String publicVar = "Public Variable";
    protected String protectedVar="Protected Variable";
    String defaultVar="Default Variable";
    private String privateVar="Private Variable";
    public void publicMethod()
    {
        System.out.println("Public Method");
    }
    protected void protectedMethod()
    {
        System.out.println("Protected Method");
    }
    private void privateMethod()
    {
        System.out.println("Private Method");
    }
    void defaultMethod()
    {
        System.out.println("Default Method");
    }
    public void showPrivate()
    {
        System.out.println(privateVar);
        privateMethod();
    }
}
