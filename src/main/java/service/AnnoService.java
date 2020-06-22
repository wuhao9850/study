package service;

import anno.CherryAnnontation;
import org.springframework.stereotype.Service;

import java.lang.annotation.Annotation;

@CherryAnnontation(name="123")
public class AnnoService {
    public static void main(String[] args) {
        Class<AnnoService> clazz = AnnoService.class;
        Annotation[] annotations = clazz.getAnnotations();
        for (Annotation annotation : annotations) {

            System.out.println(annotation.annotationType().getSimpleName());

        }
        
    }
}
