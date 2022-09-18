package com.example.commonapi.anotation.validator;


import com.example.commonapi.anotation.anotation.MaskedField;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class MaskFieldService {
    public static  <T> Map<String,? super Object> maskObjectFields(T object){
        Map<String,? super Object> values = new HashMap<>();
        Arrays.stream(object.getClass().getDeclaredFields()).filter(field->null != field.getAnnotation(MaskedField.class)).
                forEach(annotatedField->{
                    try {
                        if(annotatedField.getType().isAssignableFrom(String.class)) {
                            annotatedField.setAccessible(true);
                            values.put(annotatedField.getName(),maskString((String) annotatedField.get(object)));
                            annotatedField.set(object, annotatedField.get(object));
                        }
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
                });
        return values;
    }


    public <T> void unMaskObjectFields(T object,Map values){
        Arrays.stream(object.getClass().getDeclaredFields()).filter(field->null != field.getAnnotation(MaskedField.class)).
                forEach(annotatedField->{
                    try {
                        annotatedField.setAccessible(true);
                        annotatedField.set(object,values.get(annotatedField.getName()));
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
                });
    }

    private static String maskString(String value){
        if(Objects.isNull(value)) return null;
        return "******"; //TODO: your logic goes here for masking
    }
}
