package SingletonPattern.ConfigurationManager;

public class Main {
    public static void main(String[] args) {
        FileBasedConfigurationManager o1=FileBasedConfigurationManagerImpl.getInstance();
        FileBasedConfigurationManager o2=FileBasedConfigurationManagerImpl.getInstance();
        System.out.println(o1);
        System.out.println(o2);
        FileBasedConfigurationManagerImpl.resetInstance();
        System.out.println(o1);
        System.out.println(o2);
    }
}
