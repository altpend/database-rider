package com.github.database.rider.core.configuration;

import com.github.database.rider.core.replacers.DateTimeReplacer;
import com.github.database.rider.core.replacers.NullReplacer;
import com.github.database.rider.core.replacers.UnixTimestampReplacer;

import java.util.*;

public class DBUnitiDefaultProperties {
    private Map<String, Object> properties;

    public DBUnitiDefaultProperties() {
        this.properties = new HashMap<>();
        putIfAbsent(properties, "batchedStatements", false);
        putIfAbsent(properties, "qualifiedTableNames", false);
        putIfAbsent(properties, "schema", null);
        putIfAbsent(properties, "caseSensitiveTableNames", false);
        putIfAbsent(properties, "batchSize", 100);
        putIfAbsent(properties, "fetchSize", 100);
        putIfAbsent(properties, "allowEmptyFields", false);
        putIfAbsent(properties, "replacers", new ArrayList<>(
                Arrays.asList(new DateTimeReplacer(), new UnixTimestampReplacer(), new NullReplacer())));
        putIfAbsent(properties, "tableType", Collections.singletonList("TABLE"));
        putIfAbsent(properties, "prologTimeout", 1_000L);
    }

    private <K, V> void putIfAbsent(Map<K, V> map, K key, V value) {
        if (!map.containsKey(key)) {
            map.put(key, value);
        }
    }

    public Map<String, Object> getProperties() {
        return properties;
    }

    public void setProperties(Map<String, Object> properties) {
        this.properties = properties;
    }

}
