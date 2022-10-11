package idschema;

import java.util.ArrayList;
import java.util.Map;

public class Identitydto {

    public boolean additionalProperties;
    public String type;
    public ArrayList required;
    public Map<String,Map> properties;

    public Identitydto() {
    }

    public boolean isAdditionalProperties() {
        return additionalProperties;
    }

    public void setAdditionalProperties(boolean additionalProperties) {
        this.additionalProperties = additionalProperties;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ArrayList getRequired() {
        return required;
    }

    public void setRequired(ArrayList required) {
        this.required = required;
    }

    public Map<String, Map> getProperties() {
        return properties;
    }

    public void setProperties(Map<String, Map> properties) {
        this.properties = properties;
    }
}
