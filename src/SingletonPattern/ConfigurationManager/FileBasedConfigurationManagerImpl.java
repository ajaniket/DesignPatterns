package SingletonPattern.ConfigurationManager;

public class FileBasedConfigurationManagerImpl extends FileBasedConfigurationManager {

    private static FileBasedConfigurationManager instance;
    private FileBasedConfigurationManagerImpl(){
    }
    @Override
    public String getConfiguration(String key) {
        return properties.getProperty(key);
        //throw new UnsupportedOperationException("Unimplemented method 'getConfiguration'");
    }

    @Override
    public <T> T getConfiguration(String key, Class<T> type) {
        try {
            if(properties.getProperty(key)!=null)
                return convert(properties.getProperty(key),type);
        }
        catch (Exception e){
            throw new ClassCastException();
        }
        return null;
        //throw new UnsupportedOperationException("Unimplemented method 'getConfiguration'");
    }

    @Override
    public void setConfiguration(String key, String value) {
        properties.setProperty(key, value);
        //throw new UnsupportedOperationException("Unimplemented method 'setConfiguration'");
    }

    @Override
    public <T> void setConfiguration(String key, T value) {
        if(value!=null)
            properties.setProperty(key, (String) value);
        else
            properties.setProperty(key,null);
    }

    @Override
    public void removeConfiguration(String key) {
        properties.remove(key);
        //throw new UnsupportedOperationException("Unimplemented method 'removeConfiguration'");
    }

    @Override
    public void clear() {
        properties.clear();
        //throw new UnsupportedOperationException("Unimplemented method 'clear'");
    }

    public static FileBasedConfigurationManager getInstance() {
        if(instance==null)
        {
            synchronized (FileBasedConfigurationManagerImpl.class){
                if(instance==null)
                    instance=new FileBasedConfigurationManagerImpl();
            }
        }
        return instance;
    }
    //it's for testing purposes
    public static void resetInstance() {
        instance=null;
    }

}