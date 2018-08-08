package com.maodot.mode.memorandummode;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/**
 * 为备忘录模式准备的工具
 * @author maodot
 */
public class BeanUtil {
    public static Map<String, Object> bean2Map(Object object) throws IllegalAccessException {
        Map<String, Object> map = new HashMap<>();
        Class<?> clazz = object.getClass();
        map.put("class", clazz);

        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            String key = field.getName();
            Object value = field.get(object);
            map.put(key, value);
        }

        return map;
    }

    public static <T> T map2Bean(Map<String, Object> map) throws IllegalAccessException, InstantiationException, NoSuchFieldException {
        Class<?> clazz = (Class<?>) map.get("class");
        Field[] fields = clazz.getDeclaredFields();
        Object object = clazz.newInstance();
        for (Field field : fields) {
            field.setAccessible(true);
            Object value = map.get(field.getName());
            field.set(object, value);
        }

        return (T) object;
    }
}
