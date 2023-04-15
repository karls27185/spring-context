package com.javastart.springcontext;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.util.ReflectionUtils;

import java.io.File;
import java.lang.reflect.Field;
import java.util.Random;

public class CalculateCatStrengthBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object o, String s)
            throws BeansException {
        Field[] declaredFields = o.getClass().getDeclaredFields();
        for (Field field : declaredFields){
            CalculateCatStrength annotation = field.getAnnotation(CalculateCatStrength.class);
            if(annotation != null){
                int minStrength = annotation.minStrength();
                int maxStrength = annotation.maxStrength();
                Random random = new Random();
                int result = minStrength + random.nextInt(maxStrength - minStrength);
                field.setAccessible(true);
                ReflectionUtils.setField(field, o, result);
            }
        }
        return o;
    }

    @Override
    public Object postProcessAfterInitialization(Object o, String s)
            throws BeansException {
        return o;
    }
}
