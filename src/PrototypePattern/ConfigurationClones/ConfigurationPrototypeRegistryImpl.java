package PrototypePattern.ConfigurationClones;

import java.util.HashMap;
import java.util.Map;

public class ConfigurationPrototypeRegistryImpl implements ConfigurationPrototypeRegistry{
    private final Map<ConfigurationType, Configuration> register=new HashMap<>();
    @Override
    public void addPrototype(Configuration user) {
        register.put(user.getType(),user);
    }

    @Override
    public Configuration getPrototype(ConfigurationType type) {
        return register.get(type);
    }

    @Override
    public Configuration clone(ConfigurationType type) {
        return register.get(type).cloneObject();
        // or this.getPrototype(type).cloneObject();
    }
}
