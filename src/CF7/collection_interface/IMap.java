package CF7.collection_interface;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * Το interface Map χρησιμοποιεται για να αποθηκευονται ζευγαρια key:value
 * Η πιο δημοφιλης του υλοποιηση ειναι η κλαση HashMap
 */
public interface IMap extends Map {

    @Override
    int size();

    @Override
    boolean isEmpty();

    @Override
    boolean containsKey(Object key);

    @Override
    boolean containsValue(Object value);

    @Override
    Object get(Object key);

    @Override
    Object put(Object key, Object value);

    @Override
    Object remove(Object key);

    @Override
    void putAll(Map m);

    @Override
    void clear();

    @Override
    Set keySet();

    @Override
    Collection values();

    @Override
    Set<Entry> entrySet();

    @Override
    boolean equals(Object o);

    @Override
    int hashCode();

    @Override
    default Object getOrDefault(Object key, Object defaultValue) {
        return Map.super.getOrDefault(key, defaultValue);
    }

    @Override
    default void forEach(BiConsumer action) {
        Map.super.forEach(action);
    }

    @Override
    default void replaceAll(BiFunction function) {
        Map.super.replaceAll(function);
    }

    @Override
    default Object putIfAbsent(Object key, Object value) {
        return Map.super.putIfAbsent(key, value);
    }

    @Override
    default boolean remove(Object key, Object value) {
        return Map.super.remove(key, value);
    }

    @Override
    default boolean replace(Object key, Object oldValue, Object newValue) {
        return Map.super.replace(key, oldValue, newValue);
    }

    @Override
    default Object replace(Object key, Object value) {
        return Map.super.replace(key, value);
    }

    @Override
    default Object computeIfAbsent(Object key, Function mappingFunction) {
        return Map.super.computeIfAbsent(key, mappingFunction);
    }

    @Override
    default Object computeIfPresent(Object key, BiFunction remappingFunction) {
        return Map.super.computeIfPresent(key, remappingFunction);
    }

    @Override
    default Object compute(Object key, BiFunction remappingFunction) {
        return Map.super.compute(key, remappingFunction);
    }

    @Override
    default Object merge(Object key, Object value, BiFunction remappingFunction) {
        return Map.super.merge(key, value, remappingFunction);
    }
}
